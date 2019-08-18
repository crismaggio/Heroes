package edu.unsam.algo2.individuo

import org.eclipse.xtend.lib.annotations.Accessors
import java.util.List

abstract class Item extends Entidad {

	@Accessors var String nombre
	@Accessors var Double precio

	def double poderDeAtaque()

	def double resistencia()

	def boolean sobrenatural()

	override tieneValorBusqueda(String valor) {
		nombre.equals(valor)
	}

	def List<Item> getComponentes()

	def aumentarPrecioDeItem() {}

}

class ItemSimple extends Item {

	@Accessors var double alcance
	@Accessors var double peso
	@Accessors var double danio
	var double resistencia
	@Accessors boolean sobrenatural = false
	@Accessors var Double porcentaje

	def aumentarAtaque() {
		if (sobrenatural)
			1.5
		else
			1
	}

	def hacerSobrenatural() {
		sobrenatural = !sobrenatural
	}

	override poderDeAtaque() {
		(danio + (alcance * 0.2) - (peso * 0.1) ) * aumentarAtaque
	}

	override sobrenatural() {
		sobrenatural
	}

	override resistencia() {
		resistencia
	}

	def setResistencia(double valorDeResistencia) {
		resistencia = valorDeResistencia
	}

	override aumentarPrecioDeItem() {
		precio = precio * porcentajeAAumentar
		precio

	}

	def porcentajeAAumentar() {
		(porcentaje / 100) + 1
	}

	override actualizar(Entidad elemento) {
		val itemActualizado = elemento as ItemSimple
		nombre = itemActualizado.nombre
		precio = itemActualizado.precio
		peso = itemActualizado.peso
		danio = itemActualizado.danio
		alcance = itemActualizado.alcance
		resistencia = itemActualizado.resistencia
		sobrenatural = itemActualizado.sobrenatural
	}

	override getComponentes() {
	}

}

@Accessors
class ItemCompuesto extends Item {
	List<Item> componentes = newArrayList

	override poderDeAtaque() {
		componentes.fold(0.0, [acum, item|acum + item.poderDeAtaque])
	}

	override sobrenatural() {
		componentes.exists[sobrenatural()]
	}

	override resistencia() {
		componentes.maxBy[resistencia].resistencia
	}

	override actualizar(Entidad elemento) {
		val itemActualizado = elemento as ItemCompuesto
		id = elemento.id
		nombre = itemActualizado.nombre
		componentes = itemActualizado.componentes

	}

}

@Accessors
class Mejora {

	var double alcance
	var double danio
	var double resistencia
	var double precio

	def mejorarItem(ItemSimple item) {
		item.alcance = item.alcance * calculadorDePorcentajeDeMejora(alcance)
		item.danio = item.danio * calculadorDePorcentajeDeMejora(danio)
		item.resistencia = item.resistencia() * calculadorDePorcentajeDeMejora(resistencia)
	}

	def calculadorDePorcentajeDeMejora(double atributo) {
		(atributo / 100) + 1
	}

}
