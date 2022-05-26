package br.com.cwi.apitestcwiresetqa.tests.booking.tests;

import br.com.cwi.apitestcwiresetqa.suites.AllTests;
import br.com.cwi.apitestcwiresetqa.tests.base.BaseTest;
import br.com.cwi.apitestcwiresetqa.tests.booking.requests.GetBookingRequest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.hamcrest.Matchers.greaterThan;

public class GetBookingTest extends BaseTest {
    GetBookingRequest getBookingRequest = new GetBookingRequest();
    @Test
    @Category({AllTests.class})
    public void validarListagemDeIdsDasReservas(){
        getBookingRequest.bookingReturnIds()
                .then()
                .statusCode(200)
                .body("size()", greaterThan(0));

    }
}
