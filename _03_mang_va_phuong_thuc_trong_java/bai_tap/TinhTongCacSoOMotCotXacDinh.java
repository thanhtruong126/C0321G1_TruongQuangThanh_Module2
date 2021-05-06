package bai3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class TinhTongCacSoOMotCotXacDinh {
    public static void main(String[] args) {
        // Khai báo và nhập kích thước cho mảng 2 chiều
        int rowSize;
        int colSize;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số hàng trong mảng: ");
        rowSize = sc.nextInt();
        System.out.print("Nhập số cột trong mảng: ");
        colSize = sc.nextInt();
        int arr [][] = new int[rowSize][colSize];
        // Nhập các phần tử vào mảng 2 chiều
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Nhập phần tử hàng thứ " + i + " cột " + j + " :");
                arr[i][j] = sc.nextInt();
            }
        }
        // In mảng
        System.out.println("Các phần tử trong mảng 2 chiều: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // Hỏi người dùng tính tổng cột số bao nhiêu
        System.out.print("Nhập cột muốn tính tổng: ");
        int colNum = sc.nextInt();
        // Tính tổng cột số colNum trong mảng
        int sumColNum = 0;
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == colNum) {
                    sumColNum += arr[i][j];
                }
            }
        }
        System.out.println("Tổng cột số " + colNum + " trong mảng là: " + sumColNum);
    }
}
