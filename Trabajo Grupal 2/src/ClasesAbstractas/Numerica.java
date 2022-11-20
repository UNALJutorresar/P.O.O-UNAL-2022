
package ClasesAbstractas;
public abstract class Numerica {
  protected int num;
  protected int ob;
  
  public abstract String getString();
  public abstract boolean equals(Object ob);
  public abstract Numerica sumar(Numerica num);
  public abstract Numerica restar(Numerica num);
  public abstract Numerica multiplicar(Numerica num);
  public abstract Numerica dividir(Numerica num);

    
}
