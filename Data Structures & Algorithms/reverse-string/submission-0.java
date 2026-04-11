class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        int i=0;
        int j=n-1;
        char k;
        for(;i<n/2;i++){
            k=s[i];
            s[i]=s[j];
            s[j]=k;
            j--;
        }
        return;
        
    }
}