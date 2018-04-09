package cn.school.thoughtworks.section1;

import java.util.*;
import java.util.stream.Collectors;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        return collection1.stream().filter(n -> collection2.stream().findFirst().get().contains(n)).collect(Collectors.toList());
    }
}
