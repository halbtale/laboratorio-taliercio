import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserisci raggio: ");
		double raggio = in.nextDouble();
		
		System.out.println("Perimetro: "+(2*Math.PI*raggio));
		System.out.println("Area: "+(Math.PI*raggio*raggio));
		
		in.close();
	}
}
