package collection;

import java.util.Hashtable;
import java.util.Map;

public class Revers {
    public Map revers(Map array) {
        Map<Integer, String> revers = new Hashtable<Integer, String>();
        for (Object key : array.keySet()) {
            String name = (String) key;
            int age = (Integer) array.get(name);
            revers.put(age, name);
        }
        return revers;
    }
}
