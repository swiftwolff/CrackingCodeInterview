import java.util.ArrayList;

public class ChNine5 {
	public static ArrayList<ArrayList<String>> permuteString(String s){
		ArrayList<ArrayList<String>> res = new ArrayList<ArrayList<String>>();
		char[] c = s.toCharArray();
		permute(c,0,s.length(),res);
		return res;
	}
	public static void permute(char[] c, int pos, int n,ArrayList<ArrayList<String>> res){
		if(pos==n){
			ArrayList<String> tmp = new ArrayList<String>();
			tmp.add(new String(c));
			res.add(tmp);
			return;
		}
		
		for(int i=pos;i<c.length;i++){	
				swap(c,i,pos);
				permute(c,pos+1,n,res);
				swap(c,i,pos);
		}
	}
	public static void swap(char[] c, int a, int b){
		char tmp = c[a];
		c[a] = c[b];
		c[b] = tmp;
		return;
	}
	
	public static void main(String args[]){
		System.out.println(permuteString("them"));
	}
	
	
}
