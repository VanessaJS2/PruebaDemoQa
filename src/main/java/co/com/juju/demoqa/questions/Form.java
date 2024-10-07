package co.com.juju.demoqa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static co.com.juju.demoqa.userinterfaces.Elements.*;
import static co.com.juju.demoqa.utils.Constants.*;

public class Form implements Question {//TEXTBOX
    @Override
    public Boolean answeredBy(Actor actor) {

        return Name.resolveFor(actor).getText().contains(FULLNAME)&&
                EMAIL.resolveFor(actor).getText().contains(INPUTEMAIL)&&
                CURRENTADDRESS.resolveFor(actor).getText().contains(INPUTADDRESS)&&
                PERMANENTADDRESS.resolveFor(actor).getText().contains(INPUTADDRESS);
    }

    public static Form validate(){
        return new Form();
    }
}
