import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperty {
	public static void main(String[] args) {
        Properties prop = new Properties();
 
        try (InputStream input = new FileInputStream("config.properties")) {
 
            // load a properties file
            prop.load(input);
 
            // get the property value and print it out
            System.out.println("Database - " + prop.getProperty("database"));
            System.out.println("Username - " + prop.getProperty("username"));
            System.out.println("Password - " + prop.getProperty("password"));
 
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
