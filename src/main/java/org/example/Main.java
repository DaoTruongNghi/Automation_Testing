package org.example;

import org.openqa.selenium.Alert;
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
        btnCart.click();
        Thread.sleep(1000);

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



//      [ATC Click & GetText]

        System.out.println("PRODUCT 1");
        WebElement P1_getText = driver.findElement(By.xpath("//div[@class=\"sc-124al1g-2 dwOYCh\"]"));
        WebElement P1_click = driver.findElement(By.xpath("//div[@class=\"sc-124al1g-2 dwOYCh\"]/child::button"));
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
        Thread.sleep(1000);
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
        sizeLinkXXL.click();
        Thread.sleep(1000);
        sizeLinkXXL.click();



    }
    }
