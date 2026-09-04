class Solution {
    public int[] productExceptSelf(int[] nums) {
        /*
        The output of this problem is to have the product of the array without the product of arr[i] being included. the brute force method is to just force compute through iteration, a way we could make this faster is to essentially just "cache" the solution right? so we can store a multiplication in a hashtable like 1 *2 or 4*6 so we can just look up the answer instead of having to recompute kind of like 2sum but that doesn't fit O(N) nor does it seem like the right solution here
        Im thinking prefix sum or prefix multiplication right?
        Input [1,2,4,6], 
        Output [48,24,12,8], 
        PrefixSum [1,3,7,13], 
        PrefixMul[1,2,8,48]

        But how do these relate, and I need to solve this in One pass for O(N) timing
        the issue with the prefix is the mutliplication or addition includes arr[i], and the follow up is we aren't allowed to use the division operation. Lets start without the follow up for right now. so if we reverse the PrefixMul array so it becomes [48,8,2,1]. How am i ment to be getting ot 12 and 24? if we look at 12 its made up of 6 2 from 2 * 6 * 1 * (4/4) and 24 is the same with 1 * (2/2) * 4 * 6 but how do we relate that to the prefix is the hard part. 

        We split the prefixsum into Prefix and Suffix essentially splitting up arr[1]
        */
        

        //prefix
        int[] prefix = new int[nums.length]; 
        prefix[0] = 1; 
 
        for(int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i-1] * nums[i-1]; 

        }

        //suffix
        int[] suffix = new int[nums.length]; 
        suffix[nums.length - 1] = 1;

        for(int i = nums.length - 2; i >= 0; i--) {
            suffix[i] = suffix[i+1] * nums[i+1]; 
        }

        //output:
        int[] output = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            output[i] = prefix[i] * suffix[i];
        }


        //placeholder
        return output;
    }
}  
