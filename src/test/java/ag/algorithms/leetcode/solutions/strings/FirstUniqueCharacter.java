package ag.algorithms.leetcode.solutions.strings;

import java.util.HashMap;

public class FirstUniqueCharacter {

    public int find(String text) {
        if (text == null) {
            return -1;
        }
        if (text.length() < 2) {
            return 1;
        }
        HashMap<Character, Integer> characterIntegerHashMap = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (!characterIntegerHashMap.containsKey(currentChar)) {
                characterIntegerHashMap.put(currentChar,i);
            } else {
                characterIntegerHashMap.put(currentChar,-1);
            }
        }

        int min = Integer.MAX_VALUE;

        for ( Character c: characterIntegerHashMap.keySet()) {
            if (characterIntegerHashMap.get(c) > -1 && characterIntegerHashMap.get(c) < min) {
                min = characterIntegerHashMap.get(c);
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;

    }
}
