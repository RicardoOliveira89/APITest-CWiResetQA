package br.com.cwi.apitestcwiresetqa.tests.auth.tests;

import br.com.cwi.apitestcwiresetqa.tests.auth.requests.PostAuthRequest;
import br.com.cwi.apitestcwiresetqa.tests.base.BaseTest;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.notNullValue;

public class PostAuthTest extends BaseTest {
    PostAuthRequest postAuthRequest = new PostAuthRequest();

    @Test
    public void validaRetornoDeTokenParaUsuario(){
        postAuthRequest.tokenReturn()
                .then()
                .statusCode(200)
                .body("token", notNullValue());
    }
}
