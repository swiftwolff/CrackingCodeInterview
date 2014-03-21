
public class ChTwo2 {
	
	public static ListNode kthToLast(ListNode head,int kth){
		ListNode res = head;
		if(head==null){
			return head;
		}
		int count=0;
		while(head!=null){
			count++;
			head = head.next;
		}
		
		System.out.println("count "+count);
		if (kth > count){
			return null;
		}
		head = res;
		for(int i=0;i<count-kth;i++){
	
			head=head.next;
		}

		return head;
		
	}
	
	public static int kthToLastRecur(ListNode head,int cur,int kth,int count){
		if(head==null){
			return count;
		}
		int i = kthToLastRecur(head.next,cur,kth,count+1);
		if (i-cur==kth){
			return cur;
		}
		return i;
	}
	
	public static ListNode generateLinkedList(int num){
		ListNode head = new ListNode(1);
		ListNode res = head;
		for(int i=2;i<=num;i++){
			head.next = new ListNode(i);
			head = head.next;
		}
		return res;
	}
	public static void main(String args[]){
		ListNode head = generateLinkedList(5);
//		System.out.println(head.next.val);
//		System.out.println(head.next.next.val);
		ListNode res = kthToLast(head,1);
//		while(head!=null){
//			System.out.println(head.val);
//			head = head.next;
//		}
		System.out.println(res.val);	
		
	}
}
