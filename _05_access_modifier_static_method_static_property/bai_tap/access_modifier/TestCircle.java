package bai5_access_modifier_static_method_static_property.bai_tap.bai1_access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5);
        System.out.println("Circle 1: " + circle1.display());
        System.out.println("Circle 2: " + circle2.display());
    }
}
