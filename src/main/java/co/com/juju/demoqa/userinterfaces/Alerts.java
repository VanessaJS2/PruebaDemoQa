package co.com.juju.demoqa.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Alerts {
    public static final Target CATEGORIAALERTSMODAL = Target.the("CATEGORIA ALERT MODAL")
            .located(By.xpath("//*[text()='Modal Dialogs']"));

    public static final Target BUTTOMSMALLMODAL = Target.the("Boton small modal de alert modal")
            .located(By.xpath("//button[@id='showSmallModal']"));

    public static final Target BUTTOMLARGEMODAL = Target.the("Boton LARGE modal de alert modal")
            .located(By.xpath("//button[@id='showLargeModal']"));

    public static final Target BUTTONCLOSEALERTS = Target.the("BOTON PARA CERRAR ALERTA")
            .located(By.xpath("//button[@class='btn btn-primary']"));

    public static final Target TEXTOBODY = Target.the("BOTON PARA CERRAR ALERTA")
            .located(By.xpath("//div[@class='modal-body']"));

}
