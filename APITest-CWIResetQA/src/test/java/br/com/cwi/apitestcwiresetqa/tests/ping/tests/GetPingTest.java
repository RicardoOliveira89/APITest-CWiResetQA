package br.com.cwi.apitestcwiresetqa.tests.ping.tests;

import br.com.cwi.apitestcwiresetqa.suites.AllTests;
import br.com.cwi.apitestcwiresetqa.tests.base.BaseTest;
import br.com.cwi.apitestcwiresetqa.tests.ping.requests.GetPingRequest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class GetPingTest extends BaseTest {
    GetPingRequest getPingRequest = new GetPingRequest();

    @Test
    @Category({AllTests.class})
    public void validaApiOnline(){
        getPingRequest.pingReturnApi()
                .then()
                .statusCode(201);

    }
}
