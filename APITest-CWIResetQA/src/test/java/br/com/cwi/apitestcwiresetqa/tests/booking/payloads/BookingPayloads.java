package br.com.cwi.apitestcwiresetqa.tests.booking.payloads;

import org.json.JSONObject;

public class BookingPayloads {
    public static JSONObject payloadValidBooking(){
        JSONObject payload = new JSONObject();
        JSONObject bookingDates = new JSONObject();

        bookingDates.put("checkin", "2018-01-01");
        bookingDates.put("checkout", "2019-01-01");

        payload.put("firstname", "Chapolin");
        payload.put("lastname", "Colorado");
        payload.put("totalprice", "125");
        payload.put("depositpaid", "true");
        payload.put("bookingdates", bookingDates);
        payload.put("additionalneeds", "Breakfast");

        return payload;
    }
}
