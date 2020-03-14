# GRAPH BUILDERS & SERCHERS

graph builders & serchers implement in JAVA

## How to build regular graph without wieght
1. Define new state("state name") (state=node).
2. Add to each state the neighbors it leads to, with the function "addToNieboresList(STATE)".
3. Define new graphbuilder() ( for exmpale - | Builder buffergraph= new Graphbuilder();|).
4. Add all the state that you made to the graph builder with the function "addToGraph(State)" (support in flowing programing).
5. Define new SearchableGraph( graphbuilder,state(the state we want to start with)).
6. For more exmpales please read the file "MainTrainBfs" line 10-32 or "DfsMainTrain" lines 10-24.

   **Congratulations you have a regular graph !!**


## Regular graph functions 
1. printGraphWithVretxes()- print the regular graph.
2. getInitialState()- get the start state.
3.  getGraph()- get list of states that in the graph.

## How to run BFS on the  regular graph
1. Define new searcher = Bfs(),for exmpale |Searcher Bfs=new Bfs();|.
2. Use function search(SearchableGraph)- the function get searchable graph and print the distance of the shortest path from the start. state.

3.For more exmpales please read the file "MainTrainBfs" line 10-35.

## How to run DFS on the  regular graph
1. Define new searcher = Dfs(),for exmpale |Searcher Dfs=new Dfs();|.
2. Use function search(SearchableGraph)- the function get searchable graph and print the start time ,end time and the father of each state in the shortest path from the start state.

3.For more exmpales please read the file "DfsMainTrain" line 10-26.

## How to build graph with wieghts
1. Define new arraylist of edges for exmpale |List<Edge> bufferlist=new ArrayList<Edge>();|.
2. Add to the list new edges from one state according to your graph, every new edge get the | weight (int) |, | father (string) | and |   child(string)|  for exmpale |bufferlist.add(new Edge(33, "S", "A"));|.
3. Define new state("state name",list of edges that we made in 1,2 (bufferlist)) (state=node).
4. Remove all the buffer list |bufferlist.removeAll(bufferlist);|.
5. Do 2-4 it for each state in the graph.
6. Define new graphbuilder() ( for exmpale - | Builder buffergraph= new Graphbuilder();|).
7. Define new hashmap<String,State> for example |	HashMap<String , State> buffermap=new HashMap<String, State>();|.
8. Add all the states with thier names to the map with put function | buffermap.put("S",S); |.
9. Add all the state that you made to the graph builder with the function "addToGraph(State)" (support in flowing programing).
10.Define new SearchableGraph( graphbuilder,state(the state we want to start with),buffermap (the map with all the states)).
11. For more exmpales please read the file "MainTrainDijkstra" line 10-49 or "MainTrainBellmanFord" lines 10-37.

   **Congratulations you have a wieghted graph !!**
   
## Graph with wieghts functions
1. printGraphWithEdges()- print the graph with wieghts.
2. getInitialState()- get the start state.
3.  getGraph()- get list of states that in the graph.
4. getMap()- get the states map.
5. getAllPossibleEdges(State s) - get array list of all the weighted edges that go from this specific state.
  
## How to run BELLMANFORD on the whieghted graph
1. Define new searcher =BellmanFord ,for exmpale |Searcher Bellman=new BellmanFord(); |.
2. Use function search(SearchableGraph)- the function get searchable wieghted graph and print  the short distance from start state to any state.


3. For more exmpales please read the file "MainTrainBellmanFord" line 10-40.

## How to run DIJKSTRA on the whieghted graph
1. Define new searcher = Dijkstra ,for exmpale |Searcher dijkstra = new Dijkstra();|.
2. Use function search(SearchableGraph)- the function get searchable wieghted graph and print the short distance from start state to any state.

3. For more exmpales please read the file "MainTrainDijkstra" line 10-52.


## Learn about the Algorithms

* [BFS](https://en.wikipedia.org/wiki/Breadth-first_search) 
* [DFS](https://en.wikipedia.org/wiki/Depth-first_search) 
* [BELLMANFORD](https://en.wikipedia.org/wiki/Bellman%E2%80%93Ford_algorithm) 
* [DIJKSTRA](https://en.wikipedia.org/wiki/Dijkstra%27s_algorithm) 


## Disclaimer

* This project its just for practice and fun.
* I am aware of the Code smells, these issues will be fixed as soon as possible (im working on it).
* I intend to improve the project and add more serchers.

 # HAVE FUN !!
