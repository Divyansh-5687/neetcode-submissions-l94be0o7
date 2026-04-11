class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int arr1[]=new int[26];
        int arr2[]=new int[26];
        for(int i=0;i<ransomNote.length();i++)
        {
            int j=(int)(ransomNote.charAt(i));
            arr1[(j-'a')]++;
        }
        for(int j=0;j<magazine.length();j++)
        {
            int f=(int)(magazine.charAt(j));
            arr2[(f-'a')]++;
        }
        for(int k=0;k<arr1.length;k++)
        {
            if(arr1[k]>0)
            {
                if(arr2[k]>=arr1[k])
                {
                    continue;
                }
                else
                {
                    return false;
                }
            }
        }
        return true;
    }
}