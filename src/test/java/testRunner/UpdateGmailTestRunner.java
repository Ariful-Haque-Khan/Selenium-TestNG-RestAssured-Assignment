package testRunner;

import config.Setup;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.UpdateGmailPage;
import utils.Utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UpdateGmailTestRunner extends Setup {
    @Test(priority = 1, description = "Login with last user")
    public void doLogin() throws IOException, ParseException {
        LoginPage loginPage = new LoginPage(driver);
        JSONParser jsonParser = new JSONParser();
        JSONArray jsonArray = (JSONArray) jsonParser.parse(new FileReader("./src/test/resources/users.json"));
        JSONObject userObj = (JSONObject) jsonArray.get(jsonArray.size()-1);
        String email =(String) userObj.get("email");
        loginPage.doLogin(email, "1234");
    }
    @Test(priority = 2, description = "Update gmail with new gmail")
    public void updateGmail() throws IOException, ParseException, InterruptedException {
        UpdateGmailPage updateGmailPage = new UpdateGmailPage(driver);
        updateGmailPage.btnProfileIcon.click();
        updateGmailPage.btnProfileMenuItems.get(0).click();
        updateGmailPage.editBtn.click();
        updateGmailPage.txtEmail.sendKeys(Keys.CONTROL, "a");
        updateGmailPage.txtEmail.sendKeys(Keys.BACK_SPACE);
        updateGmailPage.txtEmail.sendKeys("shakhawatopi+646@gmail.com");
        updateGmailPage.updateBtn.click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        JSONParser jsonParser = new JSONParser();
        JSONArray jsonArray = (JSONArray) jsonParser.parse(new FileReader("./src/test/resources/users.json"));
        JSONObject userObj = (JSONObject) jsonArray.get(jsonArray.size()-1);
        String email =(String) userObj.get("email");
        Utils.updateEmail("./src/test/resources/users.json",email, "shakhawatopi+646@gmail.com");
        updateGmailPage.btnProfileIcon.click();
        updateGmailPage.btnProfileMenuItems.get(1).click();
    }



}