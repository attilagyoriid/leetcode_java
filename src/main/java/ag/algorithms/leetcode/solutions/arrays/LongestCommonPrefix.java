package ag.algorithms.leetcode.solutions.arrays;

public class LongestCommonPrefix {

    public String compute(String[] list) {

        if (list == null || list.length < 1) {
            return "";
        }

        StringBuilder longestCommonPrefix = new StringBuilder();
        int index = 0;
        for (char c : list[0].toCharArray()) {

            for (int i = 1; i < list.length; i++) {

                if (list[i].length()-1 < index || list[i].charAt(index)!= c) {
                    return longestCommonPrefix.toString();
                }
            }
            longestCommonPrefix.append(c);
            index++;

        }

        return longestCommonPrefix.toString();


    }
}
