
public class ChOne1 {
	public static boolean unique(String s){
		if (s.length() > 256){
			return false;
		}
		char[] table= new char[256];
		for(int i=0;i<s.length();i++){
			table[s.charAt(i)]+=1;
			if(table[s.charAt(i)]>1){
				return false;
			}
		}
		return true;
	}
	public static void main(String args[]){
		String check = "aab";
		String checktwo = "abc";
		System.out.println(unique(check));
		System.out.println(unique(checktwo));
	}
}
