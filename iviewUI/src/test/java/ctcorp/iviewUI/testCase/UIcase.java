package ctcorp.iviewUI.testCase;

import ctcorp.iviewUI.pageObject.BaseClass;
import ctcorp.iviewUI.pageObject.RegisterPage;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class UIcase extends BaseClass {
	
	@Test(priority = 0, description = "successful registration with all checkbox", groups = "UI")
	public void TC01() {
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		RegisterPage rp = new RegisterPage(driver);
		
		// enter the page
		driver.get(baseUrl);
		
		// fill all the form correctly
		String emailCreate = "vyond.qa+" + randomString() + "@gmail.com";
		rp.emailInput(emailCreate);
		rp.passInput("pwd123#@!");
		rp.wanitaRadio();
		rp.namaInput(emailCreate);
		rp.selectHari("01");
		rp.selectBulan("01");
		rp.selectTahun("1990");
		rp.submitButton();
		
		wait.until(ExpectedConditions.visibilityOf(rp.verifyEmail));
		rp.verify(emailCreate);
	}
	
	@Test(priority = 1, description = "Discount checkbox and stay login", groups = "UI")
	public void TC02() {
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		RegisterPage rp = new RegisterPage(driver);
		
		// enter the page
		driver.get(baseUrl);
		String emailCreate = "vyond.qa+" + randomString() + "@gmail.com";
		rp.emailInput(emailCreate);
		rp.passInput("pwd123#@!");
		rp.wanitaRadio();
		rp.namaInput(emailCreate);
		rp.selectHari("01");
		rp.selectBulan("01");
		rp.selectTahun("1990");
		rp.submitButton();
		
		wait.until(ExpectedConditions.visibilityOf(rp.verifyEmail));
		rp.verify(emailCreate);
	}
	
	@Test(priority = 2, description = "successful registration, no checkbox", groups = "UI")
	public void TC03() {
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		RegisterPage rp = new RegisterPage(driver);
		
		// enter the page
		driver.get(baseUrl);
		String emailCreate = "vyond.qa+" + randomString() + "@gmail.com";
		rp.emailInput(emailCreate);
		rp.passInput("pwd123#@!");
		rp.wanitaRadio();
		rp.namaInput(emailCreate);
		rp.selectHari("01");
		rp.selectBulan("01");
		rp.selectTahun("1990");
		rp.loggedIn();
		rp.diskon();
		rp.submitButton();	
		
		wait.until(ExpectedConditions.visibilityOf(rp.verifyEmail));
		rp.verify(emailCreate);
	}
	
	@Test(priority = 3, description = "successful registration as male", groups = "UI")
	public void TC04() {
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		RegisterPage rp = new RegisterPage(driver);
		
		// enter the page
		driver.get(baseUrl);
		String emailCreate = "vyond.qa+" + randomString() + "@gmail.com";
		rp.emailInput(emailCreate);
		rp.passInput("pwd123#@!");
		rp.wanitaRadio();
		rp.namaInput(emailCreate);
		rp.selectHari("01");
		rp.selectBulan("01");
		rp.selectTahun("1990");
		rp.submitButton();
		
		wait.until(ExpectedConditions.visibilityOf(rp.verifyEmail));
		rp.verify(emailCreate);
	}
	
	@Test(priority = 4, description = "successful registration without first name", groups = "UI")
	public void TC05() {
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		RegisterPage rp = new RegisterPage(driver);
		
		// enter the page
		driver.get(baseUrl);
		String emailCreate = "vyond.qa+" + randomString() + "@gmail.com";
		rp.emailInput(emailCreate);
		rp.passInput("pwd123#@!");
		rp.wanitaRadio();
		rp.selectHari("01");
		rp.selectBulan("01");
		rp.selectTahun("1990");
		rp.loggedIn();
		rp.submitButton();
		
		wait.until(ExpectedConditions.visibilityOf(rp.verifyEmail));
		rp.verify(emailCreate);
	}
	
	@Test(priority = 5, description = "Fail with no email", groups = "UI")
	public void TC06() {
		
//		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		RegisterPage rp = new RegisterPage(driver);
		
		// enter the page
		driver.get(baseUrl);
		String emailCreate = "vyond.qa+" + randomString() + "@gmail.com";
//		rp.emailInput(emailCreate);
		rp.passInput("pwd123#@!");
		rp.wanitaRadio();
		rp.namaInput(emailCreate);
		rp.selectHari("01");
		rp.selectBulan("01");
		rp.selectTahun("1990");
		rp.loggedIn();
		rp.submitButton();
		
		rp.emailAlert();
	}
	
	@Test(priority = 6, description = "Fail with invalid email", groups = "UI")
	public void TC07() {
		
//		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		RegisterPage rp = new RegisterPage(driver);
		
		// enter the page
		driver.get(baseUrl);
		rp.emailInput("invalidemail");
		rp.passInput("pwd123#@!");
		rp.wanitaRadio();
//		rp.namaInput(emailCreate);
		rp.selectHari("01");
		rp.selectBulan("01");
		rp.selectTahun("1990");
		rp.loggedIn();
		rp.submitButton();
		
		rp.emailAlert();
	}
	
	@Test(priority = 7, description = "Fail with no password", groups = "UI")
	public void TC08() {
		
//		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		RegisterPage rp = new RegisterPage(driver);
		
		// enter the page
		driver.get(baseUrl);
		String emailCreate = "vyond.qa+" + randomString() + "@gmail.com";
		rp.emailInput(emailCreate);
//		rp.passInput("pwd123#@!");
		rp.wanitaRadio();
		rp.namaInput(emailCreate);
		rp.selectHari("01");
		rp.selectBulan("01");
		rp.selectTahun("1990");
		rp.loggedIn();
		rp.submitButton();
		
		rp.passwordAlert();
	}
	
	@Test(priority = 8, description = "Fail with password < 6 chars", groups = "UI")
	public void TC09() {
		
//		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		RegisterPage rp = new RegisterPage(driver);
		
		// enter the page
		driver.get(baseUrl);
		String emailCreate = "vyond.qa+" + randomString() + "@gmail.com";
		rp.emailInput(emailCreate);
		rp.passInput("123");
		rp.wanitaRadio();
		rp.namaInput(emailCreate);
		rp.selectHari("01");
		rp.selectBulan("01");
		rp.selectTahun("1990");
		rp.loggedIn();
		rp.submitButton();
		
		rp.passwordAlert();
	}
	
	@Test(priority = 9, description = "Fail no gender selected", groups = "UI")
	public void TC10() {
		
		RegisterPage rp = new RegisterPage(driver);
		
		// enter the page
		driver.get(baseUrl);
		String emailCreate = "vyond.qa+" + randomString() + "@gmail.com";
		rp.emailInput(emailCreate);
		rp.passInput("pwd123#@!");
//		rp.wanitaRadio();
		rp.namaInput(emailCreate);
		rp.selectHari("01");
		rp.selectBulan("01");
		rp.selectTahun("1990");
		rp.loggedIn();
		rp.submitButton();
		
		rp.genderAlert();
	}
	
	@Test(priority = 10, description = "Fail empty hari", groups = "UI")
	public void TC11() {
		
		RegisterPage rp = new RegisterPage(driver);
		
		// enter the page
		driver.get(baseUrl);
		String emailCreate = "vyond.qa+" + randomString() + "@gmail.com";
		rp.emailInput(emailCreate);
		rp.passInput("pwd123#@!");
		rp.wanitaRadio();
		rp.namaInput(emailCreate);
//		rp.selectHari("01");
		rp.selectBulan("01");
		rp.selectTahun("1990");
		rp.loggedIn();
		rp.submitButton();
		
		rp.hariAlert();
	}
	
	@Test(priority = 11, description = "Fail empty bulan", groups = "UI")
	public void TC12() {
		
		RegisterPage rp = new RegisterPage(driver);
		
		// enter the page
		driver.get(baseUrl);
		String emailCreate = "vyond.qa+" + randomString() + "@gmail.com";
		rp.emailInput(emailCreate);
		rp.passInput("pwd123#@!");
		rp.wanitaRadio();
		rp.namaInput(emailCreate);
		rp.selectHari("01");
//		rp.selectBulan("01");
		rp.selectTahun("1990");
		rp.loggedIn();
		rp.submitButton();
		
		rp.bulanAlert();
	}
	
	@Test(priority = 12, description = "Fail empty tahun", groups = "UI")
	public void TC13() {
		
		RegisterPage rp = new RegisterPage(driver);
		
		// enter the page
		driver.get(baseUrl);
		String emailCreate = "vyond.qa+" + randomString() + "@gmail.com";
		rp.emailInput(emailCreate);
		rp.passInput("pwd123#@!");
		rp.wanitaRadio();
		rp.namaInput(emailCreate);
		rp.selectHari("01");
		rp.selectBulan("01");
//		rp.selectTahun("1990");
		rp.loggedIn();
		rp.submitButton();
		
		rp.tahunAlert();
	}
	
	@Test(priority = 13, description = "Fail incorrect date", groups = "UI")
	public void TC14() {
		
		RegisterPage rp = new RegisterPage(driver);
		
		// enter the page
		driver.get(baseUrl);
		String emailCreate = "vyond.qa+" + randomString() + "@gmail.com";
		rp.emailInput(emailCreate);
		rp.passInput("pwd123#@!");
		rp.wanitaRadio();
		rp.namaInput(emailCreate);
		rp.selectHari("31");
		rp.selectBulan("06");
		rp.selectTahun("1990");
		rp.submitButton();
		
		rp.dobAlert();
	}
	
	@Test(priority = 14, description = "Fail existing email", groups = "UI")
	public void TC15() {
		RegisterPage rp = new RegisterPage(driver);
		
		// enter the page
		driver.get(baseUrl);
		rp.emailInput("ikhszy+zalora1@gmail.com");
		rp.passInput("pwd123#@!");
		rp.wanitaRadio();
		rp.selectHari("30");
		rp.selectBulan("06");
		rp.selectTahun("1990");
		rp.submitButton();
		
		rp.emailExistAlert();
	}
}
