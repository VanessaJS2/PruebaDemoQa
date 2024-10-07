package co.com.juju.demoqa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static co.com.juju.demoqa.utils.Constants.*;

public class AlertsQuestions implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String smallBody = actor.recall("bodysmallAlerts").toString();
        String largeBody = actor.recall("bodyLargeAlerts").toString();
        return smallBody.equals(TEXTSMALLBODY)&&
                largeBody.equals(TEXTLARGEBODY);}

    public static AlertsQuestions alertsQuestions(){
        return new AlertsQuestions();
    }
}
