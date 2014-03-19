import java.util.Arrays;


public class ChOne8 {
	
	public static boolean isSubstring(String one, String two){
		
		if(one.length()>=two.length()){
			return false;
		}
		int onelen = one.length();
		int count = 0;
		int tmpOneIndex = 0;
		char[] tmpOne = one.toCharArray();
		char[] tmpTwo = two.toCharArray();

		for(int i=0;i<two.length();i++){
			if(count>0&&tmpOne[tmpOneIndex]==tmpTwo[i]){
				count++;
				continue;
			}else{
				count=0;
				tmpOneIndex = 0;
			}
			if(tmpOne[tmpOneIndex]==tmpTwo[i]){
				count++;
				tmpOneIndex++;
			}
			if(tmpOneIndex==tmpOne.length){
				return true;
			}
		}
		
		if (count!=onelen){
			return false;
		}
		return true;
	}
	
	public static boolean checkRotation(String one, String two){
		return true;
	}
	
	public static void main(String args[]){
		String a = "hello";
		String b = "eo";
		
		System.out.println(isSubstring(b,a));
	}
}
