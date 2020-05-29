package LocatorsCheck;

import UtilitiesForElements.GenericMethods;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;



public class checkLocators {
    WebDriver driver;

    @Test
    public void testTheElements() throws InterruptedException {


        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.get("http://www.netaporter.com");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       // driver.findElement(By.xpath("//span[@class='ccx-lightbox-close']")).click();
        //driver.findElement(By.cssSelector("a.deliver-component-CloseButton.deliver-component-CloseButton--transparent")).click();
        // driver.findElement(By.xpath("(//li[@class='sign-in'])[1]")).click();

         WebElement designerlink = driver.findElement(By.cssSelector("a[href*='Shop/AZDesigners?cm_sp=topnav-_-designers-_-topbar']"));
        //WebElement moveToAccessories = driver.findElement(By.cssSelector("a[href*='Shop/Accessories?']"));
        Actions action = new Actions(driver);
        action.moveToElement(designerlink).build().perform();
        // selectFromFeaturedDesigners("Gucci");
        //driver.findElement(By.linkText("All Accessories")).click();
        //driver.findElement(By.xpath("(//span[@class='AccordionSection2__arrowIcon arrowIcon'])[4]")).click();
        // driver.findElement(By.xpath("(//label[@class='AccordionSection2__heading openLabel'])[1]")).click();
        // driver.findElement(By.linkText("Sunglasses")).click();
        //driver.navigate().refresh();
        //driver.findElement(By.xpath("(//label[@class='AccordionSection2__heading openLabel'])[3]")).click();
        //Thread.sleep(5000);
        //Thread.sleep(3000);
        // List<WebElement> sunglasses = driver.findElements(By.cssSelector("a[href ^='/en-gb/shop/accessories/sunglasses/']"));
        // System.out.println(sunglasses.size());
        //int typesOfSunGlasses = GenericMethods.randomNumberHelper(sunglasses.size());
        // WebElement chooseSunGlasses = sunglasses.get(typesOfSunGlasses);
        // chooseSunGlasses.click();
        selectFromFeaturedDesigners("Gucci");
        //Thread.sleep(5000);
        //driver.navigate().refresh();
        //driver.findElement(By.xpath("(//label[@class='AccordionSection2__heading openLabel'])[3]")).click();
        //List<WebElement>  categories= driver.findElements(By.cssSelector(".PLPAccordionSection43--active.override .AccordionSection2__content.content a span.Filter43__filterLineCheckbox.radioButton"));

       /* List<WebElement> colours = driver.findElements(By.cssSelector(".Swatch6.Filter43__swatch"));
        // driver.navigate().refresh();
        System.out.println(colours.size());
        int chooseColour = GenericMethods.randomNumberHelper(colours.size());
        WebElement randomColour = colours.get(chooseColour);
        randomColour.click();
        driver.navigate().refresh();
        driver.findElement(By.xpath("(//label[@class='AccordionSection2__heading openLabel'])[4]")).click();
        List<WebElement> brands = driver.findElements(By.cssSelector(".DesignerFilterGroup43__list div a"));
        System.out.println(brands.size());
        int brandAccs = GenericMethods.randomNumberHelper(brands.size());
        WebElement selectBrands = brands.get(brandAccs);
        selectBrands.click();
        driver.navigate().refresh();*/
    }

        /*List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
        totalLinks.addAll(driver.findElements(By.tagName("img")));
        System.out.println("total links are :"+totalLinks.size());
        List<WebElement> activeLinks = new ArrayList<WebElement>();
        for (int i = 0; i < totalLinks.size(); i++) {
         // System.out.println(totalLinks.get(i).getAttribute("href"));
          if(totalLinks.get(i).getAttribute("href") !=null){
              activeLinks.add(totalLinks.get(i));}}
        System.out.println("total active links are: "+activeLinks.size());

        for(int j=0;j<activeLinks.size();j++){
            try {
               HttpURLConnection connection= (HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href")).openConnection();
               connection.connect();
               int response=connection.getResponseCode();
               System.out.println(activeLinks.get(j).getAttribute("href")+ "-->"+ response);
               connection.disconnect();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }*/

       /*  driver.findElement(By.linkText("Register")).click();
        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("swetha");
        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("illan");
        driver.findElement(By.cssSelector("[placeholder='Email address']")).sendKeys("swetha.illan@gmail.com");
        driver.findElement(By.cssSelector("[placeholder='Confirm email address']")).sendKeys("swetha.illan@gmail.com");
        driver.findElement(By.cssSelector("[placeholder='Password']")).sendKeys("Net-A-P");
    WebElement element =driver.findElement(By.id("country"));
        GenericMethods.dropDownByValue(element,"GB");
    WebElement birthday= driver.findElement(By.cssSelector("[name='birthDay']"));
        GenericMethods.dropDownByValue(birthday,"22");
    WebElement birthMonth= driver.findElement(By.cssSelector("[name='birthMonth']"));
        GenericMethods.dropDownByValue(birthMonth,"1");
        driver.findElement(By.xpath("//input[@type='radio' and @value='false']")).click();
        driver.findElement(By.xpath("//input[@id='captcha' and @type='checkbox']")).click();
        driver.findElement(By.cssSelector("#submit-registration")).click();*/


    public void selectFromFeaturedDesigners(String brands) {

        By locator = By.cssSelector(".sf-nav__featured-designers ul li");
        List<WebElement> featuredDesigners = driver.findElements(By.cssSelector(".sf-nav__featured-designers ul li"));
        int designerList = featuredDesigners.size();
        System.out.println(designerList);
        for (WebElement Designers : featuredDesigners) {

           // JavascriptExecutor js = (JavascriptExecutor)driver
              WebDriverWait wait = new WebDriverWait(driver,15);
              wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
              String text =Designers.getText();
              System.out.println(text);
            //if(Designers.)
                try {
                if (text.equalsIgnoreCase(brands)) {
                    GenericMethods.actionsToMoveElement(driver,Designers);
                    //js.executeScript("arguments[0].scrollIntoView(true)");
                     Designers.click();
                    break;
                }
           } catch (Exception e) {
                System.out.println("someException");
                //e.printStackTrace();
            }

            if (designerList == 0) {
                TestCase.fail("Designer is not Available");
            }

        }
    }


    public void clickBrand(String value) throws InterruptedException {
        // driver.findElement(By.xpath("(//label[@class='AccordionSection2__heading openLabel'])[3]")).click();
        driver.findElement(By.cssSelector("label[for='Brand-open'] ")).click();
        By locator = By.xpath("//div[@class='DesignerFilterGroup43__list']//a");
        List<WebElement> Brands = driver.findElements(By.xpath("//div[@class='DesignerFilterGroup43__list']//a"));
        int diffBrands = Brands.size();
        System.out.println(diffBrands);
        for (WebElement chooseBrand : Brands) {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            try {
                String text = chooseBrand.getText();
                System.out.println(text);
                if (text.equalsIgnoreCase(value)) {
                    wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
                    chooseBrand.click();
                    System.out.println("element clicked is: " + text);
                    driver.navigate().refresh();
                }
            } catch (Exception e) {
                System.out.println("Dom is closing after clicking element");
                e.printStackTrace();
            }
            // JavascriptExecutor executor = (JavascriptExecutor)driver;
            //executor.executeScript("arguments[0].scrollIntoView(true);", chooseBrand.getText().equalsIgnoreCase(value));
            //executor. executeScript("arguments[0]. click();", chooseBrand.getText().equalsIgnoreCase(value));
            //chooseBrand.click();

            // System.out.println("element clicked is " + text);
        }

        //Thread.sleep(2000);
        if (diffBrands == 0) {
            System.out.println("No colours available");
        }
    }
    // String actual = driver.getCurrentUrl();
    // assertThat(actual, containsString("brand"));


    public void multipleBrands(String... value) {
        driver.findElement(By.cssSelector("label[for='Brand-open']")).click();
        By locator = By.xpath("//div[@class='DesignerFilterGroup43__list']//a");
        List<WebElement> dropList = driver.findElements(By.cssSelector(".DesignerFilterGroup43__list a "));
        if (!value[0].equalsIgnoreCase("ALL")) {
            try {
                for (int i = 0; i < dropList.size(); i++) {
                    WebDriverWait waits = new WebDriverWait(driver, 20);
                    String text = dropList.get(i).getText();
                    System.out.println(text);

                    for (int j = 0; j < value.length; j++) {
                        waits.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
                        if (text.equals(value[j])) {
                            dropList.get(i).click();
                            break;
                        }
                    }
                }
            } catch (Exception e) {

            }}

         else{
                try {
                    for (int full = 0; full < dropList.size(); full++) {
                        dropList.get(full).click();
                    }
                } catch (Exception e) {

                }
            }

        }}



//List<WebElement>Brandslist = driver.findElements(By.xpath("//div[@class='DesignerFilterGroup43__list']//a//span[@class='Filter43__filterLineLabel']"));


        //Thread.sleep(3000);
    /*Alert alert= driver.switchTo().alert();
    // alert.dismiss();
      driver.findElement(By.cssSelector("a.deliver-component-CloseButton.deliver-component-CloseButton--transparent")).click();
     WebElement moveToAccessories =driver.findElement(By.cssSelector("a[href*='Shop/Accessories?']"));
     Actions action= new Actions(driver);
     action.moveToElement(moveToAccessories).build().perform();
     driver.findElement(By.linkText("All Accessories")).click();
      List<WebElement> randomAccessories =driver.findElements(By.cssSelector(".ProductListingPage43__layoutGrid a"));*/
        // Random rand = new Random();
        // int products= rand.nextInt(randomAccessories.size());
        // WebElement randomProducts = randomAccessories.get(products);
        //randomProducts.click();
      /*driver.findElement(By.cssSelector("button.Button10.Button10--primary.AsyncButton10.CTAButtons77__addToBag.primaryButton ")).click();
      driver.findElement(By.cssSelector("a[title='Shopping bag']")).click();
      driver.findElement(By.cssSelector(".primary-button-medium-wide.proceed-to-purchase.position-top")).click();
      driver.findElement(By.cssSelector(".test-guest-customer-email")).sendKeys("swetha.illan@gmail.com");
      driver.findElement(By.xpath("//input[@class='emailSignupRadioButton' and @value='false']")).click();
      driver.findElement(By.cssSelector("#purchasePathSubmit")).click();


    //Actions action = new Actions(driver);
    driver.findElement(By.xpath("(//div[@class='sf-search'])[2]")).click();
    driver.findElement(By.xpath("(//div[@class='sf-search__header'])[2]/form/input[@name='keywords']")).sendKeys("belts");
    driver.findElement(By.xpath("(//div[@class='sf-search__header'])[2]/form/input[@type='submit']")).click();
   List<WebElement> products= driver.findElements(By.cssSelector(".ProductListingPage43__layoutGrid a"));
    int bags= GenericMethods.randomNumberHelper(products.size());
    WebElement randomProducts = products.get(bags);
   randomProducts.click();
  // List<WebElement> colours = driver.findElements(By.cssSelector(".ProductDetailsColours77__coloursList ul li"));
     //int randomColour =GenericMethods.randomNumberHelper(colours.size()-1);
    // WebElement randomColourBags = colours.get(randomColour);
    // randomColourBags.click();
      driver.findElement(By.cssSelector("button.Button10.Button10--primary.AsyncButton10.CTAButtons77__addToBag.primaryButton ")).click();*/


        //action.moveToElement(search).build().perform();
        //search.click();

        //driver.findElement(By.xpath("//div[@class='sf-search__popup sf-search__popup--open']//input[@type='text']")).click();
        // driver.findElement(By.cssSelector(".sf-search__popup.sf-search__popup--open form)).sendKeys("bags");
        //driver.findElement(By.cssSelector(".sf-nav.sf-hover div form input.sf-search__icon.sf-search__icon--nav")).click();




    /* List<WebElement> links = driver.findElements(By.cssSelector(".sf-nav__level1 li a"));
      System.out.println("Total Amenities "  + links.size());
      int statusCode=0;
      HttpURLConnection connection = null;
      try
      {
          for (WebElement link : links)
          {
              String href = link.getAttribute("href");
              System.out.println(link.getAttribute("href"));
              connection = (HttpURLConnection) new URL(href).openConnection();
              connection.connect();
              statusCode = connection.getResponseCode();
              Assert.assertEquals("Broken link " + href + " - response code  :" + statusCode , 200, statusCode);
              System.out.println(href + " - response code :" + statusCode);
          }
      }
      catch(Exception e)
      {
          System.out.println(e.getMessage());
      }
      finally
      {
         // connection.disconnect();
      }
 */





