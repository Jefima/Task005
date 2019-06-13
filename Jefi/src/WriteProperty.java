import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class WriteProperty {
	public static void main(String[] args) {
		 
        try (OutputStream output = new FileOutputStream("config.properties")) {
 
            Properties prop = new Properties();
 
            // set the properties value
            prop.setProperty("database", "localhost");
            prop.setProperty("username", "Jefi");
            prop.setProperty("password", "Jefin");
 
            // save properties to project root folder.
            prop.store(output, null);
 
        } catch (IOException exception) {
            exception.printStackTrace();
        } 
 
    }
}
