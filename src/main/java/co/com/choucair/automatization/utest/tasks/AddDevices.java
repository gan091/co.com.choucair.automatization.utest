package co.com.choucair.automatization.utest.tasks;

import co.com.choucair.automatization.utest.model.UTestData;
import co.com.choucair.automatization.utest.userinterface.AboutYourDevicesView;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class AddDevices implements Task {
    UTestData uTD;

    public AddDevices(UTestData uTD) {
        this.uTD = uTD;
    }

    public static AddDevices onThePage(UTestData uTD) {
        return Tasks.instrumented(AddDevices.class, uTD);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(AboutYourDevicesView.DIV_COMPUTER_OS),
                Enter.theValue(uTD.getStrComputerOS()).into(AboutYourDevicesView.INPUT_COMPUTER_OS),
                Hit.the(Keys.ENTER).into(AboutYourDevicesView.INPUT_COMPUTER_OS),
                Click.on(AboutYourDevicesView.DIV_VERSION),
                Enter.theValue(uTD.getStrComputerVersion()).into(AboutYourDevicesView.INPUT_VERSION),
                Hit.the(Keys.ENTER).into(AboutYourDevicesView.INPUT_VERSION),
                Click.on(AboutYourDevicesView.DIV_LANGUAJE),
                Enter.theValue(uTD.getStrComputerLenguaje()).into(AboutYourDevicesView.INPUT_LANGUAJE),
                Hit.the(Keys.ENTER).into(AboutYourDevicesView.INPUT_LANGUAJE),
                Click.on(AboutYourDevicesView.DIV_BRAND),
                Enter.theValue(uTD.getStrBrandMobil()).into(AboutYourDevicesView.INPUT_BRAND),
                Hit.the(Keys.ENTER).into(AboutYourDevicesView.INPUT_BRAND),
                Click.on(AboutYourDevicesView.DIV_MODEL),
                Enter.theValue(uTD.getStrModelMobil()).into(AboutYourDevicesView.INPUT_MODEL),
                Hit.the(Keys.ENTER).into(AboutYourDevicesView.INPUT_MODEL),
                Click.on(AboutYourDevicesView.DIV_MOBILE_OS),
                Enter.theValue(uTD.getStrMobilOS()).into(AboutYourDevicesView.INPUT_MOBILE_OS),
                Hit.the(Keys.ENTER).into(AboutYourDevicesView.INPUT_MOBILE_OS),
                Click.on(AboutYourDevicesView.BUTTON_NEXT_3)
                );
    }
}
