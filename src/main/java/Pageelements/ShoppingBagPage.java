package Pageelements;

import UtilitiesForElements.GenericMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import webdriverbase.DriverManager;
import static junit.framework.TestCase.fail;

import java.util.List;

public class ShoppingBagPage extends DriverManager {

    @FindBy(css = "a[title='Shopping bag']")
    private WebElement checkShoppingBag;

    @FindBy(css = ".primary-button-medium-wide.proceed-to-purchase.position-top")
    private WebElement proceedToPurchase;


    @FindBy(xpath= "//input[@class='emailSignupRadioButton' and @value='false']")
    private WebElement RadioButton;




   public void shoppingBag() {
       checkShoppingBag.click();
       GenericMethods.refreshPage(driver);
       proceedToPurchase.click();
       GenericMethods.refreshPage(driver);

       if(checkShoppingBag.equals("out of stock")){
           fail("Item is out of stock");
       }

   }



public String titleOfThePage(){
       return GenericMethods.getTitle(driver);
}



}
