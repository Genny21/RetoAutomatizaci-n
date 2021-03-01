package phptravels.preguntas;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import phptravels.ui.PaginaPrincipal;

public class LaPaginaPrincipal {
    public static Question<String> titulo() {
        return actor -> Text.of(PaginaPrincipal.TITULO)
                .viewedBy(actor).asString();
    }
}
