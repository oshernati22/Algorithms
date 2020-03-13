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


## Built With

* [Dropwizard](http://www.dropwizard.io/1.0.2/docs/) - The web framework used
* [Maven](https://maven.apache.org/) - Dependency Management
* [ROME](https://rometools.github.io/rome/) - Used to generate RSS Feeds

## Contributing

Please read [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags). 

## Authors

* **Billie Thompson** - *Initial work* - [PurpleBooth](https://github.com/PurpleBooth)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc
