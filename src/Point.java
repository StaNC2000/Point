public class Point {

    private int x;
    private int y;

    public Point() {
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        Point A = new Point(getX(), getY());
        Point B =  new Point(0, 0);

        double distance = Math.sqrt((B.getX() - A.getX()) * (B.getX() - A.getX()) + ((B.getY() - A.getY()) * (B.getY() - A.getY())));

        return  distance;
    }

    public double distance(int x, int y) {

        Point point = new Point(getX(), getY());
        Point xy = new Point(x, y);

        double distance = Math.sqrt((xy.getX() - point.getX()) * (xy.getX() - point.getX()) + ((xy.getY() - point.getY()) * (xy.getY() - point.getY())));

        return distance;
    }

    public double distance(Point A) {

        Point B =  new Point(getX(), getY());

        double distance = Math.sqrt((B.getX() - A.getX()) * (B.getX() - A.getX()) + ((B.getY() - A.getY()) * (B.getY() - A.getY())));

        return distance;
    }


}
