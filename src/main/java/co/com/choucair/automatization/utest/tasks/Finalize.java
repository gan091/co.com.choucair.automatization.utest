package co.com.choucair.automatization.utest.tasks;

import co.com.choucair.automatization.utest.model.UTestData;
import co.com.choucair.automatization.utest.userinterface.LastStepView;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Finalize implements Task {
    UTestData u;

    public Finalize(UTestData u) {
        this.u = u;
    }

    public static Finalize createUser(UTestData user) {
        return Tasks.instrumented(Finalize.class, user);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(u.getStrPassword()).into(LastStepView.INPUT_PASSWORD_1),
                Enter.theValue(u.getStrPassword()).into(LastStepView.INPUT_PASSWORD_2),
                Click.on(LastStepView.CHECKBOX_TERMS),
                Click.on(LastStepView.CHECKBOX_PRIVACITY),
                Click.on(LastStepView.BUTTON_FINISH)
                );
    }
}
