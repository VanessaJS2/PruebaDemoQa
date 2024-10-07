package co.com.juju.demoqa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static co.com.juju.demoqa.userinterfaces.Elements.*;
import static co.com.juju.demoqa.utils.Constants.*;

public class ButtonQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return BOTTONSLABELDOBLECLICK.resolveFor(actor).getText().contains(TEXTOESPERADODOBLECLICK)&&
                BOTTONSLABELCLICKDERECHO.resolveFor(actor).getText().contains(TEXTOESPERADOCLICKDERECHO)&&
                BOTTONSLABELCLICKME.resolveFor(actor).getText().contains(TEXTOESPERADOCLICKME);
    }

    public static ButtonQuestion validate(){
        return new ButtonQuestion();
    }
}
