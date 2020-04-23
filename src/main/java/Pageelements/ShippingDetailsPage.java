package Pageelements;

import UtilitiesForElements.GenericMethods;
import cucumber.api.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import webdriverbase.DriverManager;

import java.util.List;

public class ShippingDetailsPage extends DriverManager {

  @FindBy(css="#titleSelect")
  private WebElement title;

  @FindBy(xpath = "//input[@id='address.firstName']")
  private WebElement firstname;

  @FindBy(xpath = "//input[@id='address.lastName']")
  private WebElement lastname;

  @FindBy(css = "#country")
  private WebElement country;

  @FindBy(xpath = "//input[@id='address.address1']")
  private WebElement address1;

  @FindBy(id="address.towncity")
  private WebElement townCity;

  @FindBy(id="address.postcode")
  private WebElement postcode;

  @FindBy(id="address.work")
  private WebElement telePhone;

  @FindBy(css ="#billing_same")
  private WebElement radioBillingSameAddress;

  @FindBy(css="input#purchasenow")
  private WebElement proceedToPurchase;






    public void fillShippingForm(DataTable credentials){

      GenericMethods.dropDownByValue(title,"Mrs");
     List<List<String>> data =credentials.raw();
     firstname.sendKeys(data.get(0).get(0));
     lastname.sendKeys(data.get(0).get(1));
     GenericMethods.dropDownByValue(country,"United Kingdom");
     address1.sendKeys(data.get(0).get(2));
     townCity.sendKeys(data.get(0).get(3));
     postcode.sendKeys(data.get(0).get(4));
     telePhone.sendKeys(data.get(0).get(5));
     radioBillingSameAddress.click();
     proceedToPurchase.click();

  }



}
