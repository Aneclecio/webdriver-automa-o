package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementsTest {
	
	public WebDriver driver;	

	@BeforeEach
	public void setUp() throws Exception {
		//System.setProperty("webdriver.chrome.driver", "/Users/umov.me/Dev/drivers/chromedriver");
		System.setProperty("webdriver.geckodriver.driver", "/Users/umov.me/Dev/drivers/geckodriver");
		
		// Para windows
		//System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		
		//driver = new ChromeDriver();
		driver = new FirefoxDriver();
		driver.get("https://antoniotrindade.com.br/treinoautomacao/elementsweb.html");
	}

	@AfterEach
	public void tearDown() throws Exception {
		//Tempo para visualização
		Thread.sleep(3000);
		driver.quit();
	}

	@Test
	public void testValidateTextField() {
		//1. Identificar um elemento
		WebElement tfName = driver.findElement(By.name("txtbox1"));
		
		//2. Fazer uma ação no elemento		
		tfName.sendKeys("Hello world test automation");	
		
		//3. Validar que o texto está escrito corretamente
		assertEquals("Hello world test automation", tfName.getAttribute("value"));		
	}
	
	@Test
	public void testValidateEnableDisableTextField() {
		//1. Identificar um elemento na tela
		WebElement tfEnable = driver.findElement(By.name("txtbox1"));
		WebElement tfDisable = driver.findElement(By.name("txtbox2"));
		
		//2. Validar que os elementos estão habilitado e desabilitado
		assertTrue(tfEnable.isEnabled());
		assertFalse(tfDisable.isEnabled());			
	}
	
	

}
