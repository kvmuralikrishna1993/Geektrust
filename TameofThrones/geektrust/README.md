#### Open the Project in IntelliJ

#### **To Build Jar**:


       mvn clean install -DskipTests -q assembly:single


#### **To run on Jar on cmd:**


        java -jar geektrust.jar <filename with path>
		
        Example: java -jar geektrust.jar "inputs/inputs.txt"



_File should consists of all file names which has test cases._

#### **Each input file format~~:**


        AIR ROZO  -> [KINGDOM, ENCRYPTED MESSAGE]
