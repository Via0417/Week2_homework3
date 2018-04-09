package cn.school.thoughtworks.section3;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        for(String key : collectionA.keySet()){
            if (object.values().stream().flatMap(Collection::stream).collect(Collectors.toList()).contains(key)){
                if (collectionA.get(key) >= 3){
                    int value = collectionA.get(key);
                    collectionA.put(key, value-value/3);
                }
            }
        }
        return collectionA;
    }
}
