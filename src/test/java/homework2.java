import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class homework2 {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = getDriver();
        WebElement loginField, passwordField, submitLogin;
        driver.manage().window().fullscreen();
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");


        loginField = driver.findElement(By.id("email"));
        loginField.sendKeys("webinar.test@gmail.com");

        passwordField = driver.findElement(By.id("passwd"));
        passwordField.sendKeys("Xcg7299bnSmMuRLp9ITw");

        submitLogin = driver.findElement(By.name("submitLogin"));
        submitLogin.click();

        Thread.sleep(2000);

        WebElement profileAvator = driver.findElement(By.className("employee_avatar_small"));
        profileAvator.click();


        WebElement logoutMenu = driver.findElement(By.id("header_logout"));
        logoutMenu.click();

        System.out.println("Test one passed");
        //System.out.println("driver get title" + driver.getTitle());

        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");


        loginField = driver.findElement(By.id("email"));
        loginField.sendKeys("webinar.test@gmail.com");

        passwordField = driver.findElement(By.id("passwd"));
        passwordField.sendKeys("Xcg7299bnSmMuRLp9ITw");

        submitLogin = driver.findElement(By.name("submitLogin"));
        submitLogin.click();

        Thread.sleep(2000);

        WebElement dashbord = driver.findElement(By.id("tab-AdminDashboard"));
        dashbord.click();
        Thread.sleep(2000);
        System.out.println("driver get title " + driver.getTitle());
        driver.navigate().refresh();
        Thread.sleep(2000);
        if(driver.getTitle() == "Dashboard • prestashop-automation");
        System.out.println("try page 1");


        WebElement order = driver.findElement(By.id("subtab-AdminParentOrders"));
        order.click();
        Thread.sleep(2000);
        System.out.println("driver get title " + driver.getTitle());
        driver.navigate().refresh();
        Thread.sleep(2000);
        if(driver.getTitle() == "Заказы • prestashop-automation");
        System.out.println("try page 2");


        System.out.println("Test two passed");

        driver.quit();
    }

    public static WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//resources/chromedriver.exe");
        return new ChromeDriver();
    }
}

