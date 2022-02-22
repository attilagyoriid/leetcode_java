package ag.algorithms.leetcode.solutions.strings;

import java.util.Arrays;

public class WordBreak {

    public boolean canBreak(String text, String[] wordDictionary) {

        boolean[] hits = new boolean[text.length()+1];
        Arrays.fill(hits,false);
        hits[text.length()] = true;

        for (int i = text.length() - 1; i > -1; i--) {

            for (String word : wordDictionary) {

                if (i + word.length() <= text.length() && word.equals(text.substring(i, i + word.length()))) {

                    hits[i] = hits[i + word.length()];
                    if (hits[i]) {
                        break;
                    }

                }

            }


        }
        return hits[0];

    }


}
