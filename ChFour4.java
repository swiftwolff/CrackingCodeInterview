import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class ChFour4 {
	
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
	public static ArrayList<LinkedList<Integer>> binaryTreeLinkedList(TreeNodeI root){
		ArrayList<LinkedList<Integer>> res = new ArrayList<LinkedList<Integer>>();
		int level = 0;
		build(root,res,level);
		return res;
	}
	
	public static void build(TreeNodeI root,ArrayList<LinkedList<Integer>>res,int level){
		if(root==null){
			return;
		}
		if(level>=res.size()){
			LinkedList<Integer> tmp = new LinkedList<Integer>();
			tmp.add(root.val);
			res.add(tmp);
		}else{
			LinkedList<Integer> tmp = res.get(level);
			tmp.add(root.val);
			res.set(level, tmp);
		}
		
		build(root.left,res,level+1);
		build(root.right,res,level+1);
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
		TreeNodeI root = setMinimal(A, 0, 3);
//		preorder(root);
		ArrayList<LinkedList<Integer>> res = binaryTreeLinkedList(root);
		System.out.println(res);
		
	}
}
