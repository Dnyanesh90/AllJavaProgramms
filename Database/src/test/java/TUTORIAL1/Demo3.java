package TUTORIAL1;

import BasePackage.BaseClass;

public class Demo3 extends BaseClass{

	

	public static void main(String[] args) throws InterruptedException {
		BaseClass.inilization();
		
		driver.findElement(By.id("fname")).sendKeys("sanuja");
		driver.findElement(By.id("mname")).sendKeys("abc");
		driver.findElement(By.id("lname")).sendKeys("Kadu");
		
		driver.findElement(By.id("uname")).sendKeys("sanuja@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("sanuja@123");
		driver.findElement(By.id("confirmPass")).sendKeys("sanuja@123");
		
		driver.findElement(By.xpath("/html/body/form[1]/input[7]")).click();
		
		Thread.sleep(4000);
		
		databaseConnector.getDataFromDatabaseSheet();
	

	}

}
