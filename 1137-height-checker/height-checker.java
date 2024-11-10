class Solution {
    public int heightChecker(int[] arr) {
        int n=arr.length;
        int exp[]=new int[n];
         
        for(int i=0; i<n; i++){
            exp[i]=arr[i];
        }
        Arrays.sort(exp);
        int count=0;
        for(int i=0; i<n; i++){
            if(arr[i]!=exp[i]){
                count++;
            }
        }
        if(count==0){
            return 0;
        }
        else if(count==n){
            return n;
        }
        else{
            return count;
        }
    }
}