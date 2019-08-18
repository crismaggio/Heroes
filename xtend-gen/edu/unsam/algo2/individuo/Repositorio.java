package edu.unsam.algo2.individuo;

import edu.unsam.algo2.individuo.Entidad;

/* @Accessors
 */public abstract class Repositorio<T extends Entidad> {
  private /* List<T> */Object elementos /* Skipped initializer because of errors */;
  
  private int proximoId = 1;
  
  public void agregarElemento(final T elemento) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method setId(String) from the type Entidad refers to the missing type String"
      + "\nThe method asignarId(int) from the type Repositorio refers to the missing type String"
      + "\nThe method proximoId() from the type Repositorio refers to the missing type Object"
      + "\nThe field Repositorio.elementos refers to the missing type List"
      + "\nadd cannot be resolved");
  }
  
  public void update(final T elemento) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method searchById(String) from the type Repositorio refers to the missing type String"
      + "\nThe field Entidad.id refers to the missing type String");
  }
  
  public void delete(final T elemento) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field Repositorio.elementos refers to the missing type List"
      + "\nremove cannot be resolved");
  }
  
  public Object existe(final /* String */Object id) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field Repositorio.elementos refers to the missing type List"
      + "\nexists cannot be resolved"
      + "\nid cannot be resolved"
      + "\n== cannot be resolved");
  }
  
  public T searchById(final /* String */Object id) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field Repositorio.elementos refers to the missing type List"
      + "\nThe method existe(String) from the type Repositorio refers to the missing type Object"
      + "\nThe constructor RepositorioException(String) refers to the missing type String"
      + "\nfindFirst cannot be resolved"
      + "\nid cannot be resolved"
      + "\nequals cannot be resolved"
      + "\n! cannot be resolved"
      + "\n+ cannot be resolved");
  }
  
  public /* List<T> */Object search(final /* String */Object value) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method tieneValorBusqueda(String) is undefined"
      + "\nThe field Repositorio.elementos refers to the missing type List"
      + "\nfilter cannot be resolved"
      + "\ntoList cannot be resolved");
  }
  
  public Object proximoId() {
    throw new Error("Unresolved compilation problems:"
      + "\n++ cannot be resolved.");
  }
  
  public abstract /* String */Object asignarId(final int idNro);
}
