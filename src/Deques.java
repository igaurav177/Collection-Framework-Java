import java.util.ArrayDeque;
import java.util.Deque;

public class Deques {
    public static void main(String[] args) {
        Deque<Integer> arr = new ArrayDeque<>();

        arr.add(1);
        arr.add(3);
        arr.add(34);
        arr.addLast(5);
        arr.addFirst(0);
       int element= arr.removeLast();
        System.out.println(arr.peek());
        System.out.println(element);

        for(int i=0;i<arr.size();i++){
            System.out.print(arr.getFirst());
        }

    }
}
