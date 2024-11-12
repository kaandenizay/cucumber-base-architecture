//package tests;
//
//import driver.DriverManager;
//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.*;
//import org.testng.asserts.SoftAssert;
//
//public class BaseTest {
//
//     protected WebDriver driver;
//     private final ThreadLocal<SoftAssert> softAssertPool = new ThreadLocal<>();
//     protected SoftAssert softAssert;
//
//    @Parameters({"browser"})
//    @BeforeClass
//    public void setupBrowser(String browser){
//        DriverManager.setThreadDriver(browser);
//        driver = DriverManager.getThreadDriver();
//        System.out.println("Browser launched");
//    }
//
//
//    @AfterClass
//    public void tearDown(){
//        DriverManager.quitDriver();
//        System.out.println("Browser closed");
//    }
//
//    @AfterTest
//    public void terminateTest(){
//        DriverManager.removeThreadPool();
//        softAssertPool.remove();
//    }
//
//
//}
