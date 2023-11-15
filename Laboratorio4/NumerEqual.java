import java.util.Scanner;

class NumberEqual {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserisci primo numero");
		double number1 = in.nextDouble();
		
		System.out.println("Inserisci secondo numero");
		double number2 = in.nextDouble();
		
		if (areEqual(number1, number2)) {
			System.out.println("Sono uguali");
		} else {
			System.out.println("Sono diversi");
		}
		
		in.close();
	}
	
	private static boolean areEqual(double n1, double n2) {
		final double EPSILON = 10E-14;
		return Math.abs(n1-n2) < EPSILON * Math.max(Math.abs(n1),Math.abs(n2));
	}
}
