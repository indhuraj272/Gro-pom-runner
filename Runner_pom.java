package com.pom_runner;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.pom.Login_Page;
import org.reusuable.Base_Class;

public class Runner_pom extends Base_Class{
	
	public static WebDriver driver=browserlanuch("Chrome");
    public static void main(String[] args) throws AWTException, IOException, InterruptedException {
	urllanuch("https://adactinhotelapp.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	Login_Page login=new Login_Page(driver);
	
	sendkey(login.getUsername(), "indhuraj2702");
	sendkey(login.getPassword(), "@yy8dPATFSL3Wm");
	screenscot("/home/hp/eclipse-workspace/seleniumDemo/src/com/selenium/learn/Selenium/scr_1\\snap.png");
	clickon(login.getLogin_btn());
	dropdown_Index(login.getLocations(),1);
	clickon(login.getHotel());
	clickon(login.getRoomtype());
	clickon(login.getRoomnos());
	dropdown_Index(login.getAdultroom(), 1);
	dropdown_Index(login.getChildroom(), 2);
	screenscot("/home/hp/eclipse-workspace/seleniumDemo/src/com/selenium/learn/Selenium/scr_2\\snap.png");
	clickon(login.getSub_mit());
	
	clickon(login.getTick());
	clickon(login.getConti_nue());
	
	sendkey(login.getFirstname(), "indhu");
	sendkey(login.getLastname(), "Raj");
	
	sendkey(login.getAdd_ress(),"2/62,pappyanayakarpatti, srivilliputtur,mallipost" );
	sendkey(login.getCcnum(),"1234567887653456" );
	dropdown_Index(login.getCctype(), 3);
	dropdown_Index(login.getCcexp_month(), 3);
	dropdown_Index(login.getCcexp_year(), 3);
	sendkey(login.getCccvv(), "234");
	screenscot("/home/hp/eclipse-workspace/seleniumDemo/src/com/selenium/learn/Selenium/scr_3\\\\snap.png");
	clickon(login.getBooknow());
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	clickon(login.getBooked_Itinerary());
	
//	driver.get("https://adactinhotelapp.com/BookedItinerary.php");
	screenscot("/home/hp/eclipse-workspace/seleniumDemo/src/com/selenium/learn/Selenium/scr_4\\snap.png");
	
	clickon(login.getCell_pedding());
clickon(login.getCancel_all());

	alertaccept();
	screenscot("/home/hp/eclipse-workspace/seleniumDemo/src/com/selenium/learn/Selenium/scr_5\\snap.png");

	clickon(login.getLog_out());
	screenscot("/home/hp/eclipse-workspace/seleniumDemo/src/com/selenium/learn/Selenium/scr_6\\snap.png");
	
}
}
