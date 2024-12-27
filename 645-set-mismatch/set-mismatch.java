class Solution {
    public int[] findErrorNums(int[] nums) {
        int dup=-1; int mis=-1;
        int n=nums.length;

        for(int i=0; i<=n; i++){
            int count=0;
            for(int j=0; j<n; j++){
               if(nums[j]==i){
                count++;
               }
            }
            if(count==2){
                dup=i;
            }
            else if(count==0){
                mis=i;
            }
        }
        return new int[] {dup, mis};
    }
}