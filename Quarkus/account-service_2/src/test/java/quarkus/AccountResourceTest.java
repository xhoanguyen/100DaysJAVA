package quarkus;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import quarkus.model.Account;

import java.util.List;
import java.util.stream.Stream;

import static com.google.inject.matcher.Matchers.not;
import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.core.StringContains.containsString;

@QuarkusTest
public class AccountResourceTest {

    @Test
    void testRetrieveAll(){

        Response result = given().
                when().get("/accounts")
                .then()
                .statusCode(200)
                .body(
                        containsString("George Baird"),
                        containsString("Mary Taylor"),
                        containsString("Diana Rigg")
                     ).extract().response();
        List<Account> accounts = result.jsonPath().getList("$");
        assertThat(accounts, not(empty()));
        assertThat(accounts, hasSize(3));

    }


}
