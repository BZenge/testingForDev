# TestingForDevelopers
Test automation project for the TestingForDevelopers session using Selenium/Cucumber.

## Overview
- Basic info
- How to run

### Basic info
Before starting on the project you will need to have java 11 installed on your computer. Once you have done that
you have to execute the "mvn clean install -DskipTests" command to get install all the dependencies from the POM file.

### How to run
To run your test, you have to create a new configuration file with settings "-ea -Dcucumber.filter.tags="@wip"
As soon as you have the configuration file successfully installed you can run your test which you tagged with @wip.

### Exercise 1:
Try to write a test adding a product from any other category besides dresses to your cart.

### Exercise 2:
Try to write a test continuing to the checkout and completing the checkout flow.

### Additional exercise:
- Try to import browser compatibility.
- Try to add screenshots in the report file.