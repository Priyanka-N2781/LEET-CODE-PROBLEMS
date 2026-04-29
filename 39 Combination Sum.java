import java.util.*;

class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(0, candidates, target, new ArrayList<>(), ans);
        return ans;
    }

    private void backtrack(int i, int[] arr, int target,
                           List<Integer> temp, List<List<Integer>> ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        if (i == arr.length) return;

        if (arr[i] <= target) {
            temp.add(arr[i]);
            backtrack(i, arr, target - arr[i], temp, ans); // pick
            temp.remove(temp.size() - 1);
        }

        backtrack(i + 1, arr, target, temp, ans); // skip
    }
}
