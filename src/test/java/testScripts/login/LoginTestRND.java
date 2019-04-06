package testScripts.login;

import org.testng.SkipException;
//import org.testng.TestNGException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.home.Home;
import pageObjects.login.Login;
//import testBase.DataSource;
import testBase.TestBase;

public class LoginTestRND extends TestBase{
	
	Login login;
	Home home;
	
	@DataProvider(name="testData")
	public Object[] testData(){
		Object[][] data = getExcelData("demo.xlsx", "masterData", "login");
		return data;
	}
	
	@BeforeClass
	public void beforeClass(){
		//getApplicationURL(DataSource.OR.getProperty("url"));
		//login = new Login(driver);
	}

	
	@Test(dataProvider="testData")
	public void loginTest1(String userName, String password, String runMode){
		if(runMode.equalsIgnoreCase("n")){
			throw new SkipException("Run mode for this set of data is marked N");
		}
		System.out.println(userName);
		System.out.println(password);
	}

}
