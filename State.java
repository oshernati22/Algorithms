package test;

import java.util.ArrayList;
import java.util.List;

public class State { // here its vertex
    String name;
	private int distance;
	private State Father; // the state we came from to this state 
	List<State> listOFneibores;
	List<Edge> listOfChildren;
	int color;
	int endtime;
	
	
	public State(String name,List<Edge> list){ // CTOR
	distance=Integer.MAX_VALUE;
	Father=null;
	this.name=name;
	this.listOfChildren= new ArrayList<Edge>();
    listOfChildren.addAll(list);
	}
	public State(String name){ // CTOR
		distance=Integer.MAX_VALUE;
		Father=null;
		this.name=name;
	    listOFneibores=new ArrayList<State>();
	    color=1;
	    endtime=Integer.MAX_VALUE;
		}
	public int getDistance(){
		return this.distance;
	}
	public void setDistance(int d){
		this.distance=d;
	}
	
	public State getFather() {
		return Father;
	}
	public void setFather(State father) {
		Father = father;
	}
	public void setCameFrom(State n) {
		this.Father = n;
		
	} 
	
	public State addtoListOfChildren(Edge s) {
		this.listOfChildren.add(s);
		return this;
	}

	public List<Edge> getListOfChildren() {
		return this.listOfChildren;
	}
	
	public int getEndtime() {
		return endtime;
	}

	public void setEndtime(int endtime) {
		this.endtime = endtime;
	}
	
	public State addToNieboresList(State s) {
		this.listOFneibores.add(s);
		return this;
	}
     
	
	public List<State> getNieboresList() {
		return this.listOFneibores;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}
}
