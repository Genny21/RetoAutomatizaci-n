import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import phptravels.acciones.*;
import phptravels.preguntas.LaPaginaPrincipal;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

@RunWith(SerenityRunner.class)


public class WhenUserCreatePostWhitCategorie {

    Actor actor;

    @Managed
    WebDriver navegador;

    @Before
    public void prepararEscenario(){

        actor = Actor.named("Genny");

        actor.can(BrowseTheWeb.with(navegador));

    }

    @Test
    public void CrearCategoriaCorrectamente(){

        /* El actor se encuentra registrado en la paltaforma de viajes
           El actor quiere ingresar a su cuenta
           Y el actor puede ver el titulo de la pagina de inicio ¡Hola Admin!
           Y el actor crea una categoria ingresando todos los campos
           Y verifica que se haya creado esa categoria
           Y el actor crea un nuevo post con la categoria agregada
         */

        //GIVE
        //El actor ingresa a la plataforma
        actor.has(Decidido.ingresarConUsuarioYcontraseña());

        //El actor quiere ingresar a su cuenta
        actor.attemptsTo(IngresarCon.usuario("admin@phptravels.com").contraseña("demoadmin"));

        //El actor puede ver el titulo de la pagina de inicio ¡Hola Admin!
        actor.should(
                seeThat("Titulo ¡Hola Admin!", LaPaginaPrincipal.titulo(), equalTo("Hi Admin!"))
        );

        //WHEN
        //El actor selecciona menu Blog
        actor.attemptsTo(SeleccionarOpcion.blog());
        //El actor selecciona submenu Blog Categories
        actor.attemptsTo(SeleccionarOpcion.blogCategories());
        //El actor selecciona boton ADD
        actor.attemptsTo(SeleccionarOpcion.addCategories());
        //El actor crear el registro de una nueva categoria
        actor.attemptsTo(
                AgregarCategory
                        .nombreCategoria("Science fiction")
                        .estado("Enable")
                        .nombreVietnamese("Khoa học viễn tưởng")
                        .nombreRussian("Научная фантастика")
                        .nombreArabic("الخيال العلمي")
                        .nombreFarsi("داستان علمی")
                        .nombreTurkish("Bilim kurgu")
                        .nombreFrench("science fiction")
                        .nombreSpanish("Ciencia ficción")
                        .nombreGerman("Science-Fiction")
                        .run()
        );
        //El actor selecciona boton ADD
        actor.attemptsTo(SeleccionarOpcion.addCategories());
        //El actor crear el registro de una nueva categoria
        actor.attemptsTo(
            AgregarCategory
                .nombreCategoria("Science fiction 2")
                .estado("Enable")
                .nombreVietnamese("Khoa học viễn tưởng")
                .run()
        );
        //El actor selecciona boton ADD
        actor.attemptsTo(SeleccionarOpcion.addCategories());
        actor.attemptsTo(
                AgregarCategory
                        .nombreCategoria("Science fiction 3")
                        .estado("Disable")
                        .run()
        );
        //El actor valida que la categoria se ha creado correctamente
        //El actor selecciona el boton buscar
        actor.attemptsTo(BuscarCategory.search("Science fiction"));










    }


}
