package metodos;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MetodosDeTeste {

	WebDriver driver;
	
	public void abrirNavegador(String url) {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage(). window().maximize();
    driver.get(url);	
	}
	public void validarTitle(String titleEsperado) {
	String titulo = driver.getTitle ();
	assertEquals(titleEsperado, titulo);
	}
	
	public void fecharNavegador() {
		driver.quit();
	}
	
	public void evidenciarTeste(String nomeEvidencia) throws IOException {
	TakesScreenshot	scrShot = (TakesScreenshot) driver;
	File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
	File destFile = new File("./evidencias/"+nomeEvidencia+".png")	;
		FileUtils.copyFile(scrFile, destFile);
	}
	
	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}
	
	}
	

