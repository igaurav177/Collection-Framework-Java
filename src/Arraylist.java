import java.util.*;
public class Arraylist {

    public static void main(String[] args ) {
//       ArrayList<Integer> arr = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(34);
        arr.add(12);
        arr.add(2);
        arr.add(1,5);
        //change the value of particular index
        arr.set(1,0);
        boolean exsist= arr.contains(0);
        System.out.println(exsist);
        System.out.println(arr.size());

        for(int index=0;index<arr.size();index++){
            System.out.print(arr.get(index)+" ");
        }
        System.out.println();
//        arr.remove(1);
//        System.out.println(arr.size());


    }
}
