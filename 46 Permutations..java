import java.util.*;

public class Main {

    static List<List<Integer>> ans = new ArrayList<>();

    static void backtrack(int[] nums, List<Integer> temp, boolean[] used) {

        if(temp.size() == nums.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0;i<nums.length;i++) {

            if(used[i]) continue;

            used[i] = true;
            temp.add(nums[i]);

            backtrack(nums, temp, used);

            temp.remove(temp.size()-1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i=0;i<n;i++)
            nums[i] = sc.nextInt();

        backtrack(nums, new ArrayList<>(), new boolean[n]);

        System.out.println(ans);
    }
}
