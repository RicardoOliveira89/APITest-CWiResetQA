package br.com.cwi.apitestcwiresetqa.runners;

import br.com.cwi.apitestcwiresetqa.tests.auth.tests.PostAuthTest;
import br.com.cwi.apitestcwiresetqa.tests.booking.tests.GetBookingTest;
import br.com.cwi.apitestcwiresetqa.tests.ping.tests.GetPingTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(br.com.cwi.apitestcwiresetqa.suites.AllTests.class)
@Suite.SuiteClasses({
        PostAuthTest.class,
        GetBookingTest.class,
        GetPingTest.class
})
public class AllTests {
}
