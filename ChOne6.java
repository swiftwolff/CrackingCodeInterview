
public class ChOne6 {
	
	public static void rotate(int[][] matrix){
		if(matrix.length==0){
			return;
		}
		for(int i=0;i<matrix.length/2;i++){
			int first = i;
			int last = matrix.length-1-i;
			for(int j=0;j<last-first;j++){
//				System.out.println(j);
				int offset = last - j;
				int tmp = matrix[first][first+j];
				matrix[first][first+j] = matrix[offset][first];
				matrix[offset][first] = matrix[last][offset];
				matrix[last][offset] = matrix[first+j][last];
				matrix[first+j][last] = tmp;
			}
			
		}
	}
	
	
	public static void main(String args[]){
		int[][] A = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		rotate(A);
		for(int i=0;i<A.length;i++){
			for(int j=0;j<A.length;j++){
				System.out.println(A[i][j]);
			}
		}
	}
}
