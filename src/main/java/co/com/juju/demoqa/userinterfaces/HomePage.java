package co.com.juju.demoqa.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static final Target CATEGORIATEXTBOX = Target.the("Primera categoría de pruebas")
            .located(By.xpath("(//div[@class='card-up'])[1]"));

    public static final Target CATEGORIAFORM = Target.the("SEGUNDA categoría de pruebas")
            .located(By.xpath("(//div[@class='card-up'])[2]"));

    public static final Target CATEGORIALERTS = Target.the("TERCERA categoría de pruebas")
            .located(By.xpath("(//div[@class='card-up'])[3]"));

    public static final Target SEGUNDOBLOQUEHOME = Target.the("Sección contenedora de las categorias")
            .located(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div"));

    public static final Target TERCERCATEGORIALERTS = Target.the("TERCERA CATEGORIA ALERTS")
            .located(By.xpath("//*[text()='Alerts, Frame & Windows']"));

}
