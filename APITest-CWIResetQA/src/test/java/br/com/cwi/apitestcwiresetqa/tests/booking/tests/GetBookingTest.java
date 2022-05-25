package br.com.cwi.apitestcwiresetqa.tests.booking.tests;

import br.com.cwi.apitestcwiresetqa.tests.booking.requests.GetBookingRequest;
import org.junit.Test;

import static org.hamcrest.Matchers.greaterThan;

public class GetBookingTest {
    GetBookingRequest getBookingRequest = new GetBookingRequest();
    @Test
    public void validarListagemDeIdsDasReservas(){
        getBookingRequest.bookingReturnIds()
                .then()
                .statusCode(200)
                .body("size()", greaterThan(0));

    }
}
