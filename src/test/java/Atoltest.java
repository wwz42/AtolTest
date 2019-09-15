import com.codeborne.selenide.logevents.SelenideLogger;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.junit4.DisplayName;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.BeforeClass;
import org.junit.Test;

public class Atoltest {

//    LocatorsYandexStartPage locators = new LocatorsYandexStartPage();
    Methods methods = new Methods();
    @BeforeClass
    public static void setUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));
        WebDriverManager.chromedriver().version("2.35").setup();
    }

    @DisplayName("Проверка доступности сайта Атол через поисковую систему Яндекс")
    @Test
    public void  ATOLTEST001() { //отправка анкеты выше
        methods.findOnYandex("Атол онлайн");
        methods.transferToElement();
        methods.checkSiteAtol();





    }


}
