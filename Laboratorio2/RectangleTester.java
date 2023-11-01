import java.awt.Rectangle;

public class RectangleTester {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(0, 0, 10, 10);
        Rectangle box2 = new Rectangle(5, 5, 10, 10);
        Rectangle box3 = box1.intersection(box2);
        System.out.println(box3);
    }
}
