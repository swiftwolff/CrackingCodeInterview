import java.util.ArrayList;

public class ChNine4 {
	
	public static ArrayList<ArrayList<Integer>> subset(int[] set, int n){
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		res.add(new ArrayList<Integer>());
		for(int i=1;i<=n;i++){
			
			for(int j=0;j<=set.length-i;j++){
				ArrayList<Integer> tmp = new ArrayList<Integer>();
				for(int k=j;k<j+i;k++){
					tmp.add(set[k]);
					System.out.println(set[k]);
				}
				res.add(tmp);
				System.out.println("---------");
				
			}
		}
		return res;
	}
	//recursion
	ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> set, int index){
		ArrayList<ArrayList<Integer>> allsubsets;
		if(set.size()==index){  //this is the last
			allsubsets = new ArrayList<ArrayList<Integer>>();
			allsubsets.add(new ArrayList<Integer>());  //empty set
		}else{
			allsubsets = getSubsets(set,index+1);
			int item = set.get(index);
			ArrayList<ArrayList<Integer>> moresubsets = new ArrayList<ArrayList<Integer>>();
			for(ArrayList<Integer> subset:allsubsets){
				ArrayList<Integer> newsubset = new ArrayList<Integer>();
				newsubset.addAll(subset);
				newsubset.add(item);
				moresubsets.add(newsubset);
			}
			allsubsets.addAll(moresubsets);
		}
		return allsubsets;
	}
	
	
	
	public static void main(String args[]){
		int[] set= {1,2,3};
//		for(int i=1;i<=3;i++){
//			
//			for(int j=0;j<=set.length-i;j++){
//				ArrayList<Integer> tmp = new ArrayList<Integer>();
//				for(int k=j;k<j+i;k++){
//					tmp.add(set[k]);
//					System.out.println(set[k]);
//				}
//				res.add(tmp);
//				System.out.println("---------");
//				
//			}
//		}
		int a = 5;
		System.out.println(1<<3);
//		System.out.println(subset(set,set.length));
		
	}
}
