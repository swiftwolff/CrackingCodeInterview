import java.util.HashMap;

public class ChSeven5 {

	public static HashMap<Double,Double> findLine(Coordinates a, double lone, Coordinates b, double ltwo){
		HashMap<Double,Double> res = new HashMap<Double,Double>();
		Coordinates[] squareone = findCoord(a,lone);
		Coordinates[] squaretwo = findCoord(b,ltwo);
		Coordinates midOne = findMiddle(squareone);
		Coordinates midTwo = findMiddle(squaretwo);
		
		System.out.println(midTwo.xcoord);
		System.out.println(midTwo.ycoord);
		double slope = (midOne.ycoord-midTwo.ycoord)/(midOne.xcoord-midTwo.xcoord);
		double intercept = midOne.ycoord - slope*midOne.xcoord;
		res.put(slope,intercept);	
		return res;
	}
	
	public static Coordinates findMiddle(Coordinates[] square){
		
		double x = (square[3].xcoord-square[0].xcoord)/2;
		double y = (square[0].ycoord - square[1].ycoord)/2+square[1].ycoord;
		
		return new Coordinates(x,y);
		
	}
	public static Coordinates[] findCoord(Coordinates a, double l){
		Coordinates[] square = new Coordinates[4];
		Coordinates two = new Coordinates(a.xcoord,a.ycoord-l);
		Coordinates three = new Coordinates(two.xcoord+l,two.ycoord);
		Coordinates four = new Coordinates(three.xcoord,three.ycoord+l);
		square[0] = a;
		square[1] = two;
		square[2] = three;
		square[3] = four;
		
		return square;
	}
	public static void main(String args[]){
		Coordinates a = new Coordinates(0,6);
		Coordinates b = new Coordinates(0,2);
		System.out.println(findLine(a,4,b,2));
	}
}
