class Solution {
    public String customSortString(String order, String s) {
         // Step 1: Count frequency of characters in s
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        StringBuilder result = new StringBuilder();

        // Step 2: Add characters in the order specified by 'order'
        for (char c : order.toCharArray()) {
            if (freq.containsKey(c)) {
                int count = freq.get(c);
                for (int i = 0; i < count; i++) {
                    result.append(c);
                }
                freq.remove(c); // remove processed char
            }
        }

        // Step 3: Add remaining characters (not in 'order')
        for (char c : freq.keySet()) {
            int count = freq.get(c);
            for (int i = 0; i < count; i++) {
                result.append(c);
            }
        }

        return result.toString();
    }
}