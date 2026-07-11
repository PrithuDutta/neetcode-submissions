class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false; 
        }
        int[] masterArray = new int[26]; 
        for(int i = 0; i < s.length(); i++) {
            masterArray[((int) s.charAt(i)) - 'a']++;
            masterArray[((int) t.charAt(i)) - 'a']--;
        }

        for(int i : masterArray) {
            if(i != 0) {
                return false; 
            }
        }
        return true; 
    }
}
