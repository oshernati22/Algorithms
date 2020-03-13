# GRAPH BUILDERS & SERCHERS

graph builders & serchers implement in JAVA

## How to build regular graph without wieght
1. Define new state("state name") (state=node).
2. Add to each state the neighbors it leads to, with the function "addToNieboresList(STATE)".
3. Define new graphbuilder() ( for exmpale - | Builder buffergraph= new Graphbuilder();|)
4. Add all the state that you made to the graph builder with the function "addToGraph(State)".
5. Define new SearchableGraph( graphbuilder,state(the state we want to start with)).
6. For more exmpales please read the file "MainTrainBfs" line 10-32 or "DfsMainTrain" lines 10-24.

   **Congratulations you have a regular graph !**


## Regular graph function 
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


## Learn about the Algorithms

* [BFS](https://en.wikipedia.org/wiki/Breadth-first_search) 
* [DFS](https://en.wikipedia.org/wiki/Depth-first_search) 
* [BELLMANFORD](https://en.wikipedia.org/wiki/Bellman%E2%80%93Ford_algorithm) 
* [DIJKSTRA](https://en.wikipedia.org/wiki/Dijkstra%27s_algorithm) 


## disclaimer

* This project its just for practice and fun.
* I am aware of the Code smells, these issues will be fixed as soon as possible (im working on it).
* I intend to improve the project and add more serchers.

 ***enjoy !!***
