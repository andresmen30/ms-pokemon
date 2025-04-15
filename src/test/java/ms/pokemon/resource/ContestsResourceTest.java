package ms.pokemon.resource;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.mockito.Mockito.when;

import io.quarkus.test.InjectMock;
import io.quarkus.test.junit.QuarkusTest;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import jakarta.ws.rs.core.Response;
import lombok.extern.slf4j.Slf4j;
import ms.pokemon.dto.contests.ContestEffectDto;
import ms.pokemon.dto.contests.ContestTypeDto;
import ms.pokemon.dto.contests.SuperContestEffectDto;
import ms.pokemon.mock.ContestsMock;
import ms.pokemon.service.ContestsService;

@Slf4j
@QuarkusTest
class ContestsResourceTest {

   @InjectMock
   ContestsService contestsService;

   @ParameterizedTest
   @ValueSource(strings = { "pikachu", "bulbasaur", "1", "5" })
   void getContestTypeSuccess(final String idOrName) {
      log.info("start test getContestTypeSuccess");
      final ContestTypeDto contestType = ContestsMock.getContestType();
      when(contestsService.getContestType(idOrName)).thenReturn(contestType);
      given()
            .queryParam("idOrName", idOrName)
            .when()
            .get("/pokemon/contest-type")
            .then()
            .statusCode(Response.Status.OK.getStatusCode())
            .body("id", is(contestType.getId()))
            .body("name", is(contestType.getName()))
            .body("berryFlavor.name", is(contestType.getBerryFlavor().getName()))
            .body("berryFlavor.url", is(contestType.getBerryFlavor().getUrl()))
            .body("names.size()", is(contestType.getNames().size()));
      log.info("end test getContestTypeSuccess");
   }

   @Test
   void getContestTypeBadRequest() {
      log.info("start test getContestTypeBadRequest");
      given()
            .queryParam("idOrName", StringUtils.EMPTY)
            .when()
            .get("/pokemon/contest-type")
            .then()
            .statusCode(Response.Status.BAD_REQUEST.getStatusCode())
            .body("time", notNullValue())
            .body("description", containsString("idOrName"))
            .body("data.size()", is(NumberUtils.INTEGER_ONE));
      log.info("end test getContestTypeBadRequest");
   }

   @ParameterizedTest
   @ValueSource(strings = { "pikachu", "bulbasaur", "1", "5" })
   void getContestEffectSuccess(final String idOrName) {
      log.info("start test getContestEffectSuccess");
      final ContestEffectDto contestEffect = ContestsMock.getContestEffect();
      when(contestsService.getContestEffect(idOrName)).thenReturn(contestEffect);
      given()
            .queryParam("idOrName", idOrName)
            .when()
            .get("/pokemon/contest-effect")
            .then()
            .statusCode(Response.Status.OK.getStatusCode())
            .body("id", is(contestEffect.getId()))
            .body("appeal", is(contestEffect.getAppeal()))
            .body("jam", is(contestEffect.getJam()))
            .body("effectEntries.size()", is(contestEffect.getEffectEntries().size()))
            .body("flavorTextEntries.size()", is(contestEffect.getFlavorTextEntries().size()));
      log.info("end test getContestEffectSuccess");
   }

   @Test
   void getContestEffectBadRequest() {
      log.info("start test getContestEffectBadRequest");
      given()
            .queryParam("idOrName", StringUtils.EMPTY)
            .when()
            .get("/pokemon/contest-effect")
            .then()
            .statusCode(Response.Status.BAD_REQUEST.getStatusCode())
            .body("time", notNullValue())
            .body("description", containsString("idOrName"))
            .body("data.size()", is(NumberUtils.INTEGER_ONE));
      log.info("end test getContestEffectBadRequest");
   }

   @ParameterizedTest
   @ValueSource(strings = { "pikachu", "bulbasaur", "1", "5" })
   void getSuperContestEffectSuccess(final String idOrName) {
      log.info("start test getSuperContestEffectSuccess");
      final SuperContestEffectDto superContestEffect = ContestsMock.getSuperContestEffect();
      when(contestsService.getSuperContestEffect(idOrName)).thenReturn(superContestEffect);
      given()
            .queryParam("idOrName", idOrName)
            .when()
            .get("/pokemon/super-contest-effect")
            .then()
            .statusCode(Response.Status.OK.getStatusCode())
            .body("id", is(superContestEffect.getId()))
            .body("appeal", is(superContestEffect.getAppeal()))
            .body("flavorTextEntries.size()", is(superContestEffect.getFlavorTextEntries().size()))
            .body("moves.size()", is(superContestEffect.getMoves().size()));
      log.info("end test getSuperContestEffectSuccess");
   }

   @Test
   void getSuperContestEffectBadRequest() {
      log.info("start test getSuperContestEffectBadRequest");
      given()
            .queryParam("idOrName", StringUtils.EMPTY)
            .when()
            .get("/pokemon/super-contest-effect")
            .then()
            .statusCode(Response.Status.BAD_REQUEST.getStatusCode())
            .body("time", notNullValue())
            .body("description", containsString("idOrName"))
            .body("data.size()", is(NumberUtils.INTEGER_ONE));
      log.info("end test getSuperContestEffectBadRequest");
   }

}