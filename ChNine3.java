
public class ChNine3 {
	
	public static int magicFindDistinct(int[] arry,int start, int end){
		if(start > end){
			return -1;
		}
		int mid = (start+end)/2;
		
		if(arry[mid]==mid){
			return mid;
		}
		if(mid>arry[mid]){
			return magicFindDistinct(arry,mid+1,end);
		}else{
			return magicFindDistinct(arry,start,mid-1);
		}
		
	}
	
	public static int magicFindNotDistinct(int[] arry,int start,int end){
		if(start > end){
			return -1;
		}
		int mid = (start+end)/2;
		
		if(arry[mid]==mid){
			return mid;
		}
		
		if(arry[mid]>mid){
			for(int i=mid+1;i<=arry[mid];i++){
				if(arry[i]==i){
					return i;
				}
			}
			return magicFindNotDistinct(arry,start,mid-1);
		}else{
			for(int i=mid-1;i>=arry[mid];i--){
				if(arry[i]==i){
					return i;
				}
			}
			return magicFindNotDistinct(arry,mid+1,end);
		}
	}
	
	
	public static void main(String args[]){
		int[] A = {-20,-6,0,1,4,6};
		int[] B = {1,1,4,5,5,6};
		System.out.println(magicFindDistinct(A,0,5));
		System.out.println(magicFindNotDistinct(B,0,5));
	}
}
