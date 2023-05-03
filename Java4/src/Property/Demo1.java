package Property;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		Properties prop =new Properties();
		FileInputStream fis =new FileInputStream("C:\\Users\\kadam\\eclipse-workspace\\Java1\\src\\Property\\config.properties");
		prop.load(fis);;
		System.out.println(prop.getProperty("url"));
		prop.setProperty("fname", "Soham");
		
	}

}
