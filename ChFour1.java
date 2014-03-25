
public class ChFour1 {
	
	public static boolean balanced(TreeNode root){
		
		if(root==null){
			return true;
		}
		if(height(root)==-1){
			return false;
		}
		return true;
	}
	
	public static int height(TreeNode root){
		
		if(root==null){
			return 0;
		}
		
		int leftHeight = height(root.left);
		if (leftHeight==-1){
			return -1;
		}
		int rightHeight = height(root.right);
		if (rightHeight==-1){
			return -1;
		}
		
		if(Math.abs(leftHeight-rightHeight)>1){
			return -1;
		}
		
		return 1+Math.max(height(root.left), height(root.right));
	}
	
	public static void main(String args[]){
		
	}
}
