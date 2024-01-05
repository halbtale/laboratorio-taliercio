import java.util.Scanner;

public class SquareTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Square s1 = promptAndGetSquare(in);
        Square s2 = promptAndGetSquare(in);

        printSquares();

        promptAndResizeSquare(in, s1);
        promptAndResizeSquare(in, s2);

        printSquares();

        in.close();
    }

    private static void printSquares(Square s1, Square s2) {
        if (s1.getArea() < s2.getArea()) {
            System.out.println(s1);
            System.out.println(s2);
        } else {
            System.out.println(s2);
            System.out.println(s1);
        }
    }

    private static void promptAndResizeSquare(Scanner in, Square s) {
        System.out.print("Inserisci [width] [height]");
        int width = Integer.parseInt(in.next());
        int height = Integer.parseInt(in.next());
        s.setSize(width, height);

    }

    private static Square promptAndGetSquare(Scanner in) {
        System.out.print("Inserisci [x] [y] [lato]: ");
        int x = Integer.parseInt(in.next());
        int y = Integer.parseInt(in.next());
        int l = Integer.parseInt(in.next());

        return new Square(x,y,l);
    }
}