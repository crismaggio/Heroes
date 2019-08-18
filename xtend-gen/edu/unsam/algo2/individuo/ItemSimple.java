package edu.unsam.algo2.individuo;

import edu.unsam.algo2.individuo.Entidad;
import edu.unsam.algo2.individuo.Item;

public class ItemSimple extends Item {
  /* @Accessors
   */private double alcance;
  
  /* @Accessors
   */private double peso;
  
  /* @Accessors
   */private double danio;
  
  private double resistencia;
  
  private boolean sobrenatural = false;
  
  public double aumentarAtaque() {
    double _xifexpression = (double) 0;
    if (this.sobrenatural) {
      _xifexpression = 1.5;
    } else {
      _xifexpression = 1;
    }
    return _xifexpression;
  }
  
  public boolean hacerSobrenatural() {
    throw new Error("Unresolved compilation problems:"
      + "\n! cannot be resolved.");
  }
  
  public double poderDeAtaque() {
    throw new Error("Unresolved compilation problems:"
      + "\n+ cannot be resolved."
      + "\n* cannot be resolved."
      + "\n* cannot be resolved."
      + "\n- cannot be resolved"
      + "\n* cannot be resolved");
  }
  
  public boolean sobrenatural() {
    return this.sobrenatural;
  }
  
  public double resistencia() {
    return this.resistencia;
  }
  
  public double setResistencia(final double valorDeResistencia) {
    return this.resistencia = valorDeResistencia;
  }
  
  public void actualizar(final Entidad elemento) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field nombre is not visible"
      + "\nThe field nombre is not visible"
      + "\nThe field precio is not visible"
      + "\nThe field precio is not visible"
      + "\nThe field Entidad.id refers to the missing type String"
      + "\nThe field Entidad.id refers to the missing type String"
      + "\nThe field Item.nombre refers to the missing type String"
      + "\nThe field Item.nombre refers to the missing type String"
      + "\nThe field Item.precio refers to the missing type BigDecimal"
      + "\nThe field Item.precio refers to the missing type BigDecimal");
  }
}
