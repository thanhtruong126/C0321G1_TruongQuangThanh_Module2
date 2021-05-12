package bai6_ke_thua.bai_tap.lop_point_va_moveable_point;

public class TestMovablePoint {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);

        movablePoint = new MovablePoint(5, 7);
        System.out.println(movablePoint);

        movablePoint = new MovablePoint(3, 4, 1, 2);
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println(movablePoint);
    }
}
