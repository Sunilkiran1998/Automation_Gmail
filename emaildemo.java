import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
public class emaildemo {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:/Chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url ="https://www.google.com/gmail/about/";
		driver.get(url);
		driver.manage().window().maximize();
		
		//create account button
		driver.findElement(By.xpath("/html/body/header/div/div/div/a[3]/span[2]")).click();
		
		//entering details
		driver.findElement(By.name("firstName")).sendKeys("Sunil");
		driver.findElement(By.name("lastName")).sendKeys("Kiran");
		driver.findElement(By.xpath("//*[@id='collectNameNext']/div/button/span")).click();
		Thread.sleep(5000);
		
		// next page for date
		WebElement w = driver.findElement(By.cssSelector("#day"));
		w.click();
		w.sendKeys("12");
		
		// for month
		WebElement w1 = driver.findElement(By.xpath("//*[@id='month']"));
		Select s1 = new Select(w1);
		s1.selectByValue("1");
		
		//to display all the months
		/*for(int i=0; i<l1.size(); i++){
			String s2 = l1.get(i).getText();
			System.out.println(s2);
		}*/
		
		// for year
		Thread.sleep(2000);
		WebElement w2 = driver.findElement(By.cssSelector("#year"));
		w2.click();
		w2.sendKeys("1998");
		
		// for gender
		WebElement w3 =driver.findElement(By.xpath("//*[@id='gender']"));
		Select s2 = new Select(w3);
		s2.selectByValue("1");
		
		// submit button 
		Thread.sleep(2000);
		WebElement w4 = driver.findElement(By.cssSelector("#birthdaygenderNext > div > button > span"));		
		w4.click();
		
		//creating own email address
		Thread.sleep(5000);
		WebElement w5 = driver.findElement(By.name("Username"));
		w5.sendKeys("SunilKiran199");
		
		//submit button for email creation
		driver.findElement(By.xpath("//*[@id='next']/div/button/span")).click();
		
		//password page
		Thread.sleep(2000);
		driver.findElement(By.name("Passwd")).sendKeys("Sunil1998");
		driver.findElement(By.name("PasswdAgain")).sendKeys("Sunil1998");
		//check-box to show password
		List<WebElement> l = driver.findElements(By.xpath("//*[@id='view_container']/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div/div[3]/div/div[1]/div/div/div[1]/div/input"));
		boolean b = l.get(0).isSelected();
		if(b) l.get(1).isSelected();
		else l.get(0).click();
		//driver.close(); 
		
		//submit key
		Thread.sleep(2000);
		WebElement w6 =driver.findElement(By.cssSelector("#createpasswordNext > div > button > span"));
		w6.click();
		
		//phone number
		Thread.sleep(2000);
		WebElement w7 = driver.findElement(By.xpath("//*[@id='phoneNumberId']"));
		w7.sendKeys("1234567891"); 
		
		driver.close();
		System.out.println("ALERT MESSAGE-New Account Created");				
	} 

} 