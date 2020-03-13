# GRAPH BUILDERS & SERCHERS

graph builders & serchers implement in JAVA

## how to build regular graph without wieght
1. define new state("state name") (state=node).
2. Add to each state the neighbors it leads to, with the function "addToNieboresList(STATE)".
3. define new graphbuilder() ( for exmpale - | Builder buffergraph= new Graphbuilder();|)
4. add all the state that you made to the graph builder with the function "addToGraph(State)".
5. define new SearchableGraph( graphbuilder,state(the state we want to start with)).

###Congratulations you have a regular graph !


## Running the tests

Explain how to run the automated tests for this system

## Deployment

Add additional notes about how to deploy this on a live system

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
