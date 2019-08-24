import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesHandler {
    public static void main(String[] args) {
        Properties prop = new Properties();
        InputStream input = null;

        try {
            input = new FileInputStream("config.properties");
            prop.load(input);

            System.out.println(prop.getProperty("defaulBrowser"));

        } catch (IOException ex){
            ex.printStackTrace();

        } finally {
            if (input !=null){
                try{
                    input.close();
                } catch (IOException e){}

            }
        }
    }
}
