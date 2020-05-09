public class PointTest {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);

        Point point1 = new Point();
        point1.setX(3);
        point1.setY(4);
        System.out.println(point1);

        Point point2 = new Point();
        point2.setXY(9,4);
        System.out.println(point2);
    }
}
