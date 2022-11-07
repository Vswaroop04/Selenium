import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class App {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\vishnu\\Desktop\\Selenium\\SeleniumTool\\src\\drivers\\msedgedriver.exe");

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Your Task");
        System.out.println("1. SignUp Our Website");
        System.out.println("2. SignIn to Our Website");
        System.out.println("3. Book a Plane Ticket");
        System.out.println("4. Do Credit Card Payment");
        int option = sc.nextInt();

        if(option == 1) {
            System.out.println("Enter Your Name");
            String name = sc.next();
            System.out.println("Enter Your Email Id");
            String emailId = sc.next();
            System.out.println("Enter Your Password");
            String password = sc.next();
            signUpPage(name, emailId, password);
        }

        else if(option == 2) {
          System.out.println("Enter Your Email Id");
            String emailId = sc.next();
            System.out.println("Enter Your Password");
            String password = sc.next();
            signInPage(emailId, password);
        }

        else if(option == 3) {
          bookFlightTicket();
        }

        else if(option == 4) {
          creditCardPayment();
        }
        
        // else if(option == 5) {
        //   creditcardPayment();
        // }

        else {
            System.out.println("Choose only from above options.");
        }
    }

    public static void bookFlightTicket() throws Exception{
      WebDriver driver = new EdgeDriver();

      driver.get("https://safe-thicket-17826.herokuapp.com/");
      driver.manage().window().setSize(new Dimension(1050, 700));
      driver.findElement(By.cssSelector(".log-in")).click();
      Thread.sleep(1000);
      driver.findElement(By.cssSelector(".signIn > input:nth-child(3)")).click();
      Thread.sleep(1000);
      driver.findElement(By.cssSelector(".signIn > input:nth-child(3)")).sendKeys("kaushikmoralwar9420@gmail.com");
      driver.findElement(By.cssSelector(".signIn")).click();
      Thread.sleep(1000);
      driver.findElement(By.cssSelector(".signIn > input:nth-child(4)")).click();
      driver.findElement(By.cssSelector(".signIn > input:nth-child(4)")).sendKeys("kaushik0703");
      Thread.sleep(1000);
      driver.findElement(By.cssSelector(".dx:nth-child(6)")).click();
      driver.findElement(By.cssSelector("a:nth-child(2) > .btn")).click();
  

        System.out.println(driver.getTitle());
        Thread.sleep(1000);
        driver.quit();
    }

    public static void signUpPage(String name, String emailId, String password) throws Exception {
        WebDriver driver = new EdgeDriver();

        driver.get("https://safe-thicket-17826.herokuapp.com/");
        driver.manage().window().setSize(new Dimension(1280, 720));
        driver.findElement(By.name("name1")).click();
        driver.findElement(By.name("name1")).sendKeys(name);
        Thread.sleep(1000);
        driver.findElement(By.name("email")).click();
        driver.findElement(By.name("email")).sendKeys(emailId);
        Thread.sleep(1000);
        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).sendKeys(password);
        Thread.sleep(1000);
        driver.findElement(By.name("submit")).click();

        System.out.println(driver.getTitle());
        Thread.sleep(1000);
        driver.quit();
      }

    public static void signInPage(String emailId, String password) throws Exception {
        WebDriver driver = new EdgeDriver();

        driver.get("https://safe-thicket-17826.herokuapp.com/");
        driver.manage().window().setSize(new Dimension(1280, 720));
        driver.findElement(By.cssSelector(".log-in")).click();
        driver.findElement(By.cssSelector(".signIn > input:nth-child(3)")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".signIn > input:nth-child(3)")).sendKeys(emailId);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".signIn")).click();
        driver.findElement(By.cssSelector(".signIn > input:nth-child(4)")).click();
        driver.findElement(By.cssSelector(".signIn > input:nth-child(4)")).sendKeys(password);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".dx:nth-child(6)")).click();
  
        System.out.println(driver.getTitle());
        Thread.sleep(1000);
        driver.quit();
      }
      
      public static void creditCardPayment() throws Exception {
        WebDriver driver = new EdgeDriver();

        driver.get("https://safe-thicket-17826.herokuapp.com/");
        driver.manage().window().setSize(new Dimension(1051, 701));
        driver.findElement(By.cssSelector(".log-in")).click();
        driver.findElement(By.cssSelector(".signIn > input:nth-child(3)")).click();
        driver.findElement(By.cssSelector(".signIn > input:nth-child(3)")).sendKeys("kaushikmoralwar9420@gmail.com");
        driver.findElement(By.cssSelector(".signIn")).click();
        driver.findElement(By.cssSelector(".signIn > input:nth-child(4)")).click();
        driver.findElement(By.cssSelector(".signIn > input:nth-child(4)")).sendKeys("kaushik0703");
        driver.findElement(By.cssSelector(".dx:nth-child(6)")).click();
        driver.findElement(By.cssSelector(".btn-outline-dark")).click();
        driver.findElement(By.id("column-left")).click();
        driver.findElement(By.id("column-left")).sendKeys("Aditya");
        driver.findElement(By.id("column-right")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("column-right")).sendKeys("A");
        driver.findElement(By.id("input-field")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("input-field")).sendKeys("2020 1100 3202 0110");
        driver.findElement(By.name("expiry")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("expiry")).sendKeys("01 / 09");
        driver.findElement(By.name("cvc")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("cvc")).sendKeys("420");
        driver.findElement(By.name("streetaddress")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("streetaddress")).sendKeys("allahabad");
        driver.findElement(By.name("city")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("city")).sendKeys("prayagraj");
        driver.findElement(By.name("zipcode")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("zipcode")).sendKeys("42020");
        driver.findElement(By.name("email")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("email")).sendKeys("flickergroundmaster@gmail.com");

        System.out.println(driver.getTitle());
        Thread.sleep(1000);
        driver.quit();
      }

      public static void loginandLogout() {
        // Test name: Login and Logout
        // Step # | name | target | value
        // 1 | open | / | 
        WebDriver driver = new EdgeDriver();

        driver.get("https://gaivi-grocery.herokuapp.com/");
        // 2 | setWindowSize | 1536x824 | 
        driver.manage().window().setSize(new Dimension(1536, 824));
        // 3 | click | name=email | 
        driver.findElement(By.name("email")).click();
    
        // 4 | type | name=email | vswaroop04@gmail.com
        driver.findElement(By.name("email")).sendKeys("vswaroop04@gmail.com");
        // 5 | click | name=password | 
        driver.findElement(By.name("password")).click();
        // 6 | type | name=password | vishnu
        driver.findElement(By.name("password")).sendKeys("vishnu");
        // 7 | click | css=.btn | 
        driver.findElement(By.cssSelector(".btn")).click();
        // 8 | click | linkText=Logout | 
        driver.findElement(By.linkText("Logout")).click();

        System.out.println(driver.getTitle());
        driver.quit();
      }
}
