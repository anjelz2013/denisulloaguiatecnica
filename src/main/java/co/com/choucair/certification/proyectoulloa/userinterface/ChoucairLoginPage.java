package co.com.choucair.certification.proyectoulloa.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class ChoucairLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to login").located(By.xpath("//ul[2]/li/a/strong"));
    public static final Target NAME_USER = Target.the("write tha user").located(By.id("username"));
    public static final Target PASSWORD_USER = Target.the("write the password").located(By.id("password"));
    public static final Target CONFIRM_ACCESS = Target.the("Successful").located(By.xpath("//div[3]/button"));
}
