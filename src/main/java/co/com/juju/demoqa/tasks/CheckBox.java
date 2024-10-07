package co.com.juju.demoqa.tasks;

import co.com.juju.demoqa.interactions.Wait;
import co.com.juju.demoqa.userinterfaces.Elements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import static co.com.juju.demoqa.userinterfaces.Elements.*;
import static co.com.juju.demoqa.userinterfaces.HomePage.CATEGORIATEXTBOX;
import static co.com.juju.demoqa.userinterfaces.HomePage.SEGUNDOBLOQUEHOME;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CheckBox implements Task {
    @Override
    public <T extends Actor> void performAs(T vanessa) {
    vanessa.attemptsTo(
            Scroll.to((SEGUNDOBLOQUEHOME)),
            Click.on(CATEGORIATEXTBOX),
            Wait.theSeconds(1),
            Click.on(CATEGORIACHECKBOX),
            Wait.theSeconds(1),
            Scroll.to((CATEGORIAWEBTABLES)),
            Wait.theSeconds(1),
            Click.on(Elements.getToggle(1)),
            Wait.theSeconds(1),
            Click.on(Elements.getToggle(2)),
            Click.on(Elements.getToggle(3)),
            Click.on(Elements.getToggle(6)),
            Click.on(OPCIONNOTES),
            Click.on(OPCIONCHECKBOX),
            Click.on(OPCIONOFFICE),
            Click.on(OPCIONWORDFILE),
            Wait.theSeconds(1)
    );
    }
    public static CheckBox checkBox() {
        return instrumented(CheckBox.class);
    }
}
