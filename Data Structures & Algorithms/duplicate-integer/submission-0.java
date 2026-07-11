class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> hasNum = new HashMap<>();

        for(int num : nums) {
            hasNum.put(num, hasNum.getOrDefault(num, 0) + 1);

            if(hasNum.containsValue(2)){
                return true; 
            }
        }
        return false; 
    }
}