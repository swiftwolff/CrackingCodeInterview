
public class ChFour2 {
	
	public static boolean routExist(Graph g, Node start, Node end){
		
		if(start==end){
			return true;
		}
		
		if(start.getAdjacent().length==0){
			return false;
		}
		
//		boolean res=false;
		for(Node n:start.getAdjacent()){
			if(routExist(g,n,end)){
				return true;
			}
		}

		return false;
	}
	
	
	
	
	public static void main(String args[]){
		Node nodeA = new Node("A",2);
		Node nodeB = new Node("B",1);
		Node nodeC = new Node("C",0);
		Node nodeD = new Node("D",0);
		Node nodeE = new Node("E",1);
		
		nodeA.addAdjacent(nodeB);
		nodeA.addAdjacent(nodeD);
		nodeB.addAdjacent(nodeC);
		nodeE.addAdjacent(nodeA);
		
		Graph g = new Graph();
		g.addNode(nodeA);
		g.addNode(nodeB);
		g.addNode(nodeC);
		g.addNode(nodeD);
		g.addNode(nodeE);
		
//		System.out.println(nodeD.getAdjacent().length);
		System.out.println(routExist(g,nodeA,nodeD));
	}
}
