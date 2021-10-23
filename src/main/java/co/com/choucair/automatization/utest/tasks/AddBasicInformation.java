package co.com.choucair.automatization.utest.tasks;

import co.com.choucair.automatization.utest.model.UTestData;
import co.com.choucair.automatization.utest.userinterface.AboutYourselfView;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class AddBasicInformation implements Task {
    private UTestData u;

    public AddBasicInformation(UTestData u) {
        this.u = u;
    }

    public static AddBasicInformation onThePage(UTestData user) {
        return Tasks.instrumented(AddBasicInformation.class, user);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(u.getStrFirstName()).into(AboutYourselfView.INPUT_NAME),
                Enter.theValue(u.getStrLastName()).into(AboutYourselfView.INPUT_LASTNAME),
                Enter.theValue(u.getStrEmail()).into(AboutYourselfView.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(u.getStrMounth()).from(AboutYourselfView.OPTION_MONTH),
                SelectFromOptions.byVisibleText(Integer.toString(u.getIntDay())).from(AboutYourselfView.OPTION_DAY),
                SelectFromOptions.byVisibleText(Integer.toString(u.getIntYear())).from(AboutYourselfView.OPTION_YEAR),
                Click.on(AboutYourselfView.INPUT_LENGUAGE),
                Enter.theValue(u.getStrLenguage()).into(AboutYourselfView.INPUT_LENGUAGE),
                Hit.the(Keys.ENTER).into(AboutYourselfView.INPUT_LENGUAGE),
                WaitUntil.the(AboutYourselfView.BUTTON_NEXT_1, isEnabled()),
                Click.on(AboutYourselfView.BUTTON_NEXT_1)
                );
    }
}
