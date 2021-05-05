package bai3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int size = 10;
        int arr [] = new int[size];
        arr[0] = 10;
        arr[1] = 4;
        arr[2] = 6;
        arr[3] = 7;
        arr[4] = 8;
        // In mảng ban đầu
        System.out.println("Mảng ban đầu: ");
        for (int element: arr) {
            System.out.print(element + "\t");
        }
        Scanner sc = new Scanner(System.in);
        // Nhập phần tử x và vị trí index cần chèn
        System.out.print("\nNhập phần tử cần chèn: ");
        int x = sc.nextInt();
        System.out.print("Nhập vị trí cần chèn: ");
        int index = sc.nextInt();
        // Điều kiện để thêm phần tử vào mảng
        if (index >= (arr.length - 1) || index <= 1) {
            System.out.println("Không chèn được phần tử vào mảng");
        } else {
            // Duyệt mảng từ vị trí cuối mảng giảm dần đến vị trí index cần chèn, gán giá trị cuối mảng bằng giá trí kế sau nó <=> lùi phần tử về sau 1 ô để chừa ô chèn phần tử x
            for (int i = arr.length - 1; i > index; i --) {
                arr[i] = arr[i-1];
            }
            // Thêm phần tử x ở vị trí index vào mảng
            arr[index] = x;
            // In mảng sau khi thêm phần tử
            System.out.println("Mảng sau khi được chèn thêm phần tử " + x + " ở vị trí " + index);
            for (int element: arr) {
                System.out.print(element + "\t");
            }
        }
    }
}
