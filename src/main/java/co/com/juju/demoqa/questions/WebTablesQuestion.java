package co.com.juju.demoqa.questions;

import co.com.juju.demoqa.userinterfaces.Elements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static co.com.juju.demoqa.utils.Constants.*;

public class WebTablesQuestion implements Question {
    @Override
    public Boolean answeredBy(Actor actor) {

        return Elements.getWebTablesUser(FIRSNAME).resolveFor(actor).getText().contains(FIRSNAME)&&
                Elements.getWebTablesUser(LASTNAME).resolveFor(actor).getText().contains(LASTNAME)&&
                Elements.getWebTablesUser(AGE).resolveFor(actor).getText().contains(AGE)&&
                Elements.getWebTablesUser(INPUTEMAIL).resolveFor(actor).getText().contains(INPUTEMAIL)&&
                Elements.getWebTablesUser(SALARY).resolveFor(actor).getText().contains(SALARY)&&
                Elements.getWebTablesUser(DEPART).resolveFor(actor).getText().contains(DEPART);
    }

    public static WebTablesQuestion validate(){
        return new WebTablesQuestion();
    }
}