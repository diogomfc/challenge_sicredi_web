package br.com.sicredi.pages;

import static org.junit.Assert.*;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

public class MetodosdeTestes {

  private static WebDriver driver;

  public WebDriver adriver() {

    return driver;

  }

  public void abrirNavegador(String url) {
    System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
    driver = new ChromeDriver();
    driver.get(url);
    driver.manage().window().maximize();
  }

  public void selectedSwitchVersions(By elemento) {
    driver.findElement(elemento).click();
  }

  public void btnAddCustomer(By elemento) {
    driver.findElement(elemento).click();
  }

  public void inputCustomerName(By elemento, String texto) {
    driver.findElement(elemento).sendKeys(texto);
  }

  public void inputContactLastName(By elemento, String texto) {
    driver.findElement(elemento).sendKeys(texto);
  }

  public void inputContactFirstName(By elemento, String texto) {
    driver.findElement(elemento).sendKeys(texto);
  }

  public void inputPhone(By elemento, String texto) {
    driver.findElement(elemento).sendKeys(texto);
  }

  public void inputAddressLine1(By elemento, String texto) {
    driver.findElement(elemento).sendKeys(texto);
  }

  public void inputAddressLine2(By elemento, String texto) {
    driver.findElement(elemento).sendKeys(texto);
  }

  public void inputCity(By elemento, String texto) {
    driver.findElement(elemento).sendKeys(texto);
  }

  public void inputState(By elemento, String texto) {
    driver.findElement(elemento).sendKeys(texto);
  }

  public void inputPostalCode(By elemento, String texto) {
    driver.findElement(elemento).sendKeys(texto);
  }

  public void inputCountry(By elemento, String texto) {
    driver.findElement(elemento).sendKeys(texto);
  }

  public void selectEmployee(By elemento) {
    driver.findElement(elemento).click();
  }

  public void inputTextChosenSearch(By elemento) {
    driver.findElement(elemento).sendKeys("Fixter");
  }

  public void insertTextChosenSearch(By elemento) {
    driver.findElement(elemento).sendKeys(Keys.ENTER);
  }

  public void inputCreditLimit(By elemento, String num) {
    driver.findElement(elemento).sendKeys(num);
  }

  public void scroll(int n1, int n2) {
    JavascriptExecutor jsScroll = (JavascriptExecutor) driver;
    jsScroll.executeScript("window.scrollBy(" + n1 + "," + n2 + ")");
  }

  public void btnSave(By elemento) throws InterruptedException {
    driver.findElement(elemento).click();
    Thread.sleep(2000);
  }

  public void mensageValida(By elemento, String mensagem) throws InterruptedException {
    String mensagemExibida = driver.findElement(elemento).getText();
    assertTrue(mensagemExibida.contains(mensagem));
    Thread.sleep(3000);
  }

  public void screenshot(String fileName) throws IOException {
    TakesScreenshot scrShot = (TakesScreenshot) driver;
    java.io.File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
    java.io.File destFile = new java.io.File("./Evidencias/" + fileName + ".png");
    FileUtils.copyFile(scrFile, destFile);
  }

  public void fecharNavegador() {
    driver.quit();
  }

}
