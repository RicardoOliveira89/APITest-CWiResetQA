package br.com.cwi.apitestcwiresetqa.tests.auth.tests;

import br.com.cwi.apitestcwiresetqa.tests.auth.requests.PostAuthRequest;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.notNullValue;

public class PostAuthTest {
    PostAuthRequest postAuthRequest = new PostAuthRequest();

    @Test
    public void validaRetornoDeTokenParaUsuario(){
        postAuthRequest.tokenReturn()
                .then()
                .statusCode(200)
                .body("token", notNullValue());
    }
}
