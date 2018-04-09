package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> map = new HashMap<>();
        for(String key : collection1){
            if (1 == key.length()){
                int count = map.getOrDefault(key, 0);
                map.put(key, count+1);
            }else if (key.charAt(1) == '-' || key.charAt(1) == ':'){
                int count = map.getOrDefault(key.substring(0,1), 0);
                map.put(key.substring(0,1), count + Integer.valueOf(key.substring(2)));
            }else if (key.charAt(1) == '['){
                int count = map.getOrDefault(key.substring(0,1), 0);
                map.put(key.substring(0,1), count + Integer.valueOf(key.substring(2, key.length()-1)));
            }
        }
        return map;
    }
}
