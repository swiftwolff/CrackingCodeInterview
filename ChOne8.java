import java.util.HashMap;
import java.util.Map;

public class ChOne8 {
	
	public static boolean isSubstring(String pat, String txt) {
		  Map<Character, Integer> mt = new HashMap<Character, Integer>();
		  // Bad character Skip : Moore Table Construction
		  for (int i = 0; i < pat.length(); i++) {
		   mt.put(pat.charAt(i), i);
		  }
		  int skip = 0;
		  int N = txt.length();
		  int M = pat.length();
		  for (int i = 0; i <= N-M; i= i+ skip) {
		   skip = 0;
		   for (int j = M - 1; j >= 0; j--) {
		    if (pat.charAt(j) != txt.charAt(i+j)) {
		     if(mt.get(txt.charAt(i + j))!=null)
		      skip = Math.max(1, j - mt.get(txt.charAt(i + j)));
		     else
		      skip = j+1;
		     break;
		    }
		   }
		   if (skip == 0) {
		    // Match found
		    return true;
		   }
		  }
		  return false;
		 }

	public static boolean checkRotation(String one, String two){
		one = one+one;
		System.out.println(one);
		System.out.println(two);
		return isSubstring(two,one);
	}
	
	public static void main(String args[]){
		String a = "heyhey";
		String b = "jim_saw_me_in_a_barber_parlour";
		System.out.println(isSubstring(a,b));
	}
}
