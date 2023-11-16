import java.time.LocalDate;
import java.util.Scanner;

class Oroscopo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		try {
			System.out.println("Inserisci la tua data di nascita: giorno mese");
			String giornoRaw = in.next();
			String meseRaw = in.next();

			int giorno = Integer.parseInt(giornoRaw);
			int mese = Integer.parseInt(meseRaw);

			LocalDate.of(2000, mese, giorno); // lancia exception se data non è valida

			if (mese == 3 && giorno >= 20 || mese == 4 && giorno < 20) {
				System.out.println("ARIETE");
			} else if (mese == 4 && giorno >= 20 || mese == 5 && giorno < 20) {
				System.out.println("TORO");
			} else if (mese == 5 && giorno >= 20 || mese == 6 && giorno < 20) {
				System.out.println("GEMELLI");
			} else if (mese == 6 && giorno >= 20 || mese == 7 && giorno < 20) {
				System.out.println("CANCRO");
			} else if (mese == 7 && giorno >= 20 || mese == 8 && giorno < 20) {
				System.out.println("LEONE");
			} else if (mese == 8 && giorno >= 20 || mese == 9 && giorno < 20) {
				System.out.println("VERGINE");
			} else if (mese == 9 && giorno >= 20 || mese == 10 && giorno < 20) {
				System.out.println("VERGINE");
			} else if (mese == 10 && giorno >= 20 || mese == 11 && giorno < 20) {
				System.out.println("SCORPIONE");
			} else if (mese == 11 && giorno >= 20 || mese == 12 && giorno < 20) {
				System.out.println("SAGITTARIO");
			} else if (mese == 12 && giorno >= 20 || mese == 1 && giorno < 20) {
				System.out.println("CAPRICORNO");
			} else if (mese == 1 && giorno >= 20 || mese == 2 && giorno < 20) {
				System.out.println("ACQUARIO");
			} else if (mese == 2 && giorno >= 20 || mese == 3 && giorno < 20) {
				System.out.println("PESCI");
			}

			System.out.println("Amore:    " + Math.floor(Math.random() * 5 + 1) + "/5");
			System.out.println("Amicizia: " + Math.floor(Math.random() * 5 + 1) + "/5");
			System.out.println("Lavoro:   " + Math.floor(Math.random() * 5 + 1) + "/5");
		} catch (Exception e) {
			System.out.println("Che calendario usi? Quello di Marte?");
		}

		in.close();
	}
}
