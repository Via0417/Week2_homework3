package cn.school.thoughtworks.section3;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        /*collectionA.forEach((k,v) ->
        {
            if (object.values().stream().flatMap(Collection::stream).collect(Collectors.toList()).contains(k))
                v = v-1;
        });*/
        for(String key : collectionA.keySet()){
            if (object.values().stream().flatMap(Collection::stream).collect(Collectors.toList()).contains(key)){
                int value = collectionA.get(key);
                collectionA.put(key, value-1);
            }
        }
        return collectionA;
    }
}
