import java.util.ArrayList;
public class ChNine9 {
	
	public static char[][] nQueens(int number){
		char[][] board = new char[number][number];
		initalize(board);
		ArrayList<char[][]> res = new ArrayList<char[][]>();
		for(int i=0;i<1;i++){
			for(int j=0;j<board[0].length;j++){
				board[i][j] = 'Q';
				nQueensHelper(board,0,res);
				board[i][j] = '.';
			}
		}
		
		return board;
	}
	
	public static void initalize(char[][] board){
		for(int i=0;i<board.length;i++){
			for(int j=0;j<board[0].length;j++){
				board[i][j] = '.';
			}
		}
	}
	
	public static void nQueensHelper(char[][] board,int row, ArrayList<char[][]> res){
		if(row==board.length){
			res.add(board);
		}
		//needs to clean the board
		
		
		
		return;
	}
	
	
	public static void main(String args[]){
		System.out.println('Q');
	}
}
