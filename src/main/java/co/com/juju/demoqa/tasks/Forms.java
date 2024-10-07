package co.com.juju.demoqa.tasks;

import co.com.juju.demoqa.interactions.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import static co.com.juju.demoqa.userinterfaces.Elements.*;
import static co.com.juju.demoqa.userinterfaces.FormUI.*;
import static co.com.juju.demoqa.userinterfaces.FormUI.BOTONSUBMIT;
import static co.com.juju.demoqa.userinterfaces.HomePage.*;
import static co.com.juju.demoqa.utils.Constants.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Forms implements Task {
    @Override
    public <T extends Actor> void performAs(T vanessa) {
        vanessa.attemptsTo(
                Scroll.to((SEGUNDOBLOQUEHOME)),
                Click.on(CATEGORIAFORM),
                Wait.theSeconds(1),
                Click.on(CATEGORIAPRACTICEFORM),
                Wait.theSeconds(1),
                Scroll.to((CATEGORIAPRACTICEFORM)),
                Wait.theSeconds(1),
                Enter.theValue(FIRSNAME).into((WEBTABLESFORMFIRSTNAME)),
                Enter.theValue(LASTNAME).into((WEBTABLESFORMLASTNAME)),
                Enter.theValue(INPUTEMAIL).into((WEBTABLESFORMEMAIL)),
                Click.on(FORMRADIOBUTONFEMALE),
                Scroll.to((FORMRADIOBUTONFEMALE)),
                Enter.theValue(CELNUMBER).into(CELLNUMBER),
                Click.on(FORMBIRTHDAY),
                Click.on(FORMMONTH),
                Click.on(FORMYEARD),
                Wait.theSeconds(1),
                Click.on(FORMDAY),
                Click.on(FORMHOBBIES),
                Enter.theValue(DEPART).into(FORMSCURRENTADDRES),
                Scroll.to(FORMSCURRENTADDRES),
                Wait.theSeconds(1),
                Click.on(BOTONSUBMIT),
                Wait.theSeconds(1),
                Scroll.to(FORMSVALUES)
        );
    }

    public static Forms form() {
        return instrumented(Forms.class);
    }
}
