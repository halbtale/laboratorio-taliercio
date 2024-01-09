import java.util.*;

public class ArrayDequeTester {
    public static void main(String args[]) {
        // Inserimento da standard input di elementi nella coda doppia
        Scanner in = new Scanner(System.in);
        Deque d = new ArrayDeque();
        boolean done = false;
        while (!done) {
            System.out.println("\n******************************************");
            System.out.println("* Comando?");
            System.out.println("* Q          termina");
            System.out.println("* AF < int > aggiungi intero con addFirst");
            System.out.println("* AL < int > aggiungi intero con addLast");
            System.out.println("* RF         rimuovi con removeFirst");
            System.out.println("* RL         rimuovi con removeLast");
            System.out.println("* GL         ispeziona con getFirst");
            System.out.println("* GL         ispeziona con getLast");
            System.out.println("******************************************\n");

            String commLine = null;
            if (!in.hasNextLine() ||
                    (commLine = in.nextLine()).equalsIgnoreCase("Q")) {
                done = true;
                System.out.println("Arrivederci");
            } else {
                Scanner toks = new Scanner(commLine);
                if (toks.hasNext()) {
                    String cmd = toks.next();
                    if (cmd.equalsIgnoreCase("AF") ||
                            cmd.equalsIgnoreCase("AL")) // inserimento valore
                        try {
                            int val = Integer.parseInt(toks.next());
                            if (cmd.equalsIgnoreCase("AF"))
                                d.addFirst(val);
                            else
                                d.addLast(val);
                        } catch (NoSuchElementException e) {
                            System.out.println("Formato: AF (opp. AL) < val >");
                        } catch (NumberFormatException e) {
                            System.out.println("Non hai inserito un intero");
                        }

                    else if (cmd.equalsIgnoreCase("RF") ||
                            cmd.equalsIgnoreCase("RL")) // rimozione valore
                        try {
                            int n;
                            if (cmd.equalsIgnoreCase("RF"))
                                System.out.println("Rimosso valore (RF): "
                                        + d.removeFirst());
                            else
                                System.out.println("Rimosso valore (RL): "
                                        + d.removeLast());
                        } catch (EmptyDequeException e) {
                            System.out.println("La coda doppia e` vuota");
                        }

                    else if (cmd.equalsIgnoreCase("GF") ||
                            cmd.equalsIgnoreCase("GL")) // ispezione valore
                        try {
                            if (cmd.equalsIgnoreCase("GF"))
                                System.out.println("Ispezionato valore (GF): "
                                        + d.getFirst());
                            else
                                System.out.println("Ispezionato valore (GL): "
                                        + d.getLast());
                        } catch (EmptyDequeException e) {
                            System.out.println("La coda doppia e` vuota");
                        }
                    System.out.println("Dimensione coda doppia: " + d.size());
                    System.out.println("Contenuto coda doppia: " + d);
                } // fine dell' if(toks.hasNext())
            } // fine del corpo dell'else
        } // fine del ciclo while
    } // fine del corpo del metodo main
}
