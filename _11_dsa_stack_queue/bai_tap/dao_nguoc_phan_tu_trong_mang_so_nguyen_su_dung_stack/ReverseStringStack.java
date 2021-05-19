package bai11_DSA_stack_queue.bai_tap.dao_nguoc_phan_tu_trong_mang_so_nguyen_su_dung_stack;

import java.util.Stack;

public class ReverseStringStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        String string = "mygedoC";
        String[] stringSplit = string.split("");
        System.out.println("String before reverse: " + string);
        /*int size = stringSplit.length;
        for (int i = 0; i < size; i++) {
            stack.push(stringSplit[i]);
        }*/
        for (String element : stringSplit) {
            stack.push(element);
        }
        string = "";
        while (!stack.isEmpty()){
            string = string + stack.pop();
        }

        System.out.println("Reverse string: " + string);
    }
}
