package bai3_mang_va_phuong_thuc_trong_java.thuc_hanh;

public class FindMinimum {
    // Cho mảng arr và tìm giá trị nhỏ nhất trong mảng
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9, -9};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);
    }
    // Phương thức duyệt mảng và trả về index có giá trị nhỏ nhất
    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
