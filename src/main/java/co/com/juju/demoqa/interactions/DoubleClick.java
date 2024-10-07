package co.com.juju.demoqa.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick implements Task {

    private final Target element;

    public DoubleClick(Target element) {
        this.element = element;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Actions actions = new Actions(BrowseTheWeb.as(actor).getDriver());
        actions.doubleClick(element.resolveFor(actor)).perform();
    }

    public static DoubleClick on(Target element) {
        return new DoubleClick(element);
    }
}
