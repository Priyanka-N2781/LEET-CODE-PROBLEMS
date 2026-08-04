import java.util.*;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length - 1; i++) {
            // Skip duplicate elements
            if (nums[i] == nums[i + 1])
                continue;

            // Add all missing numbers between consecutive elements
            for (int x = nums[i] + 1; x < nums[i + 1]; x++) {
                ans.add(x);
            }
        }

        return ans;
    }
}
