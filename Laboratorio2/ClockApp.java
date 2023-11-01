public class ClockApp {
    public static void main(String[] args) {
        String orario1 = "1730";
        String orario2 = "0900";

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
            intervalloMinuti = 60 - intervalloMinuti;
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
