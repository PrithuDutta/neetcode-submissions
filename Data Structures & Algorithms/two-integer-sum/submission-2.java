class Solution {
    public int[] twoSum(int[] nums, int target) {
        //seen<Value, Index>
        HashMap<Integer, Integer> seen = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            if(seen.containsKey(target - nums[i])) {
                return new int[] {seen.get(target-nums[i]), i};
            }
            seen.putIfAbsent(nums[i], i);
        }

        return new int[] {0,0}; //in case of non-existant pair
    }
}
