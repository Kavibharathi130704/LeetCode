class Solution {
    public int strStr(String haystack, String needle) {
        int n=haystack.length();
        int m=needle.length();
        for(int i=0,j=m;j<=n; i++,j++){
            if(haystack.substring(i,j).equals(needle)){
               return i;
            }
        }
        return -1;
    }
}