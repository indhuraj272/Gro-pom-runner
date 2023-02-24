package com.pom_runner;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.pom.Login_Page;
import org.pom.gro_elements;
import org.reusuable.Base_Class;

public class Gro_POM_Runner extends Base_Class{

	public static WebDriver driver=browserlanuch("Chrome");
    public static void main(String[] args) throws AWTException, IOException, InterruptedException {
	urllanuch("http://13.232.97.105/");
	max();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	gro_elements gro=new gro_elements(driver);
//signin	
	clickon(gro.getLogin());
	sendkey(gro.getEmail(), "super_admin@hlf.com");
	sendkey(gro.getPassword(), "12345678");
	clickon(gro.getSignin_button());
//profile_type
	clickon(gro.getProfile_type());
	down();
	enter();
//dropdown_Index(gro.getProfile_type(),1);
//shipper name
	sendkey(gro.getShi_name_text(), "Audit Test Customer");
//add load
//	clickon(gro.getSelect_button());
//	clickon(gro.getClick_load());
	urllanuch("http://13.232.97.105/my-loads/shippertabs=all/11211");
	clickon(gro.getAdd_name());
	sendkey(gro.getLoad_name(), "auto tesing");
	clickon(gro.getLoad_expiry());
	down();
    down();
    enter();
//    clickon(gro.getSelect_pickup());
//	sendkey(gro.getPickup_location(), "sivakasi");
//	down();
//	down();
//	enter();
//	clickon(gro.getUnknownpath1());
	sendkey(gro.getLoad_incharge(), "orphan");
	sendkey(gro.getMobile_number(), "9878978978");
	sendkey(gro.getAuto_complete(), "theni");
	down();
    down();
    enter();
//	dropdown_Index(gro.getAuto_complete(), 1);
	sendkey(gro.getTat_hours(), "52");
	clickon(gro.getBill_address_name());
	down();
    down();
    enter();
	clickon(gro.getPrice_type_ton());
	sendkey(gro.getShipper_price(), "30000");
	sendkey(gro.getSupplier_price(), "40000");
	sendkey(gro.getWeight(), "2");
	clickon(gro.getKg());
	clickon(gro.getMaterialtype());
	clickon(gro.getMaterial_secondary());
	down();
    down();
    enter();
	clickon(gro.getPackage_type());
	down();
    enter();
	sendkey(gro.getPackage_type(), "30");
	clickon(gro.getTruck_type());
	sendkey(gro.getEnter_truck_manual(), "closed truck type");
	clickon(gro.getSubmit_button());
	clickon(gro.getSubmit_OK());
	
	
	
}
}
