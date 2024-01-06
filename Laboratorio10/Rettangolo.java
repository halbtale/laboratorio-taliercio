public class Rettangolo implements Poligono {
    protected int lato1;
    protected int lato2;

    Rettangolo(int l1, int l2) {
        lato1 = l1;
        lato2 = l2;
    }

    public int compareTo(Object o) throws IllegalArgumentException {
        if (o instanceof Poligono) {
            Poligono otherPoligono = (Poligono) o;
            return (int) (area() - otherPoligono.area());
        } else {
            throw new IllegalArgumentException();
        }
    }

    public int perimetro() {
        return (lato1 + lato2) * 2;
    }

    public double area() {
        return (lato1 * lato2);
    }

    public String toString() {
        return String.format("[R] %d %d", lato1, lato2);
    }

}
