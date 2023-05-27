package com.Try_Cloud.Pages;

import com.Try_Cloud.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;

import java.util.List;

public class ContactsPage {


    public HTMLInputElement delete;

    public List<WebElement> picture;
    public HTMLInputElement choose;
    public HTMLInputElement logOut;

    public ContactsPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="(//li[@data-id='contacts'])[1]")
    public WebElement contacts;


    @FindBy(id="new-contact-button")
    public WebElement newContact;


    @FindBy(xpath="//div[@class='app-navigation-entry__counter'][1]")
    public WebElement allContactsTotal;

    @FindBy(css="[title='All contacts']")
    public WebElement allContactsTitle;


    @FindBy(xpath = "//*[@class='icon action-item__menutoggle icon-picture-force-white']")
    public WebElement profilePictureIcon;


   // @FindBy(xpath = "//*[@src='/index.php/avatar/Employee83/32?v=13']")
    //public WebElement employee83Button;

    @FindBy(css ="[class='action-item header-menu']")
    public WebElement threePointItem;

    @FindBy(xpath="(//span[@class='action-button__icon icon-delete'])[5]/..")
    public WebElement deleteButton;



    @FindBy(xpath="//span[@class='action-button__icon icon-folder']/..")
    public WebElement chooseFromFileButton;

    @FindBy(css="[class='oc-dialog-title']")
    public WebElement pickAnAvatarTitle;

    @FindBy(css="tbody>tr:nth-child(3)>[class='filename']")
    public WebElement ajaxProfilePicture;

    @FindBy(css=".oc-dialog-buttonrow>button")
    public WebElement chooseButton;

    @FindBy(id="expand")
    public WebElement profileSettingsButton;

    @FindBy(css="[data-id='logout']")
    public WebElement logoutButton;

   @FindBy(css="[id='contacts-list']>div>div")
    public List<WebElement> listOfContacts;





}


