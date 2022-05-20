import java.io.*;
import java.util.*;
public class study {
    public static void main (String[] args){
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(7);
        stack.push(8);
        stack.pop();
        stack.peek();
        stack.push(15);

        System.out.println(stack);
    }
}
