//package propertiesfile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileWriting {
    public static void main(String args[]) {
        Properties prop = new Properties();
        try {
            // set the properties value
            prop.setProperty("Gujarat", "Gandhinagar");
            prop.setProperty("Maharashtra", "Mumbai");
            prop.setProperty("Madhya_Pradesh", "Indore");
            prop.setProperty("Rajasthan", "Jaipur");
            prop.setProperty("Punjab", "mkyong");
            prop.setProperty("Uttar_Pradesh", "Lucknow");
            // save properties to project root folder
            prop.store(new FileOutputStream("capitals.properties"), null);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
