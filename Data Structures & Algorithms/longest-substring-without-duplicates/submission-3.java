class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if(s.length() <= 1) {
            return s.length(); 
        }
        
        int maxLength = 0;
        int left = 0;
        int right = 0;

        HashSet<Character> seen = new HashSet<>();
        while (right < s.length()) {
          
            if (!(seen.add(s.charAt(right)))) {

                while (seen.contains(s.charAt(right))) {
                    seen.remove(s.charAt(left));
                    left++;
                }
            }
            seen.add(s.charAt(right));
            int currLength = right - left + 1;
            if (currLength > maxLength) {
                maxLength = currLength;
            }

            right++;
        }

        return maxLength;
    }
}
