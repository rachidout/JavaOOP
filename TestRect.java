import Point.*;

public class TestRect {

    public static void main(String args[]) {
        Rectangle r1 = new Rectangle(new Point(2, 4), new Point(4, 2));
        r1.afficher();
        System.out.println(r1.contains(new Point(3, 3)));
    }
}