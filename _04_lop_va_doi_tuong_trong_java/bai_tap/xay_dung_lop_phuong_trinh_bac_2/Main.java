package bai4_lop_va_doi_tuong_trong_java.bai_tap.xay_dung_lop_phuong_trinh_bac_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập a: ");
        double a = input.nextDouble();
        System.out.print("Nhập b: ");
        double b = input.nextDouble();
        System.out.print("Nhập c: ");
        double c = input.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();
        if (delta > 0) {
            System.out.print("Phương trình có 2 nghiệm: " + quadraticEquation.getRoot1() + " và " + quadraticEquation.getRoot2());
        } else if (delta == 0) {
            System.out.print("Phương trình có nghiệm duy nhất: " + quadraticEquation.getRoot2());
        } else {
            System.out.print("Phương trình vô nghiệm.");
        }
    }
}
