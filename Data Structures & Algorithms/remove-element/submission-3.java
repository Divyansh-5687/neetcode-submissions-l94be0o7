class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0; // Pointer to place the next non-val element

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }

        return index; // New length of array without val
    }
}