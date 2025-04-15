package ms.pokemon.it;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

import io.quarkus.test.junit.QuarkusIntegrationTest;
import io.restassured.RestAssured;

import org.apache.commons.lang3.math.NumberUtils;
import org.junit.jupiter.api.Test;

@QuarkusIntegrationTest
class BerryResourceIT {

   @Test
   void testGetBerry() {
      RestAssured
            .given()
            .queryParam("idOrName", NumberUtils.INTEGER_ONE)
            .when()
            .get("/pokemon/berry")
            .then()
            .statusCode(200)
            .body("id", is(1))
            .body("name", notNullValue());
   }

   @Test
   void testGetBerryFirmness() {
      RestAssured
            .given()
            .pathParam("idOrName", NumberUtils.INTEGER_ONE)
            .when()
            .get("/pokemon/berry-firmness")
            .then()
            .statusCode(200)
            .body("name", is("firmness-name"));
   }

   void testGetBerryFlavor() {
      RestAssured
            .given()
            .pathParam("idOrName", NumberUtils.INTEGER_ONE)
            .when()
            .get("/berry-flavor/{idOrName}")
            .then()
            .statusCode(200)
            .body("name", is(NumberUtils.INTEGER_ONE));
   }

   void testGetContestType() {
      RestAssured
            .given()
            .pathParam("idOrName", "1")
            .when()
            .get("/contest-type/{idOrName}")
            .then()
            .statusCode(200)
            .body("id", is(1))
            .body("name", notNullValue());
   }

   void testGetContestEffect() {
      RestAssured
            .given()
            .pathParam("idOrName", "1")
            .when()
            .get("/contest-effect/{idOrName}")
            .then()
            .statusCode(200)
            .body("id", is(1))
            .body("appeal", notNullValue());
   }

   void testGetSuperContestEffect() {
      RestAssured
            .given()
            .pathParam("idOrName", "1")
            .when()
            .get("/super-contest-effect/{idOrName}")
            .then()
            .statusCode(200)
            .body("id", is(1))
            .body("appeal", notNullValue());
   }

}
