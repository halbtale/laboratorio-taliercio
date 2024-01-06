public class Quadrato extends Rettangolo {
    Quadrato(int lato) {
        super(lato, lato);
    }

    public String toString() {
        return String.format("[Q] %d", lato1);
    }
}
