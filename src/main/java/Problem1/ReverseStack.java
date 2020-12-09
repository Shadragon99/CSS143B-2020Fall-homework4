package Problem1;

import java.util.Stack;

public class ReverseStack {

    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        reverseStack(stack);
    }

    private static int start = 0;

    public static void reverseStack(Stack<Integer> stack) {
        // homework
        if(stack.size() < 2){
            return;
        }
        else if (start < stack.capacity()/2){
            swap(stack, start, stack.size() - start - 1);
            start ++;
            reverseStack(stack);
        }
    }

    //helper method to swap two elements
    public static void swap(Stack<Integer> stack, int s, int e){
        int temp = stack.indexOf(s);
        stack.add(s, e);
        stack.remove(s+1);
        stack.add(e, temp);
        stack.remove(e+1);
    }

}