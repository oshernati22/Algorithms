package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainTrainBfs {

	public static void main(String[] args) {
	   
	    State A= new State("A");
	    State B= new State("B");
	    State C= new State("C");
	    State D= new State("D");
	    State E= new State("E");
	    State F= new State("F");
	    State H= new State("H");
	    State I= new State("I");
	    State J= new State("J");
	    A.addToNieboresList(B).addToNieboresList(F);
	    B.addToNieboresList(J).addToNieboresList(C);
	    F.addToNieboresList(E).addToNieboresList(I);
	    J.addToNieboresList(A);
	    C.addToNieboresList(H);
	    I.addToNieboresList(J);
	    H.addToNieboresList(I).addToNieboresList(J);
	    D.addToNieboresList(C).addToNieboresList(H).addToNieboresList(E);
	    Builder buffergraph= new Graphbuilder();
		buffergraph.addToGraph(A).addToGraph(C).addToGraph(B).addToGraph(D).addToGraph(E).addToGraph(F);//build the graph
		buffergraph.addToGraph(J).addToGraph(I).addToGraph(H);//build the graph
		SearchableGraph graph=new SearchableGraph(buffergraph,A);//new graph to solve
		graph.printGraphWithVretxes();
		Searcher Bfs=new Bfs(); // new solver (bfs algorithm)
		Bfs.search(graph);// this function solve all the routes from initial vertex 
	    
	    
	}

}
