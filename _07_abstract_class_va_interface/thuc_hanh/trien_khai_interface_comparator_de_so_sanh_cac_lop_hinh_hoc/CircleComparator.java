package bai7_abstract_class_va_interface.thuc_hanh.trien_khai_interface_comparator_de_so_sanh_cac_lop_hinh_hoc;

import bai6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle o1, Circle o2) {
        if (o1.getRadius() > o2.getRadius()) return 1;
        else if (o1.getRadius() < o2.getRadius()) return -1;
        else return 0;
    }
}
