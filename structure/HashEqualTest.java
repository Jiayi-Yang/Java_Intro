package structure;

import java.util.HashMap;
import java.util.Map;

public class HashEqualTest {

    public static void main(String[] args) {
        Map<DataKey, Integer> hm = getAllData();
        DataKey dk2 = new DataKey();
        dk2.setId(1L);
        dk2.setName("test1");
        System.out.println(dk2.hashCode());
        Integer value = hm.get(dk2);
        System.out.println(value);
    }

    public static Map<DataKey,Integer> getAllData(){
        Map<DataKey, Integer> hm = new HashMap<>();
        DataKey dk1 = new DataKey();
        dk1.setId(1L);
        dk1.setName("test1");
        System.out.println(dk1.hashCode());
        hm.put(dk1,10);
        return hm;
    }
}
