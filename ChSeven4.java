
public class ChSeven4 {
	public static int multiply(int a,int b){
		int sum = 0;

		for(int i=0;i<Math.abs(b);i++){
			sum += a;
		}
		if(b<0){
			sum = negate(sum);
		}
		return sum;
	}
	public static int negate(int a){
		if(a==0){
			return 0;
		}
		int neg = 0;
		int count = a<0?1:-1;
		for(int i=0;i<Math.abs(a);i++){
			neg+=count;
		}
		return neg;
	}
	public static int subtract(int a,int b){
		
		return a+negate(b);
	}
	public static int divide(int a,int b){
		int tmp = a;
		int count = 0;
		for(int i=0;i<Math.abs(b);i++){
			tmp -= Math.abs(b);
			count++;
			if(tmp<0){
				count--;
				break;
			}
			if(tmp==0){
				break;
			}
		}
		return (a<0&b<0) || (a>0&b>0)?Math.abs(count):negate(count);
	}
	public static void main(String args[]){
		System.out.println(multiply(3,-2));
		System.out.println(subtract(3,-2));
		System.out.println(divide(6,-4));

	}
}
