import java.util.Scanner;

public class ProductTester {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserisci nome e prezzo prodotto 1");
		String nome1 = in.next();
		double prezzo1 = Double.parseDouble(in.next());
		
		Product prodotto1 = new Product(nome1, prezzo1);
		
		System.out.println("Inserisci nome e prezzo prodotto 2");
		String nome2 = in.next();
		double prezzo2 = Double.parseDouble(in.next());
		
		Product prodotto2 = new Product(nome2, prezzo2);
		
		System.out.println(prodotto1);
		System.out.println(prodotto2);
		
		System.out.println("Inserisci tasso sconto");
		double tassoSconto = in.nextDouble();
		
		
		if (prodotto1.getPrice() > prodotto2.getPrice()) {
			prodotto1.reducePrice(tassoSconto);
		} else {
			prodotto2.reducePrice(tassoSconto);
		}
		
		System.out.println(prodotto1);
		System.out.println(prodotto2);
		
		in.close();
		
	}
}
