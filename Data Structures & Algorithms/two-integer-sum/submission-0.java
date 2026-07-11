class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seen = new HashMap<>(); //<Number, Index>
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            if (seen.containsKey(target - val)) {
                return new int[]{seen.get(target - val), i}; 
        }
        seen.put(val, i);
    }
        return new int[]{-1, -1};
    }
}
