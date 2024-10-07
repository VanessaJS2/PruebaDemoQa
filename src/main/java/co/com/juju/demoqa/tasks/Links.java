package co.com.juju.demoqa.tasks;

import co.com.juju.demoqa.interactions.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import static co.com.juju.demoqa.userinterfaces.Elements.*;
import static co.com.juju.demoqa.userinterfaces.HomePage.CATEGORIATEXTBOX;
import static co.com.juju.demoqa.userinterfaces.HomePage.SEGUNDOBLOQUEHOME;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Links  implements Task {
    @Override
    public <T extends Actor> void performAs(T vanessa) {
        String totalResponded = "";
        vanessa.attemptsTo(
                Scroll.to((SEGUNDOBLOQUEHOME)),
                Click.on(CATEGORIATEXTBOX),
                Wait.theSeconds(1),
                Scroll.to((CATEGORIAWEBTABLES)),
                Wait.theSeconds(1),
                Click.on(CATEGORIALINKS),
                Scroll.to((CATEGORIAWEBTABLES)),
                Wait.theSeconds(1),
                Scroll.to(LINKSLABELHOME),
                Click.on(LINKSLABELCREATED),
                Wait.theSeconds(2)
        );
        totalResponded += getLinkslabelCreatedResponded(1).resolveFor(vanessa).getText()+getLinkslabelCreatedResponded(2).resolveFor(vanessa).getText();

        vanessa.attemptsTo(Click.on(LINKSLABELNOCONTEN), Wait.theSeconds(2));
        totalResponded += getLinkslabelCreatedResponded(1).resolveFor(vanessa).getText()+getLinkslabelCreatedResponded(2).resolveFor(vanessa).getText();

        vanessa.attemptsTo(Click.on(LINKSLABELMOVED), Wait.theSeconds(2));
        totalResponded += getLinkslabelCreatedResponded(1).resolveFor(vanessa).getText()+getLinkslabelCreatedResponded(2).resolveFor(vanessa).getText();

        vanessa.attemptsTo(Click.on(LINKSLABELBADREQUEST), Wait.theSeconds(2));
        totalResponded += getLinkslabelCreatedResponded(1).resolveFor(vanessa).getText()+getLinkslabelCreatedResponded(2).resolveFor(vanessa).getText();

        vanessa.attemptsTo(Click.on(LINKSLABELUNAUTHORIZED), Wait.theSeconds(2));
        totalResponded += getLinkslabelCreatedResponded(1).resolveFor(vanessa).getText()+getLinkslabelCreatedResponded(2).resolveFor(vanessa).getText();

        vanessa.attemptsTo(Click.on(LINKSLABELFORBIDDEN), Wait.theSeconds(2));
        totalResponded += getLinkslabelCreatedResponded(1).resolveFor(vanessa).getText()+getLinkslabelCreatedResponded(2).resolveFor(vanessa).getText();

        vanessa.attemptsTo(Click.on(LINKSLABELINVALIDURL), Wait.theSeconds(2));
        totalResponded += getLinkslabelCreatedResponded(1).resolveFor(vanessa).getText()+getLinkslabelCreatedResponded(2).resolveFor(vanessa).getText();

        vanessa.remember("LinkHasResponded", totalResponded);

    }
    public static Links links() {
        return instrumented(Links.class);
    }
}
