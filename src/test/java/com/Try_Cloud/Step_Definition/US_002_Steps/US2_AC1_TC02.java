package com.Try_Cloud.Step_Definition.US_002_Steps;

import com.Try_Cloud.Pages.LoginPage;
import com.Try_Cloud.Pages.US_002;
import io.cucumber.java.en.When;

public class US2_AC1_TC02 {

    US_002 us_002 = new US_002();


    @When("Click  manus by one by")
    public void clickAnyManu() {
        for (int i = 0; i < us_002.upMenuButtons.size(); i++) {
            us_002.upMenuButtons.get(i).click();
            us_002.userProfileIcon.click();
            us_002.logOutButton.click();
            new LoginPage().logIn();

        }
    }


}
