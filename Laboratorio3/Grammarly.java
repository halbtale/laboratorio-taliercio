import java.util.Scanner;

public class Grammarly {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserisci un aggettivo");
		String aggettivo = in.nextLine();
		String aggettivoFormattato = aggettivo.substring(0,1).toUpperCase() + aggettivo.substring(1).toLowerCase();
		String aggettivoSuperlativo = aggettivoFormattato.substring(0,aggettivoFormattato.length() - 1) + "issim" + aggettivoFormattato.substring(aggettivoFormattato.length() - 1, aggettivoFormattato.length());
		
		System.out.println("Aggettivo inserito:    "+aggettivoFormattato);
		System.out.println("Forma diminutiva:      "+aggettivoDiminutivo);
		System.out.println("Superlativo assoluto:  "+aggettivoSuperlativo);
	}
}
