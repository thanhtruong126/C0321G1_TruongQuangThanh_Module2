package bai3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        // Khai báo biến và kích thước mảng 1, 2
        Scanner sc = new Scanner(System.in);
        int size1 = 5;
        int size2 = 4;
        int arr1[] = new int[size1];
        int arr2[] = new int[size2];
        // Nhập từng phần tử cho mảng 1
        int i = 0;
        while (i < arr1.length) {
            System.out.print("Nhap phan tu " + (i + 1) + " vao mang 1: ");
            arr1[i] = sc.nextInt();
            i++;
        }
        // Nhập từng phần tử cho mảng 2
        int j = 0;
        while (j < arr2.length) {
            System.out.print("Nhap phan tu " + (j + 1) + " vao mang 2: ");
            arr2[j] = sc.nextInt();
            j++;
        }
        // In mảng 1
        System.out.println("Mang 1 co cac phan tu la: ");
        for (int element : arr1) {
            System.out.print(element + "\t");
        }
        // In mảng 2
        System.out.println("\nMang 2 co cac phan tu la: ");
        for (int element : arr2) {
            System.out.print(element + "\t");
        }
        // Tạo mảng 3 có kích thước bằng kích thước mảng 1 + 2
        int size3 = size1 + size2;
        int arr3[] = new int[size3];
        // Duyệt phần tử mảng 1, lấy từng phần tử mảng 1 gán vào mảng 3 tính từ phần tử đầu tiên
        for (int k = 0; k < arr1.length; k++) {
            arr3[k] = arr1[k];
        }
        // Duyệt phần tử mảng 2, lấy từng phần tử mảng 2 gán tiếp vào mảng 3 tính từ phần tử array3[array1.length + m]
        for (int m = 0; m < arr2.length; m++) {
            arr3[m + arr1.length] = arr2[m];
        }
        //In mảng 3
        System.out.println("\nMang 3 co cac phan tu la: ");
        for (int element: arr3) {
            System.out.print(element + "\t");
        }
    }
}
