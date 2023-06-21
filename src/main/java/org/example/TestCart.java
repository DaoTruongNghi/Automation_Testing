package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type show whitespaces,
// then press Enter. You can now see whitespace characters in your code.
public class CART {
    public static void main(String[] args) throws InterruptedException {
        // Cấu hình WebDriver

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://react-shopping-cart-67954.firebaseapp.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(5));


// Tìm tất cả các sản phẩm trong danh sách
        Thread.sleep(500);
        List<WebElement> products = driver.findElements(By.xpath("//*[@class=\"sc-uhudcz-0 iZZGui\"]/div[*]/button"));
        WebElement btnclose = driver.findElement(By.xpath("//button[@class=\"sc-1h98xa9-0 gFkyvN\"]"));
        System.out.println(products.size());
        for (int i = 0; i < products.size(); i++) {
            WebElement btn = products.get(i);
            btn.click();// Click vào từng button lần lượt
            Thread.sleep(100);
            btnclose.click();// Đóng cart
            Thread.sleep(100);
            System.out.println("Added to cart");


        }

        driver.findElement(By.xpath("//button[@class=\"sc-1h98xa9-0 gFkyvN\"]")).click();
        Thread.sleep(500);
        List<WebElement> plus = driver.findElements(By.xpath("//div[@class=\"sc-7th5t8-0 jehOnP\"]/div/div/div/button[2]"));
        System.out.println(plus.size());
        List<WebElement> minus = driver.findElements(By.xpath("//div[@class=\"sc-7th5t8-0 jehOnP\"]/div/div/div/button[1]"));
        System.out.println(minus.size());
        List<WebElement> delete = driver.findElements(By.xpath("//div[@class=\"sc-11uohgb-0 hDmOrM\"]/button"));
        System.out.println(delete.size());
        Thread.sleep(10000);
        for (int i = 0; i < plus.size(); i++) {
            WebElement them = plus.get(i);
            WebElement tru = minus.get(i);
            WebElement xoa = delete.get(i);
            Thread.sleep(1000);
            them.click();// thêm sản phẩm lần lượt
            Thread.sleep(1000);
            tru.click();// Trừ sản phẩm
            Thread.sleep(1000);
            xoa.click();// Xóa sản phẩm

            System.out.println("OK");
        }





    }
}
