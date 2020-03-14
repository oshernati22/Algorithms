package test;



import java.util.HashMap;
import java.util.List;

public interface Searchable { // the problem(graph) that we want to solve

	State getInitialState();
	List<Edge> getAllPossibleEdges(State s);
	public List<State> getGraph();
	 public  HashMap<String, State> getMap() ;
	

}
