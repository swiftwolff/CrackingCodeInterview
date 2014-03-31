import java.util.HashMap;


public class ChSeven6 {
	public static String maxLine(Coordinates[] points){
		HashMap<String,Integer> record = new HashMap<String,Integer>();
		int maxCount = Integer.MIN_VALUE;
		String winner = "";
		record.put("on x axis", 0);
		record.put("on y axis", 0);
		for(int i=0;i<points.length;i++){
			for(int j=i+1;j<points.length;j++){
				if (points[i].ycoord-points[j].ycoord==0){ //when y = 0
					System.out.println("y is zero");
					record.put("on x axis",record.get("on x axis")+2); 
					if(record.get("on x axis")>maxCount){
						maxCount = record.get("on x axis");
						winner = "on x axis";
					}
					continue;
				}
				if (points[i].xcoord-points[j].xcoord==0){ //when x = 0
					record.put("on y axis",record.get("on y axis")+2);
					if(record.get("on y axis")>maxCount){
						maxCount = record.get("on y axis");
						winner = "on y axis";
					}
					continue;
				}
				double slope = (points[i].ycoord - points[j].ycoord) / (points[i].xcoord - points[j].xcoord);
				double intercept = points[i].ycoord - slope*points[i].xcoord;
				String tmp = "" + slope +"/"+intercept;
				if(record.containsKey(tmp)){
					record.put(tmp, record.get(tmp)+1);
					if(record.get(tmp)>maxCount){
						maxCount = record.get(tmp);
						winner = tmp;
					}
				}else{
					record.put(tmp,2);
					if(record.get(tmp)>maxCount){
						maxCount = record.get(tmp);
						winner = tmp;
					}
				}
				
			}
		}
		System.out.println(record);
		return winner;
	}
	
	public static void main(String args[]){
		Coordinates a = new Coordinates(1,1);
		Coordinates b = new Coordinates(2,2);
		Coordinates c = new Coordinates(3,3);
		Coordinates d = new Coordinates(3,1);
		Coordinates e = new Coordinates(2,9);
		Coordinates f = new Coordinates(0,9);
		Coordinates g = new Coordinates(6,2);
		Coordinates[] points = new Coordinates[7];
		points[0] = a;
		points[1] = b;
		points[2] = c;
		points[3] = d;
		points[4] = e;
		points[5] = f;
		points[6] = g;
		
		System.out.println(maxLine(points));

		
	}
	
	
}
