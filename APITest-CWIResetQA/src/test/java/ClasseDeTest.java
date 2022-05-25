import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.greaterThan;

public class ClasseDeTest {
    @Test
    public void validarApiOnline(){
        Response responsePing =
                given()
                        .header("Content-Type", "application/json")
                        .when()
                        .get("https://treinamento-api.herokuapp.com/ping");

        responsePing
                .then()
                .statusCode(201);
    }

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
    public void criartoken (){
        JSONObject payload = new JSONObject();
        payload.put("username", "admin");
        payload.put("password", "password123");

        Response createToken =
                given()
                        .header("Content-Type", "application/json")
                        .when()
                        .body(payload)
                        .post("https://treinamento-api.herokuapp.com/auth");

        createToken
                .then()
                .statusCode(200)
                .body(payload);


    }

}
