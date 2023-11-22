public class QuadraticEquation
{
	double a;
	double b;
	double c;

  /*
      Costruttore: riceve i coefficienti a, b, c dell'equazione quadratica
      e inizializza i campi di esemplare secondo i valori ricevuti
  */
  public QuadraticEquation(double acoeff, double bcoeff, double ccoeff)
  {
	a = acoeff;
	b = bcoeff;
	c = ccoeff;
  }



  /*
      Restituisce la prima delle due soluzioni dell'equazione quadratica,
      usando la ben nota formula...
  */
  public double getSolution1()
  {
  	if (a == 0) return -c/b;
  	return ((-b)+Math.sqrt(b*b - 4*a*c))/2*a;
  }


  /*
      Restituisce la seconda delle due soluzioni dell'equazione quadratica,
      usando la ben nota formula...
  */
  public double getSolution2()
  {
  	if (a == 0) return -c/b;
	return ((-b)-Math.sqrt(b*b - 4*a*c))/2*a;
  }



  /*
      Restituisce il valore false se l'equazione non ha soluzioni
      (ovvero se il discriminante e` negativo)
  */
  public boolean hasSolutions()
  {
  	return b*b - 4*a*c >= 0;
  }
  
  public boolean hasInfiniteSolutions() {
  	return a == 0 && b == 0 && c == 0;
  }



  //... campi di esemplare... da completare
  //...

}
