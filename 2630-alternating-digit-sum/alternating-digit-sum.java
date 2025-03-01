class Solution {
    public int alternateDigitSum(int n) {
        String m=Integer.toString(n);
        char arr[]=m.toCharArray();
        int sumOdd=0 , sumEven=0 , sum=0;
        for(int i=0; i<arr.length; i++){
            if(i%2==0){
                sum+=arr[i]-'0';
            }
            else{
                sum-=arr[i]-'0';
            }
        }
     
       return sum;

    }
}