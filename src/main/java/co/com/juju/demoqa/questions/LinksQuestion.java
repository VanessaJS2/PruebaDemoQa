package co.com.juju.demoqa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.juju.demoqa.utils.Constants.ConstLinkHasResponded;

public class LinksQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        String LinkHasResponded = actor.recall("LinkHasResponded").toString();
        return LinkHasResponded.equals(ConstLinkHasResponded);
    }
    public static LinksQuestion validate(){
        return new LinksQuestion();
    }
}
