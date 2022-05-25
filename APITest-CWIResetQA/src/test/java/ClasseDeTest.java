import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.greaterThan;

public class ClasseDeTest {
    @Test
    public void validarListagemDeIdsDasReservas(){
        Response responseReturnBookingIds =
                given()
                        .when()
                        .get("https://treinamento-api.herokuapp.com/booking");
        responseReturnBookingIds
                .then()
                .statusCode(200)
                .body("size()", greaterThan(0));
    }

    @Test
    public void validarRetornoDeTokenParaUsuario (){

        JSONObject payload = new JSONObject();
        payload.put("username", "admin");
        payload.put("password", "password123");

        Response createToken =
                given()
                        .log().all()
                        .header("Content-Type", "application/json")
                        .when()
                        .body(payload.toString())
                        .post("https://treinamento-api.herokuapp.com/auth");

        createToken
                .then()
                .log().all()
                .statusCode(200)
                .extract()
                .path("token");


    }

//    public String pegarToken(){
//        return "token=" + this.validarRetornoDeTokenParaUsuario()
//                .then()
//                .statusCode(200)
//                .extract()
//                .path("token");
//    }

}
