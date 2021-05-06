package bai3_mang_va_phuong_thuc_trong_java.bai_tap;

public class TimPhanTuLonNhatTrongMang2Chieu {
    public static void main(String[] args) {
        // Tao mang 2 chieu cho truoc
        int[][] arr = {
                {1,2,3},
                {23,11,5},
        };
        System.out.println("Các phần tử trong mảng 2 chiều: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        // Tim phan tu lon nhat trong mang 2 chieu
        int max = arr[0][0];
        int x = 0;
        int y = 0;
        for (int i = 0; i< arr.length; i++ ) {
            for (int j = 0; j < arr[i].length; j++){
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng là " + max + " ở vị trí " + x + " , " + y);
    }
}
