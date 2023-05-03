package BasePackage;

import java.io.FileInputStream;
import java.util.Properties;

public class BaseClass {

	public static Properties prop;
	public static WebDriver driver;

	public BaseClass() {
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\praf0\\Desktop\\June Batch Script\\GUIandDatabaseEndToEndFramework\\src\\main\\java\\configLayer\\config.properties");

			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void inilization() 
	{
		String browsers =prop.getProperty("browsername");
		if(browsers.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			 driver =new ChromeDriver();
		}
		else if(browsers.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			 driver =new EdgeDriver();
		}
		else {
			System.err.println("Use Proper browser name");
		}
		
		driver.get(prop.getProperty("url"));
		
		
	}

}
		

	}

}
