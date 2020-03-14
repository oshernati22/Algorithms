package test;

public class BellmanFord  extends CommonSearcher{

	@Override
	public boolean search(Searchable s) {
	  s.getInitialState().setDistance(0);
	  for (int i = 0; i < s.getGraph().size() ; i++) {
		  for(Edge e :s.getGraph().get(i).getListOfChildren()) {
			  Realex(s.getGraph().get(i), e, s);                      // do realex alll the edges
		  }
	  }
	  
	  
	  for (int i = 0; i < s.getGraph().size() ; i++) {
	  
	  for(Edge e :s.getGraph().get(i).getListOfChildren()) {
			if(s.getMap().get(e.getChild()).getDistance()>s.getGraph().get(i).getDistance()+e.wieght) { // check if theres negative circle
				return false;
			}
	  }
	  }
	  printanswer(s.getGraph());
	  return true;

	}

}
