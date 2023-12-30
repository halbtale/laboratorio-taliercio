import java.util.Arrays;

class RecSubstringGenerator {
    public static void main(String[] args) {
        if (args.length != 1 || args[0] == null) throw new IllegalArgumentException();
        Arrays.stream(getRecSubstring(args[0])).forEach(System.out::println);
    }

    private static String[] getRecSubstring(String mainString) {
        if (mainString.length() <= 1) return new String[] {mainString};

        String sFirst = mainString.substring(0, mainString.length() - 1);
        String sLast = mainString.substring(1);

        String[] sFirstSubstrings = new String[sFirst.length()];
        for (int i = 0; i<sFirst.length(); i++) {
            sFirstSubstrings[i] = sFirst.substring(0, i+1);
        }

        String[] sLastSubstrings = getRecSubstring(sLast);

        String[] allSubstrings = new String[sFirstSubstrings.length + sLastSubstrings.length + 1];

        for (int i = 0; i<sFirstSubstrings.length; i++) {
            allSubstrings[i] = sFirstSubstrings[i];
        }
        for (int i = 0; i<sLastSubstrings.length; i++) {
            allSubstrings[i+sFirstSubstrings.length] = sLastSubstrings[i];
        }

        allSubstrings[allSubstrings.length - 1] = mainString;

        return allSubstrings;
    }
}