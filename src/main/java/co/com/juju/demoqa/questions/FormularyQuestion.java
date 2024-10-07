package co.com.juju.demoqa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static co.com.juju.demoqa.userinterfaces.FormUI.getDataForm;
import static co.com.juju.demoqa.utils.Constants.*;

public class FormularyQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return getDataForm(FIRSNAME).resolveFor(actor).isPresent()&&
                getDataForm(LASTNAME).resolveFor(actor).isPresent()&&
                getDataForm(INPUTEMAIL).resolveFor(actor).isPresent()&&
                getDataForm(FEMALE).resolveFor(actor).isPresent()&&
                getDataForm(CELNUMBER).resolveFor(actor).isPresent()&&
                getDataForm(BIRTHDAY).resolveFor(actor).isPresent()&&
                getDataForm(HOBBIES).resolveFor(actor).isPresent()&&
                getDataForm(DEPART).resolveFor(actor).isPresent()
                ;
    }

    public static FormularyQuestion validate(){
        return new FormularyQuestion();
    }
}
