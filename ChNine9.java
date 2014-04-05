import java.util.ArrayList;
public class ChNine9 {
	
	public static ArrayList<int[]> nQueens(int num){
		ArrayList<int[]> board = new ArrayList<int[]>();
		int[] combinations = new int[num];
		for(int i=0;i<num;i++){
			combinations[0] = i;
			nQueensHelper(1,combinations,board);
		}
		return board;
	}
	
	public static void nQueensHelper(int row, int[] combinations, ArrayList<int[]> board){
		
		if(row > combinations.length-1){
			board.add(combinations);
			return;
		}
		int[] tmp = combinations.clone();
		for(int i=0;i<combinations.length;i++){  //possible columns
			for(int j=0;j<row;j++){  //prev rows
				if(tmp[j]==i || Math.abs(j-row)==Math.abs(tmp[j]-i)){
					break;
				}
				if(j==row-1){
					tmp[row] = i;
					nQueensHelper(row+1,tmp,board);
				}
			}
		}
	}
	
	public static void main(String args[]){
//		int[] res = nQueens(4);
		for(int[] i:nQueens(4)){
			for(int j=0;j<i.length;j++){
				System.out.println(i[j]);
			}
			System.out.println();
		}
		
		
	}
}
