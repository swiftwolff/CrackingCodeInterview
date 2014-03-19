public class ChOne5 {
	
	public static String compress(String s){
		
		if (s.length()==0){
			return "";
		}
		StringBuffer strtmp = new StringBuffer();
		char last=s.charAt(0);
		int count = 1;
		for(int i=1;i<s.length();i++){
			if(s.charAt(i)==last){
				count++;
			}else{
				strtmp.append(last);
				strtmp.append(count);
				last = s.charAt(i);
				count = 1;
			}
		}
		strtmp.append(last);
		strtmp.append(count);
		return s.length()<=strtmp.toString().length()?s:strtmp.toString();
	}
	
	public static void main(String args[]){
		System.out.println(compress("a"));
		System.out.println(compress("aabccccaaa"));
	}
}
