import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class SelectorsCss {
   WebDriver driver = new ChromeDriver();

    @Test
    public void phoneBookTest(){
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://telranedu.web.app/home");
        WebElement btnAbout = driver.findElement(By.cssSelector("a[href='/about']"));
        btnAbout.click();
        pause(2);
        System.out.println(btnAbout.getText());
        WebElement btnLogin = driver.findElement(By.cssSelector("div[id='root'] a:last-child"));
        btnLogin.click();
        WebElement inputEmail = driver.findElement(By.cssSelector("input[name='email']"));
        inputEmail.sendKeys("a@mail.ru");
        WebElement inputPassword = driver.findElement(By.cssSelector("*[placeholder='Password']"));
        inputPassword.sendKeys("Password123!");
        WebElement btnLoginForm = driver.findElement(By.cssSelector("form>button[name='login']"));
        btnLoginForm.click();
        pause(5);
        driver.quit();
    }

    @Test
    public void iLcarroTest() {
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://ilcarro.web.app/search");
        WebElement btnSearch = driver.findElement(By.cssSelector("a[href='/search']"));
        btnSearch.click();
        WebElement btnLetCarWork = driver.findElement(By.cssSelector("a[href='/let-car-work']"));
        btnLetCarWork.click();
        pause(3);
        WebElement btnTermsOfUse = driver.findElement(By.cssSelector("a[href='/terms-of-use']"));
        btnTermsOfUse.click();
        pause(3);
        WebElement btnSU = driver.findElement(By.cssSelector("a.navigation-link[href^='/registration']"));
        btnSU.click();
        pause(2);
        WebElement inputName = driver.findElement(By.cssSelector("input[formcontrolname='firstName']"));
        inputName.sendKeys("Tony");
        WebElement inputLN = driver.findElement(By.cssSelector("input[autocomplete='family-name']"));
        inputLN.sendKeys("Black");
        WebElement inputEmail = driver.findElement(By.cssSelector("input[autocomplete='email']"));
        inputEmail.sendKeys("tony1256@gmail.com");
        WebElement inputPas = driver.findElement(By.cssSelector("input[autocomplete='new-password']"));
        inputPas.sendKeys("Password12345!");
        WebElement btnLabel = driver.findElement(By.cssSelector("label[class='checkbox-label terms-label']"));
        btnLabel.click();
        WebElement btnYalla = driver.findElement(By.cssSelector("button[type='submit']"));
        btnYalla.click();
        pause(5);
        WebElement btnPositive = driver.findElement(By.cssSelector("button.positive-button"));
        btnPositive.click();
        WebElement btnLogout = driver.findElement(By.cssSelector("a[ng-reflect-router-link='logout']"));
        btnLogout.click();
        pause(5);
        WebElement btnSearch1 = driver.findElement(By.cssSelector("a[href='/search']"));
        btnSearch1.click();
        WebElement btnLogin = driver.findElement(By.cssSelector("a.navigation-link[href^='/login'"));
        btnLogin.click();
        WebElement inputIdEmail = driver.findElement(By.cssSelector("input[formcontrolname='email']"));
        inputIdEmail.sendKeys("tony1234@gmail.com");
        WebElement inputIdPassword = driver.findElement(By.cssSelector("input[formcontrolname='password']"));
        inputIdPassword.sendKeys("Password12345!");
        WebElement btnYallaLogin = driver.findElement(By.cssSelector("button[type='submit']"));
        btnYallaLogin.click();
        driver.quit();
    }

    static void pause(int time){
        try {
            Thread.sleep(time * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
