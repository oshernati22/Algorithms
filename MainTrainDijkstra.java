package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainTrainDijkstra { // main that include dijkstra exmaple - graph without negative wights

	public static void main(String[] args) {
    List<Edge> bufferlist=new ArrayList<Edge>();
	bufferlist.add(new Edge(33, "S", "A"));
	bufferlist.add(new Edge(10, "S", "C"));	 
	bufferlist.add(new Edge(8, "S", "B"));
	State S=new State("S",bufferlist);
	bufferlist.removeAll(bufferlist);
	bufferlist.add(new Edge(11,"A","E"));
	State A=new State("A",bufferlist);
	bufferlist.removeAll(bufferlist);
	bufferlist.add(new Edge(9,"C","F"));
	bufferlist.add(new Edge(13,"C","H"));
	bufferlist.add(new Edge(6,"C","D"));
	State C=new State("C",bufferlist);
	bufferlist.removeAll(bufferlist);
	bufferlist.add(new Edge(12,"B","D"));
	State B = new State("B", bufferlist);
	bufferlist.removeAll(bufferlist);
	bufferlist.add(new Edge(5,"D","H"));
	State D = new State("D", bufferlist);
	bufferlist.removeAll(bufferlist);
	bufferlist.add(new Edge(6,"H","F"));
	State H = new State("H", bufferlist);
	bufferlist.removeAll(bufferlist);
	bufferlist.add(new Edge(3,"F","A"));
	bufferlist.add(new Edge(25,"F","E"));
	State F = new State("F", bufferlist);
	bufferlist.removeAll(bufferlist);
	State E= new State("E", bufferlist);
	Builder buffergraph= new Graphbuilder();  // graph builder
	HashMap<String , State> buffermap=new HashMap<String, State>();
	buffermap.put("S",S);
	buffermap.put("A",A);
	buffermap.put("B",B);
	buffermap.put("C",C);
	buffermap.put("D",D);
	buffermap.put("E",E);
	buffermap.put("F",F);
	buffermap.put("H",H);
	buffergraph.addToGraph(S).addToGraph(A).addToGraph(C).addToGraph(B).addToGraph(D).addToGraph(H).addToGraph(F).addToGraph(E);//build the graph
	SearchableGraph graph=new SearchableGraph(buffergraph,S,buffermap);// new graph to solve
	graph.printGraphWithEdges();
	Searcher dijkstra = new Dijkstra(); // new solver (Dijkstra algorithm)
	dijkstra.search(graph);// this function solve the distance and return the best path
	
	}

}
