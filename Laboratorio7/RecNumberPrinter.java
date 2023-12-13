public class RecNumberPrinter {
	public static void main(String[] args) {
		String param = args[0];
		if (param == null) throw new IllegalArgumentException();
		
		int n = Integer.parseInt(param);
		
		System.out.println(listNumbers(n));
	}
	
	public static String listNumbers(int n) {
		if (n == 0) return "0";
		return listNumbers(n-1) + " " + n;
	}
}
