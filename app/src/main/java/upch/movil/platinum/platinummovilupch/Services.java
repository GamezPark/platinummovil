package upch.movil.platinum.platinummovilupch;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import upch.movil.platinum.platinummovilupch.entidades.Catalogo;

public interface Services {

    public static String baseUrl = "https://platinum.upchiapas.edu.mx/";

@GET("PlatinumMovilBD/controller/docentes.php/docentes_planEstudios?planID=")
    Call<Catalogo> getPlanEstudios();

@GET("PlatinumMovilBD/controller/docentes.php/docentes_docentes")
    Call<Catalogo> getListaMaestro(@Query("txtname") String id);

@GET("PlatinumMovilBD/controller/docentes.php/docentes_alumnos?TipoPostgradoID=1&ProgramaAcademicoID=3&matri=")
    Call<Catalogo> getListaAlumnos(@Query("pagina") String id);
        }
