package phptravels.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaPrincipal {
    public static final Target TITULO = Target.the("Título de la página principal")
            .located(By.cssSelector("body.pace-done:nth-child(2) div.wrapper:nth-child(8) div.sc-fOKMvo.jboxko.container-fluid:nth-child(8) div.row:nth-child(1) div.col-lg-8.col-md-12 div.sc-fYiAbW.EnZnL h2:nth-child(2) > strong:nth-child(1)"));

    }
