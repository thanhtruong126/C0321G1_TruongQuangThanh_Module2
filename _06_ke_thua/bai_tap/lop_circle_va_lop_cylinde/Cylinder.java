package bai6_ke_thua.bai_tap.lop_circle_va_lop_cylinde;

public class Cylinder extends Circle {
    private double heigth;

    public Cylinder() {

    }

    public Cylinder(double radius, String color, double heigth) {
        super(radius, color);
        this.heigth = heigth;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public double getVolume() {
        return super.getArea() * this.heigth;
    }

    @Override
    public String toString() {
        return "A Cylinder with heigth="
                + getHeigth()
                + ", Volume="
                + getVolume()
                + ", which is a subclass of "
                + super.toString();
    }
}
