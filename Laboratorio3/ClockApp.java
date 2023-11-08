import java.util.Scanner;

public class ClockApp {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	System.out.println("Inserisci orario 1");
        String orario1 = in.nextLine();
        System.out.println("Inserisci orario 2");
        String orario2 = in.nextLine();
        
        int intervalloOre = ottieniOre(orario2) - ottieniOre(orario1);
        int intervalloMinuti = ottieniMinuti(orario2) - ottieniMinuti(orario1);

        if (intervalloOre < 0) {
            intervalloOre = 24 + intervalloOre;
        }

        if (intervalloMinuti > 0) {
            if (intervalloMinuti % 60 == 1) {
                intervalloOre++;
                intervalloMinuti -= 60;
            }
        } else if (intervalloMinuti < 0) {
            intervalloOre--;
            intervalloMinuti = 60 - Math.abs(intervalloMinuti);
        }

        System.out.printf(" Tempo trascorso: %d ore e %d minuti%n", intervalloOre, intervalloMinuti);
    }

    public static int ottieniMinuti(String orario) {
        return Integer.parseInt(orario.substring(2, 4));
    }

    public static int ottieniOre(String orario) {
        return Integer.parseInt(orario.substring(0, 2));
    }
}
