import java.util.*;

public class Main {

    static int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};

    public static void dfs(int[][] grid, int i, int j) {
        int m = grid.length, n = grid[0].length;

        if(i<0 || j<0 || i>=m || j>=n || grid[i][j]==1)
            return;

        grid[i][j] = 1;

        for(int[] d : dir)
            dfs(grid, i+d[0], j+d[1]);
    }

    public static int closedIsland(int[][] grid) {
        int m = grid.length, n = grid[0].length;

        // remove border islands
        for(int i=0;i<m;i++) {
            if(grid[i][0]==0) dfs(grid,i,0);
            if(grid[i][n-1]==0) dfs(grid,i,n-1);
        }

        for(int j=0;j<n;j++) {
            if(grid[0][j]==0) dfs(grid,0,j);
            if(grid[m-1][j]==0) dfs(grid,m-1,j);
        }

        int count = 0;

        // count remaining islands
        for(int i=1;i<m-1;i++) {
            for(int j=1;j<n-1;j++) {
                if(grid[i][j]==0) {
                    count++;
                    dfs(grid,i,j);
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] grid = new int[m][n];

        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                grid[i][j] = sc.nextInt();

        System.out.println(closedIsland(grid));
    }
}
