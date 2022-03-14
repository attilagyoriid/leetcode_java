package ag.algorithms.leetcode.solutions.strings;

import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.PriorityQueue;

public class LongestHappyString {

    public String getLongestHappyString(int a, int b, int c) {
        StringBuilder result = new StringBuilder();
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>((x1,x2)-> x2.getValue()-x1.getValue()
        );

        Map.Entry<Character,Integer> entryA =
                new AbstractMap.SimpleEntry<>('a', a);
        Map.Entry<Character,Integer> entryB =
                new AbstractMap.SimpleEntry<>('b', b);
        Map.Entry<Character,Integer> entryC =
                new AbstractMap.SimpleEntry<>('c', c);
        maxHeap.add(entryA);
        maxHeap.add(entryB);
        maxHeap.add(entryC);

        while (!maxHeap.isEmpty()) {

            Map.Entry<Character, Integer> characterWithHighestOccurrence = maxHeap.poll();
            int currentHighestCount = characterWithHighestOccurrence.getValue();
            // it would be the third contiguous same character in a row
            if (result.length() > 1 && result.charAt(result.length()-1) == result.charAt(result.length()-2) && result.charAt(result.length()-1) == characterWithHighestOccurrence.getKey()) {
                if (maxHeap.isEmpty()) {
                    break;
                }
                Map.Entry<Character, Integer> characterWithSecondHighestOccurrence = maxHeap.poll();
                result.append(characterWithSecondHighestOccurrence.getKey());
                int currentNextHighestCount = characterWithSecondHighestOccurrence.getValue() - 1;
                if (currentNextHighestCount != 0) {
                    maxHeap.add(new AbstractMap.SimpleEntry<>(characterWithSecondHighestOccurrence.getKey(), currentNextHighestCount));
                }


            } else {

                result.append(characterWithHighestOccurrence.getKey());
                currentHighestCount--;


            }
            if (currentHighestCount!=0) {
                maxHeap.add(new AbstractMap.SimpleEntry<>(characterWithHighestOccurrence.getKey(), currentHighestCount));
            }

        }

        return result.toString();

    }
}
