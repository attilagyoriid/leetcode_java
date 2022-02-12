package ag.algorithms.leetcode.solutions.arrays;

public class MoveZeros {

    public int[] moveZeros(int[] items) {
        int left = 0;
        int temp;
        for (int right = 0; right < items.length; right++) {

            if (items[right] != 0) {

                temp = items[right];
                items[right] = items[left];
                items[left] = temp;
                left++;

            }

        }
        return items;

    }
}
