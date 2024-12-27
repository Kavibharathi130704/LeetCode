class Solution {
    public int maximumProduct(int[] nums) {
        int maxPro=Integer.MIN_VALUE/2;
        int n=nums.length;
        int ans=0;
  
        // for(int i=0; i<n-2; i++){
        //     for(int j=i+1; j<n-1; j++){
        //         for(int k=j+1; k<n; k++){
        //             ans=nums[i]*nums[j]*nums[k];
        //             if(ans>maxPro){
        //                 maxPro=ans;
        //             }
        //         }
        //     }
        // }
        Arrays.sort(nums);
        
            maxPro=Math.max((nums[n-1]*nums[n-2]*nums[n-3]),(nums[0]*nums[1]*nums[n-1]));
        
        return maxPro;
    }
}