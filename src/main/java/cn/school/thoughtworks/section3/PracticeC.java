package cn.school.thoughtworks.section3;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        Map<String, Long> map = collectionA.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        for(String key : map.keySet()){
            if (object.values().stream().flatMap(Collection::stream).collect(Collectors.toList()).contains(key)){
                if (map.get(key) >= 3){
                    long value = map.get(key);
                    map.put(key, value-value/3);
                }
            }
        }
        Map<String, Integer> collection3 = convertLongToInteger(map);
        return collection3;
    }
    static Map<String, Integer> convertLongToInteger(Map<String, Long> map){
        Map<String, Integer> result = new HashMap<>();
        for (String s: map.keySet()){
            result.put(s, Math.toIntExact(map.get(s)));
        }
        return result;
    }
}
