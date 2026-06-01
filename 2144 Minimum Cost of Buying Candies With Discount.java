class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int t = 0;
        int l = cost.length;
        for(int i=0;i<l;i+=3){
            t += cost[l-1-i];
            if(i+1 < l){
                t += cost[l-1-(i+1)];
            }
        }
        return t;
    }
}

