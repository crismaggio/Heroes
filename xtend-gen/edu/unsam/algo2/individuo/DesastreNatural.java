package edu.unsam.algo2.individuo;

import edu.unsam.algo2.individuo.Amenaza;
import edu.unsam.algo2.individuo.SuperIndividuo;

/* @Accessors
 */public class DesastreNatural extends Amenaza {
  private double superficiAfectada;
  
  private double potencia;
  
  public /* Double */Object magnitud() {
    throw new Error("Unresolved compilation problems:"
      + "\n+ cannot be resolved."
      + "\n* cannot be resolved");
  }
  
  public boolean contieneEnemigos(final SuperIndividuo _individuo) {
    return false;
  }
  
  public List involucrados() {
    return null;
  }
}
