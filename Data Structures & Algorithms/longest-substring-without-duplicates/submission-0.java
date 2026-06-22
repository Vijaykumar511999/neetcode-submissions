class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int maxLength=0;
        int left=0;
        Set<Character> res = new HashSet<>();
        for(int right=0;right<s.length();right++){
            while(res.contains(s.charAt(right))){
                res.remove(s.charAt(left));
                left++;
            }
            res.add(s.charAt(right));
            maxLength= Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }
}
