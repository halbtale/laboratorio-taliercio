public class Triangolo implements Poligono {
    protected int lato1;
    protected int lato2;
    protected int lato3;

    Triangolo(int l1, int l2, int l3) {
        lato1 = l1;
        lato2 = l2;
        lato3 = l3;
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
        return lato1 + lato2 + lato3;
    }

    public double area() {
        return Math.sqrt(
                (perimetro() / 2) * (perimetro() / 2 - lato1) * (perimetro() / 2 - lato2) * (perimetro() / 2 - lato3));
    }

    public String toString() {
        return String.format("[R] %d %d", lato1, lato2);
    }

}
