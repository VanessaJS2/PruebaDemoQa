package co.com.juju.demoqa.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Elements
{
    public static final Target INPUTFULLNAMEPATH = Target.the("primer elemento del formulario PARA INGRESAR")
            .located(By.xpath("//input[@id=\"userName\"]"));

    public static final Target INPUTEMAILPATH = Target.the("SEGUNDO elemento del formulario PARA INGRESAR")
            .located(By.xpath("//input[@id=\"userEmail\"]"));

    public static final Target INPUTCURRENTADDRESSPATH = Target.the("tercer elemento del formulario PARA INGRESAR")
            .located(By.xpath("//textarea[@id=\"currentAddress\"]"));

    public static final Target INPUTPERMANENTADDRESSPATH = Target.the("Cuarto elemento del formulario PARA INGRESAR")
            .located(By.xpath(" //textarea[@id=\"permanentAddress\"]"));

    public static final Target Name = Target.the("primer elemento del formulario ingresado")
            .located(By.xpath("//p[@id=\"name\"]"));
    public static final Target EMAIL = Target.the("SEGUNDO elemento del formulario ingresado")
            .located(By.xpath("//p[@id=\"email\"]"));
    public static final Target CURRENTADDRESS = Target.the("TERCER elemento del formulario ingresado")
            .located(By.xpath("//p[@id=\"currentAddress\"]"));
    public static final Target PERMANENTADDRESS = Target.the("CUARTO elemento del formulario ingresado")
            .located(By.xpath("//p[@id=\"permanentAddress\"]"));

    public static final Target BOTONSUBMIT = Target.the("BOTON submit para enviar el formulario diligenciado")
            .located(By.xpath("//button[@id=\"submit\"]"));

    public static final Target CATEGORIAWEBTABLES = Target.the("CATEGORIA web tables")
            .located(By.xpath("//*[text()='Web Tables']"));

    public static final Target CATEGORIATEXTBOX = Target.the("CATEGORIA TEXT BOX")
            .located(By.xpath("//*[text()='Text Box']"));

    public static final Target CATEGORIACHECKBOX = Target.the("CATEGORIA CHECKBOX")
            .located(By.xpath("//*[text()='Check Box']"));
    public static final Target CATEGORIARADIOBUTTOM = Target.the("CATEGORIA RADIO BUTOM")
            .located(By.xpath("//*[text()='Radio Button']"));

    public static final Target CATEGORIALINKS = Target.the("CATEGORIA links")
            .located(By.xpath("//*[text()='Links']"));

    public static Target getToggle(int index) {
        return Target.the("TOGGLE donde estan todos los elementos")
                .located(By.xpath("(//button[@class='rct-collapse rct-collapse-btn'])[" + index + "]"));
    }
    public static final Target HASSELECIONADO = Target.the("Resumen de los elementos seleccionados")
            .located(By.xpath("//div[@id='result']"));


    public static final Target OPCIONNOTES = Target.the("OPCION notes checkbox ")
            .located(By.xpath("//span[text()='Notes']"));
    public static final Target OPCIONCHECKBOX = Target.the("OPCION workspace checkbox ")
            .located(By.xpath("//span[text()='WorkSpace']"));

    public static final Target OPCIONOFFICE = Target.the("OPCION OFFICE checkbox ")
            .located(By.xpath("//span[text()='Office']"));

    public static final Target OPCIONWORDFILE = Target.the("OPCION WORD FILE DOC checkbox ")
        .located(By.xpath("//span[text()='Word File.doc']"));
//  Radio buton

    public static Target getCHECKBOXRADIOBUTON(int index) {
        return Target.the("TOGGLE donde estan todos los elementos")
                .located(By.xpath("(//label[@class='custom-control-label'])[" + index + "]"));
    }
    public static final Target CHECKBOXSELECCIONADO = Target.the("CHECKBOX SELECCIONADO RADIOBUTON")
            .located(By.xpath("//span[@class='text-success']"));
    //web tables
    public static final Target WEBTABLESBUTTOMADD = Target.the("WEB TABLES BOTON ADD")
            .located(By.xpath("//button[@id='addNewRecordButton']"));
    public static final Target WEBTABLESBUTTOMSUBMIT = Target.the("WEB TABLES BOTON SUBMIT PARA ENVIAR FORMULARIO")
            .located(By.xpath("//button[@id='submit']"));
    public static final Target WEBTABLESFORMFIRSTNAME= Target.the("INPUT firstname formulario")
            .located(By.xpath("//input[@id='firstName']"));
    public static final Target WEBTABLESFORMLASTNAME= Target.the("INPUT LASTNAME formulario")
            .located(By.xpath("//input[@id='lastName']"));
    public static final Target WEBTABLESFORMEMAIL= Target.the("INPUT EMAIL formulario")
            .located(By.xpath("//input[@id='userEmail']"));
    public static final Target WEBTABLESFORMAGE= Target.the("INPUT AGE formulario")
            .located(By.xpath("//input[@id='age']"));
    public static final Target WEBTABLESFORMSALARY= Target.the("INPUT SALARY FORMULARIO")
            .located(By.xpath("//input[@id='salary']"));
    public static final Target WEBTABLESFORMDEPARMENT= Target.the("INPUT DEPARMENT FORMULARIO")
            .located(By.xpath("//input[@id='department']"));

    public static Target getWebTablesUser(String text) {
        return Target.the("TOGGLE donde estan todos los elementos")
                .located(By.xpath("//div[@class='rt-tr -even']//*[text()='" + text + "']"));
    }
    public static final Target BOTTONEDITAR= Target.the("BOTON EDITAR DEL REGISTRO")
            .located(By.xpath("//span[@id='edit-record-4']"));
    public static final Target BOTTONELIMINAR= Target.the("BOTON EDITAR DEL REGISTRO")
            .located(By.xpath("//span[@id='delete-record-4']"));
    //buttons
    public static final Target CATEGORIABUTTONS = Target.the("CATEGORIA BUTTONS")
            .located(By.xpath("//*[text()='Buttons']"));
    public static final Target BOTTONSDOBLECLICK = Target.the("CATEGORIA BUTTON DOBLE CLICK")
            .located(By.xpath("//button[@id='doubleClickBtn']"));
    public static final Target BOTTONSCLICKDERECHO = Target.the("CATEGORIA BUTTON CLICK DERECHO")
            .located(By.xpath("//button[@id='rightClickBtn']"));
    public static final Target BOTTONSCLICKME = Target.the("CATEGORIA BUTTON UN SOLO CLICK")
            .located(By.xpath("//*[text()='Click Me']"));

    public static final Target BOTTONSLABELDOBLECLICK = Target.the("SECCION LABEL, BOTONES SELECCIONADOS DOBLE CLICK")
            .located(By.xpath("//p[@id='doubleClickMessage']"));

    public static final Target BOTTONSLABELCLICKDERECHO = Target.the("SECCION LABEL, BOTONES SELECCIONADOS CLICK DERECHO")
            .located(By.xpath("//p[@id='rightClickMessage']"));

    public static final Target BOTTONSLABELCLICKME = Target.the("SECCION LABEL, BOTONES SELECCIONADOS CLICKME")
            .located(By.xpath("//p[@id='dynamicClickMessage']"));

    //links
    public static final Target LINKSLABELHOME = Target.the("OPCION LABEL, HOME")
            .located(By.xpath("//a[@id='simpleLink']"));
    public static final Target LINKSLABELHOMEDYNAMICLINK = Target.the("OPCION LABEL, dynamicLink")
            .located(By.xpath("//a[@id='dynamicLink']"));

    public static final Target LINKSLABELCREATED = Target.the("OPCION LABEL, CREATED")
            .located(By.xpath("//a[@id='created']"));
    public static final Target LINKSLABELNOCONTEN = Target.the("OPCION LABEL, NO CONTENT")
            .located(By.xpath("//a[@id='no-content']"));
    public static final Target LINKSLABELMOVED = Target.the("OPCION LABEL, MOVED")
            .located(By.xpath("//a[@id='moved']"));
    public static final Target LINKSLABELBADREQUEST = Target.the("OPCION LABEL, bad-request")
            .located(By.xpath("//a[@id='bad-request']"));
    public static final Target LINKSLABELUNAUTHORIZED= Target.the("OPCION LABEL, unauthorized")
            .located(By.xpath("//a[@id='unauthorized']"));

    public static final Target LINKSLABELFORBIDDEN= Target.the("OPCION LABEL, forbidden")
            .located(By.xpath("//a[@id='forbidden']"));

    public static final Target LINKSLABELINVALIDURL= Target.the("OPCION LABEL, invalid-url")
            .located(By.xpath("//a[@id='invalid-url']"));

    public static Target getLinkslabelCreatedResponded(int index) {
        return Target.the("TOGGLE donde estan todos los elementos")
                .located(By.xpath("(//p[@id='linkResponse']//b)[" + index + "]"));
    }

}
