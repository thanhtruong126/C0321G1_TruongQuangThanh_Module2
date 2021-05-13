package bai7_abstract_class_va_interface.bai_tap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc;

import bai6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Circle;

public class CircleResize extends Circle implements Resizeable{

    public CircleResize () {

    }

    public CircleResize (double radius) {
        super(radius);
    }
    @Override
    public void resize(double percent) {
        double resize = super.getRadius() * Math.sqrt(1 + (percent/100));
        super.setRadius(resize);
    }
}
