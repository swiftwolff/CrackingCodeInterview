import java.util.Arrays;

public class ChOne3 {
	public static boolean isPermutation(String a, String b){
		if (a.length()!=b.length()){
			return false;
		}
		char[] A= a.toCharArray();
		char[] B= b.toCharArray();
		Arrays.sort(A);
		Arrays.sort(B);
		String newA = new String(A);
		String newB = new String(B);

		return newA.equals(newB);
	}
	
	public static void main(String args[]){
		String a = "abc";
		String b = "cba";
		System.out.println(isPermutation(a,b));
	}
	
}
