package day1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Genericway {

	public static void main(String[] args) {
		//step1: Set Path for Driver executable
		System.setProperty("webdriver.chrome.driver", "D:\\\\Workspace\\\\SeleniumBasic\\\\Executable\\\\chromedriver.exe");
		//step2: Create an instance of Required browser class 
		WebDriver drive = new ChromeDriver();


	}

}
