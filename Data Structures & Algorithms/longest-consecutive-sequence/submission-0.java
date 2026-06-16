class Solution {
    public int longestConsecutive(int[] nums) {
        
        Map<Integer,Boolean> exposedMap = new HashMap<>();
        int longestLength=0;
        for(int num:nums){
            exposedMap.put(num,Boolean.FALSE);
        }

        for(int num:nums){
            int currentLength=1;
            
            //CHECK FROM FORWARD DIRECTION
            int nextNum=num+1;
            while(exposedMap.containsKey(nextNum) && exposedMap.get(nextNum)==false){
                currentLength++;
                exposedMap.put(nextNum,Boolean.TRUE);
                nextNum++;
            }

            
            //CHECK FROM REVERSE DIRECTION
            int prevNum=num-1;
            while(exposedMap.containsKey(prevNum) && exposedMap.get(prevNum)==false){
                currentLength++;
                exposedMap.put(prevNum,Boolean.TRUE);
                prevNum--;
            }

            longestLength = Math.max(currentLength,longestLength);
        
        }
        return longestLength;
    }
}
