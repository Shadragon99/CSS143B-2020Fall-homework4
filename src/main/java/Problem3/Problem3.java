package Problem3;

import Problem2.ListNode;

import java.io.PrintStream;

// received help from https://www.geeksforgeeks.org/print-reverse-of-a-linked-list-without-actually-reversing/
public class Problem3 {
    public static void printListInReverse(ListNode list, PrintStream print) {
        // homework
        if (list == null){
            return;
        }
        printListInReverse(list.next, print);

        System.out.print(list.val + " ");
    }
}
