import java.util.Scanner;

public class Goniometry {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserisci angolo in gradi:");
		double angoloGradi = in.nextDouble();
		double angoloRadianti = Math.toRadians(angoloGradi);
		double angoloRadiantiMultiploPI = angoloRadianti / Math.PI;
		
		System.out.printf("Angolo = %5.3f*π rad%n",angoloRadiantiMultiploPI);
		System.out.printf("sin(%5.3f*π) = %5.3f%n",angoloRadiantiMultiploPI, Math.sin(angoloRadianti));
		System.out.printf("cos(%5.3f*π) = %5.3f%n",angoloRadiantiMultiploPI, Math.cos(angoloRadianti));
		System.out.printf("tan(%5.3f*π) = %5.3f%n",angoloRadiantiMultiploPI, Math.tan(angoloRadianti));
	}
}
