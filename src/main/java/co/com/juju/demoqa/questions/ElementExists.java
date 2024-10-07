package co.com.juju.demoqa.questions;

import co.com.juju.demoqa.userinterfaces.Elements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ElementExists implements Question<Boolean> {

    private final String fieldName;

    public ElementExists(String fieldName) {
        this.fieldName = fieldName;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Elements.getWebTablesUser(fieldName).resolveFor(actor).isPresent();
    }

    public static ElementExists validate(String fieldName) {
        return new ElementExists(fieldName);
    }

}