public class RecursiveMCD {
	public static void main(String[] args) {
		if (args[0] == null || args[1] == null || args.length > 2) {
			throw new IllegalArgumentException();
		}
		int n = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);
		
		if (n < 1 || m < 1) throw new IllegalArgumentException();
		
		int MCD = recursiveMCD(n, m);
		
		System.out.println(MCD);
	}
	
	public static int recursiveMCD(int n, int m) {
		if (m % n == 0) return n;
		return recursiveMCD(m % n, n);
	}
}
