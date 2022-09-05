package org_day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org_day1.bass.baseclass;

public class dayis19 extends baseclass{
	
	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_1cfjttkdmt_e&adgrpid=58507629306&hvpone=&hvptwo=&hvadid=486388034337&hvpos=&hvnetw=g&hvrand=12488003247772236330&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007809&hvtargid=kwd-28878962&hydadcr=14456_2154379&gclid=CjwKCAjw6fyXBhBgEiwAhhiZsk8XpKF_WR091I48lKCmLDL1j4ykMWCT4evMtQqOUhlXei-xaw8xLBoCHngQAvD_BwE");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		WebElement f1 = driver.findElement(By.id("//span[@class='nav-line-2 ']"));
		f1.click();
		WebElement f2 = driver.findElement(By.id("email"));
		f2.sendKeys("8508883453");
		String url = driver.getCurrentUrl();
		
		String a1 = f2.getAttribute("value");
		String t1 = f2.getText();
		Actions a=new Actions(driver);
		a.dragAndDrop(f1, f2);
		
		
	
		
		
		
		
		
		System.out.println("done");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
