package code4life.tests.day8_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency {
    @Test(priority = 1)
    public void openURL(){

        Assert.assertEquals(2, 2);
        System.out.println("Opening up the URL");
    }

    @Test(dependsOnMethods = "openURL", priority = 2)
    public void login(){
        System.out.println("Logging into the website");
    }

    @Test(priority = 3)
    public void clickOnMainMenu(){
        System.out.println("clicking on Main Menu ");
    }

    @Test(priority = 4)
    public void logOut(){
        System.out.println("Logging out of the website");
    }
}
