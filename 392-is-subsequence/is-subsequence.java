class Solution {
    public boolean isSubsequence(String s, String t) {
        int sl=s.length();
        int tl=t.length();
        int i=0;
         for(int j=0; j<tl; j++){
            if(i==sl){
                return true;
            }
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            
         }
         return i==sl;
    }
}