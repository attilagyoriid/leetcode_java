package ag.algorithms.leetcode.solutions.numbers;

import java.util.HashSet;

public class HappyNumber {

    public boolean isHappy(int number) {

        HashSet<Integer> visited = new HashSet<>();

        while (number != 1) {
            int currentNumber = number;
            int sum = 0;
            while (currentNumber != 0) {

                sum += (currentNumber % 10) * (currentNumber % 10);

                currentNumber /= 10;
            }

            if (visited.contains(sum)) {
                return false;
            }
            visited.add(sum);
            number = sum;

        }

        return true;


    }
}
