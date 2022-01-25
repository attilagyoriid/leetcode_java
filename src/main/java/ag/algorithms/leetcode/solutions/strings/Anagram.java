package ag.algorithms.leetcode.solutions.strings;


public class Anagram {
    public boolean isAnagram(String text1, String text2) {
        if (text1 == null || text2 == null || text1.length() <= 0 || text2.length() <= 0 || (text1.length() != text2.length())) {
            return false;
        }
        int[] frequency = new int[26];


        String text1Lower = text1.toLowerCase();
        String text2Lower = text2.toLowerCase();


        for (int i = 0; i < text1Lower.length(); i++) {
            char currentChar = text1Lower.charAt(i);
            frequency[currentChar - 'a']++;
        }

        for (int i = 0; i < text2Lower.length(); i++) {
            char currentChar = text2Lower.charAt(i);
            frequency[currentChar - 'a']--;
        }
        for (int j : frequency) {
            if (j != 0) {
                return false;
            }
        }

        return true;
    }
}
