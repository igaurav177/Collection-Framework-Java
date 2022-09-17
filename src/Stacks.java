import java.util.*;
public class Stacks {
    public static void main(String[] args) {
        Stack<Integer>  arr = new Stack<Integer>();
        arr.push(3);
        arr.push(4);
        arr.push(5);
        arr.push(7);
        arr.push(8);

        System.out.println(arr.size());
        System.out.println(arr.peek());
        int element= arr.pop();
        System.out.println(element);

    }
}
