
public class ChTwo3 {
	
	public static void deleteNode(ListNode node){
		if(node==null){
			return;
		}
		
		while(node.next != null){
			node.val = node.next.val;
			if(node.next.next==null){
				node.next = null;
			}else{
				node = node.next;
			}
		}
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
		deleteNode(head.next.next.next.next);
		while(head!=null){
		System.out.println(head.val);
		head = head.next;
		}
	}
}
