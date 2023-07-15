package TestClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class testClass {
    public WebDriver edriver;
    public WebDriverWait ewait;

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


    public testClass() {
        edriver = new ChromeDriver();
        PageFactory.initElements(edriver,this);
        ewait = new WebDriverWait(edriver, Duration.ofSeconds(5));
    }
    @Before
    public void setUp(){
        edriver.manage().window().maximize();
        edriver.get("https://react-shopping-cart-67954.firebaseapp.com/");
    }
    @Test
    public void test() throws Exception{

        btn_open_cart.click();
        btnCheckout_cart.click();
        Alert alert = edriver.switchTo().alert();
        // Lấy nội dung của cửa sổ cảnh báo
        String alertText = alert.getText();
        // In ra nội dung cảnh báo
        System.out.println("Alert text: " + alertText);
        // Đóng cửa sổ cảnh báo
        Thread.sleep(1000);
        alert.accept();
        System.out.println(getText_cart_products.getText());
        btn_close_cart.click();
        Thread.sleep(1000);

        System.out.println(text_Topads.getText());
        System.out.println(text.getText());
        //getText & Click Size
        Thread.sleep(1000);
        for (int i = 0; i < click_size.size(); i++) {
            WebElement btn = click_size.get(i);
            btn.click();// Click vào từng button lần lượt
            Thread.sleep(1000);
            btn.click();// Đóng cart
            Thread.sleep(1000);
        }
        System.out.println(getText_size.getText());

        for (int i = 0; i < btnAdd_main_product.size(); i++) {
            WebElement btn = btnAdd_main_product.get(i);
            btn.click();// Click vào từng button lần lượt
            Thread.sleep(1000);
            btn_close_cart.click();// Đóng cart
            Thread.sleep(1000);
        }
        System.out.println(getText_main_product.getText());
        btn_open_cart.click();
        btnCheckout_cart.click();
        Alert alert_products = edriver.switchTo().alert();
        // Lấy nội dung của cửa sổ cảnh báo
        String alertText_Products = alert.getText();
        // In ra nội dung cảnh báo
        System.out.println("Alert text: " + alertText);
        // Đóng cửa sổ cảnh báo
        Thread.sleep(1000);
        alert.accept();
        System.out.println(getText_cart_products.getText());
        btn_close_cart.click();
        Thread.sleep(1000);
        btn_open_cart.click();

        for (int i = 0; i < btn_more_cart.size(); i++) {
            WebElement them = btn_more_cart.get(i);
            WebElement tru = btn_reduce_cart.get(i);
            WebElement xoa = btn_remove_cart.get(i);
            Thread.sleep(1000);
            them.click();// thêm sản phẩm lần lượt
            Thread.sleep(1000);
            tru.click();// Trừ sản phẩm
            Thread.sleep(1000);
            xoa.click();// Xóa sản phẩm
            i--;
        }
        btn_close_cart.click();
        edriver.quit();
//        int i = 0;
//        while(i < btn_more_cart.size()){
//            WebElement them = btn_more_cart.get(i);
//            WebElement tru = btn_reduce_cart.get(i);
//            WebElement xoa = btn_remove_cart.get(i);
//
//            Thread.sleep(1000);
//            them.click();// thêm sản phẩm lần lượt
//            Thread.sleep(1000);
//            tru.click();// Trừ sản phẩm
//            Thread.sleep(1000);
//            xoa.click();// Xóa sản phẩm
//            if (!isElementDisplayed(xoa)){
//                break;
//            }
//            i++;
//        }
    }

    private boolean isElementDisplayed(WebElement xoa) {
        return false;
    }


    @After
    public void tearDown() throws InterruptedException {
    }
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
