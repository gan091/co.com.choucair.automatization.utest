package co.com.choucair.automatization.utest.tasks;

import co.com.choucair.automatization.utest.model.UTestData;
import co.com.choucair.automatization.utest.userinterface.AdressView;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class AddAdress implements Task {
    private UTestData u;

    public AddAdress(UTestData u) {
        this.u = u;
    }

    public static AddAdress onThePage(UTestData user) {
        return Tasks.instrumented(AddAdress.class, user);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(u.getStrCity()).into(AdressView.INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN).into(AdressView.INPUT_CITY),
                Hit.the(Keys.ENTER).into(AdressView.INPUT_CITY),
                Enter.theValue(Integer.toString(u.getIntZip())).into(AdressView.INPUT_ZIP),
                Click.on(AdressView.DIV_COUNTRY),
                Enter.theValue(u.getStrCountry()).into(AdressView.INPUT_COUNTRY),
                Hit.the(Keys.ENTER).into(AdressView.INPUT_COUNTRY),
                Click.on(AdressView.BUTTON_NEXT_2)
                );
    }
}
