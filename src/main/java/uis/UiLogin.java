package uis;

import net.serenitybdd.screenplay.targets.Target;

public class UiLogin {

    //Caja de texto Usuario
    public static final Target TXT_USER = Target.the("Caja de texto User").locatedBy("//input[@id='StartSharp_Membership_LoginPanel0_Username']");


    //Caja de texto Contraseña
    public static final Target TXT_PASSWORD = Target.the("Caja de texto Password").locatedBy("//input[@id='StartSharp_Membership_LoginPanel0_Password']");


    // Boton Ingresar
    public static final Target BTN_SIGN_IN = Target.the("Boton Sign in").locatedBy("//button[@id='StartSharp_Membership_LoginPanel0_LoginButton']");

}
