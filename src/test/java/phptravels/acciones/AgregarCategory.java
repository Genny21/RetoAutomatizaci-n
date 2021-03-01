package phptravels.acciones;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import phptravels.ui.FormularioCrearCategoria;

public class AgregarCategory implements Task {

    private final String nombreCategoria;
    private final String estado;
    private final String nombreVietnamese;
    private final String nombreRussian;
    private final String nombreArabic;
    private final String nombreFarsi;
    private final String nombreTurkish;
    private final String nombreFrench;
    private final String nombreSpanish;
    private final String nombreGerman;


    public AgregarCategory(String nombreCategoria, String estado, String nombreVietnamese, String nombreRussian, String nombreArabic, String nombreFarsi,String nombreTurkish, String nombreFrench, String nombreSpanish,String nombreGerman){

        this.nombreCategoria = nombreCategoria;
        this.estado = estado;
        this.nombreVietnamese = nombreVietnamese;
        this.nombreRussian = nombreRussian;
        this.nombreArabic = nombreArabic;
        this.nombreFarsi = nombreFarsi;
        this.nombreTurkish = nombreTurkish;
        this.nombreFrench = nombreFrench;
        this.nombreSpanish = nombreSpanish;
        this.nombreGerman = nombreGerman;
    }

    public static AgregarCatConBuilder nombreCategoria(String nombreCategoria) {
        return new AgregarCatConBuilder(nombreCategoria);
    }

    @Override
    @Step ("{0} crea una nueva categoria con los datos nombreCategoria: #nombreCategoria  estado: #estado nombreVietnamese: #nombreVietnamese nombreRussian: #nombreRussian nombreArabic: #nombreArabic nombreFarsi: #nombreFarsi nombreTurkish: #nombreTurkish nombreFrench: #nombreFrench nombreSpanish: #nombreSpanish nombreGerman: #nombreGerman")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(nombreCategoria).into(FormularioCrearCategoria.NOMBRE_CATEGORIA),
                SelectFromOptions.byVisibleText(estado).from(By.xpath("//body/div[3]/div[1]/div[3]/div[2]/div[1]/form[1]/div[2]/div[2]/div[1]/select[1]")),
                Enter.theValue(nombreVietnamese).into(FormularioCrearCategoria.NOMBRE_VIETNAMESE),
                Enter.theValue(nombreRussian).into(FormularioCrearCategoria.NOMBRE_RUSSIAN),
                Enter.theValue(nombreArabic).into(FormularioCrearCategoria.NOMBRE_ARABIC),
                Enter.theValue(nombreFarsi).into(FormularioCrearCategoria.NOMBRE_FARSI),
                Enter.theValue(nombreTurkish).into(FormularioCrearCategoria.NOMBRE_TURKISH),
                Enter.theValue(nombreFrench).into(FormularioCrearCategoria.NOMBRE_FRENCH),
                Enter.theValue(nombreSpanish).into(FormularioCrearCategoria.NOMBRE_SPANISH),
                Scroll.to(By.id("ADD_BLOG_CAT")),
                Enter.theValue(nombreSpanish).into(FormularioCrearCategoria.NOMBRE_SPANISH),
                Enter.theValue(nombreGerman).into(FormularioCrearCategoria.NOMBRE_GERMAN),
                Click.on(FormularioCrearCategoria.BOTON_ADD)
        );

    }


    public static class AgregarCatConBuilder {
        private String nombreCategoria;
        private String estado;
        private String nombreVietnamese;
        private String nombreRussian;
        private String nombreArabic;
        private String nombreFarsi;
        private String nombreTurkish;
        private String nombreFrench;
        private String nombreSpanish;
        private String nombreGerman;

        public AgregarCatConBuilder(String nombreCategoria){
            this.nombreCategoria = nombreCategoria;
            this.nombreVietnamese = "";
            this.nombreRussian = "";
            this.nombreArabic = "";
            this.nombreFarsi = "";
            this.nombreTurkish = "";
            this.nombreFrench = "";
            this.nombreSpanish = "";
            this.nombreGerman = "";
        }
        public AgregarCatConBuilder estado(String estado) {

            this.estado = estado;
            return this;
        }

        public AgregarCatConBuilder nombreVietnamese(String nombreVietnamese){

            this.nombreVietnamese = nombreVietnamese;
            return this;

        }

        public AgregarCatConBuilder nombreRussian(String nombreRussian){

            this.nombreRussian = nombreRussian;
            return this;

        }

        public AgregarCatConBuilder nombreArabic(String nombreArabic){

            this.nombreArabic = nombreArabic;
            return this;

        }

        public AgregarCatConBuilder nombreFarsi(String nombreFarsi){

            this.nombreFarsi = nombreFarsi;
            return this;

        }

        public AgregarCatConBuilder nombreTurkish(String nombreTurkish){

            this.nombreTurkish = nombreTurkish;
            return this;

        }

        public AgregarCatConBuilder nombreFrench(String nombreFrench){

            this.nombreFrench = nombreFrench;
            return this;

        }

        public AgregarCatConBuilder nombreSpanish(String nombreSpanish){

            this.nombreSpanish = nombreSpanish;
            return this;

        }

        public AgregarCatConBuilder nombreGerman(String nombreGerman){

            this.nombreGerman = nombreGerman;
            return this;

        }

        public Performable run(){

            return Instrumented.instanceOf(AgregarCategory.class)
                    .withProperties(nombreCategoria, estado, nombreVietnamese,nombreRussian,nombreArabic,nombreFarsi,nombreTurkish,nombreFrench,nombreSpanish,nombreGerman);
        }


    }
}
