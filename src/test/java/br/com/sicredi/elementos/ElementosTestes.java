package br.com.sicredi.elementos;

import org.openqa.selenium.By;

public class ElementosTestes {
  public By selectedSwitchVersions = By.xpath("//*[@id='switch-version-select']/option[2]");
  public By btnAddCustomer = By.xpath("//a[@href='/v1.x/demo/bootstrap_theme_v4/add']");
  public By inputCustomerName = By.id("field-customerName");
  public By inputContactLastName = By.id("field-contactLastName");
  public By inputContactFirstName = By.id("field-contactFirstName");
  public By inputPhone = By.id("field-phone");
  public By inputAddressLine1 = By.id("field-addressLine1");
  public By inputAddressLine2 = By.id("field-addressLine2");
  public By inputCity = By.id("field-city");
  public By inputState = By.id("field-state");
  public By inputPostalCode = By.id("field-postalCode");
  public By inputCountry = By.id("field-country");

  public By SelectEmployee = By
      .xpath("//div[@id='field_salesRepEmployeeNumber_chosen']//a//span[text()='Select from Employeer']");
  public By inputTextChosenSearch = By.xpath("//div[@class='chosen-drop']//div//input");
  public By insertTextChosenSearch = By.xpath("//div[@class='chosen-drop']//div//input");

  public By inputCreditLimit = By.id("field-creditLimit");
  public By btnSave = By.id("form-button-save");
  public By mensageValida = By.xpath("//div[@id='report-success']/p");
}
