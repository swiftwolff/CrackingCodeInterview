
public class ChTwo4 {
	
	public static ListNode partition(ListNode head, int val){
		if(head==null){
			return head;
		}
		ListNode start = head;
		ListNode runner = head.next;
		int tmp;
		
		while(runner!=null){
			while(start.val > val && runner!=null){
				if(runner.val < val){
					tmp = start.val;
					start.val = runner.val;
					runner.val = tmp;
					start = runner;
					runner = runner.next;
				}else{
					runner = runner.next;
				}
			}
		}
		return head;
	}
	
	public static void main(String args[]){
		ListNode one = new ListNode(6);
		one.next = new ListNode(3);
		one.next.next = new ListNode(8);
		one.next.next.next = new ListNode(2);
		one.next.next.next.next = new ListNode(9);
		
		ListNode head = partition(one,4);
		while(head!=null){
			System.out.println(head.val);
			head = head.next;
		}
		
	}
}
