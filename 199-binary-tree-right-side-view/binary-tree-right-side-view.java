
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
      List<Integer> res=new ArrayList<>();
      Queue<TreeNode> q=new LinkedList<>();
      q.offer(root);
      if(root==null){
        return res;
      }
      while(!q.isEmpty()){
        int q_size=q.size();
        for(int i=0; i<q_size; i++){
            TreeNode temp=q.poll();
            if(i==q_size-1){
            res.add(temp.val);
            }
            if(temp.left!=null){
                q.offer(temp.left);
            }
            if(temp.right!=null){
                q.offer(temp.right);
            }
        }
      }
      return res;
    }
}