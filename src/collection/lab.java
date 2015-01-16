package collection;

import java.util.*;

public class lab {
    public static void main(String[] args) {
        Map<String, Integer> persons = new Hashtable<String, Integer>();
        persons.put("QQQ", 123);
        persons.put("AAA", 456);
        persons.put("ZZZ", 789);        
        
        Revers revers = new Revers();
        
        Map<Integer,String> r = revers.revers(persons);
        
        for(Map.Entry e: r.entrySet()){
            System.out.printf("%d %s\n",e.getKey(),e.getValue());
        }
    }
}
