
public class ChOne2 {
	public static String reverse(String s){
		
		StringBuffer newString = new StringBuffer();
			
		for(int i=s.length()-1;i>-1;i--){
			newString.append(s.charAt(i));
		}
		
		
		return newString.toString();
	}
	public static void main(String args[]){
		System.out.println(reverse("elephants"));
	}
}
