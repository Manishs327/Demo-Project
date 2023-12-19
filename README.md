# Cucumber7.xTestNGLatestPOC
Cucumber7.xTestNGLatestPOC

This repository contains a Proof of Concept (POC) for running Cucumber tests using JUnit with Cucumber 7.x. The project demonstrates how to set up and configure your test framework to execute Cucumber scenarios.

# Prerequisites
Java 8 or higher
Maven 3.x

# Project Structure
1. It is a Maven Based Project so it has a pom.xml to take care of the dependencies and plugins.
2. /src/test/java/apphooks : This package is dedicated to application hooks which contains the hooks that needed to be run before and after the test.
3. /src/test/java/factory : This package contains a class DriverFactory.java which we can use to invoke the WebDriver based on the type of browser we provide on the config file.
4. pages: This package is set to dedicate different pages action method which will be utilised by StepDefinitions to create test. This is a POC model. There are still scope for refinement like adding a different pages/prop file for object repository purpose. Also the common functions like element click, text box entry can be moved to common util files.
5. /src/test/java/stepdefs : This package is dedicated for the StepDefinitions which will define the steps that are wrtten in the feature files.
6. /src/test/java/util : This package is dedicated to perform utilities task like reading properties file, separate class is also dedicated for ElementUtil*
   * The ElementUtil is kept blank but it has the scope of acting as a Utility class for project on large scale.
   * Also the Constants is kept blank for POC. But for project on large scale, this class can hold the Constants that we may use.
7. /src/test/runner: This package contains the TestRunner.java which is responsible for trigerring the test and where we can provide different options for running the test like plugins, dryrun, features folder etc.
8. src/test/resources: This folder contains a subfolder "features" where we have kept the features file. Apart from this this holds other properties and xml files.



# Navigate to the project directory:
``` cd Cucumber7.xTestNGLatestPOC ```

# Run the tests with Maven:
``` mvn clean test ```

