import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int indexDiff = sc.nextInt();
        int valueDiff = sc.nextInt();

        int nums[] = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        boolean found = false;

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {

                if(Math.abs(i - j) <= indexDiff &&
                   Math.abs((long)nums[i] - nums[j]) <= valueDiff) {
                    found = true;
                    break;
                }
            }
            if(found) break;
        }

        System.out.println(found ? "true" : "false");
    }
}
