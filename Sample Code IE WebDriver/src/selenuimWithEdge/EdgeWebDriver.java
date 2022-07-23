package selenuimWithEdge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class EdgeWebDriver {
	public WebDriver driver;

  @Test
  public void EdgrDriver() {
	  System.setProperty("webdriver.edge.driver","C:\\Users\\lo0ol\\Downloads"
	  		+ "\\Compressed\\edgedriver_win64\\msedgedriver.exe");
	  driver = new EdgeDriver();
	  driver.navigate().to("https://sda.edu.sa/");
	 // driver.close();
  }
}
