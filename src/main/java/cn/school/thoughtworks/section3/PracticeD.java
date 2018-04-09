package cn.school.thoughtworks.section3;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        Map<String, Integer> collection3 = new HashMap<>();
        for(String key : collectionA){
            if (1 == key.length()){
                int count = collection3.getOrDefault(key, 0);
                collection3.put(key, count+1);
            }else{
                int count = collection3.getOrDefault(key.substring(0,1), 0);
                collection3.put(key.substring(0,1), count + Integer.valueOf(key.substring(2)));
            }
        }
        for(String key : collection3.keySet()){
            if (object.values().stream().flatMap(Collection::stream).collect(Collectors.toList()).contains(key)){
                if (collection3.get(key) >= 3){
                    int value = collection3.get(key);
                    collection3.put(key, value-value/3);
                }
            }
        }
        return collection3;
    }
}
