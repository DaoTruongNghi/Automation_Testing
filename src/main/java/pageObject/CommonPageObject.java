package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class CommonPageObject {
    public static WebDriver edriver;
    public static WebDriverWait ewait;

    public CommonPageObject(WebDriver driver) throws Exception{
        edriver = new ChromeDriver();
        PageFactory.initElements(edriver, this);
        ewait = new WebDriverWait(edriver, Duration.ofSeconds(5));
        edriver.get("https://react-shopping-cart-67954.firebaseapp.com/");
        edriver.manage().window().maximize();
    }
    @FindBy(how = How.XPATH, using = "//div[@class='star-button-container']") //Star
    public WebElement text;
    @FindBy(how = How.XPATH, using = "//div[@class=\"sc-joc36b-3 jCptDE\"]") //getText
    public WebElement text_Topads;

    @FindBy(how = How.XPATH,using = "//div[@class=\"sc-bj2vay-0 DCKcC\"]/div[*]/label") //Click_Size
    public List<WebElement> click_size;
    @FindBy(how = How.XPATH,using = "//div[@class=\"sc-bj2vay-0 DCKcC\"]") //getText_Size
    public WebElement getText_size;


    @FindBy(how = How.XPATH,using = "//main[@class=\"sc-ebmerl-3 hewZDo\"]") //getText_Main_Product
    public WebElement getText_main_product;
    @FindBy(how = How.XPATH,using = "//main[@class=\"sc-ebmerl-3 hewZDo\"]/div[*]/div/button") //btnAdd_Main_Product
    public List<WebElement> btnAdd_main_product;
    @FindBy(how = How.XPATH,using = "//div[@class=\"sc-1h98xa9-1 kQlqIC\"]/button") //btn_close_cart
    public WebElement btn_close_cart;
    @FindBy(how = How.XPATH,using = "//button[@class=\"sc-1h98xa9-0 gFkyvN\"]") //btn_open_cart
    public WebElement btn_open_cart;
    @FindBy(how = How.XPATH, using="//div[@class=\"sc-1h98xa9-12 fqwdnu\"]/button") //btn_checkout
    public WebElement btnCheckout_cart;
    @FindBy(how = How.XPATH, using="//div[@class=\"sc-1h98xa9-4 hzlwTK\"]") //getText_cart_products
    public WebElement getText_cart_products;


    @FindBy(how = How.XPATH,using = "//div[@class=\"sc-7th5t8-0 jehOnP\"]/div/div/div/button[1]") //btn_reduce_cart
    public List<WebElement> btn_reduce_cart;
    @FindBy(how = How.XPATH,using = "//div[@class=\"sc-7th5t8-0 jehOnP\"]/div/div/div/button[2]") //btn_more_cart
    public List<WebElement> btn_more_cart;
    @FindBy(how = How.XPATH,using = "//div[@class=\"sc-11uohgb-0 hDmOrM\"]/button") //btn_remove_cart
    public List<WebElement> btn_remove_cart;
    @FindBy(how = How.XPATH,using = "//*[@id=\"root\"]/div/main/main/main/p") //Testcase 1
    public WebElement productQuantity;
    @FindBy(how = How.XPATH,using = "//div[@class=\"sc-1h98xa9-1 kQlqIC\"]/div/div[3]/div/p[2]/span")
    public WebElement numberCart;

    @FindBy(how = How.XPATH,using = "//p[@class=\"sc-7th5t8-1 hqDkK\"]")
    public WebElement addSomeCart;
    @FindBy(how = How.XPATH,using = "//div[@class=\"sc-7th5t8-0 jehOnP\"]/div/div/p[2]")
    public List<WebElement> quantityInCart;
    @FindBy(how = How.XPATH,using = "//p[@class=\"sc-1h98xa9-9 jzywDV\"]")
    public WebElement cartPrice;
    public void waitUntilElementVisible(WebElement element){
        int tryTimes = 0;
        while (tryTimes < 2){
            try {
                ewait.until(ExpectedConditions.visibilityOf(element));
                break;
            }
            catch (StaleElementReferenceException se){
                tryTimes ++;
                if (tryTimes == 2)
                    throw se;
            }
        }
    }

    public void waitUntilElementVisible(String path) throws Exception{
        int tryTimes = 0;
        while (tryTimes < 2){
            try {
                WebElement element = edriver.findElement(By.xpath(path));
                ewait.until(ExpectedConditions.visibilityOf(element));
                break;
            }
            catch (StaleElementReferenceException se){
                tryTimes ++;
                if (tryTimes == 2)
                    throw se;
            }
        }
    }
}
