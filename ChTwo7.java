import java.util.Stack;
public class ChTwo7 {
	
	public static boolean palindrome(ListNode head){
		ListNode start=head;
		ListNode runner=head;
		Stack<Integer> s = new Stack<Integer>();
		while(runner!=null){
			
			if(runner.next==null){
				start = start.next;
				break;
			}
			if(runner.next.next==null){
				s.push(start.val);
				start = start.next;
				break;
			}
			s.push(start.val);
			runner = runner.next.next;
			start = start.next;
			
		}
		System.out.println(s);
		while(start!=null){
			if(s.pop()!=start.val){
				return false;
			}
			start = start.next;
		}
		
		return true;
	}
	public static void main(String args[]){
		ListNode one = new ListNode(1);
		one.next = new ListNode(1);
//		one.next.next = new ListNode(2);
//		one.next.next.next = new ListNode(1);
		
		System.out.println(palindrome(one));
		
		
		
	}
}
