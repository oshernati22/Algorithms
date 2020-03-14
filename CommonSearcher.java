package test;

import java.util.List;
import java.util.PriorityQueue;

public abstract class CommonSearcher implements Searcher{ //abstract class of same function in common searchers
	
    protected PriorityQueue<State> queue;

	public CommonSearcher() {
		queue=new PriorityQueue<State>(100,(w0,w1)->w0.getDistance()-w1.getDistance());
	
	}
	protected State popOpenList() { //number of nodes that we finished to handle;
	return queue.poll();
	} 
	@Override
	public abstract boolean search(Searchable s);


	public void Realex(State u,Edge v,Searchable s) {                                     
		if(s.getMap().get(v.getChild()).getDistance()>u.getDistance()+v.wieght) {           //if (distance of [v] > distance of [u]+wights of v)
			s.getMap().get(v.getChild()).setDistance(u.getDistance()+v.wieght);          // then distance of [v]←(distance of[u] + w(u,v))
			s.getMap().get(v.getChild()).setFather(u);            //and set father[v]←u
		   }
		}
		
		public void printanswer(List<State> ListOfFinishState) {
			System.out.println();
			System.out.println();
			System.out.println("The Short Distance From S To::");
			for(State s: ListOfFinishState) {
				System.out.println(s.name+ " " +"is" +" "+s.getDistance());
			}
			
		}



}
