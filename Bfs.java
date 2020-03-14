package test;

public class Bfs extends CommonSearcher {

	@Override
	public boolean search(Searchable s) {
		System.out.println();
		System.out.println("The distance from vertex" +" "+s.getInitialState().name+ "  is : ");
		s.getInitialState().setColor(2);
		s.getInitialState().setDistance(0);
		queue.add(s.getInitialState());
		while (!queue.isEmpty()) {
			State u = queue.poll();
			for (State vertex : u.getNieboresList()) {
				if(vertex.getColor()==1) {
					vertex.setColor(2);
					vertex.setDistance(u.getDistance()+1);
					vertex.setFather(u);
					queue.add(vertex);
					System.out.println(u.name + "-"+"("+ vertex.getDistance()+ ")"+ "->" + vertex.name);
				}
			}
			u.setColor(3);
		   
		}
		
		return true;
	}
	

}
