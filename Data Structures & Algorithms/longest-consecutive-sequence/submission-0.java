

class Solution {
    public int longestConsecutive(int[] nums) {
        int longestLength = 0;
        HashMap<Integer, Boolean> map = new HashMap<>();

        // Mark all numbers as unvisited
        for (int num : nums) {
            map.put(num, false);
        }

        for (int num : nums) {
            if (map.get(num)) {
                continue; // already visited, skip
            }

            int currentLength = 1;
            map.put(num, true); // mark current as visited

            // Forward check
            int nextNum = num + 1;
            while (map.containsKey(nextNum) && !map.get(nextNum)) {
                map.put(nextNum, true);
                currentLength++;
                nextNum++;
            }

            // Backward check
            int prevNum = num - 1;
            while (map.containsKey(prevNum) && !map.get(prevNum)) {
                map.put(prevNum, true);
                currentLength++;
                prevNum--;
            }

            longestLength = Math.max(longestLength, currentLength);
        }

        return longestLength;
    }
}
