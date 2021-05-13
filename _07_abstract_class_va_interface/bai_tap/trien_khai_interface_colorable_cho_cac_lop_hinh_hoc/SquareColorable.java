package bai7_abstract_class_va_interface.bai_tap.trien_khai_interface_colorable_cho_cac_lop_hinh_hoc;

import bai6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Shape;
import bai7_abstract_class_va_interface.bai_tap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc.SquareResize;

public class SquareColorable extends Shape implements Colorable{
    private double side = 1.0;

    public SquareColorable() {

    }

    public SquareColorable(double side) {
        this.side = side;
    }

    public SquareColorable(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
