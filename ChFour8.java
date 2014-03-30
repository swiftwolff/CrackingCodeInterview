
public class ChFour8 {
	
	public static boolean isSubTree(TreeNodeI one, TreeNodeI two){	
		if(one==null||two==null){
			return one==null&&two==null;
		}	
		
		boolean left = false;
		boolean right = false;
		if(one==two){
			
			left = isSubTree(one.left,two.left);
			if(left==false){
				return false;
			}
			right = isSubTree(one.right,one.right);
			if(right==false){
				return false;
			}
		}else{
			left = isSubTree(one.left,two);
			if(left){
				return true;
			}
			right = isSubTree(one.right,two);
			if(right){
				return true;
			}
		}
		
		return left==false||right==false?false:true;
	}
	
	public static void main(String args[]){
		TreeNodeI hey = new TreeNodeI(6);
		hey.setLeftChild(new TreeNodeI(8));
		hey.setRightChild(new TreeNodeI(10));
		TreeNodeI root = new TreeNodeI(1);
		root.setLeftChild(new TreeNodeI(2));
		root.left.setLeftChild(new TreeNodeI(9));
		root.left.left.setLeftChild(new TreeNodeI(10));
		root.left.left.setRightChild(new TreeNodeI(30));
		root.left.setRightChild(new TreeNodeI(23));
		root.setRightChild(new TreeNodeI(4));
		root.right.setRightChild(new TreeNodeI(20));
		
		System.out.println(isSubTree(root,hey));
		
		
	}
}
