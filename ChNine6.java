import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ChNine6 {
	
	public static ArrayList<String> generate(int n){
		ArrayList<String> res = new ArrayList<String>();
		StringBuilder s = new StringBuilder();
		for(int i=0;i<n;i++){
			s.append("()");
		}
		Set<String> store = new HashSet<String>();
		build(new String(s),res,store);
		return res;
	}
	public static void build(String s, ArrayList<String> res, Set<String> store){	
		if(store.contains(s)){
			return;
		}
		store.add(s);
		res.add(s);
		char[] c = s.toCharArray();
		for(int i=0;i<c.length-1;i++){
			if(c[i]==')'&&c[i+1]=='('){
				swap(c,i,i+1);
				build(new String(c),res,store);
				swap(c,i,i+1);
			}
		}
		
	}
	public static void swap(char[] c, int a, int b){
		char tmp = c[a];
		c[a] = c[b];
		c[b] = tmp;
		return;
	}
	
	public static void main(String args[]){
		System.out.println(generate(3));
	}
}
