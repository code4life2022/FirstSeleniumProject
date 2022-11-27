package code4life.utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

   public static String getValue(String key) throws IOException {
       FileReader reader ;
       try {
           reader = new FileReader("cred.properties");
       } catch (FileNotFoundException e) {
           throw new RuntimeException(e);
       }


       Properties properties = new Properties();
       properties.load(reader);



       String value = properties.getProperty(key);


       return value;
   }






}
