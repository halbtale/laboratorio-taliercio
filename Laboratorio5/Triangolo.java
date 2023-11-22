public class Triangolo
{
	private double latoA;
	private double latoB;
	private double latoC;
	
	private static double getAngle(double l1, double l2, double l3) {
		return Math.toDegrees(Math.acos(((l1*l1)+(l2*l2)-(l3*l3))/(2*l1*l2)));
	}
	
   /*
      Construttore della classe Triangolo
   */
   public Triangolo (double la, double lb, double lc)
   {
		latoA = la;
		latoB = lb;
		latoC = lc;
   }

   /*
      restituisce informazioni sul triangolo. le informazioni sono relative
      ai lati:     equilatero,  isoscele,    scaleno.
      agli angoli: acutangolo,  rettangolo,  ottusangolo.
      Esempio: per il triangolo di lati 3, 4, 5 restituisce la stringa
      "scaleno rettangolo".
   */
   public String info()
   {
   		String tipoLato = null;
		String tipoAngolo = null;
		
		if (latoA == latoB && latoA == latoC) {
			tipoLato = "equilatero";
		} else if ((latoA == latoB && latoA != latoC) || (latoA == latoC && latoA != latoB) || (latoB == latoC && latoA != latoC)) {
			tipoLato = "isoscele";
		} else {
			tipoLato = "scaleno";
		}
		
		double angolo1 = getAngle(latoA, latoB, latoC);
		double angolo2 = getAngle(latoA, latoC, latoB);
		double angolo3 = getAngle(latoB, latoC, latoA);
		
		if (angolo1 == 90 || angolo2 == 90 || angolo3 == 90) {
			tipoAngolo = "rettangolo";
		} else if (angolo1 > 90 || angolo2 > 90 || angolo3 > 90) {
			tipoAngolo = "ottusangolo";
		} else {
			tipoAngolo = "acutangolo";
		}
		
		return tipoLato + " " + tipoAngolo;
   }
   /*
      restituisce una stringa contenente una descrizione testuale dell'oggetto
      nel formato T(a, b, c)
      Esempio "T(3, 4, 5)"
   */
   public String toString ()
   {
		return String.format("T(%f, %f, %f)", latoA, latoB, latoC);
   }
   
   public double perimeter() {
   		return latoA+latoB+latoC;
   }
   
   public double semiPerimeter() {
   		return perimeter() / 2;
   }

    /*
       calcola e restituisce l'area del triangolo.
       Usa la formula di Erone:
            area * area = p * (p - a) * (p - b) * (p - c)
       dove p e` il semiperimetro, ovvero p = (a + b + c) / 2
    */
    public double area()
    {
		return Math.sqrt(semiPerimeter() * (semiPerimeter() - latoA) * (semiPerimeter() - latoB) * (semiPerimeter() - latoC));
    }
   
    /*
       calcola e restituisce l'altezze del triangolo relativa al lato maggiore:
    */
    public double h()
    {
		double latoMax = Math.max(latoA, Math.max(latoB, latoC));
		return area() * 2 / latoMax;
    }



  //... campi di esemplare... da completare
  //...

}

