package Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
    public static void main(String[] args) {
//        Map<String,Integer> hm = new HashMap<>();
        //TreeMap is same as HashMap only order is sorted.
        // TreeMap is not use generally Most cases.
        Map<String,Integer> hm = new TreeMap<>();

        hm.put("Oranges",2);
        hm.put("Apples",3);
        hm.put("Mango",5);
        hm.put("PineApples",1);

        System.out.println(hm.get("Apples"));

        hm.put("Apples",5);
        System.out.println(hm.get("Apples"));

//      System.out.println(hm.get("Banana"));
//      int x=hm.get("Banana");  // it thorw null pointer exception so,
        System.out.println(hm.containsKey("Banana"));

        if(hm.containsKey("Banana")){
            int x=hm.get("Banana");
        }

//        System.out.println(Arrays.asList(hm));



    }
}
