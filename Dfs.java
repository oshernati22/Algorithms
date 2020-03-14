package test;

public class Dfs extends CommonSearcher {
   int time=0;
	@Override
	public boolean search(Searchable s) {
	 
		for(State vertex: s.getGraph()) {
		if(vertex.color==1) {
			dfsVisit(vertex);
		}
	}
		return true;
	}

	
	private void dfsVisit(State u) {
		u.setColor(2);
		this.time= this.time+1;
		u.setDistance(this.time);
       		for (State ver: u.getNieboresList()) {
				if(ver.getColor()==1) {
       			ver.setFather(u);
       			dfsVisit(ver);
				}
	
		}
       		u.setColor(3);
			time=time+1;
			u.setEndtime(this.time);
			if(u.getFather() !=null) {
			System.out.println("vertex "+u.name+ " startime is: "+ u.getDistance() + " end time is: "+ u.getEndtime() +" The father is :" + u.getFather().name);
			}else {
				System.out.println("vertex "+u.name+ " startime is: "+ u.getDistance() + " end time is: "+ u.getEndtime() +" The father is null"); 
			}
	}
	
}
