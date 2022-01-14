package uis;

import net.serenitybdd.screenplay.targets.Target;

public class UiHome {

    //Boton desplegar menu
    public static final Target BTN_ABLE_MENU = Target.the("Boton desplegar menu").locatedBy("//i[@class='s-sidebar-band-icon fa fa-angle-double-left']");


    //Boton cambiar idioma
    public static final Target BTN_SWITCH_LANGUAGE = Target.the("Boton cambiar lenguaje").locatedBy("//i[@class='s-sidebar-band-icon fa fa-language']");

    // Boton cambiar a español
    public static final Target BTN_SWITCH_LANGUAGE_SPANISH = Target.the("Boton cambiar lenguaje a español").locatedBy("//ul[@class='dropdown-menu s-language-selection-menu show']//li//a[@class='dropdown-item' and @data-language='es' and contains(.,'Spanish')]");

    // Boton desplegar Organizacion
    public static final Target BTN_ORGANIZACION = Target.the("Boton desplegar Organizacion").locatedBy("//li[@class='s-sidebar-item has-children']//a[@href='#nav_menu1_3_1']");

    // Boton unidades de Negocio
    public static final Target BTN_UNIDADES_NEGOCIO = Target.the("Boton Unidades de Negocio").locatedBy("//a[@class='s-sidebar-link' and @href='/demo/Organization/BusinessUnit']");

}
