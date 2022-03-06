package ag.algorithms.leetcode.solutions.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

    public List<List<Integer>> getUniqueCombination(List<Integer> list, int target) {

        List<List<Integer>> result = new ArrayList<>();


        List<Integer> currentCombination = new ArrayList<>();
        dfs(0,currentCombination,0, result, target, list);

        return result;
    }

    private void dfs(int index, List<Integer> currentCombination, int total, List<List<Integer>> result, int target, List<Integer> list) {

        if (total == target) {
            result.add(List.copyOf(currentCombination));
            return;
        }
        if (total > target || index >= list.size()) {
            return;
        }

        currentCombination.add(list.get(index));
        dfs(index, currentCombination,total + list.get(index),result,target,list);
        currentCombination.remove(currentCombination.size()-1);
        dfs(index+1, currentCombination,total,result,target,list);



    }


}
