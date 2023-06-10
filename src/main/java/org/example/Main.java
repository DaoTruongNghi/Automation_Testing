package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
//            System.out.println("i = " + i);
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://react-shopping-cart-67954.firebaseapp.com/");
        Thread.sleep(10000);
        WebElement starLink = driver.findElement(By.xpath("// a[@class=\"github-button\"]"));
        System.out.println(starLink.getText());

        WebElement adsTop = driver.findElement(By.xpath("//div[@class=\"sc-joc36b-3 jCptDE\"]"));
        System.out.println(adsTop.getText());


        WebElement navAside = driver.findElement(By.xpath("// div[@class=\"sc-bj2vay-0 DCKcC\"]"));
        System.out.println(navAside.getText());
        navAside.click();

        WebElement sizeLinkXS = driver.findElement(By.xpath("//input[@value='XS']/../.."));
        System.out.println(sizeLinkXS.getText());
        sizeLinkXS.click();
        WebElement sizeLinkS = driver.findElement(By.xpath("//input[@value='S']/../.."));
        System.out.println(sizeLinkS.getText());
        sizeLinkS.click();
        WebElement sizeLinkM = driver.findElement(By.xpath("//input[@value='M']/../.."));
        System.out.println(sizeLinkM.getText());
        sizeLinkM.click();
        WebElement sizeLinkML = driver.findElement(By.xpath("//input[@value='ML']/../.."));
        System.out.println(sizeLinkML.getText());
        sizeLinkML.click();
        WebElement sizeLinkL = driver.findElement(By.xpath("//input[@value='L']/../.."));
        System.out.println(sizeLinkL.getText());
        sizeLinkL.click();
        WebElement sizeLinkXL = driver.findElement(By.xpath("//input[@value='XL']/../.."));
        System.out.println(sizeLinkXL.getText());
        sizeLinkXL.click();
        WebElement sizeLinkXXL = driver.findElement(By.xpath("//input[@value='XXL']/../.."));
        System.out.println(sizeLinkXS.getText());
        sizeLinkXXL.click();


        WebElement mainTitleProductFound = driver.findElement(By.xpath("//main[@class=\"sc-ebmerl-4 iliWeY\"]"));
        System.out.println(mainTitleProductFound.getText());

        WebElement btnCart = driver.findElement(By.xpath("//button[@class=\"sc-1h98xa9-0 gFkyvN\"]"));
        System.out.println(btnCart.getText());
        btnCart.click();
        }
    }