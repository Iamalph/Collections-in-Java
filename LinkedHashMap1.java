package Collections;

import java.util.LinkedHashMap;
import java.util.Map;



public class LinkedHashMap1 {
    public static void main(String[] args){
        Map<String,Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("a",1);
        linkedHashMap.put("b",2);
        linkedHashMap.put("c",3);
        linkedHashMap.put("d",4);
        linkedHashMap.put("e",5);
        linkedHashMap.put("f",6);
        linkedHashMap.put("g",7);
        linkedHashMap.put("h",8);
        linkedHashMap.put("i",9);
        linkedHashMap.put("j",10);
        linkedHashMap.put("k",11);
        linkedHashMap.put("h",12);

        for(Map.Entry<String,Integer> entry:linkedHashMap.entrySet()){
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }
}
