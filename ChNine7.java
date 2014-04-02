public class ChNine7 {
	
	enum Color{
		GREEN(0),
		RED(1),
		YELLOW(2);
		private int value;
        Color(int v) {
        	value = v;
        }
        public int getValue() {
                return value;
        }
	}
	public static void paintFill(Color[][] matrix, int i,int j,Color color ){
		
		if(matrix[i][j]==color){
			return;
		}	
		matrix[i][j]=color;
		for(int k=-1;k<2;k+=2){
			
			if(i+k>=0&&i+k<=matrix.length-1){
				paintFill(matrix,i+k,j,color);
			}
			if(j+k>=0&&j+k<=matrix[0].length-1){
				paintFill(matrix,i,j+k,color);
			}
		}

	}
	public static void initializeBoard(Color[][] board){
		for (int i=0;i<board.length;i++){
			for(int j=0;j<board[0].length;j++){
				board[i][j] = Color.GREEN;
			}
		}
	}
	
	public static void printBoard(Color[][] board){
		for (int i=0;i<board.length;i++){
//				System.out.println("Row:");
			for(int j=0;j<board[0].length;j++){
				System.out.printf("%-5s", board[i][j]);
//				System.out.print(board[i][j]);
				System.out.print(" ");
			}
				System.out.println();
		}
	}
	
	public static void main(String args[]){
		Color[][] matrix = new Color[5][5];  //initialize to Green
		initializeBoard(matrix);
		matrix[2][3] = Color.RED;
		matrix[3][2] = Color.RED;
		matrix[3][1] = Color.RED;
		matrix[2][1] = Color.RED;
		matrix[1][2] = Color.RED;
		printBoard(matrix);
		System.out.println();
		paintFill(matrix, 0,0,Color.RED );
		printBoard(matrix);


	
	}
}
