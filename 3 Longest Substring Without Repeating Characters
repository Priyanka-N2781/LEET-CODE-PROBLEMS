class Solution {
    public int lengthOfLongestSubstring(String s) {
       int[] freq = new int[256];
       int j=0;
       int ans=0;
       for(int i=0;i<s.length();i++){
        freq[s.charAt(i)]++;
        while(freq[s.charAt(i)]>1){
            freq[s.charAt(j)]--;
            j++;
        }
        ans=Math.max(ans,i-j+1);
       }
       return ans;
    }
}
