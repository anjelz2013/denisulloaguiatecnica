package co.com.choucair.certification.proyectoulloa.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target.the("select the university Choucair").located(By.xpath("//div[@id='certificaciones']/div/a/h4/strong"));
    public static final Target INPUT_SEARCH = Target.the("select the university Choucair").located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("select the university Choucair").located(By.xpath("//button[@type='submit']"));
    public static final Target INPUT_COURSE = Target.the("select the university Choucair").located(By.linkText("Foundation Level"));
    public static final Target INPUT_NAME_COURSE = Target.the("select the university Choucair").located(By.xpath("//a[contains(text(),'Foundation Level')]"));
}


