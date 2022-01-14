package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import uis.UiHome;
import uis.UiLogin;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoLogin implements Task{

    private final String user;
    private final String password;

    public DoLogin( String user, String password){
        this.user = user;
        this.password = password;
    }

    public static  DoLogin conCredenciales(String user, String password){
        return instrumented(DoLogin.class, user , password);
    }

    @Override
    public <T extends Actor>void performAs(T actor){
        actor.attemptsTo(
                Clear.field(UiLogin.TXT_USER),
                Clear.field(UiLogin.TXT_PASSWORD),
                Enter.theValue(user).into(UiLogin.TXT_USER),
                Enter.theValue(password).into(UiLogin.TXT_PASSWORD),
                Click.on(UiLogin.BTN_SIGN_IN),
                //
                Click.on(UiHome.BTN_SWITCH_LANGUAGE),
                Click.on(UiHome.BTN_SWITCH_LANGUAGE_SPANISH)

        );
    }
}
