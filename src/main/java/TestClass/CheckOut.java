package TestClass;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.CommonPageObject;
import pageObject.DataField;

public class CheckOut extends CommonPageObject {
    public WebDriver edriver;
    public WebDriverWait ewait;
    DataField dataField;

    public CheckOut() throws Exception {
        super(CommonPageObject.edriver); //Connect to testcase you want, so u need this shit !
        edriver = CommonPageObject.edriver;
        ewait = CommonPageObject.ewait;
        dataField = new DataField("src/main/java/TestClass/testClass.xlsx"); //connect your excel file and allowed selenium system can read and get data form your excel file
    }
    @Test
    public void test() throws Exception{
            btn_open_cart.click();
            Assert.assertEquals(dataField.getData(0,1),addSomeCart.getText());
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

        for (int i = 0; i < 4; i++) {
            WebElement btn = btnAdd_main_product.get(i);
            btn.click();// Click vào từng button lần lượt
            Thread.sleep(1000);
            Assert.assertEquals(dataField.getData(i,2),numberCart.getText());
            btn_close_cart.click();// Đóng cart
            Thread.sleep(1000);
        }
//        edriver.quit();
    }
}

