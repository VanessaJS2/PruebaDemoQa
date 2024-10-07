package co.com.juju.demoqa.tasks;

import co.com.juju.demoqa.interactions.Wait;
import co.com.juju.demoqa.userinterfaces.Elements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import static co.com.juju.demoqa.userinterfaces.Elements.*;
import static co.com.juju.demoqa.userinterfaces.HomePage.CATEGORIATEXTBOX;
import static co.com.juju.demoqa.userinterfaces.HomePage.SEGUNDOBLOQUEHOME;
import static co.com.juju.demoqa.utils.Constants.*;
import net.serenitybdd.screenplay.actions.Scroll;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class TextBox implements Task {
    @Override
    public <T extends Actor> void performAs(T vanessa) {

        vanessa.attemptsTo(
                Scroll.to((SEGUNDOBLOQUEHOME)),
                Click.on(CATEGORIATEXTBOX),
                Wait.theSeconds(1),
                Click.on(Elements.CATEGORIATEXTBOX),
                Wait.theSeconds(1),
                Scroll.to((CATEGORIAWEBTABLES)),
                Wait.theSeconds(1),
                Enter.theValue(FULLNAME).into((INPUTFULLNAMEPATH)),
                Wait.theSeconds(1),
                Enter.theValue(INPUTEMAIL).into(INPUTEMAILPATH),
                Wait.theSeconds(1),
                Enter.theValue(INPUTADDRESS).into(INPUTCURRENTADDRESSPATH),
                Wait.theSeconds(1),
                Enter.theValue(INPUTADDRESS).into(INPUTPERMANENTADDRESSPATH),
                Wait.theSeconds(1),
                Scroll.to(INPUTPERMANENTADDRESSPATH),
                Wait.theSeconds(1),
                Click.on(BOTONSUBMIT),
                Wait.theSeconds(1)
           );
    }

    public static TextBox textBox() {
        return instrumented(TextBox.class);
    }
}
