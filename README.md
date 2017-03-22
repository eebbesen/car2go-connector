# Car2Go Anypoint Connector

## Supported operations
Public functions from https://github.com/car2go/openAPI are exposed.  Except for `getLocations` all operations require a location parameter.

All operations also require a Car2Go OAuth consumer token which you can request from openapi@car2go.com.

## Tests
There's only one test per endpoint because I only care if we're getting the data in JSON format. These functional tests hit the Car2Go API for realz so you need a Car2Go API OAuth token for them to pass (see https://github.com/car2go/openAPI/wiki).  Feel free to mock that behavior out.

When running the tests with Maven (or any target that causes tests to run, e.g. `package`)you'll need a Car2Go OAuth consumer key assigned to `CAR2GO_CONSUMER_KEY`.

`mvn test -DCAR2GO_CONSUMER_KEY=yoursecretkey`

## Local usage
This connector relies on a client named Car2Gosling which is not yet available in a public Maven repository (but which you can get from https://github.com/eebbesen/car2gosling).

To run tests or package locally you'll need to execute the following.  It creates a local repo on your system that points to the lib directory in this project.

    mvn deploy:deploy-file -DgroupId=com.humegatech -DartifactId=car2gosling -Dversion=1.1.2-SNAPSHOT -Durl=file:./lib/ -DrepositoryId=local-maven-repo -DupdateReleaseInfo=true -Dfile=./lib/car2gosling-1.1.2-SNAPSHOT.jar
