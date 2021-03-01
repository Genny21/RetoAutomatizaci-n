package phptravels.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormularioAddCategory {

    public static final Target NOMBRE_CATEGORIA = Target.the("Campo Nombre de Categoria").located(By.xpath("//body/div[3]/div[1]/div[3]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/input[1]"));

    public static final Target NOMBRE_VIETNAMESE = Target.the("Campo Nombre Vietnamese").located(By.xpath("//body/div[3]/div[1]/div[3]/div[2]/div[1]/form[1]/div[2]/div[3]/div[1]/input[1]"));

    public static final Target NOMBRE_RUSSIAN = Target.the("Campo Nombre Russian").located(By.xpath("//body/div[3]/div[1]/div[3]/div[2]/div[1]/form[1]/div[2]/div[4]/div[1]/input[1]"));

    public static final Target NOMBRE_ARABIC = Target.the("Campo Nombre Arabic").located(By.xpath("//body/div[3]/div[1]/div[3]/div[2]/div[1]/form[1]/div[2]/div[5]/div[1]/input[1]"));

    public static final Target NOMBRE_FARSI = Target.the("Campo Nombre Farsi").located(By.xpath("//body/div[3]/div[1]/div[3]/div[2]/div[1]/form[1]/div[2]/div[6]/div[1]/input[1]"));

    public static final Target NOMBRE_TURKISH = Target.the("Campo Nombre Turkish").located(By.xpath("//body/div[3]/div[1]/div[3]/div[2]/div[1]/form[1]/div[2]/div[7]/div[1]/input[1]"));

    public static final Target NOMBRE_FRENCH = Target.the("Campo Nombre French").located(By.xpath("//body/div[3]/div[1]/div[3]/div[2]/div[1]/form[1]/div[2]/div[8]/div[1]/input[1]"));

    public static final Target NOMBRE_SPANISH = Target.the("Campo Nombre Spanish").located(By.xpath("//body/div[3]/div[1]/div[3]/div[2]/div[1]/form[1]/div[2]/div[9]/div[1]/input[1]"));

    public static final Target NOMBRE_GERMAN = Target.the("Campo Nombre German").located(By.xpath("//body/div[3]/div[1]/div[3]/div[2]/div[1]/form[1]/div[2]/div[10]/div[1]/input[1]"));


    public static final Target BOTON_ADD = Target.the("Boton Agregar Categoria").located(By.xpath("//body/div[3]/div[1]/div[3]/div[2]/div[1]/form[1]/div[3]/button[2]"));



}
