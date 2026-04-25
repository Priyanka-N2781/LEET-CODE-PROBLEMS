class Solution {
    public int[] transformArray(int[] nums) {
        int[] ans = new int[nums.length];
        int left = 0 ;
        int rigth = ans.length-1;
        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i]%2==0){
                ans[left] = 0;
                left++;
            }else{
                ans[rigth] = 1;
                rigth--;
            }
        }
        return ans; 
    }
}
