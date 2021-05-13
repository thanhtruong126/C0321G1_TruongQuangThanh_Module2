package bai7_abstract_class_va_interface.bai_tap.trien_khai_interface_colorable_cho_cac_lop_hinh_hoc;

import bai6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Circle;

public class CircleColorable extends Circle implements Colorable {

    public CircleColorable() {

    }

    public CircleColorable(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
