package uis;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.FindElement;

public class UiMeetings {

    //Boton de reunion
    public static final Target BTN_MEETING = Target.the("Boton reunion").locatedBy("//a[@href='#nav_menu1_3_2']//span[contains(.,'Reunion')]");

    //Boton de reuniones
    public static final Target BTN_MEETINGS = Target.the("Boton reuniones").locatedBy("//a[@href='/demo/Meeting/Meeting']");

    //Boton de crear reunion
    public static final Target BTN_NEW_MEETING = Target.the("Boton crea reuniones").locatedBy("//span[contains(text(),'Nuevo Meeting')]");

    //Caja de texto meeting name
    public static final Target TXT_MEETING_NAME = Target.the("Caja de texto meeting name").located(By.id("Serenity_Pro_Meeting_MeetingDialog10_MeetingName"));

    //Boton editar tipo de reunion
    public static final Target BTN_EDIT_MEETING_TYPE = Target.the("Boton editar tipo de reunion").locatedBy("//a[@title='Editar']");

    //Caja de texto tipo de reunion
    public static final Target TXT_MEETING_TYPE = Target.the("Caja de texto fecha de inicio").located(By.id("Serenity_Pro_Meeting_MeetingTypeDialog33_Name"));

    //Boton guardar ventana emergente
    public static final Target BTN_SAVE_INFORMATION = Target.the("Boton guardar ventana emergente").locatedBy("(//span[contains(text(),'Guardar')])[last()]");

    //Texto Start Date
    public static final Target TXT_START_DATE = Target.the("Caja de texto fecha de inicio").located(By.id("Serenity_Pro_Meeting_MeetingDialog10_StartDate"));

    //Texto End Date
    public static final Target TXT_END_DATE = Target.the("Caja de texto fecha de inicio").located(By.id("Serenity_Pro_Meeting_MeetingDialog10_EndDate"));


    //Menu desplegable Hour Start Date
    public static final Target SELECT_START_DATE_MENU = Target.the("Despegable hora de inicio").locatedBy("//select[@class='editor s-DateTimeEditor time']");

    //Opcion hora elegida
    public static final Target SELECT_START_DATE_HOUR = Target.the("Seleccionar hora de inicio").locatedBy("//select[@class='editor s-DateTimeEditor time']//option[@value='{0}']");

    //Menu desplegable Hour Start Date
    public static final Target SELECT_END_DATE_MENU = Target.the("Despegable hora de fin").locatedBy("//div[@class='field EndDate col-sm-6']//select");

    //Opcion hora elegida
    public static final Target SELECT_END_DATE_HOUR = Target.the("Seleccionar hora de fin").locatedBy("//div[@class='field EndDate col-sm-6']//select//option[@value='{0}']");

    //Boton editar locacion
    public static final Target BTN_EDIT_LOCATION = Target.the("Boton editar locacion").locatedBy("(//a[@class='inplace-button inplace-create' and @title='Definir Nuevo'])[last()-4]");

    //Caja de texto name
    public static final Target TXT_NAME_LOCATION = Target.the("Texto nombre de la localizacion").locatedBy("//input[@name='Name']");

    //Caja de texto Address
    public static final Target TXT_ADDRESS_LOCATION = Target.the("Texto direccion").locatedBy("//input[@name='Address']");

    //Caja de texto Latitude
    public static final Target TXT_LATITUDE_LOCATION = Target.the("Texto latitud").locatedBy("//input[@name='Latitude']");

    //Caja de texto Latitude
    public static final Target TXT_LONGITUDE_LOCATION = Target.the("Texto longitud").locatedBy("//input[@name='Longitude']");

    //Boton editar organizador
    public static final Target BTN_EDIT_ORGANIZED_BY = Target.the("Boton editar orginazado por").locatedBy("(//a[@class='inplace-button inplace-create' and @title='Definir Nuevo'])[last()-2]");

    //Caja de texto Titulo
    public static final Target TXT_TITLE_ORGANIZED_BY = Target.the("Texto titulo").locatedBy("//input[@name='Title']");

    //Caja de texto nombre
    public static final Target TXT_FIRST_NAME_ORGANIZED_BY = Target.the("Texto nombre").locatedBy("//input[@name='FirstName']");

    //Caja de texto apellido
    public static final Target TXT_LAST_NAME_ORGANIZED_BY = Target.the("Texto apellido").locatedBy("//input[@name='LastName']");

    //Caja de texto email
    public static final Target TXT_EMAIL_ORGANIZED_BY = Target.the("Texto email").locatedBy("//input[@name='Email']");

    //Caja de texto numero de identificacion
    public static final Target TXT_IDENTITY_NUMBER_ORGANIZED_BY = Target.the("Texto numero de identificacion").locatedBy("//input[@name='IdentityNo']");

    //Menu usario
    public static final Target MENU_USER_ORGANIZED_BY = Target.the("Menu de usuario").locatedBy("(//div//a//span[@class='select2-arrow'])[last()]");

    //Opcion admin
    public static final Target OPTION_ADMIN_ORGANIZED_BY = Target.the("Opcion de admin").locatedBy("//div[contains(text(),'admin')]");



    //Boton editar reportador
    public static final Target BTN_EDIT_REPORTER = Target.the("Boton editar reporter").locatedBy("(//a[@class='inplace-button inplace-create' and @title='Definir Nuevo'])[last()-1]");

    //Boton editar attendee List
    public static final Target BTN_EDIT_ATTENDEE_LIST= Target.the("Boton editar lista de asistentes").locatedBy("(//a[@class='inplace-button inplace-create' and @title='Definir Nuevo'])[last()]");

    //Boton guardar reunion
    public static final Target BTN_SAVE_MEETING = Target.the("Boton guardar reunion").locatedBy("//div//span[contains(text(),' Guardar')]");

    //Caja de texto Meeting Number
    public static final Target TXT_MEETING_NUMBER = Target.the("Caja de texto numero de reunion").located(By.id("Serenity_Pro_Meeting_MeetingDialog10_MeetingNumber"));

    //Menu desplegable Unit
    public static final Target MENU_UNIT = Target.the("Menu despegable Unidad").locatedBy("(//div[@id='s2id_Serenity_Pro_Meeting_MeetingDialog10_UnitId']//span)[last()]");

    //Opcion Unit
    public static final Target OPTION_UNIT = Target.the("Opcion Unit").locatedBy("(//*[contains(.,'{0}')])[last()]");


    //Opcion Unit
    public static final Target TXT_VALIDATION = Target.the("Validacion de la reunion por nombre").locatedBy("//a[contains(.,'{0}')]");

}
