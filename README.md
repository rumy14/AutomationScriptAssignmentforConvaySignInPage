## clear instructions in the README file on how to execute the tests and generate reports

 

### Execute the Test
* clone or download the project
* import the project as an existing maven project in the Eclipse IDE
* java version "19.0.2" 2023-01-17
* let the build the project
* open the file: Project(convayLoginTest) > src > com.convay.testcases > LoginTestDataDrivenTesting.java
* Run the file as TestNG Test
* browse the file in the browser - ./test-output/index.html
* This will show the test result created by jUnit plugin
-----------------

### Generate reports with the Extent Report
* right click on the file: ./testng.xml
* browse the file in the browser - ./ExtentListenerReportDemo.html
-----------------
### Task List

- [x] Use Selenium WebDriver to automate the Sign-In functionality
- [x] Ensure the project is built using Maven as the build tool
- [x] Implement TestNG for managing test cases and execution
- [x] Generate detailed reports using Extent Reports or Allure to document the test execution results.
- [x] The report should include pass/fail status, execution time, and logs.
- [x] Implement Data-Driven Testing using external data sources like an Excel sheet, CSV file, or JSON file
- [x] Follow the Page Object Model (POM) design pattern for organizing your code
- [x] Create separate page classes for the page elements and corresponding action methods
- [x] Implement error handling to take screenshots of any failed test cases
- [x] Share the project through a GitHub repository, along with all necessary files
-----------------
### Necessary files included
* pom.xml (for Maven dependencies)
* Test case files - src > com.convay.testcases
* Data files (Excel used for data-driven testing) - ./TestData/TestInfo.xlsx
* Report files (Extent Report) - ./ExtentListenerReportDemo.html
* Screenshot folder for failed tests - ./Screenshots(if any testcase failed)
* README file
-----------------
