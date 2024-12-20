
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res=new ArrayList<>();
        Queue <TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
          int q_size=q.size();
          long sum=0;
          for(int i=0; i<q_size; i++){
            TreeNode temp=q.poll();
           sum=sum+temp.val;
           if(temp.left!=null){
             q.offer(temp.left);
           }
           if(temp.right!=null){
            q.offer(temp.right);
           }
          }
          double d=(double)sum/q_size;
          res.add(d);
        }
        return res;
    }
}