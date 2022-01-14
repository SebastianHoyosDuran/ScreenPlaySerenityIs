package stepsDefinitions;

import cucumber.api.java.en.*;
import driver.GoogleChromeDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import org.junit.Assert;
import tasks.CreateBusinessUnit;
import tasks.CreateMeeting;
import tasks.DoLogin;
import uis.UiMeetings;

public class CreateNewMeetingStepsDefinitions {

    Actor actor = new Actor("Sebastian");

    //==========================
    @Given("^que me encuentro en la pagina de serenity$")
    public void queMeEncuentroEnLaPaginaDeSerenity() {
        actor.can(BrowseTheWeb.with(GoogleChromeDriver.ChromeHisBrowserWeb().on("https://serenity.is/demo/")));

    }

    @When("^me loguee en la pagina$")
    public void meLogueeEnLaPagina() {
        actor.attemptsTo(DoLogin.conCredenciales("admin","serenity"));
    }

    @When("^cree una nueva Unidad de Negocio con un (.*)$")
    public void creeUnaNuevaUnidadDeNegocioConUnBussinesUnitNumberOne(String nombreUnidad) {
        actor.attemptsTo(CreateBusinessUnit.inSerenity(nombreUnidad));
    }

    @When("^programe una nueva reunion con la unidad de negocio (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*)$")
    public void programeUnaNuevaReunionConLaUnidadDeNegocioBussinesUnitNumberOne(String nombreUnidad,String nombreDeReunion,String tipoDeReunion,String numeroDeReunion,String fechaDeInicio,String fechaDeFin,String horaDeInicio,String horaDeFin) {
        actor.attemptsTo(CreateMeeting.conInformacion(nombreUnidad,nombreDeReunion,tipoDeReunion,numeroDeReunion,fechaDeInicio,fechaDeFin,horaDeInicio,horaDeFin));
    }

    @Then("^podre validar que la reunion se creo satisfactoriamente (.*)$")
    public void podreValidarQueLaReunionSeCreoSatisfactoriamente(String numeroReunion) {
        actor.should(GivenWhenThen.seeThat(WebElementQuestion.the(UiMeetings.TXT_VALIDATION.of("Propuesta")), WebElementStateMatchers.containsText("Propuesta")));
    }


}
