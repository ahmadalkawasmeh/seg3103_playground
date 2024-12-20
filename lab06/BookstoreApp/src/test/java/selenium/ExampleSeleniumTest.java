package selenium;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;


import java.util.concurrent.TimeUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

class ExampleSeleniumTest {

  static Process server;
  private WebDriver driver;

  @BeforeAll
  public static void setUpBeforeClass() throws Exception {
    ProcessBuilder pb = new ProcessBuilder("java", "-jar", "bookstore5.jar");
    server = pb.start();
  }

  @BeforeEach
  void setUp() {
    // Pick your browser
    // driver = new FirefoxDriver();
    // driver = new SafariDriver();
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();

    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("http://localhost:8080/");
    // wait to make sure Selenium is done loading the page
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("title")));
  }

  @AfterEach
  public void tearDown() {
    driver.close();
  }

  @AfterAll
  public static void tearDownAfterClass() throws Exception {
    server.destroy();
  }

  @Test
  void test1() {
    WebElement element = driver.findElement(By.id("title"));
    String expected = "YAMAZONE BookStore";
    String actual = element.getText();
    assertEquals(expected, actual);
  }

  @Test
  public void test2() {
    WebElement welcome = driver.findElement(By.cssSelector("p"));
    String expected = "Welcome";
    String actual = welcome.getText();
    assertEquals(expected, getWords(actual)[0]);
    WebElement langSelector = driver.findElement(By.id("locales"));
    langSelector.click();
    WebElement frSelector = driver.findElement(By.cssSelector("option:nth-child(3)"));
    frSelector.click();
    welcome = driver.findElement(By.cssSelector("p"));
    expected = "Bienvenu";
    actual = welcome.getText();
    assertEquals(expected, getWords(actual)[0]);
  }

  @Test
  void testSearchFunctionality() {
    WebElement searchInput = driver.findElement(By.id("search"));
    searchInput.sendKeys("");

    WebElement searchButton = driver.findElement(By.id("searchBtn"));
    searchButton.click();

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1")));

    WebElement heading = driver.findElement(By.tagName("h1"));
    assertTrue(heading.getText().contains("items in category"));
  }

  @Test
  void testAddToCart() {
    // Navigate to books catalog
    testSearchFunctionality();

    // Adding the first book to cart
    WebElement addToCartButton = driver.findElement(By.id("order-hall001"));
    addToCartButton.click();

    // Click on the cart icon
    WebElement cartButton = driver.findElement(By.id("cartLink"));
    cartButton.click();

    // Verify cart contents
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("table")));

    WebElement bookTitle = driver.findElement(By.xpath("//tr[td[text()='hall001']]/td[2]"));
    assertEquals("Core Servlets and JavaServer Pages 2nd Edition (Volume 1)", bookTitle.getText());

    WebElement bookCost = driver.findElement(By.xpath("//tr[td[text()='hall001']]/td[3]"));
    assertEquals("$39.95", bookCost.getText());
  }

  @Test
  void testProceedToCheckout() {
    // Navigate to search results and add book to cart
    testAddToCart();

    // Proceed to checkout
    WebElement proceedToCheckoutButton = driver.findElement(By.xpath("//button[@type='submit' and @name='checkout']"));
    proceedToCheckoutButton.click();

    // Verify the current URL to ensure we are on the correct page
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.urlToBe("http://localhost:8080/checkout"));

    assertEquals("http://localhost:8080/checkout", driver.getCurrentUrl());
  }


  private String[] getWords(String s) {
    return s.split("\\s+");
  }
}
