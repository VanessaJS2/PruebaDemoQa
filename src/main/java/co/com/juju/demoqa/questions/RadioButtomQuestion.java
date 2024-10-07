package co.com.juju.demoqa.questions;

import co.com.juju.demoqa.userinterfaces.Elements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static co.com.juju.demoqa.userinterfaces.Elements.*;

public class RadioButtomQuestion implements Question {
    @Override
    public Boolean answeredBy(Actor actor) {

        return CHECKBOXSELECCIONADO.resolveFor(actor).getText().
                contains(Elements.getCHECKBOXRADIOBUTON(2).resolveFor(actor).getText());
    }

    public static RadioButtomQuestion validate(){
        return new RadioButtomQuestion();
    }
}