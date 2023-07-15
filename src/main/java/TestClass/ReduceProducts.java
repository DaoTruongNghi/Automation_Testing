package TestClass;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.CommonPageObject;
import pageObject.DataField;

public class ReduceProducts extends CommonPageObject {
    public WebDriver edriver;
    public WebDriverWait ewait;
    DataField dataField;

    public ReduceProducts() throws Exception {
        super(CommonPageObject.edriver);
        this.edriver = CommonPageObject.edriver;
        this.ewait = CommonPageObject.ewait;
        this.dataField = new DataField("src/main/java/TestClass/testClass.xlsx");
    }


    @Test
    public void test() throws Exception {
        for(int i = 0; i < 4; i++) {
            WebElement btn = btnAdd_main_product.get(i);
            btn.click();
            Thread.sleep(1000L);
            Assert.assertEquals(dataField.getData(i,2),numberCart.getText());
            btn_close_cart.click();// Đóng cart
            Thread.sleep(1000);
        }
        btn_open_cart.click();

        for (int i = 0; i < quantityInCart.size(); i++) {
            WebElement them = btn_more_cart.get(i);
            Thread.sleep(1000);
            them.click();// thêm sản phẩm lần lượt
        }

        for (int i = 0; i < quantityInCart.size(); i++) {
            WebElement tru = btn_reduce_cart.get(i);
            Thread.sleep(1000);
            tru.click();// thêm sản phẩm lần lượt
        }

        Assert.assertEquals(dataField.getData(0,6),numberCart.getText());
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
    }
}