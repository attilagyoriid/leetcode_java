package ag.algorithms.leetcode.solutions.strings;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {

    public int compute(String str) {
        int max = 0;
        int left = 0;
        HashSet<Character> charactersVisited = new HashSet<>();

        for (int right = 0; right < str.length(); right++) {

            while (charactersVisited.contains(str.charAt(right))) {
                charactersVisited.remove(str.charAt(left++));
            }
            charactersVisited.add(str.charAt(right));
            max = Math.max(right - left + 1, max);


        }

        return max;


    }
}
