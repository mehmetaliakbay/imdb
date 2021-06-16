package step;

import base.BaseTest;
import com.thoughtworks.gauge.Step;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.openqa.selenium.By;

public class BaseSteps extends BaseTest {
    private static Logger logger = LoggerFactory.getLogger(BaseTest.class);

    @Step("<url> adresine gidilir")
    public void goToUrl(String url) {
        getDriver().get(url);

    }

    @Step("Arama cubugunun sol tarafinda bulunan Menu Butonuna tiklanir")
    public void clickMenu() {
        String id = "imdbHeader-navDrawerOpen--desktop";
        getDriver().findElement(By.id(id)).click();

    }

    @Step("Gelen ekranda Award & Events basligi altinda bulunan Oscars butonuna tiklanir")
    public void clickAwardAndEvent() {
        String xpath = "(//*[.='Oscars'])[1]";
        getDriver().findElement(By.xpath(xpath)).click();

    }

    @Step("<Event History> basligi altinda <1929> degeri secilir")
    public void clickEventHistory(String eventHistory, String year) {
    String xpath = "//*[.='Event History']/following-sibling::div/div/span[.='"+year+"']";
    getDriver().findElement(By.xpath(xpath)).click();

    }


    @Step("Honorary Award başlığı altında <movieName> seçilir")
    public void implementation1(String movieName) {
        String xpath = "//span[@class='event-widgets__nominee-name']/a[.='"+movieName+"']";
        getDriver().findElement(By.xpath(xpath)).click();

    }
}
