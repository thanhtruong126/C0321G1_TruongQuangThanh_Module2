package bai2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class HienThi20SoNT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0, n, i;
        boolean check2=true;
        for (n=2; n<100; n++) {
            boolean check = true;
            if (n == 2) {
                check = true;
            } else {
                for (i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        check = false;
                        break;
                    }
                }
            }
            if (check) {
                count++;
                System.out.println(n);
            }
        }
    }
}
