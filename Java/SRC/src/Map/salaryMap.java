package Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.function.BiFunction;

/**
 * Created by riosysm on 2017/10/24.
 */
public class salaryMap {
    public static  void main(String[] args){
        HashMap<String, Integer> salaryMap = new HashMap<>();
        salaryMap.put("����", 800);
        salaryMap.put("����", 1500);
        salaryMap.put("����", 3000);
        System.out.println(salaryMap);

        BiFunction<Integer,Integer,Integer> minuSelf = (V1, V2) -> V2 - V1;
        salaryMap.merge("����", 4000, minuSelf);
        System.out.println(salaryMap);
    }
}
