package edu.unsam.algo2.individuo;

import edu.unsam.algo2.individuo.SuperIndividuo;

/* @Accessors
 */public abstract class Amenaza {
  private /* Point */Object lugar;
  
  private int personasEnPeligro;
  
  public abstract /* Double */Object magnitud();
  
  public Object nivelDeAmenaza() {
    throw new Error("Unresolved compilation problems:"
      + "\n* cannot be resolved."
      + "\nThe method magnitud() from the type Amenaza refers to the missing type Double");
  }
  
  public abstract boolean contieneEnemigos(final SuperIndividuo _individuo);
  
  public abstract /* List<SuperIndividuo> */Object involucrados();
}
