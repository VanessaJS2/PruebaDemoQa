package co.com.juju.demoqa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static co.com.juju.demoqa.userinterfaces.Elements.*;
import static co.com.juju.demoqa.utils.Constants.*;

public class Toogle implements Question {
    @Override
    public Boolean answeredBy(Actor actor) {

        return HASSELECIONADO.resolveFor(actor).getText().contains(NOTES)&&
                HASSELECIONADO.resolveFor(actor).getText().contains(WORKSPACE)&&
                HASSELECIONADO.resolveFor(actor).getText().contains(OFFICE)&&
                HASSELECIONADO.resolveFor(actor).getText().contains(WORDFILE);
    }

    public static Toogle validate(){
        return new Toogle();
    }
}