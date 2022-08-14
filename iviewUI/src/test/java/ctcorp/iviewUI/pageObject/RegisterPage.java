package ctcorp.iviewUI.pageObject;

import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

	WebDriver xdriver;
	
	public RegisterPage(WebDriver sdriver){
		
		xdriver = sdriver;
		PageFactory.initElements(sdriver, this);
	}
	
	@FindBy(id="RegistrationForm_email")
	public WebElement emailText;
	
	@FindBy(id="RegistrationForm_password")
	public WebElement passText;
	
	@FindBy(id="RegistrationForm_gender_0")
	public WebElement rdWanita;
	
	@FindBy(id="RegistrationForm_gender_1")
	public WebElement rdPria;
	
	@FindBy(id="RegistrationForm_first_name")
	public WebElement namaText;
	
	@FindBy(id="RegistrationForm_day")
	public WebElement hariSelect;
	
	@FindBy(id="RegistrationForm_month")
	public WebElement bulanSelect;
	
	@FindBy(id="RegistrationForm_year")
	public WebElement tahunSelect;
	
	@FindBy(id="stayLogged")
	public WebElement chkLogin;
	
	@FindBy(id="RegistrationForm_is_newsletter_subscribed")
	public WebElement chkDiskon;
	
	@FindBy(id="send")
	public WebElement lanjutBtn;
	
	@FindBy(id="email-otp-user-email")
	public WebElement verifyEmail;
	
	@FindBy(css = "#form-account-create > div.b-register__form.ptl.pbxl > div.inputfield > div.error__client.error__client--email")
	public WebElement alertEmail;
	
	@FindBy(css = "#js-password-input > div")
	public WebElement alertPassword;
	
	@FindBy(css = "#form-account-create > div.b-register__form.ptl.pbxl > div:nth-child(5) > div.error__client.error__client--gender")
	public WebElement alertGender;
	
	@FindBy(css = "#form-account-create > div.b-register__form.ptl.pbxl > div:nth-child(7) > div.container > div > div.form-group.lfloat.register__day.register__select > div")
	public WebElement alertHari;
	
	@FindBy(css = "#form-account-create > div.b-register__form.ptl.pbxl > div:nth-child(7) > div.container > div > div.form-group.lfloat.register__month.register__select > div")
	public WebElement alertBulan;
	
	@FindBy(css = "#form-account-create > div.b-register__form.ptl.pbxl > div:nth-child(7) > div.container > div > div.form-group.lfloat.register__year.register__select > div")
	public WebElement alertTahun;
	
	@FindBy(css = "#form-account-create > div.b-register__form.ptl.pbxl > div:nth-child(7) > div.error__client.error__client--birthday")
	public WebElement alertDOB;
	
	@FindBy(css = "#form-account-create > div.b-register__form.ptl.pbxl > div.mts.box.s-error.mrm")
	public WebElement alertExistEmail;
	
	public void emailInput(String emails) {
		emailText.sendKeys(emails);
	}
	
	public void passInput(String pass) {
		passText.sendKeys(pass);
	}
	
	public void wanitaRadio() {
		rdWanita.click();
	}
	
	public void priaRadio() {
		rdPria.click();
	}
	
	public void namaInput(String nama) {
		namaText.sendKeys(nama);
	}
	
	public void selectHari(String hari) {
		Select drpHari = new Select(hariSelect);
		drpHari.selectByValue(hari);
	}
	
	public void selectBulan(String bulan) {
		Select drpBulan = new Select(bulanSelect);
		drpBulan.selectByValue(bulan);
	}
	
	public void selectTahun(String tahun) {
		Select drpTahun = new Select(tahunSelect);
		drpTahun.selectByValue(tahun);
	}
	
	public void loggedIn() {
		chkLogin.click();
	}
	
	public void diskon() {
		chkDiskon.click();
	}
	
	public void submitButton() {
		lanjutBtn.click();
	}
	
	public void verify(String emailVerify) {
		String checker = verifyEmail.getText();
		if(checker.equals(emailVerify)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
			System.out.println("wrong email shown:" + emailVerify);
		}
	}
	
	public void emailAlert() {
		String emailText = alertEmail.getText();
		if(alertEmail.isDisplayed() && emailText.contains("Masukkan alamat email yang valid")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
			System.out.println("Please check the error message");
		}
	}
	
	public void passwordAlert() {
		String passText = alertPassword.getText();
		if(alertPassword.isDisplayed() && passText.contains("Kata sandi Anda harus setidaknya 6 karakter.")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
			System.out.println("Please check the error message");
		}
	}
	
	public void genderAlert() {
		String gendText = alertGender.getText();
		if(alertGender.isDisplayed() && gendText.contains("Pilih jenis kelamin")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
			System.out.println("Please check the error message");
		}
	}
	
	public void hariAlert() {
		String hariText = alertHari.getText();
		if(alertHari.isDisplayed() && hariText.contains("Pilih hari")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
			System.out.println("Please check the error message");
		}
	}
	
	public void bulanAlert() {
		String bulanText = alertBulan.getText();
		if(alertBulan.isDisplayed() && bulanText.contains("Pilih bulan")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
			System.out.println("Please check the error message");
		}
	}
	
	public void tahunAlert() {
		String tahunText = alertTahun.getText();
		if(alertTahun.isDisplayed() && tahunText.contains("Pilih tahun")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
			System.out.println("Please check the error message");
		}
	}
	
	public void dobAlert() {
		String dobText = alertDOB.getText();
		if(alertDOB.isDisplayed() && dobText.contains("Pastikan tanggal lahir Anda sudah benar dan coba lagi")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
			System.out.println("Please check the error message");
		}
	}
	
	public void emailExistAlert() {
		String emailExistText = alertExistEmail.getText();
		if(alertExistEmail.isDisplayed() && emailExistText.contains("Sepertinya Anda sudah memiliki akun.")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
			System.out.println("Please check the error message");
		}
	}
}










