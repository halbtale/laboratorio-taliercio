import java.util.Scanner;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class Copiatore {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);
		System.out.print("Inserisci [nome file lettura] [nome file scrittura]: ");
		String readFileName = in.next();
		String writeFileName = in.next();
		in.close();
		
		FileReader reader = new FileReader(readFileName);
		Scanner scan = new Scanner(reader);
		
		PrintWriter writer = new PrintWriter(writeFileName);
		
		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			String parsedLine = "";
			Scanner tokenScan = new Scanner(line);
			
			while (tokenScan.hasNext()) {
				String token = tokenScan.next();
				String lowerCaseToken = token.toLowerCase();
				String parsedToken = lowerCaseToken.substring(0, 1).toUpperCase() + lowerCaseToken.substring(1, lowerCaseToken.length());
				String fullyParsedToken = "";
				
				Scanner singleTokenScan = new Scanner(parsedToken);
				singleTokenScan.useDelimiter("'");
				
				while (singleTokenScan.hasNext()) {
					String sToken = singleTokenScan.next();
					String sLowerCaseToken = sToken.toLowerCase();
					String sParsedToken = sLowerCaseToken.substring(0, 1).toUpperCase() + sLowerCaseToken.substring(1, sLowerCaseToken.length());
					if (fullyParsedToken.length() > 0) fullyParsedToken = fullyParsedToken +"'" +sParsedToken;
					else fullyParsedToken = sParsedToken;
				}
				
				parsedLine = parsedLine + " " + fullyParsedToken;
			}
			
			tokenScan.close();
			
			writer.println(parsedLine);
		}
		
		scan.close();
		writer.close();
	}
}
