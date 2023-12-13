public class RecStringReverser {
	public static void main(String[] args) {
		String s = args[0];
		
		String reversedString = reverseString(s);
		
		System.out.println(reversedString);	
	}
	
	public static String reverseString(String s) {
		if (s.length() == 1) return s;
		return reverseString(s.substring(1)) + reverseString(s.substring(0, 1));
	}
}
