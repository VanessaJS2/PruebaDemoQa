package co.com.juju.demoqa.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class ClickLinkAndValidate implements Question<Boolean> {

    private final Target link;
    private final String expectedUrl;

    public ClickLinkAndValidate(Target link, String expectedUrl) {
        this.link = link;
        this.expectedUrl = expectedUrl;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        actor.attemptsTo(Click.on(link));
        // Obtener todas las pestañas abiertas
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String actualUrl = driver.getCurrentUrl();
        boolean isUrlCorrect = actualUrl.equals(expectedUrl);
        driver.close();
        driver.switchTo().window(tabs.get(0));
        return isUrlCorrect;
    }

    public static ClickLinkAndValidate isCorrect(Target link, String expectedUrl) {
        return new ClickLinkAndValidate(link, expectedUrl);
    }
}
