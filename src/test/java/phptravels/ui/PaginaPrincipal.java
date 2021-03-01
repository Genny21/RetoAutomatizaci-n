package phptravels.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaPrincipal {
    public static final Target TITULO = Target.the("Título de la página principal")
            .located(By.cssSelector("body.pace-done:nth-child(2) div.wrapper:nth-child(8) div.sc-fOKMvo.jboxko.container-fluid:nth-child(8) div.row:nth-child(1) div.col-lg-8.col-md-12 div.sc-fYiAbW.EnZnL h2:nth-child(2) > strong:nth-child(1)"));

    public static final Target MENU_BLOG = Target.the("Menu Blog en pagina principal").located(By.xpath("//body/div[3]/nav[1]/div[2]/ul[1]/li[14]/a[1]"));

    public static final Target SUBMENU_BLOG_CATEGORIES = Target.the("SubMenu BlogCategories en pagina principal").located(By.xpath("//a[contains(text(),'Blog Categories')]"));

    public static final Target BOTON_ADD_CATEGORY = Target.the("Boton Add Categories en pagina principal").located(By.xpath("//body/div[3]/div[1]/div[2]/div[2]/div[1]/button[1]"));


}
