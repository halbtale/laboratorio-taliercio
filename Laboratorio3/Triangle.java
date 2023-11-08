import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserisci cateto 1");
		double cateto1 = in.nextDouble();
		
		System.out.println("Inserisci cateto 2");
		double cateto2 = in.nextDouble();
		
		double ipotenusa = Math.sqrt(Math.pow(cateto1, 2)+ Math.pow(cateto2, 2));
		double perimetro = cateto1 + cateto2 + ipotenusa;
		double area = cateto1 * cateto2 / 2;
		
		double angolo1 = Math.toDegrees(Math.atan(cateto2 / cateto1));
		double angolo2 = 90 - angolo1;
		
		System.out.printf("Ipotenusa:  %5.2f cm%n", ipotenusa);
		System.out.printf("Perimetro:  %5.2f cm%n", perimetro);
		System.out.printf("Area:       %5.2f cm2%n", area);
		System.out.printf("Angolo1:    %5.2f°%n", angolo1);
		System.out.printf("Angolo2:    %5.2f°%n", angolo2);
	}
}
