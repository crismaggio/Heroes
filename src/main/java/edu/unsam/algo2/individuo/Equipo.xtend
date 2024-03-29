package edu.unsam.algo2.individuo

import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import com.fasterxml.jackson.annotation.JsonIgnore
import java.util.ArrayList
import org.uqbar.commons.model.annotations.TransactionalAndObservable

@Accessors
@TransactionalAndObservable
class Equipo extends Entidad implements Defensores {
	var String nombre
	@JsonIgnore SuperIndividuo lider
	@JsonIgnore List<SuperIndividuo> integrantes = new ArrayList

	def double poderGrupal() {
		(lider.efectividadSuperIndividuo + adicionalPorPastaDeLider()) * porcentajeAdicionalPorAmistad()

	}

	def adicionalPorPastaDeLider() {
		if (lider.pastaDeLider)
			(sumadorDeEfectividadDeIntegrantes(filtroDeintegrantes(true)) * 0.8 +
				sumadorDePoderDeAtaqueDeIntegrantes(filtroDeintegrantes(false)) * 0.5 	)
		else
			sumadorDeEfectividadDeIntegrantes(integrantes)

	}

	def eliminarVillano() {
		integrantes.removeAll(losVillanosDeLaLista)
	}

	def losVillanosDeLaLista() {
		integrantes.filter[tipo instanceof Villano]
	}

	def porcentajeAdicionalPorAmistad() {
		(cantidadDeAmistadesEnComun * 0.05) + 1
	}

	def cantidadDeAmistadesEnComun() {
		integrantesConLider.fold(0.0, [ acum, integrante |
			integrante.cantidaDeamigosEnElEquipo(integrantesConLider) + acum
		])
	}

	def List<SuperIndividuo> filtroDeintegrantes(Boolean condicion) {
		integrantes.filter[integrante|integrante.esSenior == condicion].toList
	}

	def List<SuperIndividuo> integrantesConLider() {

		(integrantes + #[lider]).toList
	}

	def cantidadDeIntegrantesConLider() {
		(integrantes + #[lider]).toList.size
	}

	def double distanciaMasLejana(Amenaza amenaza) {

		integrantesConLider.maxBy[distanciaEntreBaseYAmenaza(amenaza)].distanciaEntreBaseYAmenaza(amenaza)

	}

	def double sumadorDePoderDeAtaqueDeIntegrantes(List<SuperIndividuo> integrantes) {

		integrantes.fold(0.0, [acum, integrante|acum + integrante.poderDeAtaque()])

	}

	def double sumadorDeEfectividadDeIntegrantes(List<SuperIndividuo> integrantes) {

		integrantes.fold(0.0, [acum, integrante|acum + integrante.efectividadSuperIndividuo])

	}

	override costoDeCombatirUnaAmenaza(Amenaza amenaza) {
		(poderGrupal() + distanciaMasLejana(amenaza)) * costoPorEnemigosInvolucrados(amenaza)
	}

	def costoPorEnemigosInvolucrados(Amenaza amenaza) {

		1 + (cantidadDeEnemigosInvolucradosEnLaAmenaza(amenaza) * 0.10)
	}

	def cantidadDeEnemigosInvolucradosEnLaAmenaza(Amenaza amenaza) {
		if (!amenaza.involucrados.nullOrEmpty) {
			amenaza.involucrados.fold(0.0, [ acom, villano |
				acom + integrantesConLider.filter[integrante|integrante.esEnemigo(villano)].size
			])
		} else {
			1.0
		}
	}

	override chancesDeContrarrestarAmenaza(Amenaza amenaza) {
		poderGrupal() / (poderGrupal() + amenaza.nivelDeAmenaza)
	}

	def agregarAEquipo(SuperIndividuo _integrante) {
		if (!(_integrante.tipo instanceof Villano) && cantidadDeIntegrantesConLider < 10 && _integrante != lider) {
			_integrante.igresaraUnEquipo(this)
			integrantes.add(_integrante)
		}
	}

	override actualizar(Entidad elemento) {
	}

	override tieneValorBusqueda(String valor) {
		nombre.contains(valor) || integrantesConLider.exists[i|i.alias.contains(valor)]
	}

}
