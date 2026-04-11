class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            // if value already in set, duplicate found
            if (set.contains(num)) {
                return true;
            }
            // otherwise, add it to the set
            set.add(num);
        }

        return false; // no duplicates found
    }
}