package co.com.juju.demoqa.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.Performable;
import org.openqa.selenium.interactions.Actions;

public class RightClick implements Interaction {

    private final Target element;

    public RightClick(Target element) {
        this.element = element;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Actions actions = new Actions(BrowseTheWeb.as(actor).getDriver());
        actions.contextClick(element.resolveFor(actor)).perform();
    }

    public static Performable on(Target element) {
        return new RightClick(element);
    }
}
