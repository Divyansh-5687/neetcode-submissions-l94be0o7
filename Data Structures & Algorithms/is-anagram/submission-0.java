class Solution {
    public boolean isAnagram(String s, String t) {
        // Step 1: Check lengths
        if (s.length() != t.length()) return false;

        // Step 2: Frequency array for 26 lowercase letters
        int[] freq = new int[26];

        // Step 3: Count frequencies from s and subtract with t
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++; // increment for s
            freq[t.charAt(i) - 'a']--; // decrement for t
        }

        // Step 4: If all frequencies are 0, it's an anagram
        for (int count : freq) {
            if (count != 0) return false;
        }

        return true;  
    }
}
