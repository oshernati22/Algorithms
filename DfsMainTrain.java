package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DfsMainTrain {

	public static void main(String[] args) {
	    State U= new State("U");
	    State V= new State("V");
	    State X= new State("X");
	    State Y= new State("Y");
	    State W= new State("W");
	    State Z= new State("Z");
        U.addToNieboresList(V).addToNieboresList(X);
        X.addToNieboresList(V);
        V.addToNieboresList(Y);
        Y.addToNieboresList(X);
        W.addToNieboresList(Y).addToNieboresList(Z);
        Builder buffergraph= new Graphbuilder();
        buffergraph.addToGraph(U).addToGraph(V).addToGraph(X).addToGraph(Y).addToGraph(W).addToGraph(Z);
    	SearchableGraph graph=new SearchableGraph(buffergraph,U);//new graph to solve
    	graph.printGraphWithVretxes();;
		Searcher Dfs=new Dfs(); // new solver (dfs algorithm)
		Dfs.search(graph);// this function make graph to deep first search tree and give us start times end times and who is the father in the best routes
        
	}

}
