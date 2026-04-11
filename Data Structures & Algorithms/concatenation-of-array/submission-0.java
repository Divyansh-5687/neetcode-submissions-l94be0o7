class Solution {
    public int[] getConcatenation(int[] nums) {
         int n = nums.length;
        int[] ans = new int[2 * n];
        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Store nums[i] in the map
        for (int i = 0; i < n; i++) {
            map.put(i, nums[i]);
        }

        // Step 2: Use the map to fill ans array
        for (int i = 0; i < n; i++) {
            ans[i] = map.get(i);      // first half
            ans[i + n] = map.get(i);  // second half
        }

        return ans;
    }
}