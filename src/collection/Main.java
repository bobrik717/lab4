package collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List array = new ArrayList();
        array.add(1);
        array.add(4);
        array.add("dsgadg");
        array.add("qqqqqqqqqqqQQQQQQQ");
        for(Object s: array){
            System.out.println(s);
        }
        
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
        
        Map<String,Integer> persons = new Hashtable<String, Integer>();
        persons.put("QQQ", 123);
        persons.put("AAA", 456);
        persons.put("ZZZ", 789);
        
        for(Map.Entry e: persons.entrySet()){
            System.out.printf("%s %d\n",e.getKey(),e.getValue());
        }
        
        for(String key: persons.keySet()){
            System.out.printf("%s %d\n",key,persons.get(key));
        }
    }
}
