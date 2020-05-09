public class MoveAblePointTest {
    public static void main(String[] args) {
        MoveAblePoint moveablePoint = new MoveAblePoint();
        moveablePoint.setXSpeed(10);
        moveablePoint.setYSpeed(30);
        moveablePoint.move();
        System.out.println(moveablePoint);

        MoveAblePoint moveAblePoint2 = new MoveAblePoint(6, 2);
        moveAblePoint2.move();
        moveAblePoint2.setXYSpeed(3, 5);
        System.out.println(moveAblePoint2);

        MoveAblePoint moveAblePoint3 = new MoveAblePoint(2, 3, 4, 4);
        System.out.println(moveAblePoint3);

    }
}
