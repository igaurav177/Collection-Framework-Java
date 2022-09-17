import java.util.*;
public class Queues {
    public static void main(String[] args) {
        Queue<Integer> arr= new PriorityQueue<>();
        // min priorityQueues by default
        arr.add(5);
        arr.add(4);
        arr.add(3);
        System.out.println(arr.peek());
        int element=arr.remove();
        System.out.println(element);


    }
}
