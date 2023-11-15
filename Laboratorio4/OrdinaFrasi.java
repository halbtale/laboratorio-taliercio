import java.util.Scanner;

class OrdinaFrasi {
	public static void main(String[] agrs) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserisci la prima frase:");
		String frase1 = in.nextLine();
		
		System.out.println("Inserisci seconda frase");
		String frase2 = in.nextLine();
		
		System.out.println("Inserisci terza frase");
		String frase3 = in.nextLine();
		
		System.out.println("Frasi ordinate:");
		
		if (frase1.compareTo(frase2) < 0) {
			if (frase2.compareTo(frase3) < 0) {
				if (frase1.compareTo(frase3) < 0) {
					System.out.println(frase1);
					System.out.println(frase2);
					System.out.println(frase3);
				} else {
					System.out.println(frase2);
					System.out.println(frase3);
					System.out.println(frase1);
				}	
			} else {
				if (frase1.compareTo(frase3) < 0) {
					System.out.println(frase1);
					System.out.println(frase3);
					System.out.println(frase2);
				} else {
					System.out.println(frase3);
					System.out.println(frase2);
					System.out.println(frase1);
				}	
			}
		} else {
			if (frase2.compareTo(frase3) < 0) {
				if (frase1.compareTo(frase3) < 0) {
					System.out.println(frase2);
					System.out.println(frase1);
					System.out.println(frase3);
				} else {
					System.out.println(frase2);
					System.out.println(frase3);
					System.out.println(frase1);
				}	
			} else {
				if (frase1.compareTo(frase3) < 0) {
					System.out.println(frase3);
					System.out.println(frase2);
					System.out.println(frase1);
				} else {
					System.out.println(frase3);
					System.out.println(frase2);
					System.out.println(frase1);
				}	
			}
		}
		
		in.close();
	}
}
