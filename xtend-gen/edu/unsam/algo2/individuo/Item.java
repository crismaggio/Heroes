package edu.unsam.algo2.individuo;

import edu.unsam.algo2.individuo.Entidad;

public abstract class Item extends Entidad {
  /* @Accessors
   */private /* String */Object nombre;
  
  /* @Accessors
   */private /* BigDecimal */Object precio;
  
  public abstract double poderDeAtaque();
  
  public abstract double resistencia();
  
  public abstract boolean sobrenatural();
  
  public boolean tieneValorBusqueda(final /* String */Object valor) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field Item.nombre refers to the missing type String"
      + "\nequals cannot be resolved");
  }
}
