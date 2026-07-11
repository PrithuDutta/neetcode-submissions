class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagramSorter = new HashMap<>();
        for (String s : strs) {
            int[] masterArray = new int[26]; 
            for(char c : s.toCharArray()) {
                masterArray[c - 'a']++; 
            }
            String key = Arrays.toString(masterArray); 
            anagramSorter.computeIfAbsent(key, 
                k -> new ArrayList<>()).add(s);

        }

        List<List<String>> groupedAnagrams = new ArrayList<>(); 
        for(String i : anagramSorter.keySet()) {
            groupedAnagrams.add(anagramSorter.get(i));
        }
        return groupedAnagrams; 
    }
}
