class Solution {
    public int maxArea(int[] heights) {
        int left = 0, right = heights.length - 1; 
        long largestArea = 0; 
        while(left < right) {
            int min = Math.min(heights[left],heights[right]); 
            long area = min * (right-left); 
            if(area > largestArea) {
                largestArea = area; 
            }
            //System.out.println("Area is " + min + " * " + (right-left) + " = " + area); 
            if(min == heights[left]) {
                left++; 
            } else {
                right--;
            }
        }  

        return (int)largestArea; 
    }
}
