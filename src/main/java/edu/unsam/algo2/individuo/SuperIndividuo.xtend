package edu.unsam.algo2.individuo

import java.time.LocalDate
import java.time.Period
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.geodds.Point
import com.fasterxml.jackson.annotation.JsonIgnore
import java.util.ArrayList
import org.uqbar.commons.model.annotations.TransactionalAndObservable

@Accessors
@TransactionalAndObservable
class SuperIndividuo extends Entidad implements Defensores {
	@JsonIgnore String nombreYApellido
	String alias
	@JsonIgnore int victorias
	@JsonIgnore int derrotas
	@JsonIgnore int empates
	@JsonIgnore Point baseDeOperaciones
	@JsonIgnore TipoDeIndividuo tipo
	@JsonIgnore LocalDate fecha_ini = LocalDate.now
	@JsonIgnore Double fuerza

	@JsonIgnore List<Equipo> Equipos = new ArrayList
	@JsonIgnore List<Item> items = new ArrayList
	@JsonIgnore List<SuperIndividuo> enemigos = new ArrayList
	@JsonIgnore List<SuperIndividuo> amigos = new ArrayList
	@JsonIgnore Double dinero
	@JsonIgnore Double resistencia
	@JsonIgnore List<Mejora> mejoras = new ArrayList
	@JsonIgnore List<String> notificaciones = new ArrayList
	@JsonIgnore List<observer> obs = new ArrayList
	@JsonIgnore int determinadaCantDerrotas = 5

	def igresaraUnEquipo(Equipo equipo) {
		Equipos.add(equipo)
	}

	def tipo(TipoDeIndividuo tipo) {
		this.tipo = tipo
		postObs()
	}

	def postObs() {
		obs.forEach[it.send(this)]
	}

	def recibirNotificacion(String string) {
		notificaciones.add(string)
	}

	def aumentarDerotas(int derrota) {
		this.derrotas = this.victorias + derrota
		postObs()
	}

	def aumentarVictorias(int victorias) {
		this.victorias = this.victorias + victorias
		postObs()
	}

	def void agregarObs(observer obs) {
		this.obs.add(obs)

	}

	def experiencia() {
		aniosDeActividad + (victorias / 2) + (derrotas / 2) + (empates / 4)
	}

	def int aniosDeActividad() {
		Period.between(fecha_ini, LocalDate.now).years

	}

	def comprarMejora(Mejora mejora) {
		if (dineroSuficienteParaLaCompra(mejora)) {
			dinero = dinero - mejora.precio
			mejoras.add(mejora)
		}

	}

	def dineroSuficienteParaLaCompra(Mejora mejora) {
		dinero > mejora.precio

	}

	def tieneItemYMejora(Mejora mejora, ItemSimple _item) {
		items.contains(_item) && mejoras.contains(mejora)
	}

	def usarMejora(Mejora _mejora, ItemSimple _item) {
		if (tieneItemYMejora(_mejora, _item)) {
			_mejora.mejorarItem(_item)
			mejoras.remove(_mejora)
		}

	}

	def agregarItemYOrdenaLista(Item item) {
		items.add(item)
		ordenaItemsDeMayoraMenor
	}

	def poderDeAtaque() {
		fuerza + ItemMasPoderoso.poderDeAtaque + sumaPorcentajeItemsRestantes
	}

	def ItemMasPoderoso() {
		items.head ?: new ItemSimple()

	}

	def sumaPorcentajeItemsRestantes() {
		0.2 * (items.tail.fold(0.0, [acum, item|acum + item.poderDeAtaque()]) ?: 0)

	}

	def void ordenaItemsDeMayoraMenor() {
		items = items.sortBy[poderDeAtaque].reverse

	}

	def poderDeDefensa() {
		resistencia + promedioDeResistenciaDeItems
	}

	def promedioDeResistenciaDeItems() {
		(items).fold(0.0, [acum, item|acum + item.resistencia]) / cantidadDeItems
	} // TODO cuando veamos excepciones ver de mejorar esto

	def cantidadDeItems() {
		if(items.size == 0) 1 else items.size
	}

	def cantidadDeBatallas() {
		victorias + derrotas + empates

	}

	def esSenior() {
		(aniosDeActividad > 4 && cantidadDeBatallas > 100) || (experiencia > 50)

	}

	def agregaEnemigo(SuperIndividuo enemigo) {
		if (enemigo != this)
			enemigos.add(enemigo)
	}

	def agregaAmigo(SuperIndividuo amigo) {

		amigos.add(amigo)
	}

	def pastaDeLider() {
		esSenior && (tasaVictoriasContraDerrotas > 10)
	}

	def tasaVictoriasContraDerrotas() {
		tasaVictorias - tasaDerrotas
	}

	def tasaVictorias() {
		(victorias * 100) / cantidadDeBatallas
	}

	def tasaDerrotas() {
		(derrotas * 100) / cantidadDeBatallas
	}

	def Double efectividadSuperIndividuo() {
		return tipo.efectividad(this)
	}

	override chancesDeContrarrestarAmenaza(Amenaza _amenaza) {
		efectividadSuperIndividuo / (efectividadSuperIndividuo + _amenaza.nivelDeAmenaza)
	}

	override costoDeCombatirUnaAmenaza(Amenaza amenaza) {
		((distanciaEntreBaseYAmenaza(amenaza) + amenaza.nivelDeAmenaza) / efectividadSuperIndividuo) *
			contieneEnemigos(amenaza)
	}

	def contieneEnemigos(Amenaza amenaza) {
		if (amenaza.contieneEnemigos(this))
			1.20
		else
			1

	}

	def distanciaEntreBaseYAmenaza(Amenaza _amenaza) {
		baseDeOperaciones.distance(_amenaza.lugar)
	}

	def tieneEnemigos() {
		enemigos.size > 0
	}

	def Boolean esAmigo(SuperIndividuo individuo) {
		amigos.contains(individuo)

	}

	def Boolean esEnemigo(SuperIndividuo enemigo) {
		enemigos.contains(enemigo)
	}

	override tieneValorBusqueda(String valor) {
		nombreYApellido.contains(valor) || alias.contains(valor)
	}

	override actualizar(Entidad elemento) {
		val superIndividuoActualizado = elemento as SuperIndividuo
		amigos = superIndividuoActualizado.amigos

	}

	def cantidaDeamigosEnElEquipo(List<SuperIndividuo> lista) {
		lista.filter[x|this.esAmigo(x)].size
	}

}
