package bai7_abstract_class_va_interface.bai_tap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc;


import bai6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Shape;

public class SquareResize extends Shape implements Resizeable {
    private double side = 1.0;

    public SquareResize() {

    }

    public SquareResize(double side) {
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
    public void resize(double percent) {
        double resizeSide = (this.getSide() * (percent/100)) + this.getSide();
        this.setSide(resizeSide);
    }
}
