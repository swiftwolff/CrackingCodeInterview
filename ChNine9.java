import java.util.ArrayList;
public class ChNine9 {
	
	public static ArrayList<char[][]> nQueens(int number){
		char[][] board = new char[number][number];
		initalize(board);
		ArrayList<char[][]> res = new ArrayList<char[][]>();
		for(int i=0;i<1;i++){
			for(int j=0;j<board[0].length;j++){
				board[i][j] = 'Q';
				System.out.println("Hey");
				nQueensHelper(board,j,1,res);
				board[i][j] = '.';
			}
		}
		
		return res;
	}
	
	public static void initalize(char[][] board){
		for(int i=0;i<board.length;i++){
			for(int j=0;j<board[0].length;j++){
				board[i][j] = '.';
			}
		}
	}
	
	public static void nQueensHelper(char[][] board,int precolumn,int row, ArrayList<char[][]> res){
		if(row==board.length){
			System.out.println("Here");
			res.add(board);
		}
		int check = 0;
		//needs to clean the board
		for(int i=0;i<row;i++){
			for(int j=0;j<board[0].length;j++){
				System.out.println("yo");
				if(board[i][j]!='Q'){
					continue;
				}
				if(precolumn!=j&&Math.abs(row-j)!=Math.abs(i-precolumn)){
					board[row][j] = 'Q';
					nQueensHelper(board,precolumn,row+1,res);
				}else{
					check++;
					break;
				}
				if(check==1){
					check = 0;
					break;
				}
			}
			
		}
		
		
		return;
	}
	
	
	public static void main(String args[]){
		System.out.println(nQueens(3));
	}
}
