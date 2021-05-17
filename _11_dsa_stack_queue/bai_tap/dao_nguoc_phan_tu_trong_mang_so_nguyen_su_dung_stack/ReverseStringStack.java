package bai11_DSA_stack_queue.bai_tap.dao_nguoc_phan_tu_trong_mang_so_nguyen_su_dung_stack;

import java.util.Arrays;
import java.util.Stack;

public class ReverseStringStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        String array = "mygedoC";
        String[] arraySplit = array.split("");
        int size = arraySplit.length;
        for (int i = 0; i < size; i++) {
            stack.push(arraySplit[i]);
        }
        System.out.println(stack);
        String[] reverseArray = new String[size];
        for (int i = 0; i < size; i++) {
            reverseArray[i] = stack.pop();
        }
        StringBuilder arrayReverse = new StringBuilder();
        for (int i = 0; i < size; i++) {
            arrayReverse.append(reverseArray[i]);
        }
        System.out.println("Reverse string: " + arrayReverse);
    }
}
