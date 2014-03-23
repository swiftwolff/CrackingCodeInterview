
public class ChTwo5 {
	
	public static ListNode circleBegin(ListNode head){
		
		if(head==null){
			return head;
		}
		ListNode node = head;
		ListNode runner = head;
		while(runner!=null){
		    node = node.next;
		    if (runner.next!=null){
                runner = runner.next.next;
            }else{
                return null;
            }
			if(runner==node){
				node = head;
				while(runner!=node){
					runner = runner.next;
					node = node.next;
				}
				return node;
			}
		}
		
		return runner;
	}
	
	
	public static void main(String args[]){
		
	}
}
