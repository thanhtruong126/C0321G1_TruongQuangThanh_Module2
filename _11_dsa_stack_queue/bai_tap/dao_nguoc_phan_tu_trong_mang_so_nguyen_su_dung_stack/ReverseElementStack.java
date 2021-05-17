package bai11_DSA_stack_queue.bai_tap.dao_nguoc_phan_tu_trong_mang_so_nguyen_su_dung_stack;

import java.util.Arrays;
import java.util.Stack;

public class ReverseElementStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] myArray = {23, 93, 56, 92, 39};
        int size = myArray.length;
        for(int i=0; i<size; i++) {
            stack.push(myArray[i]);
        }
        System.out.println(stack);
        int[] reverseArray = new int[size];
        for(int i=0; i<size; i++) {
            reverseArray[i] = stack.pop();
        }
        System.out.println("Reverse array: " + Arrays.toString(reverseArray));
    }
}
