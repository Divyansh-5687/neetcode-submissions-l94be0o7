class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        int prodl=1;
        int prodr=1;

        for(int i=n-1; i>=0 ;i--){
            ans[i] = prodr;
            prodr=prodr*nums[i];
        }
        for(int i=0 ; i<n; i++){
            ans[i]=ans[i]*prodl;
            prodl=prodl*nums[i];
        }
        return ans;
    }
}