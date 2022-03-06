package ag.algorithms.leetcode.solutions.strings;

import java.util.*;

public class MostCommonWord {

    public String getMostCommonWord(String paragraph, String[] banned) {

        String[] wordsToSearch = paragraph.replaceAll("\\p{Punct}", "").toLowerCase(Locale.ROOT).split("\\s+");
        Map<String, Integer> wordFrequency = new HashMap<>();

        for (String s : banned) {
            wordFrequency.put(s, -1);
        }

        for (String toSearch : wordsToSearch) {
            if (wordFrequency.containsKey(toSearch) && wordFrequency.get(toSearch) != -1) {
                wordFrequency.put(toSearch, wordFrequency.get(toSearch) + 1);
            } else if (!wordFrequency.containsKey(toSearch)) {
                wordFrequency.put(toSearch, 1);
            }
        }

        var max = wordFrequency.entrySet().stream().filter(e -> e.getValue() != -1).max(Map.Entry.comparingByValue());
        if (max.isPresent()) {
            return max.get().getKey();
        }
        return "";

    }
}
