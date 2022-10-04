package CYDEO.days.day59_functioal_interface;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties = new Properties();
    /*
        private: only accessible in the same class
        static: can be accessed by just class name, without creating an object
        Properties: we are creating an object of this class to connect a properties (test.properties to a java object;
     */

    static {

        try {
            // creates a file object in Java and allows us to connect to a file
            FileInputStream file = new FileInputStream("test.properties");

            // loads the files into the properties object;
            properties.load(file);

        } catch (IOException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
    }

    /*
        static block: run the code in the beginning to make sure everything is set up

        FileInputStream: connect to a file -> allows access to the information in some way
            -> checked exception occurs, so we need to handle with try catch
     */

    /*
    summary:
        1. we created a properties file called test.properties
            -> it has some information
        2. created a class called ConfigReader
        3. in ConfigReader class we created a Properties object
        4. in the static block we connected to the file using FileInputStream;
        5. used the load() method from the Properties object to load an information from the file to the Properties file.
     */

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }

}
