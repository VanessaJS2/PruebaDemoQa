package co.com.juju.demoqa.tasks;

import co.com.juju.demoqa.interactions.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import static co.com.juju.demoqa.userinterfaces.Elements.*;
import static co.com.juju.demoqa.userinterfaces.HomePage.CATEGORIATEXTBOX;
import static co.com.juju.demoqa.userinterfaces.HomePage.SEGUNDOBLOQUEHOME;
import static co.com.juju.demoqa.utils.Constants.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class WebTables implements Task {

    private final String addRecord;

    public WebTables(String addRecord) {
        this.addRecord = addRecord;
    }

    @Override
    public <T extends Actor> void performAs(T vanessa) {
        switch(addRecord) {
            case "addRecord":
                vanessa.attemptsTo(
                        Scroll.to((SEGUNDOBLOQUEHOME)),
                        Click.on(CATEGORIATEXTBOX),
                        Wait.theSeconds(1),
                        Scroll.to((CATEGORIAWEBTABLES)),
                        Click.on(CATEGORIAWEBTABLES),
                        Wait.theSeconds(1),
                        Scroll.to((CATEGORIAWEBTABLES)),
                        Wait.theSeconds(1),
                        Click.on(WEBTABLESBUTTOMADD),
                        Wait.theSeconds(1),
                        Enter.theValue(FIRSNAME).into((WEBTABLESFORMFIRSTNAME)),
                        Enter.theValue(LASTNAME).into((WEBTABLESFORMLASTNAME)),
                        Enter.theValue(INPUTEMAIL).into((WEBTABLESFORMEMAIL)),
                        Enter.theValue(AGE).into((WEBTABLESFORMAGE)),
                        Enter.theValue(SALARY).into((WEBTABLESFORMSALARY)),
                        Enter.theValue(DEPART).into((WEBTABLESFORMDEPARMENT)),
                        Click.on(WEBTABLESBUTTOMSUBMIT),
                        Wait.theSeconds(10)
                );
                break;

            case "editRecord":
                FIRSNAME="Gloria";
                vanessa.attemptsTo(
                        Click.on(BOTTONEDITAR),
                        Enter.theValue(FIRSNAME).into((WEBTABLESFORMFIRSTNAME)),
                        Click.on(WEBTABLESBUTTOMSUBMIT),
                        Wait.theSeconds(1)

                );
                break;
            case "deleteRecord":
                vanessa.attemptsTo(
                        Click.on(BOTTONELIMINAR),
                        Wait.theSeconds(1)
                );
                break;
            default:
                throw new UnsupportedOperationException("Acción no soportada: " + addRecord);

        }

    }

    public static WebTables webTables(String addRecord) {
        return instrumented(WebTables.class,addRecord);
    }
}
