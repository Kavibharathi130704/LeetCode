class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list= new ArrayList<>();
        
        int n=nums.length;
        if(n==0){
            return list;
        }
        int up_ind=nums[0];
        for(int i=1; i<=n; i++){
            if(i<n && nums[i]==nums[i-1]+1){
                continue;
            }
            if(up_ind==nums[i-1]){
                list.add(String.valueOf(up_ind));
            }
            else{
                list.add(up_ind +"->"+nums[i-1]);
            }
            if(i<n){
                 up_ind=nums[i];
            }
        }
        return list;
    }
}