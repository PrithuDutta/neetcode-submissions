class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> combinations = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                    continue; 
                }

            int left = i + 1, right = nums.length - 1;
            int target = -1 * (0 + nums[i]);

            while (left < right) {
                int sum = nums[left] + nums[right];
                List<Integer> triplet = new ArrayList<>();
                if (sum > target) {
                    right--; 
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }

                } else if (sum < target) {
                    left++; 
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                } else {
                    triplet.add(nums[i]);
                    triplet.add(nums[left]);
                    triplet.add(nums[right]);
                    combinations.add(triplet);
                    left++;
                    right--;

                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                }
            }
        }
        return combinations;
    }
}
