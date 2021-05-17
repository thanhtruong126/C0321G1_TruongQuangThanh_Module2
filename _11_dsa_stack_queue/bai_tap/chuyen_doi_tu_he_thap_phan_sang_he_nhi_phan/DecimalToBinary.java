package bai11_DSA_stack_queue.bai_tap.chuyen_doi_tu_he_thap_phan_sang_he_nhi_phan;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("Enter decimal number: ");
        int num = sc.nextInt();

        while (num != 0) {
            int temp = num % 2;
            stack.push(temp);
            num = num/2;
        }
        System.out.println(stack);
    }
}
