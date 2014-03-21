
public class ChTwo1 {
	
	public ListNode removeDup(ListNode head){
		
	        if(head==null||head.next==null){
			    return head;
			}
	        ListNode runner = head.next;
			ListNode res=head;
		
			
			while(head!=null){
				while(runner!=null){
					if(runner.val==head.val){
						head.next = runner.next;
						runner = runner.next;
					}else{
						runner = runner.next;
					}
				}
				
				head=head.next;
				if(head==null){
				    break;
				}else{
				    runner = head.next;
				}
				
			}
			
			return res;
	        
	    }

	
	public void main(String args[]){
		
	}
}
