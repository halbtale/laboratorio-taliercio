import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PoligonoTester {
    public static void main(String[] args) {
        try {
            if (args.length != 1)
                throw new IllegalArgumentException();
            FileReader reader = new FileReader(args[0]);
            Scanner scan = new Scanner(reader);
            SortedContainer container = new SortedContainer();

            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] lineData = line.split(" ");
                try {
                    if (lineData.length <= 1)
                        continue;
                    else if (lineData.length == 2 && lineData[0].equals("[Q]")) {
                        Quadrato q = new Quadrato(Integer.parseInt(lineData[1]));
                        container.add(q);
                    } else if (lineData.length == 3 && lineData[0].equals("[R]")) {
                        Rettangolo r = new Rettangolo(Integer.parseInt(lineData[1]), Integer.parseInt(lineData[2]));
                        container.add(r);
                    } else if (lineData.length == 4 && lineData[0].equals("[T]")) {
                        Triangolo t = new Triangolo(Integer.parseInt(lineData[1]), Integer.parseInt(lineData[2]),
                                Integer.parseInt(lineData[3]));
                        container.add(t);
                    }
                } catch (NumberFormatException e) {
                    continue;
                }
            }

            while (!container.isEmpty()) {
                Poligono p = (Poligono) container.removeMax();
                System.out.print(p);
                System.out.print(" - ");
                System.out.println(p.area());
            }

            scan.close();
            reader.close();
        } catch (IllegalArgumentException e) {
            System.err.println("Paremtri non corretti");
        } catch (FileNotFoundException e) {
            System.err.println("File non trovato");
        } catch (IOException e) {
            System.err.println("Errore in I/O");
        }
    }
}
