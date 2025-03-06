package org.test;

import org.excute.SeleniumBaseClass;

import org.openqa.selenium.WebElement;
import org.page.LoginPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class TC01_BooksWagonClass extends SeleniumBaseClass {
	public static SeleniumBaseClass Baseclass=new SeleniumBaseClass();
	public static LoginPage login;

   @Test
   public void clickBuyNow() {
	   login =new LoginPage();
	   WebElement buynowButton = login.getBuynowButton();
	   Baseclass.SeleniumByJse(buynowButton);
	   Baseclass.navigate();
	   WebElement recipientName = login.getRecipientName();
	   Baseclass.SeleniumByJava(recipientName,"muniraj");
	 WebElement companyName = login.getCompanyName();
	 Baseclass.SeleniumByJava(companyName,"Tvs");
	   WebElement address = login.getAddress();
	   Baseclass.SeleniumByJava(address,"chennai");
	   WebElement landMark = login.getLandMark();
	   Baseclass.SeleniumByJava(landMark,"velachery");
	   WebElement selectionCountry = login.getSelectionCountry();
	   Baseclass.SeleniumByJse(selectionCountry);
	   WebElement selectionState = login.getSelectionState();
	   Baseclass.SeleniumByJava(selectionState,"Tamil Nadu");
	   Baseclass.Waits();
	   WebElement selectioncity = login.getSelectioncity();
	   Baseclass.SeleniumByJse(selectioncity);
	   WebElement pincode = login.getPincode();
	   Baseclass.SeleniumByJava(pincode,"687789");
	   WebElement mobileNumber = login.getMobileNumber();
	   Baseclass.SeleniumByJava(mobileNumber,"9597126845");
	   WebElement saveandContinue = login.getSaveandContinue();
	   Baseclass.SeleniumByJse(saveandContinue);
	   Baseclass.navigate();
   }
	   @AfterClass
		 public static void logoutPage() {
			 login =new LoginPage();
		   
		   WebElement clickLogout = login.getClickLogout();
		   Baseclass.SeleniumByJse(clickLogout);
		   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   

}
}


	
	
	
	
	
	
	
	
	
	
	
	

