
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
      List<List<Integer>> res=new ArrayList<>();
      Queue<TreeNode> q= new LinkedList<>();
      q.offer(root);
      if(root==null){
        return res;
      }
      while(!q.isEmpty()){
        int q_size=q.size();
        List<Integer> list=new ArrayList<>();
        for(int i=0; i<q_size; i++){
        TreeNode temp=q.poll();
        list.add(temp.val);
        if(temp.left!=null){
            q.add(temp.left);
        }
        if(temp.right!=null){
            q.add(temp.right);
        }
        }
        res.add(0,list);
      }
      return res;
    }
}