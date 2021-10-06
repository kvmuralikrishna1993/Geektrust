#### Open the Project in IntelliJ

#### **To Build Jar**:


       mvn clean install -DskipTests -q assembly:single


#### **To run on Jar on cmd:**


        java -jar geektrust.jar <filename with path>
		
        Example: java -jar geektrust.jar "inputs/inputs.txt"


#### **Each input file format:**


        AIR ROZO  -> [KINGDOM, ENCRYPTED MESSAGE]


#### **Test Cases:**

        mvn clean test
        
        mvn jacoco:report
