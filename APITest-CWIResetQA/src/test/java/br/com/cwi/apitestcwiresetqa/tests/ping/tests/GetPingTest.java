package br.com.cwi.apitestcwiresetqa.tests.ping.tests;

import br.com.cwi.apitestcwiresetqa.tests.ping.requests.GetPingRequest;
import org.junit.Test;

public class GetPingTest {
    GetPingRequest getPingRequest = new GetPingRequest();

    @Test
    public void validaApiOnline(){
        getPingRequest.pingReturnApi()
                .then()
                .statusCode(201);

    }
}
