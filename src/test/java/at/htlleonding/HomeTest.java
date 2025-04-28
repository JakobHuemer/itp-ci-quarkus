package at.htlleonding;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

@QuarkusTest
class HomeTest {

    @Test
    void testRootEndpoint() {
        RestAssured.given()
                .when().get( "/" )
                .then()
                .statusCode( 200 )
                .contentType( "text/html" )
                .body( org.hamcrest.Matchers.containsString( "<h1>Hello world from Jakob Huemer-Fistelberger</h1>" ) );
    }
}