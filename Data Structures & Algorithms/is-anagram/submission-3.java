class Solution {
    public boolean isAnagram(String s, String t) {
        //if the lengths are uneven - impossible to be an Anagram
        if(s.length() != t.length()) {
            return false; 
        }
        //only lowercase English Letters a-z, 26 possible positions
        int[] masterArray = new int[26]; 
        //add 1 at location of char for string s
        for(int i = 0; i < s.length(); i++) {
            //add 1 at location of char for string s
            masterArray[((int) s.charAt(i)) - 'a']++;
            //subtract 1 at location of char for string t 
            masterArray[((int) t.charAt(i)) - 'a']--;
        }
        //check if the masterArray is all 0s
        for(int i : masterArray) {
            if(i != 0) {
                return false; 
            }
        }
        return true; 
    }
}
