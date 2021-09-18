# coinmarketcapapi
This repository has the scripts to automate coinmarketcap rest services using RestAssured library

# CodeGuidelines
Code should be clean and kept to the same standard as production code - make sure unused variables and methods are removed, code is correctly formatted, with no random newlines and whitespaces.

# Installations

You should have Java installed in your system and must set environment variables for JAVA_HOME

# How To Run the Tests

1. Clone the Project
2. Import the project to your IDE
3. Go to terminal on your IDE
4. Run "mvn clean install" command and make sure the build is successful
5. Generate new apiKey with new login
6. Replace the apiKey parameter in APIStepDefs file
7. Open CoinMarketRunner.java file
8. Right click on the file
9. Select Run CoinMarketRunner

Note:
This will run the whole feature file. If need the execution of particular scenario then
add tags="@tagNameofScenario" after the , of plugin or glue.
Open MyTestRunner.java file
Right Click and select Run MyTestRunner

