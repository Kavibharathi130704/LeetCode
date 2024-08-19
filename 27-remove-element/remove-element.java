class Solution {
    public int removeElement(int[] nums, int val) {
     int  n=nums.length;
      int upd_ind=0;
      for(int i=0; i<n; i++){
          if(nums[i]!=val){
            nums[upd_ind]=nums[i];
            upd_ind++;
          }
      }  
      return upd_ind;
    }
}