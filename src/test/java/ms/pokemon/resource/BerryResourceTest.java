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
import ms.pokemon.dto.berry.BerryDto;
import ms.pokemon.dto.berry.BerryFirmnessDto;
import ms.pokemon.dto.berry.BerryFlavorDto;
import ms.pokemon.mock.BerryMock;
import ms.pokemon.service.BerryService;
import ms.pokemon.util.ResourcePath;

@Slf4j
@QuarkusTest
class BerryResourceTest {

   @InjectMock
   BerryService berryService;

   @ParameterizedTest
   @ValueSource(strings = { "pikachu", "bulbasaur", "1", "5" })
   void getBerrySuccess(final String idOrName) {
      log.info("start test getBerrySuccess idOrName: {}", idOrName);
      final BerryDto berryDto = BerryMock.getBerry();
      when(berryService.getBerry(idOrName)).thenReturn(berryDto);
      given()
            .queryParam("idOrName", idOrName)
            .when()
            .basePath(ResourcePath.BASE_PATH_POKEMON)
            .get(ResourcePath.ENDPOINT_BERRY)
            .then()
            .statusCode(Response.Status.OK.getStatusCode())
            .body("id", is(berryDto.getId()))
            .body("name", is(berryDto.getName()))
            .body("growthTime", is(berryDto.getGrowthTime()))
            .body("flavors.size()", is(berryDto.getFlavors().size()));
      log.info("end test getBerrySuccess");
   }

   @Test
   void getBerryBadRequest() {
      log.info("start test getBerryBadRequest");
      given()
            .queryParam("idOrName", StringUtils.EMPTY)
            .when()
            .basePath(ResourcePath.BASE_PATH_POKEMON)
            .get(ResourcePath.ENDPOINT_BERRY)
            .then()
            .statusCode(Response.Status.BAD_REQUEST.getStatusCode())
            .body("time", notNullValue())
            .body("description", containsString("idOrName"))
            .body("data.size()", is(NumberUtils.INTEGER_ONE));
      log.info("end test getBerryBadRequest");
   }

   @ParameterizedTest
   @ValueSource(strings = { "pikachu", "bulbasaur", "1", "5" })
   void getBerryFirmnessSuccess(final String idOrName) {
      log.info("start test getBerryFirmness idOrName: {}", idOrName);
      final BerryFirmnessDto berryFirmness = BerryMock.getBerryFirmness();
      when(berryService.getBerryFirmness(idOrName)).thenReturn(berryFirmness);
      given()
            .queryParam("idOrName", idOrName)
            .when()
            .basePath(ResourcePath.BASE_PATH_POKEMON)
            .get(ResourcePath.ENDPOINT_BERRY_FIRMNESS)
            .then()
            .statusCode(Response.Status.OK.getStatusCode())
            .body("id", is(berryFirmness.getId()))
            .body("name", is(berryFirmness.getName()))
            .body("berries.size()", is(berryFirmness.getBerries().size()))
            .body("names.size()", is(berryFirmness.getNames().size()));
      log.info("end test getBerryFirmness");
   }

   @Test
   void getBerryFirmnessBadRequest() {
      log.info("start test getBerryFirmnessBadRequest");
      given()
            .queryParam("idOrName", StringUtils.EMPTY)
            .when()
            .basePath(ResourcePath.BASE_PATH_POKEMON)
            .get(ResourcePath.ENDPOINT_BERRY_FIRMNESS)
            .then()
            .statusCode(Response.Status.BAD_REQUEST.getStatusCode())
            .body("time", notNullValue())
            .body("description", containsString("idOrName"))
            .body("data.size()", is(NumberUtils.INTEGER_ONE));
      log.info("end test getBerryFirmnessBadRequest");
   }

   @ParameterizedTest
   @ValueSource(strings = { "pikachu", "bulbasaur", "1", "5" })
   void getBerryFlavorSuccess(final String idOrName) {
      log.info("start test getBerryFlavorSuccess idOrName: {}", idOrName);
      final BerryFlavorDto berryFlavor = BerryMock.getBerryFlavor();
      when(berryService.getBerryFlavor(idOrName)).thenReturn(berryFlavor);
      given()
            .queryParam("idOrName", idOrName)
            .when()
            .basePath(ResourcePath.BASE_PATH_POKEMON)
            .get(ResourcePath.ENDPOINT_BERRY_FLAVOR)
            .then()
            .statusCode(Response.Status.OK.getStatusCode())
            .body("id", is(berryFlavor.getId()))
            .body("name", is(berryFlavor.getName()))
            .body("contestType", notNullValue())
            .body("contestType.name", is(berryFlavor.getContestType().getName()))
            .body("contestType.url", is(berryFlavor.getContestType().getUrl()))
            .body("berries.size()", is(berryFlavor.getBerries().size()))
            .body("names.size()", is(berryFlavor.getNames().size()));
      log.info("end test getBerryFlavorSuccess");
   }

   @Test
   void getBerryFlavorBadRequest() {
      log.info("start test getBerryFlavorBadRequest");
      given()
            .queryParam("idOrName", StringUtils.EMPTY)
            .when()
            .basePath(ResourcePath.BASE_PATH_POKEMON)
            .get(ResourcePath.ENDPOINT_BERRY_FLAVOR)
            .then()
            .statusCode(Response.Status.BAD_REQUEST.getStatusCode())
            .body("time", notNullValue())
            .body("description", containsString("idOrName"))
            .body("data.size()", is(NumberUtils.INTEGER_ONE));
      log.info("end test getBerryFlavorBadRequest");
   }

}