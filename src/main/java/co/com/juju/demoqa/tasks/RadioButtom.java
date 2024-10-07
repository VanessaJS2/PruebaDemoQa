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

public class RadioButtom implements Task {
    @Override
    public <T extends Actor> void performAs(T vanessa) {
        vanessa.attemptsTo(
                Scroll.to((SEGUNDOBLOQUEHOME)),
                Click.on(CATEGORIATEXTBOX),
                Wait.theSeconds(1),
                Click.on(CATEGORIARADIOBUTTOM),
                Wait.theSeconds(1),
                Scroll.to((CATEGORIAWEBTABLES)),
                Click.on(Elements.getCHECKBOXRADIOBUTON(2)),
                Wait.theSeconds(10)
        );
    }

    public static RadioButtom radioButtom() {
        return instrumented(RadioButtom.class);
    }
}
