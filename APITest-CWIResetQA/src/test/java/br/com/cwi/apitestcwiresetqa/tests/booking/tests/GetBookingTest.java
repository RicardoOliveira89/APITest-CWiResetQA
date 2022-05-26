package br.com.cwi.apitestcwiresetqa.tests.booking.tests;

import br.com.cwi.apitestcwiresetqa.suites.AllTests;
import br.com.cwi.apitestcwiresetqa.tests.base.BaseTest;
import br.com.cwi.apitestcwiresetqa.tests.booking.requests.GetBookingRequest;
import br.com.cwi.apitestcwiresetqa.utils.Utils;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.io.File;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static org.hamcrest.Matchers.greaterThan;

public class GetBookingTest extends BaseTest {
    GetBookingRequest getBookingRequest = new GetBookingRequest();
    @Test
    @Category({AllTests.class})
    public void validaListagemDeIdsDasReservas(){
        getBookingRequest.bookingReturnIds()
                .then()
                .statusCode(200)
                .body("size()", greaterThan(0));

    }

    @Test
    @Category({AllTests.class})
    public void validaSchemaDaListagemDeReservas(){
        getBookingRequest.bookingReturnIds()
                .then()
                .statusCode(200)
                .body(matchesJsonSchema(new File(Utils.getSchemaBasePath("booking", "bookings"))));
    }
}
