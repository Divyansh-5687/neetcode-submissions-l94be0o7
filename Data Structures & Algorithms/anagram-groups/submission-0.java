class Solution {
    private String getFrequencyString(String str) {
        // Frequency bucket for 26 lowercase English letters
        int[] freq = new int[26];
        
        for (char c : str.toCharArray()) {
            freq[c - 'a']++;
        }

        // Build a unique string representation of the frequency
        StringBuilder frequencyString = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            frequencyString.append('#'); // separator to avoid ambiguity
            frequencyString.append(freq[i]);
        }
        return frequencyString.toString();
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            String frequencyString = getFrequencyString(str);

            map.computeIfAbsent(frequencyString, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
