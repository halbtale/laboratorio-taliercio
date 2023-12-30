import java.util.Scanner;

// Fib( n ) = Fib(n-2) + Fib(n-1) per ogni n > 2
public class Fib {
	public static void main(String[] args) {
		int n = 0;
		if (args.length > 0) {
			 n = Integer.parseInt(args[0]);
		}
		else {
			System.out.println("Inserisci un numero naturale > 2: ");
			Scanner in = new Scanner(System.in);
			n = in.nextInt();
			in.close();
		}
		if (n<2) throw new IllegalArgumentException();
		
		System.out.println("Iterative fib: "+iterativeFib(n));
		System.out.println("Recursive fib: "+recursiveFib(n));
		
	}
	
	public static long recursiveFib(int n) {
		if (n == 0 || n == 1) return 1;
		return recursiveFib(n-2) + recursiveFib(n-1);
	}
	
	public static long iterativeFib(int n) {
		long a = 0;
		long b = 1;

		for (int i = 0; i<n; i++) {
			long newB = a + b;
			long newA = b;
			a = newA;
			b = newB;
		}


		return b;
	}
}
