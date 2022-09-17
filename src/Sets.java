import java.util.*;

public class Sets {
    public static void main(String[] args) {
//        Set<Integer> hs = new HashSet<>();
        Set<Integer> hs = new TreeSet<>();
        hs.add(2);
        hs.add(1);
        hs.add(4);
        hs.add(3);
        hs.add(1);
        for(int i:hs){
            System.out.print(i+" ");
        }
        hs.remove(3);
        System.out.println();
        Iterator<Integer> it=hs.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }

    }
}
