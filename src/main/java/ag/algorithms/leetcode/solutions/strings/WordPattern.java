package ag.algorithms.leetcode.solutions.strings;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

    public boolean isValid(String pattern, String words) {

        if (pattern == null || words == null || pattern.length() < 1 || words.length() < 1) {
            return false;
        }

        String[] wordList = words.split(" ");
        if (wordList.length != pattern.length()) {
            return false;
        }
        Map<Character, String> characterToWord = new HashMap<>();
        Map<String, Character> wordToCharacter = new HashMap<>();

        for (int i = 0; i < wordList.length - 1; i++) {

            char currentCharacterPattern = pattern.charAt(i);
            String currentWord = wordList[i];
            if (characterToWord.containsKey(currentCharacterPattern) && !characterToWord.get(currentCharacterPattern).equals(currentWord)) {
                return false;
            }
            if (wordToCharacter.containsKey(currentWord) && !wordToCharacter.get(currentWord).equals(currentCharacterPattern)) {
                return false;
            }

            characterToWord.put(currentCharacterPattern, currentWord);
            wordToCharacter.put(currentWord, currentCharacterPattern);

        }
        return true;
    }
}
