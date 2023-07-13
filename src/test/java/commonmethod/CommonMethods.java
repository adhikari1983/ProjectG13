package commonmethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonMethods {
    protected static WebDriver driver;

    public static void setDriver(WebDriver driver) {
        CommonMethods.driver = driver;
    }

    public static void clearAndSendKeys(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }

    public static void clickElement(WebElement element) {
        element.click();
    }

    public static void sendKeys(WebElement element, String text) {
        element.sendKeys(text);
    }

    public static boolean isSelected(WebElement element) {
        return element.isSelected();
    }
}



