package bai3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        // Khai báo và nhập kích thước mảng
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập kích thước mảng: ");
        size = sc.nextInt();
        int arr[] = new int[size];
        // Nhập phần tử cho mảng
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập phần tử " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        //In ra mảng
        System.out.println("Mảng được tạo gồm các phần tử: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        // Tìm giá trị nhỏ nhất trong mảng
        int min = arr[0];
        int index = 0;
        for (int j = 0; j < arr.length; j++) {
            if (min > arr[j]) {
                min = arr[j];
                index = j;
            }
        }
        System.out.print("\nPhần tử nhỏ nhất trong mảng là : " + min + " ở vị trí " + index);
    }
}
