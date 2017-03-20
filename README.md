# Car2Go Anypoint Connector

## Supported operations

### Get Locations


## Local usage
This connector relies on a client named Car2Gosling which is not yet available in a public repository.

To run tests or package locally you'll need to execute the following.  It creates a local repo on your system that points to the lib directory in this project.

    mvn deploy:deploy-file -DgroupId=com.humegatech -DartifactId=car2gosling -Dversion=1.0-SNAPSHOT -Durl=file:./lib/ -DrepositoryId=local-maven-repo -DupdateReleaseInfo=true -Dfile=./lib/car2gosling-1.0-SNAPSHOT.jar
