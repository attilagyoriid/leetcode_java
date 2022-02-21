package ag.algorithms.leetcode.solutions.arrays;

public class RotateArray {

    public void rotate(int[] list, int k) {

        k = k % list.length;
        int[] temp = new int[list.length];

        for (int i = 0; i < list.length; i++) {

            temp[(i + k) % list.length] = list[i];

        }

        System.arraycopy(temp, 0, list, 0, temp.length);
    }

    public void rotateInPlace(int[] list, int k) {
        k = k % list.length;

        int l = 0;
        int r = list.length - 1;
        reverseArray(list, l, r);
        reverseArray(list, l, k - 1);
        reverseArray(list, k, list.length - 1);
    }

    private void reverseArray(int[] list, int left, int right) {

        while (left < right) {
            int temp = list[left];
            list[left] = list[right];
            list[right] = temp;
            left++;
            right--;
        }

    }
}
