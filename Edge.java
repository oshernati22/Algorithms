package test;

public class Edge { //edge in the graph

	int wieght;
	String father;
	String child;
	public Edge(int wieght, String father, String child) {
		super();
		this.wieght = wieght;
		this.father = father;
		this.child = child;
	}
	public int getWieght() {
		return wieght;
	}
	public void setWieght(int wieght) {
		this.wieght = wieght;
	}
	public String getFather() {
		return father;
	}
	public void setFather(String father) {
		this.father = father;
	}
	public String getChild() {
		return child;
	}
	public void setChild(String child) {
		this.child = child;
	}
	
}
