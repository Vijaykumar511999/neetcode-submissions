class Solution {
    public boolean isAnagram(String s, String t) {

        char[] s1Char = s.toCharArray();
        char[] s2Char = t.toCharArray();

        Arrays.sort(s1Char);
        Arrays.sort(s2Char);

        boolean res = Arrays.equals(s1Char,s2Char);
        return res;
    }
}
