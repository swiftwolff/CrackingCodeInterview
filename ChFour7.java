
public class ChFour7 {
	
	public static TreeNodeI commonAncestor(TreeNodeI root, TreeNodeI one, TreeNodeI two){
		
		boolean oneLeft = whichSide(root.left,one);
		boolean twoLeft = whichSide(root.left,two);
		boolean oneRight = whichSide(root.right,one);
		boolean twoRight = whichSide(root.right,two);
		if(oneLeft == oneRight){
			return root;
		}
		if(twoLeft == twoRight){
			return root;
		}
		
		if(oneLeft == twoLeft){  //same side
			
			System.out.println("Same side");
			if(oneLeft){  //on left
				System.out.println("On Left");
				return commonAncestor(root.left,one,two);
			}else{  //on right
				System.out.println("On Right");
				return commonAncestor(root.right,one,two);
			}
		}
		
		
		return root;  //different side
	}
	
	
	public static int treeDepth(TreeNodeI root){
		if(root==null){
			return 0;
		}
		return 1+Math.max(treeDepth(root.left),treeDepth(root.right));
	}
	
	public static boolean whichSide(TreeNodeI root, TreeNodeI one){
		
		if(root==null){
			return false;
		}
		if(root==one){
			return true;
		}
		
		boolean left = whichSide(root.left,one);
		if(left){
			return true;
		}
		boolean right = whichSide(root.right,one);
		if(right){
			return true;
		}
		
		return false;
	}
	
	public static void main(String args[]){
		TreeNodeI root = new TreeNodeI(1);
		root.setLeftChild(new TreeNodeI(2));
		root.left.setLeftChild(new TreeNodeI(9));
		root.left.left.setLeftChild(new TreeNodeI(10));
		root.left.left.setRightChild(new TreeNodeI(30));
		root.left.setRightChild(new TreeNodeI(23));
		root.setRightChild(new TreeNodeI(4));
		root.right.setRightChild(new TreeNodeI(20));
		
//		System.out.println(isItLeft(root.left,root.left.left));
//		System.out.println(isItLeft(root.left,root.left.right));
		System.out.println(commonAncestor(root,root.right,root.right.right).val);
	}
}
