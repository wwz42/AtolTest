//import Locators.Yandex.LocatorsYandexStartPage;

import Locators.Atol.LocatorsAtolStartPage;
import Locators.Yandex.LocatorsYandexFindResutl;
import Locators.Yandex.LocatorsYandexStartPage;
import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Methods {

    public void findOnYandex (String stringSearch){
        open("https://ya.ru/");
        $(LocatorsYandexStartPage.findfield).setValue(stringSearch);
        $(LocatorsYandexStartPage.buttonFind).click();
    }

    public  void transferToElement(){
        $(LocatorsYandexFindResutl.SearchResult).click();
    }
    public void checkSiteAtol(){
        $(LocatorsAtolStartPage.AtolOnlineHeaders).exists();
        $(LocatorsAtolStartPage.AtolOnlineHeaders).shouldBe(Condition.enabled);
        $(LocatorsAtolStartPage.AtolOnlineHeaders).shouldBe(Condition.visible);





    }
}
