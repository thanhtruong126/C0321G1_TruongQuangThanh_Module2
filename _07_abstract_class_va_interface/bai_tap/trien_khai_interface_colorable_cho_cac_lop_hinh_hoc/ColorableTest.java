package bai7_abstract_class_va_interface.bai_tap.trien_khai_interface_colorable_cho_cac_lop_hinh_hoc;

import bai6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Shape;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new SquareColorable(2,"red",true);
        shapes[1] = new CircleColorable(1, "blue", true);

        System.out.println("Area of element in list: ");
        for (Shape element : shapes) {
            if (element instanceof SquareColorable) {
                System.out.println("Square: " + ((SquareColorable) element).getArea());
                ((SquareColorable) element).howToColor();
            } else if (element instanceof CircleColorable) {
                System.out.println("Square: " + ((CircleColorable) element).getArea());
                ((CircleColorable) element).howToColor();
            }
        }

    }
}
