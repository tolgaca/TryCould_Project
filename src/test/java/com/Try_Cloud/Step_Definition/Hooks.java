package com.Try_Cloud.Step_Definition;

import com.Try_Cloud.Utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hooks {

//    @AfterStep
//    void closeDriver(Scenario scenario) {
//        if (scenario.isFailed()) {
//            Driver.closeDriver();
//        }
//    }

    @After
    public void closeDriverafter(Scenario scenario) {


        if (scenario.isFailed()) {

            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());

        }
        System.out.println("Close working"+scenario.getName());
      Driver.closeDriver();


    }

    // That is the issue "Ensar"
//    @After(value="@DeleteCreatedBoards",order = 2)
//    public void deleteBoards(Scenario scenario) {
//
//        if (scenario.isFailed()) {
//            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
//            scenario.attach(screenshot, "image/png", scenario.getName());
//        }
//
//
//        while(true){
//            List<WebElement> boards2 = new Deck_Module_POM().createdBoards3Dots;
//
//            boards2.get(boards2.size()-1).click();
//
//            new Deck_Module_POM().deleteButtonBar.click();
//            BrowserUtils.sleep(1);
//            new Deck_Module_POM().deleteButtonRedIcon.click();
//            Driver.getDriver().navigate().refresh();
//
//            if (boards2.size()==0){
//                break;
//            }
//
//
//        }
//
//        Driver.closeDriver();
//
//    }

}
