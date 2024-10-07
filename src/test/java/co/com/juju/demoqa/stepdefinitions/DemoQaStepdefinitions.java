package co.com.juju.demoqa.stepdefinitions;

import co.com.juju.demoqa.interactions.ClickLinkAndValidate;
import co.com.juju.demoqa.questions.*;
import co.com.juju.demoqa.questions.Form;
import co.com.juju.demoqa.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import static co.com.juju.demoqa.tasks.WebTables.webTables;
import static co.com.juju.demoqa.userinterfaces.Elements.LINKSLABELHOME;
import static co.com.juju.demoqa.userinterfaces.Elements.LINKSLABELHOMEDYNAMICLINK;
import static co.com.juju.demoqa.utils.Constants.INPUTEMAIL;
import static co.com.juju.demoqa.utils.Constants.URL;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class DemoQaStepdefinitions {

    @Managed(driver = "chrome")
    WebDriver hisdriver;

    @Before
    public void setThestage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("vane");
    }

    @Dado("^el usuario entra a la pagina de DemoQA$")
    public void elUsuarioEntraALaPaginaDeDemoQA() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://demoqa.com/"));
    }

    @Cuando("^el usuario llena todo el formulario$")
    public void elUsuarioLlenaTodoElFormulario() {
        theActorInTheSpotlight().attemptsTo(TextBox.textBox());
    }

    @Entonces("^el usuario valida la informacion diligenciada$")
    public void elUsuarioValidaLaInformacionDiligenciada() {
        theActorInTheSpotlight().should(seeThat(Form.validate(), Matchers.is(true)));
    }

    //

    @Cuando("^el usuario selecciona las cuatro correspondientes$")
    public void elUsuarioSeleccionaLasCorrespondientes() {
        theActorInTheSpotlight().attemptsTo(CheckBox.checkBox());
    }

    @Entonces("^el usuario valida la informacion elegida$")
    public void elUsuarioValidaLaInformacionElegida() {
        theActorInTheSpotlight().should(seeThat(Toogle.validate(), Matchers.is(true)));
    }

    //
    @Cuando("^el usuario selecciona el primer elemento$")
    public void elUsuarioSeleccionaElPrimerElemento() {
        theActorInTheSpotlight().attemptsTo(RadioButtom.radioButtom());
    }

    @Entonces("^el usuario valida el elemento seleccionado$")
    public void elUsuarioValidaElElementoSeleccionado() {
        theActorInTheSpotlight().should(seeThat(RadioButtomQuestion.validate(), Matchers.is(true)));
    }

    //

    @Cuando("^el usuario adiciona un nuevo registro con data correcta$")
    public void elUsuarioAdicionaUnNuevoRegistroConDataCorrecta() {
        theActorInTheSpotlight().attemptsTo(webTables("addRecord"));
    }

    @Entonces("^el usuario verifica que los detalles del registro sean correctos$")
    public void elUsuarioVerificaQueLosDetallesDelRegistroSeanCorrectos() {
        theActorInTheSpotlight().should(seeThat(WebTablesQuestion.validate(), Matchers.is(true)));
    }

    @Cuando("^el usuario hace una modificacion en el nombre$")
    public void elUsuarioHaceUnaModificacionEnElNombre() {
        theActorInTheSpotlight().attemptsTo(webTables("editRecord"));
    }

    @Entonces("^el usuario verifica la modificacion realizada$")
    public void elUsuarioVerificaLaModificacionRealizada() {
        theActorInTheSpotlight().should(seeThat(WebTablesQuestion.validate(), Matchers.is(true)));
    }


    @Cuando("^el usuario decide eliminar el usuario$")
    public void elUsuarioDecideEliminarElUsuario() {
        theActorInTheSpotlight().attemptsTo(webTables("deleteRecord"));
    }

    @Entonces("^el usuario verifica que no exista el usuario$")
    public void elUsuarioVerificaQueNoExistaElUsuario() {
        theActorInTheSpotlight().should(seeThat(ElementExists.validate(INPUTEMAIL), Matchers.is(false)));
    }

    @Cuando("^el usuario realiza las instrucciones correcta de los botones$")
    public void elUsuarioRealizaLasInstruccionesCorrectaDeLosBotones() {
        theActorInTheSpotlight().attemptsTo(Buttom.buttom("clickderecho"));
        theActorInTheSpotlight().attemptsTo(Buttom.buttom("dobleclick"));
    }

    @Entonces("^el usuario valida que las instrucciones se hayan aplicado correctamente$")
    public void elUsuarioValidaQueLasInstruccionesSeHayanAplicadoCorrectamente() {
        theActorInTheSpotlight().should(seeThat(ButtonQuestion.validate(), Matchers.is(true)));
    }


    @Cuando("^el usuario valida los diferentes links$")
    public void elUsuarioValidaLosDiferentesLinks() {
        theActorInTheSpotlight().attemptsTo(Links.links());
    }

    @Entonces("^el usuario valida las respuestas de los siguientes links$")
    public void elUsuarioValidaLasRespuestasDeLosSiguientesLinks() {
        theActorInTheSpotlight().should(seeThat(LinksQuestion.validate(), Matchers.is(true)));
        theActorInTheSpotlight().should(seeThat( ClickLinkAndValidate.isCorrect(LINKSLABELHOME, URL), Matchers.is(true)));
        theActorInTheSpotlight().should(seeThat( ClickLinkAndValidate.isCorrect(LINKSLABELHOMEDYNAMICLINK, URL), Matchers.is(true)));
    }
//form
    @Cuando("^el usuario llena el formulario correspondiente$")
    public void elUsuarioLlenaElFormularioCorrespondiente() {
        theActorInTheSpotlight().attemptsTo(Forms.form());
    }

    @Entonces("^el usuario valida el formulario$")
    public void elUsuarioValidaElFormulario() {
        theActorInTheSpotlight().should(seeThat(FormularyQuestion.validate(), Matchers.is(true)));
    }

    //alert

    @Cuando("^el usuario hace click en los diferentes modales$")
    public void elUsuarioHaceClickEnLosDiferentesModales() {
        theActorInTheSpotlight().attemptsTo(Alerts.alerts());
    }

    @Entonces("^el usuario valida la alerta$")
    public void elUsuarioValidaLaAlerta() {
        theActorInTheSpotlight().should(seeThat(AlertsQuestions.alertsQuestions(), Matchers.is(true)));
    }
}
