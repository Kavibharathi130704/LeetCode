class Solution {
    public int maximumProduct(int[] nums) {
        int maxPro=0;
        int n=nums.length;
        Arrays.sort(nums);
        
            maxPro=Math.max((nums[n-1]*nums[n-2]*nums[n-3]),(nums[0]*nums[1]*nums[n-1]));
        
        return maxPro;
    }
}