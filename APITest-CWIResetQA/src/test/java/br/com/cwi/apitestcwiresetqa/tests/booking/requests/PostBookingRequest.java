//package br.com.cwi.apitestcwiresetqa.tests.booking.requests;
//
//import br.com.cwi.apitestcwiresetqa.tests.base.BaseTest;
//import br.com.cwi.apitestcwiresetqa.tests.booking.payloads.BookingPayloads;
//import io.restassured.response.Response;
//
//import static io.restassured.RestAssured.given;
//
//public class PostBookingRequest extends BaseTest {
//    BookingPayloads bookingPayloads = new BookingPayloads();
//
//    public Response createBooking(){
//        return given()
//                .log().all()
//                .header("Content-Type","application/json")
//                .header("Accept","application/json")
//                .body(bookingPayloads.toString())
//                .when()
//                .post("booking");
//    }
//}
