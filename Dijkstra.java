package test;

import java.util.ArrayList;
import java.util.List;

public class Dijkstra extends CommonSearcher {

	@Override
	public boolean search(Searchable s) {
		List<State> ListOfFinishState=new ArrayList<State>();
		s.getInitialState().setDistance(0);
		queue.addAll(s.getGraph()); // put all the vertex in queue
		while(!queue.isEmpty()) { 
			State u = queue.poll(); //extract vertex 
			ListOfFinishState.add(u);
			for(Edge v:u.listOfChildren) { //run all the edges in each vertex and do realex
				 Realex(u,v,s);
					queue.remove(s.getMap().get(v.getChild())); //update the priorty quee
					queue.add(s.getMap().get(v.getChild()));
			}
			  
		}
		printanswer(ListOfFinishState);
		return true;
		
	}
	
	
	

}
