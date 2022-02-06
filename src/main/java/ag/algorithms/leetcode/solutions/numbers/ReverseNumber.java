package ag.algorithms.leetcode.solutions.numbers;

public class ReverseNumber {

    public int calculate(int number) {
        int result = 0;
        int remainder;
        while (number != 0) {

            remainder = number % 10;

            result = (result * 10) + remainder;
            number /= 10;
        }

        return result;
    }
}
