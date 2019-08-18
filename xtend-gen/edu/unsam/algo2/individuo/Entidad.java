package edu.unsam.algo2.individuo;

/* @Accessors
 */public abstract class Entidad {
  protected /* String */Object id;
  
  public Object esNuevo() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field Entidad.id refers to the missing type String"
      + "\n=== cannot be resolved");
  }
  
  public String setId(final /* String */Object idNro) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field Entidad.id refers to the missing type String");
  }
  
  public abstract void actualizar(final Entidad elemento);
  
  public abstract boolean tieneValorBusqueda(final /* String */Object valor);
}
