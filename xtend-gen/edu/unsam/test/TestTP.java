package edu.unsam.test;

import edu.unsam.algo2.individuo.Ataque;
import edu.unsam.algo2.individuo.DesastreNatural;
import edu.unsam.algo2.individuo.Equipo;
import edu.unsam.algo2.individuo.ItemCompuesto;
import edu.unsam.algo2.individuo.ItemSimple;
import edu.unsam.algo2.individuo.Mejora;
import edu.unsam.algo2.individuo.RepoEquipo;
import edu.unsam.algo2.individuo.RepoIndividuo;
import edu.unsam.algo2.individuo.RepoItem;
import edu.unsam.algo2.individuo.SuperIndividuo;

public class TestTP {
  private SuperIndividuo superman;
  
  private SuperIndividuo batman;
  
  private SuperIndividuo joker;
  
  private SuperIndividuo jo;
  
  private SuperIndividuo deadpool;
  
  private SuperIndividuo robin;
  
  private ItemSimple navaja;
  
  private ItemSimple pistola;
  
  private ItemSimple bazooka;
  
  private ItemCompuesto baticinturon;
  
  private Mejora mejora;
  
  private Ataque bomba;
  
  private DesastreNatural terremoto;
  
  private Equipo fantastico;
  
  private Equipo laLigaDeLosMancos;
  
  private RepoIndividuo repoSuperIndividuo = new RepoIndividuo();
  
  private RepoEquipo repoEquipo = new RepoEquipo();
  
  private RepoItem repoItem = new RepoItem();
  
  /* @Before
   */public void init() {
    throw new Error("Unresolved compilation problems:"
      + "\n=> cannot be resolved."
      + "\nThe method nombreYApellido(java.lang.String) is undefined"
      + "\nThe method alias(java.lang.String) is undefined"
      + "\nThe method victorias(int) is undefined"
      + "\nThe method derrotas(int) is undefined"
      + "\nThe method empates(int) is undefined"
      + "\nThe method tipo(Heroe) is undefined"
      + "\nThe method resistencia(double) is undefined"
      + "\nThe method fecha_ini(Object) is undefined"
      + "\nThe method or field LocalDate is undefined"
      + "\nThe method fuerza(double) is undefined"
      + "\nThe method baseDeOperaciones(Object) is undefined"
      + "\nPoint cannot be resolved."
      + "\n=> cannot be resolved."
      + "\nThe method nombreYApellido(java.lang.String) is undefined"
      + "\nThe method alias(java.lang.String) is undefined"
      + "\nThe method victorias(int) is undefined"
      + "\nThe method derrotas(int) is undefined"
      + "\nThe method empates(int) is undefined"
      + "\nThe method tipo(Heroe) is undefined"
      + "\nThe method resistencia(double) is undefined"
      + "\nThe method fecha_ini(Object) is undefined"
      + "\nThe method or field LocalDate is undefined"
      + "\nThe method fuerza(double) is undefined"
      + "\nThe method baseDeOperaciones(Object) is undefined"
      + "\nPoint cannot be resolved."
      + "\n=> cannot be resolved."
      + "\nThe method nombreYApellido(java.lang.String) is undefined"
      + "\nThe method alias(java.lang.String) is undefined"
      + "\nThe method victorias(int) is undefined"
      + "\nThe method derrotas(int) is undefined"
      + "\nThe method empates(int) is undefined"
      + "\nThe method dinero(double) is undefined"
      + "\nThe method tipo(Villano) is undefined"
      + "\nThe method resistencia(double) is undefined"
      + "\nThe method fecha_ini(Object) is undefined"
      + "\nThe method or field LocalDate is undefined"
      + "\nThe method fuerza(double) is undefined"
      + "\n=> cannot be resolved."
      + "\nThe method nombreYApellido(java.lang.String) is undefined"
      + "\nThe method alias(java.lang.String) is undefined"
      + "\nThe method victorias(int) is undefined"
      + "\nThe method derrotas(int) is undefined"
      + "\nThe method empates(int) is undefined"
      + "\nThe method dinero(double) is undefined"
      + "\nThe method tipo(Villano) is undefined"
      + "\nThe method resistencia(double) is undefined"
      + "\nThe method fecha_ini(Object) is undefined"
      + "\nThe method or field LocalDate is undefined"
      + "\nThe method fuerza(double) is undefined"
      + "\n=> cannot be resolved."
      + "\nThe method nombreYApellido(java.lang.String) is undefined"
      + "\nThe method alias(java.lang.String) is undefined"
      + "\nThe method tipo(Heroe) is undefined"
      + "\nThe method victorias(int) is undefined"
      + "\nThe method derrotas(int) is undefined"
      + "\nThe method empates(int) is undefined"
      + "\nThe method resistencia(double) is undefined"
      + "\nThe method fecha_ini(Object) is undefined"
      + "\nThe method or field LocalDate is undefined"
      + "\nThe method fuerza(double) is undefined"
      + "\nThe method baseDeOperaciones(Object) is undefined"
      + "\nPoint cannot be resolved."
      + "\n=> cannot be resolved."
      + "\nThe method nombreYApellido(java.lang.String) is undefined"
      + "\nThe method alias(java.lang.String) is undefined"
      + "\nThe method victorias(int) is undefined"
      + "\nThe method derrotas(int) is undefined"
      + "\nThe method empates(int) is undefined"
      + "\nThe method tipo(Antiheroe) is undefined"
      + "\nThe method resistencia(double) is undefined"
      + "\nThe method fecha_ini(Object) is undefined"
      + "\nThe method or field LocalDate is undefined"
      + "\nThe method fuerza(double) is undefined"
      + "\nThe method baseDeOperaciones(Object) is undefined"
      + "\nPoint cannot be resolved."
      + "\n=> cannot be resolved."
      + "\nThe method nombre(java.lang.String) is undefined"
      + "\nThe method alcance(int) is undefined"
      + "\nThe method peso(int) is undefined"
      + "\nThe method danio(int) is undefined"
      + "\nThe method resistencia(int) is undefined"
      + "\n=> cannot be resolved."
      + "\nThe method nombre(java.lang.String) is undefined"
      + "\nThe method alcance(int) is undefined"
      + "\nThe method peso(int) is undefined"
      + "\nThe method danio(int) is undefined"
      + "\nThe method resistencia(int) is undefined"
      + "\n=> cannot be resolved."
      + "\nThe method nombre(java.lang.String) is undefined"
      + "\nThe method alcance(int) is undefined"
      + "\nThe method peso(int) is undefined"
      + "\nThe method danio(int) is undefined"
      + "\nThe method resistencia(int) is undefined"
      + "\n=> cannot be resolved."
      + "\nThe method nombre(java.lang.String) is undefined"
      + "\nThe method componentes(java.util.List) is undefined"
      + "\n=> cannot be resolved."
      + "\nThe method alcance(int) is undefined"
      + "\nThe method precio(int) is undefined"
      + "\nThe method danio(int) is undefined"
      + "\nThe method resistencia(int) is undefined"
      + "\n=> cannot be resolved."
      + "\nThe method lugar(Object) is undefined"
      + "\nPoint cannot be resolved."
      + "\nThe method personasEnPeligro(int) is undefined"
      + "\nThe method agregarInvolucrado(SuperIndividuo) is undefined"
      + "\n=> cannot be resolved."
      + "\nThe method superficiAfectada(double) is undefined"
      + "\nThe method potencia(double) is undefined"
      + "\n=> cannot be resolved."
      + "\nThe method nombre(java.lang.String) is undefined"
      + "\nThe method lider(SuperIndividuo) is undefined"
      + "\n=> cannot be resolved."
      + "\nThe method nombre(java.lang.String) is undefined"
      + "\nThe method lider(SuperIndividuo) is undefined"
      + "\nnow cannot be resolved"
      + "\nminusYears cannot be resolved"
      + "\nnow cannot be resolved"
      + "\nminusYears cannot be resolved"
      + "\nnow cannot be resolved"
      + "\nminusYears cannot be resolved"
      + "\nnow cannot be resolved"
      + "\nminusYears cannot be resolved"
      + "\nnow cannot be resolved"
      + "\nminusYears cannot be resolved"
      + "\nnow cannot be resolved"
      + "\nminusYears cannot be resolved");
  }
  
  /* @Test
   */public Object AniosDeExperienciaDeSuperman() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Assert is undefined"
      + "\nassertEquals cannot be resolved");
  }
  
  /* @Test
   */public Object supermanTiene4DeExperiencia() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Assert is undefined"
      + "\nThe method experiencia() from the type SuperIndividuo refers to the missing type Object"
      + "\nassertEquals cannot be resolved");
  }
  
  /* @Test
   */public Object cualEsELPoderDeNavaja() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Assert is undefined"
      + "\nassertEquals cannot be resolved");
  }
  
  /* @Test
   */public Object cambioNaturalezaDeItem() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Assert is undefined"
      + "\nassertTrue cannot be resolved");
  }
  
  /* @Test
   */public Object elPoderDeAtaqueEsMayorPorSerSobreNatural() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Assert is undefined"
      + "\nThe method or field Assert is undefined"
      + "\nassertEquals cannot be resolved"
      + "\nassertEquals cannot be resolved");
  }
  
  /* @Test
   */public Object laSumaPorcentualRestanteEs2coma14() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Assert is undefined"
      + "\nThe method sumaPorcentajeItemsRestantes() from the type SuperIndividuo refers to the missing type Object"
      + "\nassertEquals cannot be resolved");
  }
  
  /* @Test
   */public Object agregoLaNavajayPistolaASuperman() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Assert is undefined"
      + "\nThe field items is not visible"
      + "\nThe field SuperIndividuo.items refers to the missing type List"
      + "\nassertEquals cannot be resolved");
  }
  
  /* @Test
   */public Object poderAtaqueDeSuperman() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Assert is undefined"
      + "\nThe method poderDeAtaque() from the type SuperIndividuo refers to the missing type Object"
      + "\nassertEquals cannot be resolved");
  }
  
  /* @Test
   */public Object itemMasPoderosoDeSuperman() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Assert is undefined"
      + "\nThe method ItemMasPoderoso() from the type SuperIndividuo refers to the missing type Object"
      + "\nassertEquals cannot be resolved");
  }
  
  /* @Test
   */public Object PoderDeDefensaDeSuperman() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Assert is undefined"
      + "\nThe method poderDeDefensa() from the type SuperIndividuo refers to the missing type Object"
      + "\nassertEquals cannot be resolved");
  }
  
  /* @Test
   */public Object supermanEsSenior() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Assert is undefined"
      + "\nThe method esSenior() from the type SuperIndividuo refers to the missing type Object"
      + "\nassertFalse cannot be resolved");
  }
  
  /* @Test
   */public Object batmanEsSenior() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Assert is undefined"
      + "\nThe method esSenior() from the type SuperIndividuo refers to the missing type Object"
      + "\nassertTrue cannot be resolved");
  }
  
  /* @Test
   */public Object agregaUnEnemigoYVeSiLoTiene() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Assert is undefined"
      + "\nThe field enemigos is not visible"
      + "\nThe method agregaEnemigo(SuperIndividuo) from the type SuperIndividuo refers to the missing type Object"
      + "\nThe field SuperIndividuo.enemigos refers to the missing type List"
      + "\nassertEquals cannot be resolved");
  }
  
  /* @Test
   */public Object supermanTieneTasaDeVictoriasDe25porciento() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Assert is undefined"
      + "\nThe method tasaVictorias() from the type SuperIndividuo refers to the missing type Object"
      + "\nassertEquals cannot be resolved");
  }
  
  /* @Test
   */public Object supermanTieneTasaDeDerrotasDe25porciento() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Assert is undefined"
      + "\nThe method tasaDerrotas() from the type SuperIndividuo refers to the missing type Object"
      + "\nassertEquals cannot be resolved");
  }
  
  /* @Test
   */public Object supermanNoTienePastaDeLider() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Assert is undefined"
      + "\nThe method pastaDeLider() from the type SuperIndividuo refers to the missing type Object"
      + "\nassertFalse cannot be resolved");
  }
  
  /* @Test
   */public Object batmanTienePastaDeLider() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Assert is undefined"
      + "\nThe method pastaDeLider() from the type SuperIndividuo refers to the missing type Object"
      + "\nassertTrue cannot be resolved");
  }
  
  /* @Test
   */public Object experienciadebatman() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Assert is undefined"
      + "\nThe method experiencia() from the type SuperIndividuo refers to the missing type Object"
      + "\nassertEquals cannot be resolved");
  }
  
  /* @Test
   */public Object efectividadSuperman() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Assert is undefined"
      + "\nThe method efectividadSuperIndividuo() from the type SuperIndividuo refers to the missing type Double"
      + "\nassertEquals cannot be resolved");
  }
  
  /* @Test
   */public Object efectividadBatman() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Assert is undefined"
      + "\nThe method efectividadSuperIndividuo() from the type SuperIndividuo refers to the missing type Double"
      + "\nassertEquals cannot be resolved");
  }
  
  /* @Test
   */public Object efectiVillano() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Assert is undefined"
      + "\nThe method efectividadSuperIndividuo() from the type SuperIndividuo refers to the missing type Double"
      + "\nassertEquals cannot be resolved");
  }
  
  /* @Test
   */public Object efectividadAntiheroeDeadpool() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Assert is undefined"
      + "\nThe method efectividadSuperIndividuo() from the type SuperIndividuo refers to the missing type Double"
      + "\nassertEquals cannot be resolved");
  }
  
  /* @Test
   */public Object mejorandoItem() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Assert is undefined"
      + "\nThe method comprarMejora(Mejora) from the type SuperIndividuo refers to the missing type Object"
      + "\nThe method usarMejora(Mejora, ItemSimple) from the type SuperIndividuo refers to the missing type Object"
      + "\nassertEquals cannot be resolved");
  }
  
  /* @Test
   */public Object jokercomprcomprarMejorayUsa() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Assert is undefined"
      + "\nThe field dinero is not visible"
      + "\nThe method comprarMejora(Mejora) from the type SuperIndividuo refers to the missing type Object"
      + "\nThe method usarMejora(Mejora, ItemSimple) from the type SuperIndividuo refers to the missing type Object"
      + "\nThe field SuperIndividuo.dinero refers to the missing type Double"
      + "\nassertEquals cannot be resolved");
  }
  
  /* @Test
   */public Object magnitudDeAtaqueBombaEs() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Assert is undefined"
      + "\nThe method magnitud() from the type Ataque refers to the missing type Double"
      + "\nassertEquals cannot be resolved");
  }
  
  /* @Test
   */public Object laBombaTieneAlJokerComoEnemigoDeBatman() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Assert is undefined"
      + "\nThe method agregaEnemigo(SuperIndividuo) from the type SuperIndividuo refers to the missing type Object"
      + "\nassertTrue cannot be resolved");
  }
  
  /* @Test
   */public Object costoDeCombatirAmenazaConEnemigo() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Assert is undefined"
      + "\nThe method agregaEnemigo(SuperIndividuo) from the type SuperIndividuo refers to the missing type Object"
      + "\nThe method costoDeCombatirAmenaza(Amenaza) from the type SuperIndividuo refers to the missing type Object"
      + "\nassertEquals cannot be resolved");
  }
  
  /* @Test
   */public Object terremotoTiene100DeMagnitud() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Assert is undefined"
      + "\nThe method magnitud() from the type DesastreNatural refers to the missing type Double"
      + "\nassertEquals cannot be resolved");
  }
  
  /* @Test
   */public Object siAgregoUnVillanoQuedaIgualElEquipo() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Assert is undefined"
      + "\nThe field integrantes is not visible"
      + "\nThe method agregarAEquipo(SuperIndividuo) from the type Equipo refers to the missing type Object"
      + "\nThe field Equipo.integrantes refers to the missing type List"
      + "\nassertEquals cannot be resolved");
  }
  
  /* @Test
   */public Object siAgregoUnNoVillanoSeAgrega() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Assert is undefined"
      + "\nThe field integrantes is not visible"
      + "\nThe method agregarAEquipo(SuperIndividuo) from the type Equipo refers to the missing type Object"
      + "\nThe field Equipo.integrantes refers to the missing type List"
      + "\nassertEquals cannot be resolved");
  }
  
  /* @Test
   */public Object siTengo10IntegrantesNoPuedoAgregarMas() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Assert is undefined"
      + "\nThe method agregarAEquipo(SuperIndividuo) from the type Equipo refers to the missing type Object"
      + "\nThe method agregarAEquipo(SuperIndividuo) from the type Equipo refers to the missing type Object"
      + "\nThe method agregarAEquipo(SuperIndividuo) from the type Equipo refers to the missing type Object"
      + "\nThe method agregarAEquipo(SuperIndividuo) from the type Equipo refers to the missing type Object"
      + "\nThe method agregarAEquipo(SuperIndividuo) from the type Equipo refers to the missing type Object"
      + "\nThe method agregarAEquipo(SuperIndividuo) from the type Equipo refers to the missing type Object"
      + "\nThe method agregarAEquipo(SuperIndividuo) from the type Equipo refers to the missing type Object"
      + "\nThe method agregarAEquipo(SuperIndividuo) from the type Equipo refers to the missing type Object"
      + "\nThe method agregarAEquipo(SuperIndividuo) from the type Equipo refers to the missing type Object"
      + "\nThe method agregarAEquipo(SuperIndividuo) from the type Equipo refers to the missing type Object"
      + "\nThe method cantidadDeIntegrantesConLider() from the type Equipo refers to the missing type Object"
      + "\nassertEquals cannot be resolved");
  }
  
  /* @Test
   */public Object batmanDeLiderYSupermanEnEquipoPoderDe220() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Assert is undefined"
      + "\nThe method agregarAEquipo(SuperIndividuo) from the type Equipo refers to the missing type Object"
      + "\nassertEquals cannot be resolved");
  }
  
  /* @Test
   */public Object fantasticoIntegrantesConLider() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Assert is undefined"
      + "\nThe method agregarAEquipo(SuperIndividuo) from the type Equipo refers to the missing type Object"
      + "\nThe method integrantesConLider() from the type Equipo refers to the missing type List"
      + "\nassertEquals cannot be resolved");
  }
  
  /* @Test
   */public Object cantidadDeEnemigosInvolucradosEnLaAmenazaEnBonba() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Assert is undefined"
      + "\nThe method agregarAEquipo(SuperIndividuo) from the type Equipo refers to the missing type Object"
      + "\nThe method agregaEnemigo(SuperIndividuo) from the type SuperIndividuo refers to the missing type Object"
      + "\nThe method agregaEnemigo(SuperIndividuo) from the type SuperIndividuo refers to the missing type Object"
      + "\nThe method agregaEnemigo(SuperIndividuo) from the type SuperIndividuo refers to the missing type Object"
      + "\nThe method cantidadDeEnemigosInvolucradosEnLaAmenaza(Amenaza) from the type Equipo refers to the missing type Object"
      + "\nassertEquals cannot be resolved");
  }
  
  /* @Test
   */public Object supermanNoPuedeSerEnemigoDeSiMismo() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Assert is undefined"
      + "\nThe field enemigos is not visible"
      + "\nThe method agregaEnemigo(SuperIndividuo) from the type SuperIndividuo refers to the missing type Object"
      + "\nThe field SuperIndividuo.enemigos refers to the missing type List"
      + "\nassertEquals cannot be resolved");
  }
  
  /* @Test
   */public Object batmanConsideraDeAmigoASuperman() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Assert is undefined"
      + "\nThe method agregaAmigo(SuperIndividuo) from the type SuperIndividuo refers to the missing type Object"
      + "\nThe method esAmigo(SuperIndividuo) from the type SuperIndividuo refers to the missing type Boolean"
      + "\nassertTrue cannot be resolved");
  }
  
  /* @Test
   */public Object batmanNoConsideraDeAmigoASuperman() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Assert is undefined"
      + "\nThe method esAmigo(SuperIndividuo) from the type SuperIndividuo refers to the missing type Boolean"
      + "\nassertFalse cannot be resolved");
  }
  
  /* @Test
   */public Object cantidadDeAmistadesEnComunEnEquipoCon2Amistades() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Assert is undefined"
      + "\nThe method agregarAEquipo(SuperIndividuo) from the type Equipo refers to the missing type Object"
      + "\nThe method agregaAmigo(SuperIndividuo) from the type SuperIndividuo refers to the missing type Object"
      + "\nThe method agregaAmigo(SuperIndividuo) from the type SuperIndividuo refers to the missing type Object"
      + "\nThe method cantidadDeAmistadesEnComun() from the type Equipo refers to the missing type Object"
      + "\nassertEquals cannot be resolved");
  }
  
  /* @Test
   */public Object siBatmanEsAmigoDeSupermanQueNoEstaEnElEquipoNoSumaAmistades() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Assert is undefined"
      + "\nThe method agregaAmigo(SuperIndividuo) from the type SuperIndividuo refers to the missing type Object"
      + "\nThe method cantidadDeAmistadesEnComun() from the type Equipo refers to the missing type Object"
      + "\nassertEquals cannot be resolved");
  }
  
  /* @Test
   */public Object con2AmistadesEnElEquipoMeDa10PorcDeAdicionalPorAmistad() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Assert is undefined"
      + "\nThe method agregarAEquipo(SuperIndividuo) from the type Equipo refers to the missing type Object"
      + "\nThe method agregaAmigo(SuperIndividuo) from the type SuperIndividuo refers to the missing type Object"
      + "\nThe method agregaAmigo(SuperIndividuo) from the type SuperIndividuo refers to the missing type Object"
      + "\nThe method porcentajeAdicionalPorAmistad() from the type Equipo refers to the missing type Object"
      + "\nassertEquals cannot be resolved");
  }
  
  /* @Test
   */public Object poderGrupal() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Assert is undefined"
      + "\nThe method agregarAEquipo(SuperIndividuo) from the type Equipo refers to the missing type Object"
      + "\nThe method agregaAmigo(SuperIndividuo) from the type SuperIndividuo refers to the missing type Object"
      + "\nThe method agregaAmigo(SuperIndividuo) from the type SuperIndividuo refers to the missing type Object"
      + "\nassertEquals cannot be resolved");
  }
  
  /* @Test
   */public Object itemCompuestoTieneUnSobrenaturalYEsSobrenatural() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Assert is undefined"
      + "\nassertTrue cannot be resolved");
  }
  
  /* @Test
   */public Object itemCompuestoNoTieneUnSobrenaturalYNoEsSobrenatural() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Assert is undefined"
      + "\nassertFalse cannot be resolved");
  }
  
  /* @Test
   */public Object laResistenciaDelBaticinturonEsIgualALaDeLaBazooka() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Assert is undefined"
      + "\nassertEquals cannot be resolved");
  }
  
  /* @Test
   */public Object elPoderDelBaticinturonEsLaSumaDelPoderDeLaBazookaYLaNavaja() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Assert is undefined"
      + "\nassertEquals cannot be resolved");
  }
  
  /* @Test
   */public Object testeoDelete() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Assert is undefined"
      + "\nThe field elementos is not visible"
      + "\nThe field Repositorio.elementos refers to the missing type List"
      + "\nassertEquals cannot be resolved");
  }
  
  /* @Test
   */public Object siAgrego2IndividuosAumentaElId() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Assert is undefined"
      + "\nThe field id is not visible"
      + "\nThe field Entidad.id refers to the missing type String"
      + "\nassertEquals cannot be resolved");
  }
  
  /* @Test
   */public Object searchByIdSuperIndividuo() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Assert is undefined"
      + "\nThe method searchById(String) from the type Repositorio refers to the missing type String"
      + "\nassertEquals cannot be resolved");
  }
  
  /* @Test
   */public Object searchByIdEquipo() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Assert is undefined"
      + "\nThe method searchById(String) from the type Repositorio refers to the missing type String"
      + "\nassertEquals cannot be resolved");
  }
  
  /* @Test
   */public Object searchByIdItem() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Assert is undefined"
      + "\nThe method searchById(String) from the type Repositorio refers to the missing type String"
      + "\nassertEquals cannot be resolved");
  }
  
  /* @Test
   */public Object searchDeSuperIndividuoAlias() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Assert is undefined"
      + "\nThe method search(String) from the type Repositorio refers to the missing type List"
      + "\nassertEquals cannot be resolved");
  }
  
  /* @Test
   */public Object searchDeSuperIndividuoNombre() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Assert is undefined"
      + "\nThe method search(String) from the type Repositorio refers to the missing type List"
      + "\nassertEquals cannot be resolved");
  }
  
  /* @Test
   */public Object searchDeItem() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Assert is undefined"
      + "\nThe method search(String) from the type Repositorio refers to the missing type List"
      + "\nassertEquals cannot be resolved");
  }
  
  /* @Test
   */public Object searchDeEquipoNombreDeEquipo() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Assert is undefined"
      + "\nThe method search(String) from the type Repositorio refers to the missing type List"
      + "\nassertEquals cannot be resolved");
  }
  
  /* @Test
   */public Object searchDeEquipoAliasDeUnIntegrante() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Assert is undefined"
      + "\nThe method agregarAEquipo(SuperIndividuo) from the type Equipo refers to the missing type Object"
      + "\nThe method search(String) from the type Repositorio refers to the missing type List"
      + "\nassertEquals cannot be resolved");
  }
}
