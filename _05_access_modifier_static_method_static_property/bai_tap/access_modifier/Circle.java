package bai5_access_modifier_static_method_static_property.bai_tap.bai1_access_modifier;

public class Circle {
    // Khai bao thuoc tinh
    private double radius = 1.0;
    private String color = "red";
    // Khoi tao ham khong co tham so va ham co tham so
    public Circle() {

    }
    public Circle(double radius) {
        this.radius = radius;
    }
    // Tao phuong thuc
    // Khi thay doi access modifier cua 2 phuong thuc getRadius va getArea thanh protected, default, private thi ben lop TestCircle van truy cap duoc
    public double getRadius() {
        return this.radius;
    }
    public double getArea() {
        final double PI = 3.14;
        double area;
        area = Math.pow(this.radius, 2) * PI;
        return area;
    }
    public String display() {
        return "radius: " + this.radius + ", color: " + this.color + ", area: " + this.getArea();
    }
}
