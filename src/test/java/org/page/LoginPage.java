package org.page;

import org.excute.SeleniumBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends SeleniumBaseClass{
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//div[@class='arrowimg']")
	private WebElement myAccount;
	public WebElement getMyAccount() {
		return myAccount;
	}
	@FindBy(xpath="//input[@name='ctl00$phBody$SignIn$txtEmail']")
	private WebElement userId;
	public WebElement getUserId() {
		return userId;
	}
	@FindBy(xpath="//input[@name='ctl00$phBody$SignIn$txtPassword']")
	private WebElement userPassword;
	public WebElement getUserPassword() {
		return userPassword;
	}
	@FindBy(xpath="//a[@id='ctl00_phBody_SignIn_btnLogin']")
	private WebElement clickLogin;
	public WebElement getClickLogin() {
		return clickLogin;
	}
	@FindBy(xpath="//a[text()='Fiction Books']")
	private WebElement ClickFictionBook;
	public WebElement getClickFictionBook() {
		return ClickFictionBook;
	}
	@FindBy(xpath="(//img[@class='w-100'])[40]")
	private WebElement addBook1;
	public WebElement getAddBook1() {
		return addBook1;
	}
	@FindBy(xpath="//select[@id='ctl00_phBody_ProductDetail_CartBoxWeb_ddlQty']")
private WebElement addBook3;
	public WebElement getAddBook3() {
		return addBook3;
	}
	@FindBy(xpath="//a[@id='btnAddtocart']")
	private WebElement clickCartButton;
	public WebElement getClickCartButton() {
		return clickCartButton;
	}
	@FindBy(xpath="//a[text()='Buy Now']")
	private WebElement buynowButton;
	public WebElement getBuynowButton() {
		return buynowButton;
	}
	@FindBy(xpath="//input[@name='ctl00$cpBody$txtNewRecipientName']")
	private WebElement RecipientName;
	public WebElement getRecipientName() {
		return RecipientName;
	}
	@FindBy(xpath="//input[@name='ctl00$cpBody$txtNewCompanyName']")
	private WebElement CompanyName;
	public WebElement getCompanyName() {
		return CompanyName;
	}
	@FindBy(xpath="//textarea[@name='ctl00$cpBody$txtNewAddress']")
	private WebElement address;
	public WebElement getAddress() {
		return address;
	}
	@FindBy(xpath="//input[@name=\"ctl00$cpBody$txtNewRecipientName\"]")
	private WebElement landMark;
	public WebElement getLandMark() {
		return landMark;
	}
	@FindBy(xpath="//option[text()='India']")
	private WebElement selectionCountry;
	public WebElement getSelectionCountry() {
		return selectionCountry;
	}
	@FindBy(xpath="//select[@name='ctl00$cpBody$ddlNewState']")
	private WebElement selectionState;
	public WebElement getSelectionState() {
		return selectionState;
	}
	@FindBy(xpath="//option[@value='Aruppukkottai']")
	private WebElement Selectioncity;
	public WebElement getSelectioncity() {
		return Selectioncity;
	}
	@FindBy(xpath="//input[@name='ctl00$cpBody$txtNewPincode']")
	private WebElement pincode;
	public WebElement getPincode() {
		return pincode;
	}
	@FindBy(xpath="//input[@name='ctl00$cpBody$txtNewPhone']")
	private WebElement MobileNumber;
	public WebElement getMobileNumber() {
		return MobileNumber;
	}
	@FindBy(xpath="//input[@name='ctl00$cpBody$imgSaveNew']")
	private WebElement SaveandContinue;
	public WebElement getSaveandContinue() {
		return SaveandContinue;
	}
	@FindBy(xpath="//a[@id='ctl00_lnkbtnLogout']")
	private WebElement ClickLogout;
	public WebElement getClickLogout() {
		return ClickLogout;
	}
	}
	

