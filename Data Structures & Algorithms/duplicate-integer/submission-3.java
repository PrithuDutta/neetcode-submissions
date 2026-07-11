class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> frequency = new HashSet<>(); 

        for(int i = 0; i < nums.length; i++) {
            if(frequency.contains(nums[i])) {
                return true;
            } else {
                frequency.add(nums[i]); 
            }
        }
        return false; 
    }
}