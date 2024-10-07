package co.com.juju.demoqa.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/elements.feature",
        glue = "co.com.juju.demoqa.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class DemoQA {
}
