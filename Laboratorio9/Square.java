import java.awt.Rectangle;

public class Square extends Rectangle {
    public Square(int x, int y, int l) {
        super();
        super.setLocation(x, y);
        super.setSize(l, l);
    }

    public int getArea() {
        return (int) super.getHeight() * (int) super.getWidth();
    }

    public void setSize(int width, int height) {
        if (width != height) throw new IllegalArgumentException();
        super.setSize(width, height);
    }

    public void setSize(int l) {
        setSize(l, l);
    }
}