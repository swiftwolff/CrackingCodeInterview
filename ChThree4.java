import java.util.Stack;
public class ChThree4 {
	
	
	public static void hanoi(int n, Stack<Integer> A, Stack<Integer> B, Stack<Integer>C){
		
		if(n==0){
			return;
		}
		
		//A to B
		hanoi(n-1,A,C,B);
		
		C.push(A.pop());
		//B to C
		hanoi(n-1,B,A,C);
		
		return;
	}
	
	public static void main(String args[]){
		Stack<Integer> A = new Stack<Integer>();
		Stack<Integer> B = new Stack<Integer>();
		Stack<Integer> C = new Stack<Integer>();
		A.push(1);
		A.push(2);
		A.push(3);
		hanoi(3,A,B,C);
		System.out.println(C);
	}
}
