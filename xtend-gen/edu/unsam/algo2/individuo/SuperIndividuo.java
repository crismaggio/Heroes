package edu.unsam.algo2.individuo;

import edu.unsam.algo2.individuo.Amenaza;
import edu.unsam.algo2.individuo.Entidad;
import edu.unsam.algo2.individuo.Item;
import edu.unsam.algo2.individuo.ItemSimple;
import edu.unsam.algo2.individuo.Mejora;
import edu.unsam.algo2.individuo.TipoDeIndividuo;

/* @Accessors
 */public class SuperIndividuo extends Entidad {
  private /* String */Object nombreYApellido;
  
  private /* String */Object alias;
  
  private int victorias;
  
  private int derrotas;
  
  private int empates;
  
  private /* Point */Object baseDeOperaciones;
  
  private TipoDeIndividuo tipo;
  
  private /* LocalDate */Object fecha_ini;
  
  private /* Double */Object fuerza;
  
  private /* List<Item> */Object items /* Skipped initializer because of errors */;
  
  private /* List<SuperIndividuo> */Object enemigos /* Skipped initializer because of errors */;
  
  private /* List<SuperIndividuo> */Object amigos /* Skipped initializer because of errors */;
  
  private /* Double */Object dinero;
  
  private /* Double */Object resistencia;
  
  private /* List<Mejora> */Object mejoras /* Skipped initializer because of errors */;
  
  public Object experiencia() {
    throw new Error("Unresolved compilation problems:"
      + "\n+ cannot be resolved."
      + "\n/ cannot be resolved."
      + "\n/ cannot be resolved."
      + "\n/ cannot be resolved."
      + "\n+ cannot be resolved"
      + "\n+ cannot be resolved");
  }
  
  public int aniosDeActividad() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Period is undefined"
      + "\nThe method or field LocalDate is undefined"
      + "\nThe field SuperIndividuo.fecha_ini refers to the missing type LocalDate"
      + "\nbetween cannot be resolved"
      + "\nnow cannot be resolved"
      + "\nyears cannot be resolved");
  }
  
  public Object comprarMejora(final Mejora mejora) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field precio is not visible"
      + "\nThe method dineroSuficienteParaLaCompra(Mejora) from the type SuperIndividuo refers to the missing type Object"
      + "\nThe field SuperIndividuo.dinero refers to the missing type Double"
      + "\nThe field SuperIndividuo.dinero refers to the missing type Double"
      + "\nThe field SuperIndividuo.mejoras refers to the missing type List"
      + "\n- cannot be resolved"
      + "\nadd cannot be resolved");
  }
  
  public Object dineroSuficienteParaLaCompra(final Mejora mejora) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field precio is not visible"
      + "\nThe field SuperIndividuo.dinero refers to the missing type Double"
      + "\n> cannot be resolved");
  }
  
  public Object tieneItemYMejora(final Mejora mejora, final ItemSimple _item) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field SuperIndividuo.items refers to the missing type List"
      + "\nThe field SuperIndividuo.mejoras refers to the missing type List"
      + "\ncontains cannot be resolved"
      + "\n&& cannot be resolved"
      + "\ncontains cannot be resolved");
  }
  
  public Object usarMejora(final Mejora _mejora, final ItemSimple _item) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method tieneItemYMejora(Mejora, ItemSimple) from the type SuperIndividuo refers to the missing type Object"
      + "\nThe field SuperIndividuo.mejoras refers to the missing type List"
      + "\nremove cannot be resolved");
  }
  
  public void agregarItemYOrdenaLista(final ItemSimple item) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field SuperIndividuo.items refers to the missing type List"
      + "\nadd cannot be resolved");
  }
  
  public Object poderDeAtaque() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field SuperIndividuo.fuerza refers to the missing type Double"
      + "\nThe method ItemMasPoderoso() from the type SuperIndividuo refers to the missing type Object"
      + "\nThe method sumaPorcentajeItemsRestantes() from the type SuperIndividuo refers to the missing type Object"
      + "\n+ cannot be resolved"
      + "\npoderDeAtaque cannot be resolved"
      + "\n+ cannot be resolved");
  }
  
  public Object ItemMasPoderoso() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field SuperIndividuo.items refers to the missing type List"
      + "\nhead cannot be resolved"
      + "\n?: cannot be resolved");
  }
  
  public Object sumaPorcentajeItemsRestantes() {
    throw new Error("Unresolved compilation problems:"
      + "\n* cannot be resolved."
      + "\nThe field SuperIndividuo.items refers to the missing type List"
      + "\ntail cannot be resolved"
      + "\nfold cannot be resolved"
      + "\n+ cannot be resolved"
      + "\npoderDeAtaque cannot be resolved"
      + "\n?: cannot be resolved");
  }
  
  public void ordenaItemsDeMayoraMenor() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field SuperIndividuo.items refers to the missing type List"
      + "\nThe field SuperIndividuo.items refers to the missing type List"
      + "\nThe method poderDeAtaque() from the type SuperIndividuo refers to the missing type Object"
      + "\nsortBy cannot be resolved"
      + "\nreverse cannot be resolved");
  }
  
  public Object poderDeDefensa() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field SuperIndividuo.resistencia refers to the missing type Double"
      + "\nThe method promedioDeResistenciaDeItems() from the type SuperIndividuo refers to the missing type Object"
      + "\n+ cannot be resolved");
  }
  
  public Object promedioDeResistenciaDeItems() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field SuperIndividuo.items refers to the missing type List"
      + "\nfold cannot be resolved"
      + "\n+ cannot be resolved"
      + "\nresistencia cannot be resolved"
      + "\n/ cannot be resolved");
  }
  
  public int cantidadDeItems() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field SuperIndividuo.items refers to the missing type List"
      + "\nThe field SuperIndividuo.items refers to the missing type List"
      + "\nsize cannot be resolved"
      + "\n== cannot be resolved"
      + "\nsize cannot be resolved");
  }
  
  public Object cantidadDeBatallas() {
    throw new Error("Unresolved compilation problems:"
      + "\n+ cannot be resolved."
      + "\n+ cannot be resolved");
  }
  
  public Object esSenior() {
    throw new Error("Unresolved compilation problems:"
      + "\n> cannot be resolved."
      + "\nThe method cantidadDeBatallas() from the type SuperIndividuo refers to the missing type Object"
      + "\nThe method experiencia() from the type SuperIndividuo refers to the missing type Object"
      + "\n&& cannot be resolved"
      + "\n> cannot be resolved"
      + "\n|| cannot be resolved"
      + "\n> cannot be resolved");
  }
  
  public Object agregaEnemigo(final SuperIndividuo enemigo) {
    throw new Error("Unresolved compilation problems:"
      + "\n!= cannot be resolved."
      + "\nThe field SuperIndividuo.enemigos refers to the missing type List"
      + "\nadd cannot be resolved");
  }
  
  public Object agregaAmigo(final SuperIndividuo amigo) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field SuperIndividuo.amigos refers to the missing type List"
      + "\nadd cannot be resolved");
  }
  
  public Object pastaDeLider() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method esSenior() from the type SuperIndividuo refers to the missing type Object"
      + "\nThe method tasaVictoriasContraDerrotas() from the type SuperIndividuo refers to the missing type Object"
      + "\n&& cannot be resolved"
      + "\n> cannot be resolved");
  }
  
  public Object tasaVictoriasContraDerrotas() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method tasaVictorias() from the type SuperIndividuo refers to the missing type Object"
      + "\nThe method tasaDerrotas() from the type SuperIndividuo refers to the missing type Object"
      + "\n- cannot be resolved");
  }
  
  public Object tasaVictorias() {
    throw new Error("Unresolved compilation problems:"
      + "\n* cannot be resolved."
      + "\nThe method cantidadDeBatallas() from the type SuperIndividuo refers to the missing type Object"
      + "\n/ cannot be resolved");
  }
  
  public Object tasaDerrotas() {
    throw new Error("Unresolved compilation problems:"
      + "\n* cannot be resolved."
      + "\nThe method cantidadDeBatallas() from the type SuperIndividuo refers to the missing type Object"
      + "\n/ cannot be resolved");
  }
  
  public /* Double */Object efectividadSuperIndividuo() {
    return double.valueOf(this.tipo.efectividad(this));
  }
  
  public Object chancesDeContrarrestarAmenaza(final Amenaza _amenaza) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method efectividadSuperIndividuo() from the type SuperIndividuo refers to the missing type Double"
      + "\nThe method efectividadSuperIndividuo() from the type SuperIndividuo refers to the missing type Double"
      + "\nThe method nivelDeAmenaza() from the type Amenaza refers to the missing type Object"
      + "\n/ cannot be resolved"
      + "\n+ cannot be resolved");
  }
  
  public Object costoDeCombatirAmenaza(final Amenaza amenaza) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method distanciaEntreBaseYAmenaza(Amenaza) from the type SuperIndividuo refers to the missing type Object"
      + "\nThe method nivelDeAmenaza() from the type Amenaza refers to the missing type Object"
      + "\nThe method efectividadSuperIndividuo() from the type SuperIndividuo refers to the missing type Double"
      + "\n+ cannot be resolved"
      + "\n/ cannot be resolved"
      + "\n* cannot be resolved");
  }
  
  public double contieneEnemigos(final Amenaza amenaza) {
    double _xifexpression = (double) 0;
    boolean _contieneEnemigos = amenaza.contieneEnemigos(this);
    if (_contieneEnemigos) {
      _xifexpression = 1.20;
    } else {
      _xifexpression = 1;
    }
    return _xifexpression;
  }
  
  public Object distanciaEntreBaseYAmenaza(final Amenaza _amenaza) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field lugar is not visible"
      + "\nThe field SuperIndividuo.baseDeOperaciones refers to the missing type Point"
      + "\nThe field Amenaza.lugar refers to the missing type Point"
      + "\ndistance cannot be resolved");
  }
  
  public Object tieneEnemigos() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field SuperIndividuo.enemigos refers to the missing type List"
      + "\nsize cannot be resolved"
      + "\n> cannot be resolved");
  }
  
  public /* Boolean */Object esAmigo(final SuperIndividuo individuo) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field SuperIndividuo.amigos refers to the missing type List"
      + "\ncontains cannot be resolved");
  }
  
  public /* Boolean */Object esEnemigo(final SuperIndividuo enemigo) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field SuperIndividuo.enemigos refers to the missing type List"
      + "\ncontains cannot be resolved");
  }
  
  public boolean tieneValorBusqueda(final /* String */Object valor) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field SuperIndividuo.nombreYApellido refers to the missing type String"
      + "\nThe field SuperIndividuo.alias refers to the missing type String"
      + "\ncontains cannot be resolved"
      + "\n|| cannot be resolved"
      + "\ncontains cannot be resolved");
  }
  
  public void actualizar(final Entidad elemento) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field Entidad.id refers to the missing type String"
      + "\nThe field Entidad.id refers to the missing type String"
      + "\nThe field SuperIndividuo.amigos refers to the missing type List"
      + "\nThe field SuperIndividuo.amigos refers to the missing type List");
  }
}
