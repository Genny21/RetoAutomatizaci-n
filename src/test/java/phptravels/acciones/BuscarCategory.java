package phptravels.acciones;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;
import phptravels.ui.PaginaListarCategorias;

public class BuscarCategory implements Task {
    private Target botonTarget;
    private Target botonGo;
    private static String botonSeleccionado;
    private  String valorBuscar;

    public BuscarCategory(Target botonTarget, Target botonGo, String valorBuscar) {
        this.botonTarget = botonTarget;
        this.botonGo = botonGo;
        this.valorBuscar = valorBuscar;
    }

    public static Performable search(String valorBuscar){
        botonSeleccionado = "Boton Search";
        return Instrumented
                .instanceOf(BuscarCategory.class).withProperties(PaginaListarCategorias.BOTON_SEARCH, PaginaListarCategorias.BOTON_GO, valorBuscar);
    }


    @Override
    @Step("{0} selecciona el boton search: #botonSeleccionado")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(this.botonTarget),
                Enter.theValue(valorBuscar).into(PaginaListarCategorias.INGRESAR_VALOR),
                Click.on(this.botonGo)

        );

    }



}
