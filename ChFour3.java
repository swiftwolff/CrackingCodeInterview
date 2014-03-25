
public class ChFour3 {
	
	public static TreeNodeI setMinimal(int[] arry, int start, int end){
		
		if(start > end){
			return null;
		}
		
		int mid = (start+end)/2;
		TreeNodeI n = new TreeNodeI(arry[mid]);
		n.setLeftChild(setMinimal(arry,start,mid-1));
		n.setRightChild(setMinimal(arry,mid+1,end));
		
		return n;
	}
	
	public static void preorder(TreeNodeI root){
		if(root==null){
			return;
		}
		System.out.println(root.val);
		preorder(root.left);
		preorder(root.right);
	}
	
	
	public static void main(String args[]){
		int[] A = {1,2,3,4};
		TreeNodeI root = setMinimal(A,0,3);
		preorder(root);
	}
}
