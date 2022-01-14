package uis;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UiBusinessUnit {

    //Boton agregar nueva Unidad de Negocio
    public static final Target BTN_ADD_NEW_BUSINESS_UNIT = Target.the("Boton agregar nueva Unidad de Negocio").locatedBy("//span//i[@class='fa fa-plus-circle text-green']");

    //Caja de texto Name
    public static final Target TXT_NAME = Target.the("Caja de texto Nombre").located(By.id("Serenity_Pro_Organization_BusinessUnitDialog3_Name"));

    //Menu Parent Unit
    public static final Target MENU_PARENT_UNIT = Target.the("Menu Parent Unit").located(By.id("s2id_Serenity_Pro_Organization_BusinessUnitDialog3_ParentUnitId"));

    //Opcion e3r
    public static final Target SELECT_OPTION = Target.the("Opcion e3r").locatedBy("//div[@id='select2-result-label-31']");

    //Boton guardar
    public static final Target BTN_SAVE = Target.the("Boton guardar").locatedBy("//div[@class='tool-button save-and-close-button icon-tool-button']");

}
