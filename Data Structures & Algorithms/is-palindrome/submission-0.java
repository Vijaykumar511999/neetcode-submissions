class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuilder sb = new StringBuilder();
        for(Character c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }
        String convertedStr = sb.toString();
        int left=0;
        int right=convertedStr.length()-1;
        while(left<right){
            if(convertedStr.charAt(left)==convertedStr.charAt(right)){
                left++;
                right--;
            }else{
                return false;
            }
        }
        return true;
    }
}
