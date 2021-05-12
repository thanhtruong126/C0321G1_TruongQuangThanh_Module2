package bai7_abstract_class_va_interface.bai_tap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc;

import bai6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Shape;

public class ResizeableTest {
    public static void main(String[] args) {
        Shape[] shapesTest = new Shape[3];
        shapesTest[0] = new CircleResize(1);
        shapesTest[1] = new RectangleResize(2, 4);
        shapesTest[2] = new SquareResize(5);

        System.out.println("Area before resize in list: ");
        for (Shape element : shapesTest) {
            if (element instanceof CircleResize) {
                System.out.println("Circle: " + ((CircleResize) element).getArea());
            } else if (element instanceof RectangleResize) {
                System.out.println("Rectangle: " + ((RectangleResize) element).getArea());
            } else {
                System.out.println("Square: " + ((SquareResize) element).getArea());
            }
        }

        System.out.println("Area after resize in list: ");
        for (Shape element : shapesTest) {
            if (element instanceof CircleResize) {
                ((CircleResize) element).resize(Math.random()*100);
                System.out.println("Circle: " + ((CircleResize) element).getArea());
            } else if (element instanceof RectangleResize) {
                ((RectangleResize) element).resize(Math.random()*100);
                System.out.println("Rectangle: " + ((RectangleResize) element).getArea());
            } else {
                ((SquareResize) element).resize(Math.random()*100);
                System.out.println("Square: " + ((SquareResize) element).getArea());
            }
        }
    }
}
