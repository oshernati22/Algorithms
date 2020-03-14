package test;


import java.util.HashMap;
import java.util.List;

public class SearchableGraph implements Searchable { // the graph we want to solve
   Builder g;
   State startstate; 
   HashMap<String, State> map; // hash of each vertex and is name
   
   
	public SearchableGraph(Builder g, State startstate,  HashMap<String, State> map) {
	super();
	this.g = g;
	this.startstate = startstate;
	this.map=map;
    }

	public SearchableGraph(Builder g, State startstate) {
		super();
		this.g = g;
		this.startstate = startstate;
	    }

	@Override
	public State getInitialState() {
		return startstate;
	}

	@Override
	public List<Edge> getAllPossibleEdges(State s) { // possible edges of each vertex
	return s.listOfChildren;
	}

	public List<State> getGraph(){
		return g.getGraph();
	}
   public  HashMap<String, State> getMap() { 
	return this.map;
   }
   
   
   
   public void printGraphWithEdges() {
		for(State s : this.g.getGraph()) {
			System.out.print("The Neighborã of:");
			if(!s.listOfChildren.isEmpty()) {
			for(Edge e: s.listOfChildren) {
				System.out.print( e.getFather() +"-"+ "("+e.getWieght()+")"+"->"+e.getChild() +" ");
				
			}
			}else
			{
				System.out.print(s.name+ "--> none");
			}
		      System.out.println();
		}
	}
   
   public void printGraphWithVretxes() {
		System.out.println("The graph is :");
		for(State s: this.g.getGraph())
		{
			if(s.getNieboresList().isEmpty()) {
				System.out.print(s.name + "-->none");
			}else {
			for(State child: s.getNieboresList() ) {
				System.out.print(s.name + "-->" + child.name+" ");
			}
			}
			System.out.println();
		}
	}
   
}
