package edu.unsam.algo2.individuo;

import edu.unsam.algo2.individuo.SuperIndividuo;

public abstract class TipoDeIndividuo {
  public abstract double efectividad(final SuperIndividuo superIndividuo);
  
  public Object efectividadBase(final SuperIndividuo superIndividuo, final double factor, final double factor2) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method poderDeAtaque() from the type SuperIndividuo refers to the missing type Object"
      + "\nThe method poderDeDefensa() from the type SuperIndividuo refers to the missing type Object"
      + "\nThe method experiencia() from the type SuperIndividuo refers to the missing type Object"
      + "\n* cannot be resolved"
      + "\n+ cannot be resolved"
      + "\n* cannot be resolved"
      + "\n/ cannot be resolved");
  }
}
