class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>> hashMap = new HashMap<>();

        for(String str:strs){

            char[] stringChar = str.toCharArray();

             Arrays.sort(stringChar);

             String sortedString = new String(stringChar);

            if(!hashMap.containsKey(sortedString)){
                hashMap.put(sortedString,new ArrayList<>());
            }
            hashMap.get(sortedString).add(str);
        }
        return new ArrayList<>(hashMap.values());
    }
}
