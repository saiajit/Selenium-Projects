import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selassignment {

	public static void main(String[] args) {
		
		//Invoking Browser
		// chromeDriver --> Methods() to automate in chrome browser
		//create object of any class to access the methods present in the class
		// only implementation will differ but we can call any method for any browser
		// something above the Driver classes giving instructions on what to do - interface->WebDriver
		//interface- group of related methods with empty bodies
		// classes has to implement the interface->enforces the contract to class to follow
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		//SeleniumManager is not Active upto us
		//training perspective line 14 is important (to make it quicker)
		//SeleniumManager-does all the compatible accordingly 
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		try {
			// I want to maximize the window as its only working in minizmed version
			
			driver.manage().window().maximize();
			
			WebElement firstN = driver.findElement(By.id("firstName"));
			firstN.sendKeys("sai");
			
			WebElement lastN = driver.findElement(By.id("lastName"));
			lastN.sendKeys("ajit");
			// for txt fields
			
			//same for email field too
			WebElement email = driver.findElement(By.id("userEmail"));
			email.sendKeys("ajitsai4@gmail.com");
			
			WebElement genderMale = driver.findElement(By.xpath("//label[@for='gender-radio-1']"));//using xpath
			genderMale.click();
			
			//for mobile
			WebElement mobile = driver.findElement(By.id("userNumber"));
            mobile.sendKeys("9922222222");
			
            
                        
            // subjectInputs
            WebElement subjectsInp= driver.findElement(By.id("subjectsInput"));
            subjectsInp.sendKeys("maths");
            subjectsInp.sendKeys(Keys.ENTER);
            subjectsInp.sendKeys("english");
            subjectsInp.sendKeys(Keys.ENTER);
       
            
            WebElement Reading = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']")); // learnt that for radio buttons xpath can be used to click on it
            Reading.click();
            
            WebElement fileUpload = driver.findElement(By.id("uploadPicture"));
            fileUpload.sendKeys("C:\\Users\\jayan\\Desktop\\1SeleniumProjects/Passport_photo.jpeg");
            
            WebElement currentAddress = driver.findElement(By.id("currentAddress"));
            currentAddress.sendKeys("Dallas, USA");
            
            //Dropdowns
            WebElement state= driver.findElement(By.id("react-select-3-input"));
            state.sendKeys("NCR");
            state.sendKeys(Keys.ENTER);

            WebElement city= driver.findElement(By.id("react-select-4-input"));
            city.sendKeys("Delhi");
            city.sendKeys(Keys.ENTER);

            
            
            //now for datepicker
            WebElement dOB= driver.findElement(By.id("dateOfBirthInput"));
            dOB.click();
            WebElement selectMonth = driver.findElement(By.className("react-datepicker__month-select"));
            selectMonth.sendKeys("October");
            WebElement selectYear = driver.findElement(By.className("react-datepicker__year-select"));
            selectYear.sendKeys("2001");
            Thread.sleep(500); // maybe helps for selecting date half second sleep
            WebElement selectDay = driver.findElement(By.xpath("//div[@aria-label='Choose Wednesday, October 31st, 2001']"));
            selectDay.click();
            
            
            Thread.sleep(1000);
            WebElement submitButton = driver.findElement(By.id("submit"));
            submitButton.click();

            
            
		}
		catch (Exception e) {
			System.out.println("error found that is:"+e.getMessage());
		}//finally object can be used to close the browser
//		driver.close();
	}

}
