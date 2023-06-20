package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

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
        driver.manage().window().maximize();
        driver.get("https://react-shopping-cart-67954.firebaseapp.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

//        General Element
        WebElement btn_close = driver.findElement(By.xpath("//button[@class=\"sc-1h98xa9-0 gFkyvN\"]"));

//      [Star]

        WebElement starLink = driver.findElement(By.xpath("// a[@class=\"github-button\"]"));
        System.out.println(starLink.getText());
        System.out.println(" ");

        
//      [ADS Top]

        WebElement adsTop = driver.findElement(By.xpath("//div[@class=\"sc-joc36b-3 jCptDE\"]"));
        System.out.println(adsTop.getText());
        System.out.println(" ");



//      [Button Cart Before Add Products]

        WebElement btnCart = driver.findElement(By.xpath("//button[@class=\"sc-1h98xa9-0 gFkyvN\"]"));
        System.out.println(btnCart.getText());
        wait.until(ExpectedConditions.visibilityOf(btnCart));
        wait.until(ExpectedConditions.elementToBeClickable(btnCart));
        btnCart.click();

        WebElement getText_Div1 = driver.findElement(By.xpath("//div[@class=\"sc-1h98xa9-5 grXYZl\"]/span"));
        WebElement getText_Div2 = driver.findElement(By.xpath("//div[@class=\"sc-7th5t8-0 jehOnP\"]/p"));
        WebElement getText_Div3 = driver.findElement(By.xpath("//div[@class=\"sc-1h98xa9-12 fqwdnu\"]"));
        System.out.println(getText_Div1.getText());
        System.out.println(" ");
        System.out.println(getText_Div2.getText());
        System.out.println(" ");
        System.out.println(getText_Div3.getText());
        System.out.println(" ");

        WebElement btnCheckOut = driver.findElement(By.xpath("//div[@class=\"sc-1h98xa9-12 fqwdnu\"]/button"));
        btnCheckOut.click();


        //Fix bug UnhandledAlertException

        // Xác định đối tượng Alert
        Alert alert = driver.switchTo().alert();
        // Lấy nội dung của cửa sổ cảnh báo
        String alertText = alert.getText();
        // In ra nội dung cảnh báo
        System.out.println("Alert text: " + alertText);
        // Đóng cửa sổ cảnh báo
        alert.accept();
        System.out.println(" ");


        btnCart.click();


//      [Man Title Products]

        WebElement mainTitleProductFound = driver.findElement(By.xpath("//main[@class=\"sc-ebmerl-4 iliWeY\"]"));
        System.out.println(mainTitleProductFound.getText());
        System.out.println(" ");



//      [ATC Click & Text]

        System.out.println("PRODUCT 1");
        WebElement P1_getText = driver.findElement(By.xpath("//div[@class=\"sc-124al1g-2 dwOYCh\"]"));
        WebElement P1_click = driver.findElement(By.xpath("//div[@class=\"sc-124al1g-2 dwOYCh\"]/child::button"));
//        WebElement P1_click_more = driver.findElement(By.xpath("//p[text()='Cropped Stay Groovy off white']/../..//button[@class='sc-11uohgb-6 cgtUCJ'][1]"));
//        WebElement P1_click_reduce = driver.findElement(By.xpath("//p[text()='Cropped Stay Groovy off white']/../..//button[@class='sc-11uohgb-6 cgtUCJ'][2]"));
//        WebElement P1_click_remove = driver.findElement(By.xpath("//p[text()='Cropped Stay Groovy off white']/../../button"));
        System.out.println(P1_getText.getText());
        System.out.println(" ");
        P1_click.click();
        Thread.sleep(1000);
        btn_close.click();

        System.out.println("PRODUCT 2");
        WebElement P2_getText = driver.findElement(By.xpath("//div[@class=\"sc-124al1g-2 bCLaRj\"]"));
        WebElement P2_click = driver.findElement(By.xpath("//div[@class=\"sc-124al1g-2 bCLaRj\"]/child::button"));
        System.out.println(P2_getText.getText());
        System.out.println(" ");
        P2_click.click();
        Thread.sleep(1000);
        btn_close.click();


        System.out.println("PRODUCT 3");
        WebElement P3_getText = driver.findElement(By.xpath("//div[@class=\"sc-124al1g-2 ddJZtb\"]"));
        WebElement P3_click = driver.findElement(By.xpath("//div[@class=\"sc-124al1g-2 ddJZtb\"]/child::button"));
        System.out.println(P3_getText.getText());
        System.out.println(" ");
        P3_click.click();
        Thread.sleep(1000);
        btn_close.click();


        System.out.println("PRODUCT 4");
        WebElement P4_getText = driver.findElement(By.xpath("//div[@class=\"sc-124al1g-2 keuquD\"]"));
        WebElement P4_click = driver.findElement(By.xpath("//div[@class=\"sc-124al1g-2 keuquD\"]/child::button"));
        System.out.println(P4_getText.getText());
        System.out.println(" ");
        P4_click.click();
        Thread.sleep(1000);
        btn_close.click();


        System.out.println("PRODUCT 5");
        WebElement P5_getText = driver.findElement(By.xpath("// div[@class=\"sc-124al1g-2 kaJsVi\"]"));
        WebElement P5_click = driver.findElement(By.xpath("//div[@class=\"sc-124al1g-2 kaJsVi\"]/child::button"));
        System.out.println(P5_getText.getText());
        System.out.println(" ");
        P5_click.click();
        Thread.sleep(1000);
        btn_close.click();


        System.out.println("PRODUCT 6");
        WebElement P6_getText = driver.findElement(By.xpath("// div[@class=\"sc-124al1g-2 bMffkU\"]"));
        WebElement P6_click = driver.findElement(By.xpath("// div[@class=\"sc-124al1g-2 bMffkU\"]/child::button"));
        System.out.println(P6_getText.getText());
        System.out.println(" ");
        P6_click.click();
        Thread.sleep(1000);
        btn_close.click();


        System.out.println("PRODUCT 7");
        WebElement P7_getText = driver.findElement(By.xpath("// div[@class=\"sc-124al1g-2 ekOVCH\"]"));
        WebElement P7_click = driver.findElement(By.xpath("// div[@class=\"sc-124al1g-2 ekOVCH\"]/child::button"));
        System.out.println(P7_getText.getText());
        System.out.println(" ");
        P7_click.click();
        Thread.sleep(1000);
        btn_close.click();


        System.out.println("PRODUCT 8");
        WebElement P8_getText = driver.findElement(By.xpath("// div[@class=\"sc-124al1g-2 ctLSpw\"]"));
        WebElement P8_click = driver.findElement(By.xpath("// div[@class=\"sc-124al1g-2 ctLSpw\"]/child::button"));
        System.out.println(P8_getText.getText());
        System.out.println(" ");
        P8_click.click();
        Thread.sleep(1000);
        btn_close.click();


        System.out.println("PRODUCT 9");
        WebElement P9_getText = driver.findElement(By.xpath("// div[@class=\"sc-124al1g-2 fGSBPC\"]"));
        WebElement P9_click = driver.findElement(By.xpath("// div[@class=\"sc-124al1g-2 fGSBPC\"]/child::button"));
        System.out.println(P9_getText.getText());
        System.out.println(" ");
        P9_click.click();
        Thread.sleep(1000);
        btn_close.click();


        System.out.println("PRODUCT 10");
        WebElement P10_getText = driver.findElement(By.xpath("// div[@class=\"sc-124al1g-2 jngQVM\"]"));
        WebElement P10_click = driver.findElement(By.xpath("// div[@class=\"sc-124al1g-2 jngQVM\"]/child::button"));
        System.out.println(P10_getText.getText());
        System.out.println(" ");
        P10_click.click();
        Thread.sleep(1000);
        btn_close.click();



        System.out.println("PRODUCT 11");
        WebElement P11_getText = driver.findElement(By.xpath("// div[@class=\"sc-124al1g-2 edLCDn\"]"));
        WebElement P11_click = driver.findElement(By.xpath("// div[@class=\"sc-124al1g-2 edLCDn\"]/child::button"));
        System.out.println(P11_getText.getText());
        System.out.println(" ");
        P11_click.click();
        Thread.sleep(1000);
        btn_close.click();


        System.out.println("PRODUCT 12");
        WebElement P12_getText = driver.findElement(By.xpath("// div[@class=\"sc-124al1g-2 fcMvnw\"]"));
        WebElement P12_click = driver.findElement(By.xpath("// div[@class=\"sc-124al1g-2 fcMvnw\"]/child::button"));
        System.out.println(P12_getText.getText());
        System.out.println(" ");
        P12_click.click();
        Thread.sleep(1000);
        btn_close.click();


        System.out.println("PRODUCT 13");
        WebElement P13_getText = driver.findElement(By.xpath("// div[@class=\"sc-124al1g-2 gwkgbw\"]"));
        WebElement P13_click = driver.findElement(By.xpath("// div[@class=\"sc-124al1g-2 gwkgbw\"]/child::button"));
        System.out.println(P13_getText.getText());
        System.out.println(" ");
        P13_click.click();
        Thread.sleep(1000);
        btn_close.click();


        System.out.println("PRODUCT 14");
        WebElement P14_getText = driver.findElement(By.xpath("// div[@class=\"sc-124al1g-2 jbWNoC\"]"));
        WebElement P14_click = driver.findElement(By.xpath("// div[@class=\"sc-124al1g-2 jbWNoC\"]/child::button"));
        System.out.println(P14_getText.getText());
        System.out.println(" ");
        P14_click.click();
        Thread.sleep(1000);
        btn_close.click();


        System.out.println("PRODUCT 15");
        WebElement P15_getText = driver.findElement(By.xpath("// div[@class=\"sc-124al1g-2 iuxyGb\"]"));
        WebElement P15_click = driver.findElement(By.xpath("// div[@class=\"sc-124al1g-2 iuxyGb\"]/child::button"));
        System.out.println(P15_getText.getText());
        System.out.println(" ");
        P15_click.click();
        Thread.sleep(1000);
        btn_close.click();


        System.out.println("PRODUCT 16");
        WebElement P16_getText = driver.findElement(By.xpath("// div[@class=\"sc-124al1g-2 dzBqXE\"]"));
        WebElement P16_click = driver.findElement(By.xpath("// div[@class=\"sc-124al1g-2 dzBqXE\"]/child::button"));
        System.out.println(P16_getText.getText());
        System.out.println(" ");
        P16_click.click();
        Thread.sleep(1000);

//       [Button Cart After Add Products]
        WebElement btnCheckOuts = driver.findElement(By.xpath("//button[@class=\"sc-1h98xa9-11 gnXVNU\"]"));
        btnCheckOuts.click();
//        Thread.sleep(1000);
        String alertTexts = alert.getText();
        System.out.println("Alert text: " + alertTexts);
        System.out.println(" ");
        alert.accept();
        btn_close.click();



//      [Size]

        WebElement sizeLinkXS = driver.findElement(By.xpath("//input[@value='XS']/../.."));
        System.out.println(sizeLinkXS.getText());
        sizeLinkXS.click();
        Thread.sleep(1000);
        sizeLinkXS.click();

        WebElement sizeLinkS = driver.findElement(By.xpath("//input[@value='S']/../.."));
        System.out.println(sizeLinkS.getText());
        sizeLinkS.click();
        Thread.sleep(1000);
        sizeLinkS.click();

        WebElement sizeLinkM = driver.findElement(By.xpath("//input[@value='M']/../.."));
        System.out.println(sizeLinkM.getText());
        sizeLinkM.click();
        Thread.sleep(1000);
        sizeLinkM.click();

        WebElement sizeLinkML = driver.findElement(By.xpath("//input[@value='ML']/../.."));
        System.out.println(sizeLinkML.getText());
        sizeLinkML.click();
        Thread.sleep(1000);
        sizeLinkML.click();

        WebElement sizeLinkL = driver.findElement(By.xpath("//input[@value='L']/../.."));
        System.out.println(sizeLinkL.getText());
        sizeLinkL.click();
        Thread.sleep(1000);
        sizeLinkL.click();

        WebElement sizeLinkXL = driver.findElement(By.xpath("//input[@value='XL']/../.."));
        System.out.println(sizeLinkXL.getText());
        sizeLinkXL.click();
        Thread.sleep(1000);
        sizeLinkXL.click();

        WebElement sizeLinkXXL = driver.findElement(By.xpath("//input[@value='XXL']/../.."));
        System.out.println(sizeLinkXS.getText());
        System.out.println(" ");
        sizeLinkXXL.click();
        Thread.sleep(1000);
        sizeLinkXXL.click();

//  Button [+, -, x] in Cart
        // Open befor create WebElement
        wait.until(ExpectedConditions.visibilityOf(btnCart));
        wait.until(ExpectedConditions.elementToBeClickable(btnCart));
        btnCart.click();
        WebElement P1_click_remove = driver.findElement(By.xpath("//p[text()='Cropped Stay Groovy off white']/../../button"));
        WebElement P1_click_more = driver.findElement(By.xpath("//p[text()='Cropped Stay Groovy off white']/../..//button[@class='sc-11uohgb-6 cgtUCJ'][2]"));
        WebElement P1_click_reduce = driver.findElement(By.xpath("//p[text()='Cropped Stay Groovy off white']/../..//button[@class='sc-11uohgb-6 cgtUCJ'][1]"));
        Thread.sleep(1000);
        P1_click_more.click();
        System.out.println("Product 1 In Cart");
        System.out.println(P1_click_more.getText());
        wait.until(ExpectedConditions.visibilityOf(P1_click_reduce));
        wait.until(ExpectedConditions.elementToBeClickable(P1_click_reduce));
        System.out.println(P1_click_reduce.getText());
        P1_click_reduce.click();
//        wait.until(ExpectedConditions.visibilityOf(P1_click_remove));
//        wait.until(ExpectedConditions.elementToBeClickable(P1_click_remove));
//        P1_click_remove.click();
//        Thread.sleep(1000);

        WebElement P2_click_remove = driver.findElement(By.xpath("//p[text()='Basic Cactus White T-shirt']/../../button"));
        WebElement P2_click_more = driver.findElement(By.xpath("//p[text()='Basic Cactus White T-shirt']/../..//button[@class='sc-11uohgb-6 cgtUCJ'][2]"));
        WebElement P2_click_reduce = driver.findElement(By.xpath("//p[text()='Basic Cactus White T-shirt']/../..//button[@class='sc-11uohgb-6 cgtUCJ'][1]"));
        Thread.sleep(1000);
        P2_click_more.click();
        System.out.println("Product 2 In Cart");
        System.out.println(P1_click_more.getText());
        wait.until(ExpectedConditions.visibilityOf(P2_click_reduce));
        wait.until(ExpectedConditions.elementToBeClickable(P2_click_reduce));
        System.out.println(P1_click_reduce.getText());
        P2_click_reduce.click();
//        wait.until(ExpectedConditions.visibilityOf(P2_click_remove));
//        wait.until(ExpectedConditions.elementToBeClickable(P2_click_remove));
//        P2_click_remove.click();

        WebElement P3_click_remove = driver.findElement(By.xpath("//p[text()='Skater Black Sweatshirt']/../../button"));
        WebElement P3_click_more = driver.findElement(By.xpath("//p[text()='Skater Black Sweatshirt']/../..//button[@class='sc-11uohgb-6 cgtUCJ'][2]"));
        WebElement P3_click_reduce = driver.findElement(By.xpath("//p[text()='Skater Black Sweatshirt']/../..//button[@class='sc-11uohgb-6 cgtUCJ'][1]"));
        Thread.sleep(1000);
        P3_click_more.click();
        System.out.println("Product 3 In Cart");
        System.out.println(P3_click_more.getText());
        wait.until(ExpectedConditions.visibilityOf(P3_click_reduce));
        wait.until(ExpectedConditions.elementToBeClickable(P3_click_reduce));
        System.out.println(P1_click_reduce.getText());
        P3_click_reduce.click();

        WebElement P4_click_remove = driver.findElement(By.xpath("//p[text()='Black Tule Oversized']/../../button"));
        WebElement P4_click_more = driver.findElement(By.xpath("//p[text()='Black Tule Oversized']/../..//button[@class='sc-11uohgb-6 cgtUCJ'][2]"));
        WebElement P4_click_reduce = driver.findElement(By.xpath("//p[text()='Black Tule Oversized']/../..//button[@class='sc-11uohgb-6 cgtUCJ'][1]"));
        Thread.sleep(1000);
        P4_click_more.click();
        System.out.println("Product 4 In Cart");
        System.out.println(P4_click_more.getText());
        wait.until(ExpectedConditions.visibilityOf(P4_click_reduce));
        wait.until(ExpectedConditions.elementToBeClickable(P4_click_reduce));
        System.out.println(P4_click_reduce.getText());
        P4_click_reduce.click();

        WebElement P5_click_remove = driver.findElement(By.xpath("//p[text()='Black Batman T-shirt']/../../button"));
        WebElement P5_click_more = driver.findElement(By.xpath("//p[text()='Black Batman T-shirt']/../..//button[@class='sc-11uohgb-6 cgtUCJ'][2]"));
        WebElement P5_click_reduce = driver.findElement(By.xpath("//p[text()='Black Batman T-shirt']/../..//button[@class='sc-11uohgb-6 cgtUCJ'][1]"));
        Thread.sleep(1000);
        P5_click_more.click();
        System.out.println("Product 5 In Cart");
        System.out.println(P5_click_more.getText());
        wait.until(ExpectedConditions.visibilityOf(P5_click_reduce));
        wait.until(ExpectedConditions.elementToBeClickable(P5_click_reduce));
        System.out.println(P5_click_reduce.getText());
        P5_click_reduce.click();

//        Remove 5 product out cart (1)
        Thread.sleep(1000);
        P1_click_remove.click();
        Thread.sleep(1000);
        P2_click_remove.click();
        Thread.sleep(1000);
        P3_click_remove.click();
        Thread.sleep(1000);
        P4_click_remove.click();
        Thread.sleep(1000);
        P5_click_remove.click();
        Thread.sleep(1000);

        WebElement P6_click_remove = driver.findElement(By.xpath("//p[text()='Blue T-Shirt']/../../button"));
        WebElement P6_click_more = driver.findElement(By.xpath("//p[text()='Blue T-Shirt']/../..//button[@class='sc-11uohgb-6 cgtUCJ'][2]"));
        WebElement P6_click_reduce = driver.findElement(By.xpath("//p[text()='Blue T-Shirt']/../..//button[@class='sc-11uohgb-6 cgtUCJ'][1]"));
        Thread.sleep(1000);
        P6_click_more.click();
        System.out.println("Product 6 In Cart");
        System.out.println(P6_click_more.getText());
        wait.until(ExpectedConditions.visibilityOf(P6_click_reduce));
        wait.until(ExpectedConditions.elementToBeClickable(P6_click_reduce));
        System.out.println(P6_click_reduce.getText());
        P6_click_reduce.click();

        WebElement P7_click_remove = driver.findElement(By.xpath("//p[text()='Loose Black T-shirt']/../../button"));
        WebElement P7_click_more = driver.findElement(By.xpath("//p[text()='Loose Black T-shirt']/../..//button[@class='sc-11uohgb-6 cgtUCJ'][2]"));
        WebElement P7_click_reduce = driver.findElement(By.xpath("//p[text()='Loose Black T-shirt']/../..//button[@class='sc-11uohgb-6 cgtUCJ'][1]"));
        Thread.sleep(1000);
        P7_click_more.click();
        System.out.println("Product 7 In Cart");
        System.out.println(P7_click_more.getText());
        wait.until(ExpectedConditions.visibilityOf(P7_click_reduce));
        wait.until(ExpectedConditions.elementToBeClickable(P7_click_reduce));
        System.out.println(P7_click_reduce.getText());
        P7_click_reduce.click();

        WebElement P8_click_remove = driver.findElement(By.xpath("//p[text()='Ringer Hall Pass']/../../button"));
        WebElement P8_click_more = driver.findElement(By.xpath("//p[text()='Ringer Hall Pass']/../..//button[@class='sc-11uohgb-6 cgtUCJ'][2]"));
        WebElement P8_click_reduce = driver.findElement(By.xpath("//p[text()='Ringer Hall Pass']/../..//button[@class='sc-11uohgb-6 cgtUCJ'][1]"));
        Thread.sleep(1000);
        P8_click_more.click();
        System.out.println("Product 8 In Cart");
        System.out.println(P8_click_more.getText());
        wait.until(ExpectedConditions.visibilityOf(P8_click_reduce));
        wait.until(ExpectedConditions.elementToBeClickable(P8_click_reduce));
        System.out.println(P8_click_reduce.getText());
        P8_click_reduce.click();

        WebElement P9_click_remove = driver.findElement(By.xpath("//p[text()='Grey T-shirt']/../../button"));
        WebElement P9_click_more = driver.findElement(By.xpath("//p[text()='Grey T-shirt']/../..//button[@class='sc-11uohgb-6 cgtUCJ'][2]"));
        WebElement P9_click_reduce = driver.findElement(By.xpath("//p[text()='Grey T-shirt']/../..//button[@class='sc-11uohgb-6 cgtUCJ'][1]"));
        Thread.sleep(1000);
        P9_click_more.click();
        System.out.println("Product 9 In Cart");
        System.out.println(P9_click_more.getText());
        wait.until(ExpectedConditions.visibilityOf(P9_click_reduce));
        wait.until(ExpectedConditions.elementToBeClickable(P9_click_reduce));
        System.out.println(P9_click_reduce.getText());
        P9_click_reduce.click();

        WebElement P10_click_remove = driver.findElement(By.xpath("//p[text()='Black T-shirt with white stripes']/../../button"));
        WebElement P10_click_more = driver.findElement(By.xpath("//p[text()='Black T-shirt with white stripes']/../..//button[@class='sc-11uohgb-6 cgtUCJ'][2]"));
        WebElement P10_click_reduce = driver.findElement(By.xpath("//p[text()='Black T-shirt with white stripes']/../..//button[@class='sc-11uohgb-6 cgtUCJ'][1]"));
        Thread.sleep(1000);
        P10_click_more.click();
        System.out.println("Product 10 In Cart");
        System.out.println(P10_click_more.getText());
        wait.until(ExpectedConditions.visibilityOf(P10_click_reduce));
        wait.until(ExpectedConditions.elementToBeClickable(P10_click_reduce));
        System.out.println(P10_click_reduce.getText());
        P10_click_reduce.click();

//        Remove 5 product out cart (2)
        Thread.sleep(1000);
        P6_click_remove.click();
        Thread.sleep(1000);
        P7_click_remove.click();
        Thread.sleep(1000);
        P8_click_remove.click();
        Thread.sleep(1000);
        P9_click_remove.click();
        Thread.sleep(1000);
        P10_click_remove.click();
        Thread.sleep(1000);

        WebElement P11_click_remove = driver.findElement(By.xpath("//p[text()='Turtles Ninja T-shirt']/../../button"));
        WebElement P11_click_more = driver.findElement(By.xpath("//p[text()='Turtles Ninja T-shirt']/../..//button[@class='sc-11uohgb-6 cgtUCJ'][2]"));
        WebElement P11_click_reduce = driver.findElement(By.xpath("//p[text()='Turtles Ninja T-shirt']/../..//button[@class='sc-11uohgb-6 cgtUCJ'][1]"));
        Thread.sleep(1000);
        P11_click_more.click();
        System.out.println("Product 11 In Cart");
        System.out.println(P11_click_more.getText());
        wait.until(ExpectedConditions.visibilityOf(P11_click_reduce));
        wait.until(ExpectedConditions.elementToBeClickable(P11_click_reduce));
        System.out.println(P11_click_reduce.getText());
        P11_click_reduce.click();

        WebElement P12_click_remove = driver.findElement(By.xpath("//p[text()='Slim black T-shirt']/../../button"));
        WebElement P12_click_more = driver.findElement(By.xpath("//p[text()='Slim black T-shirt']/../..//button[@class='sc-11uohgb-6 cgtUCJ'][2]"));
        WebElement P12_click_reduce = driver.findElement(By.xpath("//p[text()='Slim black T-shirt']/../..//button[@class='sc-11uohgb-6 cgtUCJ'][1]"));
        Thread.sleep(1000);
        P12_click_more.click();
        System.out.println("Product 12 In Cart");
        System.out.println(P12_click_more.getText());
        wait.until(ExpectedConditions.visibilityOf(P12_click_reduce));
        wait.until(ExpectedConditions.elementToBeClickable(P12_click_reduce));
        System.out.println(P12_click_reduce.getText());
        P12_click_reduce.click();

        WebElement P13_click_remove = driver.findElement(By.xpath("//p[text()='Blue Sweatshirt']/../../button"));
        WebElement P13_click_more = driver.findElement(By.xpath("//p[text()='Blue Sweatshirt']/../..//button[@class='sc-11uohgb-6 cgtUCJ'][2]"));
        WebElement P13_click_reduce = driver.findElement(By.xpath("//p[text()='Blue Sweatshirt']/../..//button[@class='sc-11uohgb-6 cgtUCJ'][1]"));
        Thread.sleep(1000);
        P13_click_more.click();
        System.out.println("Product 13 In Cart");
        System.out.println(P13_click_more.getText());
        wait.until(ExpectedConditions.visibilityOf(P13_click_reduce));
        wait.until(ExpectedConditions.elementToBeClickable(P13_click_reduce));
        System.out.println(P13_click_reduce.getText());
        P13_click_reduce.click();

        WebElement P14_click_remove = driver.findElement(By.xpath("//p[text()='White T-shirt Gucci']/../../button"));
        WebElement P14_click_more = driver.findElement(By.xpath("//p[text()='White T-shirt Gucci']/../..//button[@class='sc-11uohgb-6 cgtUCJ'][2]"));
        WebElement P14_click_reduce = driver.findElement(By.xpath("//p[text()='White T-shirt Gucci']/../..//button[@class='sc-11uohgb-6 cgtUCJ'][1]"));
        Thread.sleep(1000);
        P14_click_more.click();
        System.out.println("Product 14 In Cart");
        System.out.println(P14_click_more.getText());
        wait.until(ExpectedConditions.visibilityOf(P14_click_reduce));
        wait.until(ExpectedConditions.elementToBeClickable(P14_click_reduce));
        System.out.println(P14_click_reduce.getText());
        P14_click_reduce.click();

        WebElement P15_click_remove = driver.findElement(By.xpath("//p[text()='Tropical Wine T-shirt']/../../button"));
        WebElement P15_click_more = driver.findElement(By.xpath("//p[text()='Tropical Wine T-shirt']/../..//button[@class='sc-11uohgb-6 cgtUCJ'][2]"));
        WebElement P15_click_reduce = driver.findElement(By.xpath("//p[text()='Tropical Wine T-shirt']/../..//button[@class='sc-11uohgb-6 cgtUCJ'][1]"));
        Thread.sleep(1000);
        P15_click_more.click();
        System.out.println("Product 15 In Cart");
        System.out.println(P15_click_more.getText());
        wait.until(ExpectedConditions.visibilityOf(P15_click_reduce));
        wait.until(ExpectedConditions.elementToBeClickable(P15_click_reduce));
        System.out.println(P15_click_reduce.getText());
        P15_click_reduce.click();

//        Remove 5 product out Cart (3)
        Thread.sleep(1000);
        P11_click_remove.click();
        Thread.sleep(1000);
        P12_click_remove.click();
        Thread.sleep(1000);
        P13_click_remove.click();
        Thread.sleep(1000);
        P14_click_remove.click();
        Thread.sleep(1000);
        P15_click_remove.click();
        Thread.sleep(1000);


        WebElement P16_click_remove = driver.findElement(By.xpath("//p[text()='Marine Blue T-shirt']/../../button"));
        WebElement P16_click_more = driver.findElement(By.xpath("//p[text()='Marine Blue T-shirt']/../..//button[@class='sc-11uohgb-6 cgtUCJ'][2]"));
        WebElement P16_click_reduce = driver.findElement(By.xpath("//p[text()='Marine Blue T-shirt']/../..//button[@class='sc-11uohgb-6 cgtUCJ'][1]"));
        Thread.sleep(1000);
        P16_click_more.click();
        System.out.println("Product 16 In Cart");
        System.out.println(P16_click_more.getText());
        wait.until(ExpectedConditions.visibilityOf(P16_click_reduce));
        wait.until(ExpectedConditions.elementToBeClickable(P16_click_reduce));
        System.out.println(P16_click_reduce.getText());
        P16_click_reduce.click();
        Thread.sleep(1000);
        P16_click_remove.click();
        btn_close.click();
    }
}
