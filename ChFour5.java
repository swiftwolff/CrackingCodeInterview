
public class ChFour5 {
	public static boolean isBST(TreeNode root){
		if(root==null){
			return true;
		}
		
		boolean leftBST = isBST(root.left);
		if(leftBST==false){
			return false;
		}
		boolean rightBST = isBST(root.right);
		if(rightBST==false){
			return false;
		}
		if(root.left!=null && root.left.val > root.val){
			return false;
		}
		
		if(root.right != null && root.val>=root.right.val){
			return false;
		}
		
		return true;
	}
	
	public static void main(String args[]){
		  TreeNode a = new TreeNode(2);
    	  TreeNode b = new TreeNode(1);
    	  TreeNode c = new TreeNode(3);
    	  TreeNode d = null;
    	  TreeNode e = new TreeNode(0);
    	  TreeNode f = null;
    	  TreeNode g = new TreeNode(4);
    	  TreeNode[] t = {b,c,d,e,f,g};
    	  a.insert(t, a);
    	  a.preorder(a);
    	  
    	  System.out.println(isBST(a));
    	  
	}
	
}
