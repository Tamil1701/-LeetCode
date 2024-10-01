class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> occurrenceMap = new HashMap<>();
        
        for (int num : arr) {
            occurrenceMap.put(num, occurrenceMap.getOrDefault(num, 0) + 1);
        }
        
        HashSet<Integer> occurrenceSet = new HashSet<>(occurrenceMap.values());
        
        return occurrenceSet.size() == occurrenceMap.size();
    }
}