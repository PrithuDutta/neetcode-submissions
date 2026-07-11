class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        for(int i : nums) {
            seen.put(i, seen.getOrDefault(i, 0) + 1);  
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> seen.get(b) - seen.get(a)
        );

        pq.addAll(seen.keySet()); 
        int[] topK = new int[k];

        for(int i = 0; i < topK.length; i++) {
            topK[i] = pq.poll(); 
        }
        
        return topK; 
        
    }
}
