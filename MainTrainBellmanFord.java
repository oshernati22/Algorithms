package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainTrainBellmanFord {

	public static void main(String[] args) {   // main that include bellmanford exmaple - graph with negative wights
		List<Edge> bufferlist=new ArrayList<Edge>();
		bufferlist.add(new Edge(6, "S", "C"));
		bufferlist.add(new Edge(4, "S", "A"));	 
		bufferlist.add(new Edge(2, "S", "D"));
		State S=new State("S",bufferlist);
		bufferlist.removeAll(bufferlist);
		bufferlist.add(new Edge(7, "A", "S"));
		bufferlist.add(new Edge(5, "A", "B"));
		State A=new State("A",bufferlist);
		bufferlist.removeAll(bufferlist);
		bufferlist.add(new Edge(3, "B", "A"));
		bufferlist.add(new Edge(-2, "B", "S"));	 
		bufferlist.add(new Edge(-6, "B", "C"));
		State B=new State("B",bufferlist);
		bufferlist.removeAll(bufferlist);
		State C=new State("C",bufferlist);
		bufferlist.add(new Edge(3, "D", "C"));
		State D=new State("D",bufferlist);
		bufferlist.removeAll(bufferlist);
		HashMap<String , State> buffermap=new HashMap<String, State>();
		buffermap.put("S",S);
		buffermap.put("A",A);
		buffermap.put("B",B);
		buffermap.put("C",C);
		buffermap.put("D",D);
		Builder buffergraph= new Graphbuilder();
		buffergraph.addToGraph(S).addToGraph(A).addToGraph(C).addToGraph(B).addToGraph(D);//build the graph
		SearchableGraph graph=new SearchableGraph(buffergraph,S,buffermap);//new graph to solve
		graph.printGraphWithEdges();
		Searcher Bellman=new BellmanFord(); // new solver (bellmanford algorithm)
		Bellman.search(graph);// this function solve the distance and return the best path
		
	}

}
