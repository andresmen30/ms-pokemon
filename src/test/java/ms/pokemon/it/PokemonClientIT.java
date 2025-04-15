package ms.pokemon.it;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

import io.quarkus.test.junit.QuarkusIntegrationTest;
import io.restassured.RestAssured;

@QuarkusIntegrationTest
public class PokemonClientIT {

   void testGetBerry() {
      RestAssured
            .given()
            .pathParam("idOrName", "1")
            .when()
            .get("/berry/{idOrName}")
            .then()
            .statusCode(200)
            .body("id", is(1))
            .body("name", notNullValue());
   }

   void testGetBerryFirmness() {
      RestAssured
            .given()
            .pathParam("idOrName", "firmness-name")
            .when()
            .get("/berry-firmness/{idOrName}")
            .then()
            .statusCode(200)
            .body("name", is("firmness-name"));
   }

   void testGetBerryFlavor() {
      RestAssured
            .given()
            .pathParam("idOrName", "flavor-name")
            .when()
            .get("/berry-flavor/{idOrName}")
            .then()
            .statusCode(200)
            .body("name", is("flavor-name"));
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
