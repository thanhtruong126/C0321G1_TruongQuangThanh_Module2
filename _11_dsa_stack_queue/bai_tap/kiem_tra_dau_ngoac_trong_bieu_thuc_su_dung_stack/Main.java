package bai11_DSA_stack_queue.bai_tap.kiem_tra_dau_ngoac_trong_bieu_thuc_su_dung_stack;

import java.util.Stack;

public class Main {
    public static boolean checkBracket(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push(str.charAt(i));
            } else if (str.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "s * (s – a) * (s – b) * (s – c)";
        String str1 = "s * (s – a) * (s – b) * (s – c))";

        System.out.println(checkBracket(str)); //true
        System.out.println(checkBracket(str1)); //false
    }
}
