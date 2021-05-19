package bai11_DSA_stack_queue.bai_tap.kiem_tra_chuoi_palindrome_su_dung_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String str = sc.nextLine();
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        boolean check = true;

        for (int i = 0; i < str.length(); i++) {
            queue.add(str.charAt(i));
            stack.add(str.charAt(i));
        }

        for (int j = 0; j < (str.length()/2); j++) {
            if (queue.peek()==stack.peek()) {
                queue.remove();
                stack.pop();
            } else {
                check = false;
                break;
            }
        }

        if (check)
            System.out.println("The input String is a palindrome.");
        else
            System.out.println("The input String is not a palindrome.");
    }
}
