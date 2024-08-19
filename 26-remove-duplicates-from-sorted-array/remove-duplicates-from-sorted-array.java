class Solution {
    public int removeDuplicates(int[] arr) {
        int n=arr.length;
        int upd_ind=1;
        for(int i=0; i<n-1; i++){
            if(arr[i]!=arr[i+1]){
                arr[upd_ind]=arr[i+1];
                upd_ind++
;            }
        }
        return upd_ind;
    }
}