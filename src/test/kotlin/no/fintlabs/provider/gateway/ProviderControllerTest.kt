package no.fintlabs.provider.gateway

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured.given
import org.junit.jupiter.api.Test

@QuarkusTest
class ProviderControllerTest {

    @Test
    fun testHeartbeat() {
        given()
          .`when`().post("/heartbeat")
          .then()
             .statusCode(200)
    }

}