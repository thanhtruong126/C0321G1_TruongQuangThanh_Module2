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
        Queue queue = new LinkedList();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            queue.add(str.charAt(i));
            stack.push(str.charAt(i));
        }
        System.out.println(queue);
        System.out.println(stack);
        String reversStringQueue = "";
        String reversStringStack = "";

        while (!queue.isEmpty() && !stack.isEmpty()) {
            reversStringQueue = reversStringQueue + queue.remove();
            reversStringStack = reversStringStack + stack.pop();
        }
        System.out.println(reversStringQueue);
        System.out.println(reversStringStack);
        if (reversStringQueue.equals(reversStringStack))
            System.out.println("The input String is a palindrome.");
        else
            System.out.println("The input String is not a palindrome.");
    }
}
