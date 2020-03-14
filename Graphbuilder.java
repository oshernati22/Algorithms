package test;

import java.util.ArrayList;
import java.util.List;

public class Graphbuilder implements Builder{ //Attaches all vertices

	List <State> allgraph; // list of the neighbors states
   
	public Graphbuilder() {
		super();
		this.allgraph=new ArrayList<State>();
	}

	@Override
	public Builder addToGraph(State s) {
		this.allgraph.add(s);
		return this;
	}

	@Override
	public List<State> getGraph() {
       return this.allgraph;
	}


	




}
