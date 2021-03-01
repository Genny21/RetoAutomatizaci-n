package phptravels.acciones;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;
import phptravels.ui.PaginaListarCategorias;

public class SeleccionarOpcion implements Task {
    private Target menuTarget;
        private static String menuSeleccionado;

    public SeleccionarOpcion(Target menu) {

        this.menuTarget = menu;

    }

    public static Performable blog() {

        menuSeleccionado = "Menu Blog";
        return Instrumented
                .instanceOf(SeleccionarOpcion.class).withProperties(PaginaListarCategorias.MENU_BLOG);
    }

    public static Performable blogCategories() {

        menuSeleccionado = "SubMenu BlogCategories";
        return Instrumented
                .instanceOf(SeleccionarOpcion.class).withProperties(PaginaListarCategorias.SUBMENU_BLOG_CATEGORIES);
    }

    public static Performable addCategories() {

        menuSeleccionado = "Boton add Category";
        return Instrumented
                .instanceOf(SeleccionarOpcion.class).withProperties(PaginaListarCategorias.BOTON_ADD_CATEGORY);
    }



    @Override
    @Step("{0} Selecciona el menu: #menuSeleccionado")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(this.menuTarget));

    }
}
