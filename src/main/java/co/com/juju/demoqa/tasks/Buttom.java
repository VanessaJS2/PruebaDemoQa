package co.com.juju.demoqa.tasks;

import co.com.juju.demoqa.interactions.DoubleClick;
import co.com.juju.demoqa.interactions.RightClick;
import co.com.juju.demoqa.interactions.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import static co.com.juju.demoqa.userinterfaces.Elements.*;
import static co.com.juju.demoqa.userinterfaces.HomePage.CATEGORIATEXTBOX;
import static co.com.juju.demoqa.userinterfaces.HomePage.SEGUNDOBLOQUEHOME;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Buttom implements Task {

    private final String configuracion;

    public Buttom(String configuracion) {
        this.configuracion = configuracion;
    }

    @Override
    public <T extends Actor> void performAs(T vanessa) {

        switch(configuracion) {
            case "clickderecho":
                vanessa.attemptsTo(
                        Scroll.to((SEGUNDOBLOQUEHOME)),
                        Click.on(CATEGORIATEXTBOX),
                        Wait.theSeconds(1),
                        Scroll.to((CATEGORIAWEBTABLES)),
                        Click.on(CATEGORIABUTTONS),
                        Wait.theSeconds(1),
                        Scroll.to((CATEGORIAWEBTABLES)),
                        Wait.theSeconds(1),
                        RightClick.on(BOTTONSCLICKDERECHO),
                        Wait.theSeconds(1)
                );
                break;
            case "dobleclick":
                vanessa.attemptsTo(
                        DoubleClick.on(BOTTONSDOBLECLICK),
                        Wait.theSeconds(1),
                        DoubleClick.on(BOTTONSCLICKME),
                        Wait.theSeconds(1)
                );
                break;
            default:
                throw new UnsupportedOperationException("Acción no soportada: " + configuracion);
        }

    }
    public static Buttom buttom(String configuracion) {
        return instrumented(Buttom.class,configuracion);
    }
}
