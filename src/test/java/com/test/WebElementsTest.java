
package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


import java.time.Duration;



import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;






@SuppressWarnings("unused")
public class WebElementTest {

	
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://antoniotrindade.com.br/treinoautomacao/elementsweb.html");
    }
    

    @AfterEach
    public void tearDown() throws Exception {
        Thread.sleep(3000);//tempo de visualização do teste
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testValidateTextField() {
        WebElement tfName = driver.findElement(By.name("txtbox1")); //Identificar um elemento
        tfName.sendKeys("Hello world test automation"); //Fazer uma ação no elemento
        assertEquals("Hello world test automation", tfName.getAttribute("value")); //Validar que o texto está escrito corretamente
    }
    

	

    @Test
    public void testValidateEnableDisableTextField() {
        WebElement tfEnable = driver.findElement(By.name("txtbox1"));
        WebElement tfDisable = driver.findElement(By.name("txtbox2"));


        assertTrue(tfEnable.isEnabled(), "Campo habilitado deveria estar ativo");
        assertFalse(tfDisable.isEnabled(), "Campo desabilitado deveria estar inativo");
    }
}

    

		
	
	

