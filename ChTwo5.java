public class ChTwo5 {
	
	public static ListNode listAdd(ListNode nodeOne, ListNode nodeTwo, int carry){
		ListNode sum = new ListNode(0);
		if(nodeOne==null&&nodeTwo==null){
			if(carry>0){
				sum.val = carry;
				return sum;
			}
			return null;
		}
		
		if(nodeOne==null||nodeTwo==null){
			int value = nodeOne==null?nodeTwo.val:nodeOne.val;
			sum.val = value+carry;
			return sum;
		}
		
		if (nodeOne.val + nodeTwo.val>9){
			sum.val = nodeOne.val+nodeTwo.val-10+carry;
			carry = 1;
			
		}else{
			sum.val = nodeOne.val+nodeTwo.val+carry;
			carry = 0;
		}
		
		sum.next = listAdd(nodeOne.next,nodeTwo.next,carry);
		
		return sum;
	}
	
	public static ListNode listAddnormalHelper(ListNode one,ListNode two){
		
		ListNode sum = new ListNode(0);
		
		if(one==null&&two==null){
			return null;
		}
		
		if(one==null||two==null){
			int value = one==null?two.val:one.val;
			sum.val = value;
			return sum;
		}
		
		if(one.next!=null&&two.next!=null){
			if(one.next.val+two.next.val>9){
				sum.val = one.val+two.val+1;
				if(sum.val>9){
					sum.val -= 10;
				}
				
			}else{
				sum.val = one.val+two.val;
				if(sum.val>9){
					sum.val -= 10;
				}
			}
		}else if(one.next==null&&two.next==null){
			sum.val = one.val+two.val;
			if(sum.val>9){
				sum.val -= 10;
			}
			
		}else{
			int value = one.next==null?two.next.val:one.next.val;
			sum.val = one.val+two.val+value;
			if(sum.val>9){
				sum.val -= 10;
			}
			
		}
		sum.next = listAddnormalHelper(one.next,two.next);
		return sum;
	}
	
	public static ListNode listAddnormal(ListNode one, ListNode two){
		ListNode sum = listAddnormalHelper(one,two);
		if(one.val + two.val > 9){
			ListNode carry = new ListNode(1);
			carry.next = sum;
			return carry;
		}
		
		return sum;
		
		
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
//		ListNode one = generateLinkedList(4);
//		ListNode two = generateLinkedList(4);
		ListNode one = new ListNode(9);
		one.next = new ListNode(9);
		one.next.next = new ListNode(9);
		ListNode two = new ListNode(9);
		two.next = new ListNode(9);
		two.next.next = new ListNode(9);
		ListNode sum = listAddnormal(one,two);
		
		while(sum!=null){
			System.out.println(sum.val);
			sum = sum.next;
		}
		
	}
}
