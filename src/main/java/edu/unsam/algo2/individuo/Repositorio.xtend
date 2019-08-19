package edu.unsam.algo2.individuo

import java.util.ArrayList
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.model.annotations.TransactionalAndObservable

@Accessors
abstract class Entidad {
	protected String id

	def setId(String idNro) {
		id = idNro
	}

	def void actualizar(Entidad elemento)

	def boolean tieneValorBusqueda(String valor)

}

@Accessors
@TransactionalAndObservable
abstract class Repositorio<T extends Entidad> {
	List<T> elementos = new ArrayList<T>
	var int proximoId = 1

	def void agregarElemento(T elemento) {
		elemento.setId(asignarId)
		elementos.add(elemento)
	}

	def void agregarElementoJson(T elemento) {
		if (validarID(elemento.id)) {
			update(elemento)
		} else {
			elementos.add(elemento)
		}
	}

	def void update(T elemento) {
		searchById(elemento.id).actualizar(elemento)
	}

	def void delete(T elemento) {
		elementos.remove(elemento)
	}

	def validarID(String id) {
		elementos.exists[it.id == id]
	}

	def T searchById(String id) {
		elementos.findFirst[it.id.equals(id)]
		if (!validarID(id)) {
			throw new RepositorioException("No se encontro el id " + id)
		}
		elementos.findFirst[it.id.equals(id)]
	}

	def List<T> search(String value) {
		elementos.filter[tieneValorBusqueda(value)].toList
	}

	def proximoId() {
		proximoId++
	}

	def String asignarId()

	def procesarLista(List<T> elementos) {
		elementos.forEach [
			agregarElementoJson
		]
	}
	
	// INICIO Agregados TP Algo 3	
	def cantidadElementos(){
		elementos.size()
	}
	
	
	// FIN Agregados TP Algo 3
}

class RepoIndividuo extends Repositorio<SuperIndividuo> {

	override String asignarId() {
		"SI" + proximoId()
	}

	override procesarLista(List<SuperIndividuo> elementos) {
		elementos.forEach[elemento|searchById(elemento.id).amigos = elemento.amigos]
	}

	def mejorDefensorDelRepo(Amenaza unaAmenaza) {
		if (chancesDeCombatirAmenazaMayoresde60(unaAmenaza).empty) {
			elementos.minBy[costoDeCombatirUnaAmenaza(unaAmenaza)]
		} else {
			chancesDeCombatirAmenazaMayoresde60(unaAmenaza).minBy[costoDeCombatirUnaAmenaza(unaAmenaza)]
		}
	}	

	def chancesDeCombatirAmenazaMayoresde60(Amenaza unaAmenaza) {
		elementos.filter[defensor|defensor.chancesDeContrarrestarAmenaza(unaAmenaza) > 60]
	}
	
	// INICIO Agregados TP Algo 3	
	def superIndividuosBalanceados(){
		this.elementos.sortBy([supI | Math.abs(supI.poderDeAtaque - supI.poderDeDefensa)])
	}
	
	def double porcentajeIndividuosSenior(){
		return ( this.elementos.filter[supI|supI.esSenior].size().doubleValue / this.cantidadElementos.doubleValue) * 100
	}
	
	def  superIndividuoMasEfectivo(){
		this.elementos.maxBy[efectividadSuperIndividuo].nombreYApellido
	}
	// FIN Agregados TP Algo 3

}

class RepoItem extends Repositorio<Item> {

	override String asignarId() {

		"I" + proximoId()
	}
}

class RepoEquipo extends Repositorio<Equipo> {
//lista de entidades que van a ser equipos
	override String asignarId() {
		"E" + proximoId()
	}

	def mejorDefensorDelRepo(Amenaza unaAmenaza) {
		// elementos.minBy[costoDeCombatirUnaAmenaza(unaAmenaza)]
		if (chancesDeCombatirAmenazaMayoresde60(unaAmenaza).empty) {
			elementos.minBy[costoDeCombatirUnaAmenaza(unaAmenaza)]
		} else {
			chancesDeCombatirAmenazaMayoresde60(unaAmenaza).minBy[costoDeCombatirUnaAmenaza(unaAmenaza)]
		}
	}

	def chancesDeCombatirAmenazaMayoresde60(Amenaza unaAmenaza) {
		elementos.filter[defensor|defensor.chancesDeContrarrestarAmenaza(unaAmenaza) > 60]
	}

	// INICIO Agregados TP Algo 3	
	def porcentajeEquiposLlenos(){
		return ( this.elementos.filter[equipo|equipo.cantidadDeIntegrantesConLider == 10].size().doubleValue / this.cantidadElementos.doubleValue) * 100
	}
	
	def  equipoMasEfectivo(){
		this.elementos.maxBy[poderGrupal].nombre
	}
		def   equipoMasPoderoso(){
		this.elementos.sortBy[poderGrupal]
	}
	
	// FIN Agregados TP Algo 3
}

class RepoAmenaza extends Repositorio<Amenaza> {

	private new() {
	}

	override String asignarId() {
		"A" + proximoId()
	}

	static RepoAmenaza instance // = new RepoAmenaza

	def static getInstance() {
		if (instance === null) {
			return instance = new RepoAmenaza
		} else {
			instance
		}
	}

}
