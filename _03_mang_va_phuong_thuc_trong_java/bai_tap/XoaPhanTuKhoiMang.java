package bai3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int size = 10;  // Kích thước của mảng
        int [] arr = new int [size];
        arr[0] = 0;
        arr[1] = 2;
        arr[2] = 7;
        arr[3] = 5;
        arr[4] = 1;
        arr[5] = 8;
        // In mảng ban đầu
        System.out.println("Mảng ban đầu gồm các phần tử: ");
        for (int element: arr) {
            System.out.print(element + " ");
        }
        // Nhập số number cần xóa
        Scanner sc = new Scanner(System.in);
        System.out.println("\nNhập phần tử cần xóa: ");
        int number = sc.nextInt();
        // Kiểm tra số cần xóa có trong mảng kh và xóa
        boolean soCoTonTai = false;
        int index = 0; // vị trí số cần kiểm tra trong mảng
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                index = i;
                System.out.println("Phần tử cần xóa ở vị trí " + index); // In vị trí số cần xóa
                soCoTonTai = true;
                break;
            }
        }
        if (soCoTonTai) {
            for (int j = index; j < arr.length - 1; j++) {
                arr[j] = arr[j+1];
            }
            System.out.println("Mảng sau khi đã xóa phần tử " + number);
            for (int i =0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("Phần tử cần xóa không có trong mảng");
        }
    }
}
