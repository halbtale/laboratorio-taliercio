import java.util.Scanner;

class BisestoPlus {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] anni = new int[100];
		int anniSize = 0;
		
		boolean shouldContinue = true;
		
		while (shouldContinue) {
			try {
				System.out.println("Inserisci anno");
				String annoRaw = in.nextLine();
				int anno = Integer.parseInt(annoRaw);
				if (anno < 0) throw new NumberFormatException();
				if (anno == 0) {
					shouldContinue = false;
				} else {
					anniSize++;
					anni[anniSize - 1] = anno;
				}	
			} catch (NumberFormatException e) {
				System.out.println("Numero inserito non corretto");
			}
		}
		
		for (int i = 0; i < anniSize; i++) {
			int anno = anni[i];
			boolean bisestile = isBisestile(anno);
			if (bisestile) {
				System.out.println("L'anno "+anno+" e' bisestile'");
			} else {
				System.out.println("L'anno "+anno+" non e' bisestile'");
			}	
		}
		
		
		in.close();
		
		
	}
	
	public static boolean isBisestile(int anno) {
		final int annoCalendarioGregoriano = 1582;
		boolean bisestile = false;
		if (anno >= annoCalendarioGregoriano) {
			if (anno % 400 == 0) {
				bisestile = true;
			} else if (anno % 100 != 0 && anno % 4 == 0) {
				bisestile = true;
			}
		} else {
			if (anno % 4 == 0) {
				bisestile = true;
			}
		}
		return bisestile;
	}
}
