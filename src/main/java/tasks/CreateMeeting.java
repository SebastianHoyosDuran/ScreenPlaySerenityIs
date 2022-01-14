package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import uis.UiMeetings;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CreateMeeting implements Task{

    private final String nombreUnidad;
    private final String nombreDeReunion;
    private final String tipoDeReunion;
    private final String numeroDeReunion;
    private final String fechaDeInicio;
    private final String fechaDeFin;
    private final String horaDeInicio;
    private final String horaDeFin;


    public CreateMeeting( String nombreUnidad, String nombreDeReunion, String tipoDeReunion, String numeroDeReunion, String fechaDeInicio, String fechaDeFin, String horaDeInicio, String horaDeFin){
        this.nombreUnidad = nombreUnidad;
        this.nombreDeReunion = nombreDeReunion;
        this.tipoDeReunion = tipoDeReunion;
        this.numeroDeReunion = numeroDeReunion;
        this.fechaDeInicio = fechaDeInicio;
        this.fechaDeFin = fechaDeFin;
        this.horaDeInicio = horaDeInicio;
        this.horaDeFin = horaDeFin;
    }

    public static  CreateMeeting conInformacion(String nombreUnidad, String nombreDeReunion, String tipoDeReunion, String numeroDeReunion, String fechaDeInicio, String fechaDeFin, String horaDeInicio, String horaDeFin){
        return instrumented(CreateMeeting.class, nombreUnidad , nombreDeReunion,tipoDeReunion,numeroDeReunion,fechaDeInicio, fechaDeFin,horaDeInicio,horaDeFin);
    }


    @Override
    public <T extends Actor>void performAs(T actor){
        actor.attemptsTo(
                //Ir a la ventana
               Click.on(UiMeetings.BTN_MEETING),
                Click.on(UiMeetings.BTN_MEETINGS),
                Click.on(UiMeetings.BTN_NEW_MEETING)
        );

        actor.attemptsTo(
                //Agregar nombre de reunion
                Enter.theValue("Propuesta").into(UiMeetings.TXT_MEETING_NAME)
        );
        actor.attemptsTo(
                //Meeting Type
                Click.on(UiMeetings.BTN_EDIT_MEETING_TYPE),
                Enter.theValue(tipoDeReunion).into(UiMeetings.TXT_MEETING_TYPE),
                Click.on(UiMeetings.BTN_SAVE_INFORMATION)


        );
        actor.attemptsTo(
                //Meeting Number
                Enter.theValue(numeroDeReunion).into(UiMeetings.TXT_MEETING_NUMBER)
        );
        actor.attemptsTo(
                //Start and end dates
                Clear.field(UiMeetings.TXT_START_DATE),
                Clear.field(UiMeetings.TXT_END_DATE),
                Enter.theValue(fechaDeInicio).into(UiMeetings.TXT_START_DATE),
                Enter.theValue(fechaDeFin).into(UiMeetings.TXT_END_DATE)
        );
        actor.attemptsTo(
                //Start and end Hours
                Click.on(UiMeetings.SELECT_START_DATE_MENU),
                Click.on(UiMeetings.SELECT_START_DATE_HOUR.of(horaDeInicio)),
                Click.on(UiMeetings.SELECT_END_DATE_MENU),
                Click.on(UiMeetings.SELECT_END_DATE_HOUR.of(horaDeFin))
        );
        actor.attemptsTo(
                //Meeting Location
                Click.on(UiMeetings.BTN_EDIT_LOCATION),
                Enter.theValue("Bogota").into(UiMeetings.TXT_NAME_LOCATION),
                Enter.theValue("Calle 123 - 45 - 67").into(UiMeetings.TXT_ADDRESS_LOCATION),
                Enter.theValue("123").into(UiMeetings.TXT_LATITUDE_LOCATION),
                Enter.theValue("456").into(UiMeetings.TXT_LONGITUDE_LOCATION),
                Click.on(UiMeetings.BTN_SAVE_INFORMATION)
                );
        actor.attemptsTo(
                //Unit
                Click.on(UiMeetings.MENU_UNIT),
                Click.on(UiMeetings.OPTION_UNIT.of("Unidad de Negocio"))
        );
        actor.attemptsTo(
                //Organized By
                Click.on(UiMeetings.BTN_EDIT_ORGANIZED_BY),
                Enter.theValue("Gerente TI").into(UiMeetings.TXT_TITLE_ORGANIZED_BY),
                Enter.theValue("Juan").into(UiMeetings.TXT_FIRST_NAME_ORGANIZED_BY),
                Enter.theValue("Carlos").into(UiMeetings.TXT_LAST_NAME_ORGANIZED_BY),
                Enter.theValue("jc@emailmagneto365.com").into(UiMeetings.TXT_EMAIL_ORGANIZED_BY),
                Enter.theValue("112233").into(UiMeetings.TXT_IDENTITY_NUMBER_ORGANIZED_BY),
                Click.on(UiMeetings.MENU_USER_ORGANIZED_BY),
                Click.on(UiMeetings.OPTION_ADMIN_ORGANIZED_BY),
                Click.on(UiMeetings.BTN_SAVE_INFORMATION)
        );
        actor.attemptsTo(
                //Reporter
                Click.on(UiMeetings.BTN_EDIT_REPORTER),
                Enter.theValue("Reportero").into(UiMeetings.TXT_TITLE_ORGANIZED_BY),
                Enter.theValue("Marian").into(UiMeetings.TXT_FIRST_NAME_ORGANIZED_BY),
                Enter.theValue("Gonzales").into(UiMeetings.TXT_LAST_NAME_ORGANIZED_BY),
                Enter.theValue("mg@gmail.com").into(UiMeetings.TXT_EMAIL_ORGANIZED_BY),
                Enter.theValue("859102").into(UiMeetings.TXT_IDENTITY_NUMBER_ORGANIZED_BY),
                Click.on(UiMeetings.MENU_USER_ORGANIZED_BY),
                Click.on(UiMeetings.OPTION_ADMIN_ORGANIZED_BY),
                Click.on(UiMeetings.BTN_SAVE_INFORMATION)
        );

        actor.attemptsTo(
                //Attendee list
                Click.on(UiMeetings.BTN_EDIT_ATTENDEE_LIST),
                Enter.theValue("Cliente").into(UiMeetings.TXT_TITLE_ORGANIZED_BY),
                Enter.theValue("Laura").into(UiMeetings.TXT_FIRST_NAME_ORGANIZED_BY),
                Enter.theValue("Pastor").into(UiMeetings.TXT_LAST_NAME_ORGANIZED_BY),
                Enter.theValue("laurapa@gmail.com").into(UiMeetings.TXT_EMAIL_ORGANIZED_BY),
                Enter.theValue("637192").into(UiMeetings.TXT_IDENTITY_NUMBER_ORGANIZED_BY),
                Click.on(UiMeetings.MENU_USER_ORGANIZED_BY),
                Click.on(UiMeetings.OPTION_ADMIN_ORGANIZED_BY),
                Click.on(UiMeetings.BTN_SAVE_INFORMATION)
        );

        actor.attemptsTo(
                //Guardar
                Click.on(UiMeetings.BTN_SAVE_MEETING),
                Click.on(UiMeetings.BTN_MEETINGS)
        );

    }

}
