class Solution {
    public int longestConsecutive(int[] nums) {
        int i; int max=1; int count=1;
        int n=nums.length;
        Arrays.sort(nums);
        if(n==0){
            return 0;
        }
        for(i=0; i<=n-2; i++){
            if(nums[i]+1== nums[i+1]){
                count++;
                if(count>max){
                    max=count;
                }
            }
            else if(nums[i]==nums[i+1]){
                continue;
            }
            else{
                count=1;
            }
        }
        return max;
    }
}