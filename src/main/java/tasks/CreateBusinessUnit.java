package tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import uis.UiBusinessUnit;
import uis.UiHome;

public class CreateBusinessUnit implements Task{

    private final String name;

    public CreateBusinessUnit(String name){
        this.name = name;
    }

    @Override
    public <T extends Actor>void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UiHome.BTN_ORGANIZACION),
                Click.on(UiHome.BTN_UNIDADES_NEGOCIO),
                Click.on(UiBusinessUnit.BTN_ADD_NEW_BUSINESS_UNIT),
                Enter.theValue(name).into(UiBusinessUnit.TXT_NAME),
                Click.on(UiBusinessUnit.BTN_SAVE)
        );
    }

    public static CreateBusinessUnit inSerenity(String name){
        return Instrumented.instanceOf(CreateBusinessUnit.class).withProperties(name);
    }

}
