import java.util.Scanner;

public class MathExpressionChecker {
    public static void main(String[] args) {
        System.out.println("Inserisci una espressione algebrica");

        Scanner in = new Scanner(System.in);
        String expression = in.nextLine();

        if (isValidExpression(expression)) {
            System.out.println("Espressione valida");
        } else {
            System.out.println("Espressione non valida");
        }

        in.close();
    }

    private static boolean isValidExpression(String expression) {
        Stack s = new ArrayStack();
        boolean isValid = true;

        for (int i = 0; i < expression.length() && isValid; i++) {
            char c = expression.charAt(i);
            if (c == '{' || c == '[' || c == '(') {
                s.push(c);
            }
            if (c == '}') {
                if (!(!s.isEmpty() && (Character) s.pop() == '{')) {
                    isValid = false;
                }
            }

            if (c == ')') {
                if (!(!s.isEmpty() && (Character) s.pop() == '(')) {
                    isValid = false;
                }
            }

            if (c == ']') {
                if (!(!s.isEmpty() && (Character) s.pop() == '[')) {
                    isValid = false;
                }
            }
        }

        if (!s.isEmpty())
            isValid = false;

        return isValid;
    }
}
