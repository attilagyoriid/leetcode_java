package ag.algorithms.leetcode.solutions.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AnagramGroups {

    public List<List<String>> group(List<String> list) {

        HashMap<HashMap<Character, Integer>, List<String>> hashMapListHashMap = new HashMap<>();

        for (String item : list) {
            HashMap<Character, Integer> count = new HashMap<>();
            for (int i = 0; i < item.length(); i++) {
                if (!count.containsKey(item.charAt(i))) {
                    count.put(item.charAt(i), 0);
                }
                count.put(item.charAt(i), count.get(item.charAt(i)) + 1);
            }
            if (!hashMapListHashMap.containsKey(count)) {
                hashMapListHashMap.put(count, new ArrayList<>());
            }
            List<String> strings = hashMapListHashMap.get(count);
            strings.add(item);
        }

        return new ArrayList<>(hashMapListHashMap.values());


    }
}
