package bai11_DSA_stack_queue.bai_tap.kiem_tra_dau_ngoac_trong_bieu_thuc_su_dung_stack;

import java.util.Stack;

public class CheckBracket {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String str = "s * (s – a) * (s – b) * (s – c)";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '{' || str.charAt(i) == '(' || str.charAt(i) == '[' ) {
                stack.push(str.charAt(i));
            } else if (!stack.empty() && (
                        (str.charAt(i) == '}' && stack.peek() == '{') ||
                        (str.charAt(i) == ')' && stack.peek() == '(') ||
                        (str.charAt(i) == ']' && stack.peek() == '['))) {
                stack.pop();
            } else {
                stack.push(str.charAt(i));
            }
        }
        if (stack.empty()) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not balanced");
        }
    }
}
