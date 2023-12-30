public class RecPalindrome {
    public static void main(String[] args) {
        if (args.length != 1 || args[0] == null) throw new IllegalArgumentException();
        String parsedString = args[0]
            .codePoints()
            .filter(c -> Character.isAlphabetic(c))
            .mapToObj(c -> Character.toString(c))
            .reduce("", String::concat);
        System.out.println(isPalindrome(parsedString));
    }

    private static boolean isPalindrome(String s) {
        if (s.length() <= 1) return true;
        if (s.charAt(0) != s.charAt(s.length() - 1)) return false;
        return isPalindrome(s.substring(1, s.length() - 1));
    }
}