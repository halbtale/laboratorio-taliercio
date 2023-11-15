import java.util.Scanner;

class SimpleTriangleTester {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserisci lato 1");
		int lato1 = in.nextInt();
		
		System.out.println("Inserisci lato 2");
		int lato2 = in.nextInt();
		
		System.out.println("Inserisci lato 3");
		int lato3 = in.nextInt();
		
		String tipoLato = null;
		String tipoAngolo = null;
		
		if (lato1 == lato2 && lato1 == lato3) {
			tipoLato = "equilatero";
		} else if ((lato1 == lato2 && lato1 != lato3) || (lato1 == lato3 && lato1 != lato2) || (lato2 == lato3 && lato1 != lato3)) {
			tipoLato = "isoscele";
		} else {
			tipoLato = "scaleno";
		}
		
		double angolo1 = angolo(lato1, lato2, lato3);
		double angolo2 = angolo(lato1, lato3, lato2);
		double angolo3 = angolo(lato2, lato3, lato1);
		
		if (angolo1 == 90 || angolo2 == 90 || angolo3 == 90) {
			tipoAngolo = "rettangolo";
		} else if (angolo1 > 90 || angolo2 > 90 || angolo3 > 90) {
			tipoAngolo = "ottusangolo";
		} else {
			tipoAngolo = "acutangolo";
		}
		
		if (lato1 < lato2 + lato3 && lato2 < lato1 + lato3 && lato3 < lato2 + lato1) {
			System.out.print("triangolo "+tipoLato);
			if (tipoLato == "equilatero") {
				System.out.println("");
			} else {
				System.out.println(" "+tipoAngolo);
			}
		} else {
			System.out.println("non e' un triangolo'");
			
			
		}
		
	}
	
	private static double angolo(double l1, double l2, double l3) {
		return Math.toDegrees(Math.acos(((l1*l1)+(l2*l2)-(l3*l3))/(2*l1*l2)));
	}
}
