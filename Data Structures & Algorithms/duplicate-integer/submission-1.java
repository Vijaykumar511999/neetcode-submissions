class Solution {
    public boolean hasDuplicate(int[] nums) {
        

        Set<Integer> setInteger = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(setInteger.contains(nums[i])){
                return true;
            }else{
                setInteger.add(nums[i]);
                
            }
            
        }
        return false;
    }
}