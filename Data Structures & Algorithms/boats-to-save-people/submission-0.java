class Solution {
    public int numRescueBoats(int[] people, int limit) {

        if(people.length == 1) {
            return 1; 
        }
        int numBoats = 0; 
        int right = people.length -1; 
        int left = 0; 
        Arrays.sort(people);
        while(left <= right) {
            int currWeight = people[left] + people[right]; 
            
            if(currWeight > limit) {
                numBoats++; 
                right--;
            } else if(currWeight == limit) {
                numBoats++; 
                left++; 
                right--; 
            } else {
                numBoats++;
                left++; 
                right--; 
            }
 
        }

        return numBoats; 
    }
}