package TestClass;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.CommonPageObject;
import pageObject.DataField;

import static org.bouncycastle.crypto.tls.ContentType.alert;

public class AddToCart extends CommonPageObject {
    public WebDriver edriver;
    public WebDriverWait ewait;
    DataField dataField;

    public AddToCart() throws Exception{
        super(CommonPageObject.edriver); //Connect to testcase you want, so u need this shit !
        edriver = CommonPageObject.edriver;
        ewait = CommonPageObject.ewait;
        dataField = new DataField("src/main/java/TestClass/testClass.xlsx"); //connect your excel file and allowed selenium system can read and get data form your excel file
    }

    @Test
    public void test() throws Exception{
        for (int i = 0; i < btnAdd_main_product.size(); i++) {
            WebElement btn = btnAdd_main_product.get(i);
            btn.click();// Click vào từng button lần lượt
            Thread.sleep(1000);
            Assert.assertEquals(dataField.getData(i,2),numberCart.getText());
            btn_close_cart.click();// Đóng cart
            Thread.sleep(1000);
        }
        System.out.println(getText_main_product.getText());
//        edriver.quit();
    }
}
