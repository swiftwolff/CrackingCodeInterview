
public class ChFour6 {
	public static TreeNodeI findNext(TreeNodeI root){
		
		if(root.right!=null){
			return leftmostNode(root);
		}
		
		if(root.left!=null){
			return root.parent;
		}else{
			while(root.right==null&&root.parent!=null){
				root = root.parent;
			}
		}
		
		return root;
		
	}
	

	public static TreeNodeI leftmostNode(TreeNodeI root){
		
		if(root.left==null){
			return root;
		}
		TreeNodeI res =	leftmostNode(root.left);
		return res;
		
	}
	
	public static void main(String args[]){
		
		TreeNodeI root = new TreeNodeI(1);
		root.setLeftChild(new TreeNodeI(2));
		root.left.setLeftChild(new TreeNodeI(9));
		root.left.left.setLeftChild(new TreeNodeI(10));
		
		
		System.out.println(findNext(root.left.left).val);
		
		
	}
	
}
