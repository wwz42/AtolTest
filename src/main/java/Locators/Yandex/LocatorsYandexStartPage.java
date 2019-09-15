package Locators.Yandex;

import org.openqa.selenium.By;

public class LocatorsYandexStartPage {



    public static By findfield = By.xpath("//input[@aria-label = 'Запрос']");
    public static By buttonFind = By.xpath("//span[text()='Найти']/parent::button");

}
