package co.com.juju.demoqa.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class FormUI {

    public static final Target CATEGORIAPRACTICEFORM = Target.the("CATEGORIA web tables")
            .located(By.xpath("//*[text()='Practice Form']"));
    public static final Target FORMRADIOBUTONFEMALE= Target.the("Form radio buton mujer")
            .located(By.xpath("(//div[@class='custom-control custom-radio custom-control-inline'])[2]"));
    //FORMS
    public static final Target FORMSCURRENTADDRES= Target.the("OPCION FORM, CURRENTADRRES")
            .located(By.xpath("//*[@id='currentAddress']"));

    public static Target getDataForm(String text) {
        return Target.the("TOGGLE donde estan todos los elementos")
                .located(By.xpath("//*[contains(text(), '" + text + "')]"));
    }
    public static final Target BOTONSUBMIT = Target.the("BOTON submit para enviar el formulario diligenciado")
            .located(By.xpath("//button[@id=\"submit\"]"));

    public static final Target FORMSVALUES = Target.the("PARAMETRO COLUMNA FORMSVALUES")
            .located(By.xpath("//*[text()='Values']"));

    public static final Target CELLNUMBER = Target.the("INPUT DEL CELLNUMBER")
            .located(By.xpath( "//input[@id='userNumber']"));

    public static final Target FORMBIRTHDAY = Target.the("INPUT DEL BITHDAY")
            .located(By.xpath( "//input[@id='dateOfBirthInput']"));

    public static final Target FORMMONTH = Target.the("INPUT DEL BITHDAY FORMMONTH")
            .located(By.xpath( "//option[text()='January']"));

    public static final Target FORMYEARD = Target.the("INPUT DEL BITHDAY FORMYEARD")
            .located(By.xpath( "//option[text()='1994']"));

    public static final Target FORMDAY = Target.the("INPUT DEL BITHDAY FORMDAY")
            .located(By.xpath( "(//div[text()='30'])[2]"));

    public static final Target FORMHOBBIES = Target.the("INPUT DEL BITHDAY READING")
            .located(By.xpath(  "//*[text()='Reading']"));

}
