package phptravels.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaLogin {
    public static final Target  EMAIL = Target.the("Entrada de email").located(By.xpath("//body/div[2]/form[1]/div[1]/label[1]/input[1]"));
    public static final Target  PASSWORD = Target.the("Entrada de contraseña").located(By.xpath("//body/div[2]/form[1]/div[1]/label[2]/input[1]"));
    public static final Target  BOTON_SIGN_IN = Target.the("Boton de iniciar sesion").located(By.xpath("//body/div[2]/form[1]/button[1]"));
}
