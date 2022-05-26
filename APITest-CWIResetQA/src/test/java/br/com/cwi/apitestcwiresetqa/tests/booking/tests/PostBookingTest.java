//package br.com.cwi.apitestcwiresetqa.tests.booking.tests;
//
//import br.com.cwi.apitestcwiresetqa.suites.AllTests;
//import br.com.cwi.apitestcwiresetqa.tests.booking.payloads.BookingPayloads;
//import br.com.cwi.apitestcwiresetqa.tests.booking.requests.PostBookingRequest;
//import org.junit.Test;
//import org.junit.experimental.categories.Category;
//
//import static org.hamcrest.Matchers.greaterThan;
//
//public class PostBookingTest {
//    PostBookingRequest postBookingRequest = new PostBookingRequest();
//
//    @Test
//    @Category({AllTests.class})
//    public void validaCriacaoDeUmaReserva(){
//        postBookingRequest.createBooking()
//                .then()
//                .statusCode(200)
//                .body("size()", greaterThan(0));
//    }
//}
