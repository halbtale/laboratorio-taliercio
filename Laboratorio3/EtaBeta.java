import java.util.Scanner;

public class EtaBeta {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("una frase nel formato: Articolo Sostantivo Verbo Aggettivo");
		String articolo = in.next();
		String sostantivo = in.next();
		String verbo = in.next();
		String aggettivo = in.next();
		
		articolo = articolo.substring(0,1).toUpperCase() + articolo.substring(1).toLowerCase();
		sostantivo = "p" + sostantivo.toLowerCase();
		verbo = verbo.toLowerCase();
		aggettivo = "p" + aggettivo.toLowerCase();
		
		System.out.println(articolo + " " + sostantivo + " " + verbo + " " + aggettivo);
	}
}
