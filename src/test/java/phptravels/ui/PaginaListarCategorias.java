package phptravels.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaListarCategorias {

    public static final Target MENU_BLOG = Target.the("Menu Blog en pagina principal").located(By.xpath("//body/div[3]/nav[1]/div[2]/ul[1]/li[14]/a[1]"));

    public static final Target SUBMENU_BLOG_CATEGORIES = Target.the("SubMenu BlogCategories en pagina principal").located(By.xpath("//a[contains(text(),'Blog Categories')]"));

    public static final Target BOTON_ADD_CATEGORY = Target.the("Boton Add Categories en pagina principal").located(By.xpath("//body/div[3]/div[1]/div[2]/div[2]/div[1]/button[1]"));

    public static final Target BOTON_SEARCH = Target.the("Boton Search Categories en pagina principal").located(By.xpath("//a[contains(text(),'Search')]"));

    public static final Target INGRESAR_VALOR = Target.the("Campo para ingresar valor de categoria en pagina principal").located(By.xpath("//body/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/span[1]/input[1]"));

    public static final Target BOTON_GO = Target.the("Boton Go Categories en pagina principal").located(By.xpath("//a[contains(text(),'Go')]"));

}
