class Solution {
    public int maxDifference(String s) {
         HashMap<Character, Integer> freqMap = new HashMap<>();

        // Step 1: Count character frequencies
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        List<Integer> oddFreqs = new ArrayList<>();
        List<Integer> evenFreqs = new ArrayList<>();

        // Step 2: Separate frequencies
        for (int freq : freqMap.values()) {
            if (freq % 2 == 1) {
                oddFreqs.add(freq);
            } else {
                evenFreqs.add(freq);
            }
        }

        // Step 3: Calculate max difference
        int maxDiff = Integer.MIN_VALUE;
        for (int odd : oddFreqs) {
            for (int even : evenFreqs) {
                maxDiff = Math.max(maxDiff, odd - even);
            }
        }

        return maxDiff;
    }

    
}