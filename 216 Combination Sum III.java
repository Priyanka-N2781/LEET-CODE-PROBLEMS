import java.util.*;
public class CombinationSumIII {
    static void findCombinations(int k, int target, int start, ArrayList<Integer> current, int sum) {
        if(current.size() == k && sum == target) {
            for(int num : current) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }
        if(current.size() > k || sum > target) {
            return;
        }
        for(int i = start; i <= 9; i++) {
            current.add(i);   
            findCombinations(k, target, i + 1, current, sum + i);
            current.remove(current.size() - 1); 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        ArrayList<Integer> current = new ArrayList<>();
        findCombinations(k, n, 1, current, 0);
    }
}
