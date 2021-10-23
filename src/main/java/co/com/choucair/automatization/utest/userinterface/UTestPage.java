package co.com.choucair.automatization.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.utest.com/")
public class UTestPage extends PageObject {
    public static final Target JOIN_BUTTON = Target.the("button that shows us the form to create user").
            located(By.className("unauthenticated-nav-bar__sign-up"));
}
