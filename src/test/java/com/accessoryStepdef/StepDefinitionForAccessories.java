package com.accessoryStepdef;

import Pageelements.*;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import webdriverbase.DriverManager;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.concurrent.TimeUnit;

public class StepDefinitionForAccessories  {

    HomePage homePage = new HomePage();
    ProductDescriptionPage productDescriptionPage = new ProductDescriptionPage();
    ShoppingBagPage shoppingBagPage = new ShoppingBagPage();
    ShippingDetailsPage shippingDetailsPage;
    SignInGuestCheckout signInGuestCheckout;


    @Given("^User On HomePage$")
    public void user_On_HomePage() throws Throwable {
        homePage=new HomePage();
        String actualURL =  homePage.getCurrentURL();
        assertThat(actualURL,(is(endsWith("/gb/en/"))));



    }

    @When("^User move-Over Accessories Department$")
    public void user_move_Over_Accessories_Department() throws Throwable {
        productDescriptionPage = new ProductDescriptionPage();
        String productTitle= productDescriptionPage.titleOfThePage();
        productDescriptionPage.productsOnThePage();
        productDescriptionPage.addProductToBag();
        Assert.assertEquals("Hair Accessories | Accessories | NET-A-PORTER",productTitle);


    }

    @Then("^User should be able to Shop and Purchase desire Product Successfully\\.$")
    public void user_should_be_able_to_Shop_and_Purchase_desire_Product_Successfully() throws Throwable {
        shoppingBagPage = new ShoppingBagPage();
        shoppingBagPage.shoppingBag();
        signInGuestCheckout = new SignInGuestCheckout();
        signInGuestCheckout.guestCheckOut();
       // shippingDetailsPage =new ShippingDetailsPage();
       // DataTable credentials = null;
       //shippingDetailsPage.fillShippingForm(credentials);


    }




    @Given("^User On Hair-Accessories Page$")
    public void user_On_Hair_Accessories_Page() throws Throwable {
        //productDescriptionPage = new ProductDescriptionPage();
        homePage.allAccessories();
       String title = productDescriptionPage.titleOfThePage();
       Assert.assertEquals("Accessories | NET-A-PORTER",title);



    }

    @When("^User Selects Products By Using Filters With Colours and Brands$")
    public void user_Selects_Products_By_Using_Filters_With_Colours_and_Brands() throws Throwable {
     productDescriptionPage.accessoriesCategory();
     productDescriptionPage.chooseProductColour();
     //productDescriptionPage.chooseProductBrand();
     String title =productDescriptionPage.titleOfThePage();
     System.out.println(title);
    }

    @Then("^User Should be able to See the Product$")
    public void user_Should_be_able_to_See_the_Product() throws Throwable {
      productDescriptionPage.productsOnThePage();
      productDescriptionPage.addProductToBag();
      shoppingBagPage.shoppingBag();
      System.out.println(shoppingBagPage.titleOfThePage());


    }






}
