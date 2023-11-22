import java.util.Scanner;

public class QuadraticEquationTester {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Benvenuto nel risolutore di equazioni di secondo grado, adatto per chi e' pigro!'");
		System.out.print("Inserisci numeri a b c: ");
		
		int a = Integer.parseInt(in.next());
		int b = Integer.parseInt(in.next());
		int c = Integer.parseInt(in.next());
		
		QuadraticEquation eq = new QuadraticEquation(a,b,c);
		
		if (!eq.hasInfiniteSolutions()) {
			if (eq.hasSolutions()) {
				double solution1 = eq.getSolution1();
				double solution2 = eq.getSolution2();
				
				if (Math.abs(solution1 - solution2) > 0.01) {
					System.out.printf("Le soluzioni sono %5.2f e %5.2f%n",solution1,solution2);
				} else {
					System.out.printf("La soluzione e' %5.2f%n",solution1);
				}
				
			} else {
				System.out.println("Non ha soluzioni reali");
			}
		} else {
			System.out.println("Ha infinite soluzioni");
		}
		
		in.close();
	}
}
