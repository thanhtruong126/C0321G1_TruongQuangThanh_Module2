package bai7_abstract_class_va_interface.bai_tap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc;

import bai6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Rectangle;

public class RectangleResize extends Rectangle implements Resizeable {
    public RectangleResize() {

    }

    public RectangleResize(double width, double length) {
        super(width, length);
    }

    @Override
    public void resize(double percent) {
        double resizeWidth = super.getWidth() * Math.sqrt(1 + (percent/100));
        double resizeLength = super.getWidth() * Math.sqrt(1 + (percent/100)) * super.getLength()/super.getWidth();
        super.setWidth(resizeWidth);
        super.setLength(resizeLength);
    }
}
