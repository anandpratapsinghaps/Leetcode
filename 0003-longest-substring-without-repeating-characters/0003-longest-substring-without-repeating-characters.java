class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] freq = new int[256];
        int si = 0, ei = 0, ans = 0;
        while(ei < s.length()){
            //grow
            char ch = s.charAt(ei);
            freq[ch]++;

            //shrink
            while(freq[ch] > 1){
                char ch1 = s.charAt(si);
                freq[ch1]--;
                si++;
            }
            //ans
            ans = Math.max(ans, ei - si + 1);
            ei++;
        }
        return ans;
    }
}