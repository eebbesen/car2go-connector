# Car2Go Anypoint Connector
Mule Anypoint connector for the Car2Go public API.
* https://github.com/car2go/openAPI/wiki
* https://www.mulesoft.com/platform/cloud-connectors

## Car2Go API Oauth consumer key required
Email openapi@car2go.com with your request for a key.  See https://github.com/car2go/openAPI/wiki for details.

Provide the key to your program by sending the system property to the JVM thusly:

`-DCAR2GO_CONSUMER_KEY=yoursecretkey`

## Supported operations
Public functions from https://github.com/car2go/openAPI are exposed.  Except for `getLocations` all operations require a location parameter.

## Tests
There's only one test per endpoint because I only care if we're getting the data in JSON format. These functional tests hit the Car2Go API for realz so you need a Car2Go API OAuth token for them to pass (see https://github.com/car2go/openAPI/wiki).

You'll need a Car2Go OAuth consumer key assigned to `CAR2GO_CONSUMER_KEY`.

`mvn test -DCAR2GO_CONSUMER_KEY=yoursecretkey`
