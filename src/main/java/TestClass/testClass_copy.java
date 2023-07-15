package TestClass;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.CommonPageObject;
import pageObject.DataField;

import java.time.Duration;
import java.util.List;

public class testClass_copy extends CommonPageObject {
    public WebDriver edriver;
    public WebDriverWait ewait;
    DataField dataField;

    public testClass_copy() throws Exception{
        super(CommonPageObject.edriver); //Connect to testcase you want, so u need this shit !
        edriver = CommonPageObject.edriver;
        ewait = CommonPageObject.ewait;
        dataField = new DataField("src/main/java/TestClass/testClass.xlsx"); //connect your excel file and allowed selenium system can read and get data form your excel file
    }
    @Test
    public void test() throws Exception{
//        waitUntilElementVisible(userName);
//        userName.sendKeys(dataField.getData(0, 0));
//        password.sendKeys(dataField.getData(0, 1));
//        waitUntilElementVisible(btnLogin);
//        btnLogin.click();
//        waitUntilElementVisible(header);
//        try{
//            Assert.assertEquals(dataField.getData(0, 2), header.getText());
//            System.out.println("match");
//        } catch (Exception e){
//            System.out.println("not match");
//        }
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
            Assert.assertEquals(dataField.getData(i,0),productQuantity.getText()); // đếm i từ file excel ####################################################
            btn.click();
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

}
