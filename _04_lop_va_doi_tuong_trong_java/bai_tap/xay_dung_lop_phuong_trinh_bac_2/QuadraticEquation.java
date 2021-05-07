package bai4_lop_va_doi_tuong_trong_java.bai_tap.xay_dung_lop_phuong_trinh_bac_2;

public class QuadraticEquation {
    private double a, b, c;

    QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double getA() {
        return this.a;
    }

    double getB() {
        return this.b;
    }

    double getC() {
        return this.c;
    }

    double getDiscriminant() {
        double delta = Math.pow(this.b, 2) - 4 * this.a * this.c;
        return delta;
    }

    double getRoot1() {
        double delta = getDiscriminant();
        double root1 = (-this.b + Math.pow(delta, 0.5)) / (2 * this.a);
        return root1;
    }

    double getRoot2() {
        double delta = getDiscriminant();
        double root2 = (-this.b - Math.pow(delta, 0.5)) / (2 * this.a);
        return root2;
    }
    void display() {
        if (this.getDiscriminant() > 0 && getA() != 0) {
            System.out.print("Phương trình có 2 nghiệm: " + this.getRoot1() + " và " + this.getRoot2());
        } else if (this.getDiscriminant() == 0) {
            System.out.print("Phương trình có nghiệm duy nhất: " + this.getRoot2());
        } else {
            System.out.print("Phương trình vô nghiệm.");
        }
    }
}
