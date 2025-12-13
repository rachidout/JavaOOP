package Point;

public class Rectangle {
    private Point hg;
    private Point bd;

    public Rectangle() {
        this(new Point(), new Point());
    }

    public Rectangle(Point h, Point b) {
        this.hg = new Point(h);
        this.bd = new Point(b);
    }

    public void afficher() {
        System.out.println("Les cordonnes de coins : hg " + hg.toString() + "\n bd :" + bd.toString());
    }

    public int surface() {
        return (hg.getY() - bd.getY()) * (bd.getX() - hg.getX());
    }

    public void zoom(int deltax, int deltay) {
        bd.setX(bd.getX() + deltax);
        hg.setY(hg.getY() + deltay);
    }

    public boolean contains(Point p) {
        if (hg.getY() >= p.getY() && p.getY() >= bd.getY() && hg.getX() <= p.getX() && p.getX() <= bd.getX())
            return true;
        else {
            return false;
        }
    }
}
