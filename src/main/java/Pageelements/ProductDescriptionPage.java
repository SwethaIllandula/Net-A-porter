package Pageelements;

import UtilitiesForElements.GenericMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import webdriverbase.DriverManager;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import static junit.framework.TestCase.fail;

public class ProductDescriptionPage extends DriverManager{


      @FindBy(css = ".ProductListingPage43__layoutGrid a")
      private List<WebElement> accessoriesList;

      @FindBy(xpath = "//div[@class='ProductListingPage43__layoutGrid']/div/a")
      private List<WebElement> listAccessories;

      @FindBy(css=".CombinedSelect11__customizedSelect ul li")
      private List<WebElement> randomSize;

      @FindBy(css = "button[class$='addToBag primaryButton']")
     // css = "button.Button10.Button10--primary.AsyncButton10.CTAButtons77__addToBag.primaryButton ")
      private WebElement addToBag;

      @FindBy(xpath = "(//label[@class='AccordionSection2__heading openLabel'])[3]")
      private WebElement filterColours;

      @FindBy(xpath = "(//label[@class='AccordionSection2__heading openLabel'])[4]")
      private WebElement filterBrands;

      @FindBy(xpath = "(//label[@class='AccordionSection2__heading openLabel'])[1]")
      private WebElement filterCategories;

      @FindBy(xpath = "(//label[@class='AccordionSection2__heading openLabel'])[2]")
      private WebElement filterAccessories;

      @FindBy(css= ".Swatch6.Filter43__swatch")
      private List<WebElement>colours;

      @FindBy(css = ".DesignerFilterGroup43__list div a")
      private List<WebElement> brands;

      @FindBy(css="a[href ^='/en-gb/shop/accessories/sunglasses/']")
      private List<WebElement> typesOfSunglasses;

      @FindBy(linkText = "Sunglasses")
      private WebElement sunGlasses;

      @FindBy(className = "Header5__headingsContainer")
      private WebElement titleOfThePage;

      @FindBy(className = "ProductInformation77__designer")
      private WebElement productTitle;


public String titleOfThePage(){
   return GenericMethods.getTitle(driver);

}

public String getProductTitle(){
   return productTitle.getText();
}



public void productsOnThePage(){

    int productsAvailable = listAccessories.size();
    System.out.println("Products available are :"+productsAvailable);
    if(productsAvailable==0){
        fail("No Products Available on page");
    }
int products=  GenericMethods.randomNumberHelper(productsAvailable);
 WebElement randomProduct= listAccessories.get(products);
 System.out.println("Product Selected is  "  +randomProduct.getText());
 randomProduct.click();

 //int Size =GenericMethods.randomNumberHelper(randomSize.size());
 //WebElement chooseSize = randomSize.get(Size);
 //chooseSize.click();


}

public void chooseProductColour(){
    filterColours.click();
    int randomColour= colours.size();
    System.out.println("Colours Available " +randomColour);
    if(randomColour==0){
        fail("No Colours to choose");
    }

   int coloursToChoose= GenericMethods.randomNumberHelper(randomColour);
   WebElement chooseColour =colours.get(coloursToChoose);
   System.out.println("Chosen Colour is  "+ chooseColour.getText());
   chooseColour.click();
   GenericMethods.refreshPage(driver);
}

public void chooseProductBrand(){
    filterBrands.click();
    int selectBrand = brands.size();
    System.out.println(" Brands Available are :" +selectBrand);
    if(selectBrand==0){
        fail("No Brands Available ");
    }
    int randomBrands = GenericMethods.randomNumberHelper(selectBrand);
    WebElement chooseAnyBrand = brands.get(randomBrands);
    System.out.println("Chosen Brand is "+chooseAnyBrand.getText());
    chooseAnyBrand.click();
    GenericMethods.refreshPage(driver);

}

public void accessoriesCategory(){
    filterCategories.click();
    sunGlasses.click();
    GenericMethods.refreshPage(driver);
    filterAccessories.click();
    int sunGlassTypes = typesOfSunglasses.size();
    System.out.println("SunGlasses available are " +sunGlassTypes);
    if(sunGlassTypes==0){
        fail("No Sunglass Varieties to filter");
    }
   int selectSunGlasses= GenericMethods.randomNumberHelper(sunGlassTypes);
   WebElement chooseSunGlasses = typesOfSunglasses.get(selectSunGlasses);
   System.out.println("Chosen Accessory is " +chooseSunGlasses.getText());
   chooseSunGlasses.click();
   GenericMethods.refreshPage(driver);


}

public String pageTitle(){
   return titleOfThePage.getText();
}

public void addProductToBag() throws InterruptedException {
GenericMethods.refreshPage(driver);
    addToBag.click();
    GenericMethods.refreshPage(driver);

}


}
