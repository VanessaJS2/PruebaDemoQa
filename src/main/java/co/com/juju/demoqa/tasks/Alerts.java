package co.com.juju.demoqa.tasks;

import co.com.juju.demoqa.interactions.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.WebDriver;
import static co.com.juju.demoqa.userinterfaces.Alerts.*;
import static co.com.juju.demoqa.userinterfaces.HomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class Alerts implements Task {
    @Override
    public <T extends Actor> void performAs(T vanessa) {
        String bodyAlerts = "";
        WebDriver driver = BrowseTheWeb.as(vanessa).getDriver();
        vanessa.attemptsTo(
                Scroll.to((SEGUNDOBLOQUEHOME)),
                Wait.theSeconds(1),
                Click.on(CATEGORIALERTS),
                Wait.theSeconds(1),
                Scroll.to((TERCERCATEGORIALERTS)),
                Wait.theSeconds(1),
                Click.on(CATEGORIAALERTSMODAL),
                Wait.theSeconds(1),
                Scroll.to((TERCERCATEGORIALERTS)),
                Wait.theSeconds(1),
                Click.on(BUTTOMSMALLMODAL),
                Wait.theSeconds(4)

        );
        bodyAlerts = TEXTOBODY.resolveFor(vanessa).getText();
        vanessa.remember("bodysmallAlerts",bodyAlerts);

        vanessa.attemptsTo(
                Wait.theSeconds(1),
                Click.on(BUTTONCLOSEALERTS),
                Wait.theSeconds(1),
                Click.on(BUTTOMLARGEMODAL),
                Wait.theSeconds(2)
        );
        bodyAlerts = TEXTOBODY.resolveFor(vanessa).getText();
        vanessa.remember("bodyLargeAlerts",bodyAlerts);

        vanessa.attemptsTo(
                Click.on(BUTTONCLOSEALERTS),
                Wait.theSeconds(10)
        );
    }
    public static Alerts alerts() {
        return instrumented(Alerts.class);
    }
}
