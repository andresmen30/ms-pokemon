package ms.pokemon.resource;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import jakarta.validation.constraints.NotBlank;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ms.pokemon.exception.ResponseUtil;
import ms.pokemon.service.BerryService;
import ms.pokemon.util.ResourcePath;

@Path(ResourcePath.BASE_PATH_POKEMON)
@Tag(name = "Berry", description = "\n"
      + "Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by "
      + "Pokémon.")
@Slf4j
@RequiredArgsConstructor
public class BerryResource {

   private final BerryService berryService;

   @GET
   @Path(ResourcePath.ENDPOINT_BERRY)
   @Produces(MediaType.APPLICATION_JSON)
   public Response getBerry(final @QueryParam("idOrName") @NotBlank String idOrName) {
      log.info("get berry");
      return ResponseUtil.createResponse(Response.Status.OK, berryService.getBerry(idOrName));
   }

   @GET
   @Path(ResourcePath.ENDPOINT_BERRY_FIRMNESS)
   @Produces(MediaType.APPLICATION_JSON)
   public Response getBerryFirmness(final @QueryParam("idOrName") @NotBlank String idOrName) {
      log.info("get berry-firmness");
      return ResponseUtil.createResponse(Response.Status.OK, berryService.getBerryFirmness(idOrName));
   }

   @GET
   @Path(ResourcePath.ENDPOINT_BERRY_FLAVOR)
   @Produces(MediaType.APPLICATION_JSON)
   public Response getBerryFlavor(final @QueryParam("idOrName") @NotBlank String idOrName) {
      log.info("get berry-flavor");
      return ResponseUtil.createResponse(Response.Status.OK, berryService.getBerryFlavor(idOrName));
   }

}
