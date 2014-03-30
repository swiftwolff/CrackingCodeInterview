import java.util.ArrayList;
public class ChFour9 {
	
	public static ArrayList<ArrayList<Integer>> sumPath(TreeNodeI root, int target){
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> path = new ArrayList<Integer>();
		traverse(root,res,path,0,target);
		return res;
	}
	
	public static void traverse(TreeNodeI root, ArrayList<ArrayList<Integer>> res, ArrayList<Integer>path, int level, int target){
		if(root==null){
			return;
		}
		if(!path.isEmpty()){  //looking back from last to front
			int sum = 0;
			for(int i:path){
				sum+=i;
			}
			if(sum+root.val==target){
				path.add(root.val);
				ArrayList<Integer> tmp = (ArrayList<Integer>) path.clone();
				res.add(tmp);
			}
		}

		
		//looking at current
		if(root.val == target){
			ArrayList<Integer> tmp = new ArrayList<Integer>();
			tmp.add(root.val);
			res.add(tmp);
			path.add(root.val);
		}
		path.add(root.val);
		traverse(root.left,res,path,level+1,target);
		traverse(root.right,res,path,level+1,target);
		path.remove(level);
	}
	
	
	public static void main(String args[]){
		
		TreeNodeI root = new TreeNodeI(1);
		root.setLeftChild(new TreeNodeI(2));
		root.left.setLeftChild(new TreeNodeI(7));
		root.left.left.setLeftChild(new TreeNodeI(10));
		root.left.left.setRightChild(new TreeNodeI(30));
		root.left.setRightChild(new TreeNodeI(9));
		root.setRightChild(new TreeNodeI(6));
		root.right.setRightChild(new TreeNodeI(3));
		
		System.out.println(sumPath(root,12));
		
	}
}
