class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char[] jArr=jewels.toCharArray();
        char[] sArr=stones.toCharArray();
        int count=0;
         for(int i=0; i<jArr.length; i++){
            for(int j=0; j<sArr.length; j++){
                if(jArr[i]==sArr[j]){
                    count++;
                }
            }
         }
         return count;
    }
}