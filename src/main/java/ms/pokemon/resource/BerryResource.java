package ms.pokemon.resource;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.jboss.logging.Logger;

import jakarta.inject.Inject;
import jakarta.validation.constraints.NotBlank;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import lombok.extern.slf4j.Slf4j;
import ms.pokemon.exception.ResponseUtil;
import ms.pokemon.service.BerryService;

@Path("/pokemon")
@Tag(name = "Berry", description = "\n"
      + "Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by "
      + "Pokémon.")
@Slf4j
public class BerryResource {

   @Inject
   BerryService berryService;

   @GET
   @Path("/berry")
   @Produces(MediaType.APPLICATION_JSON)
   public Response getBerry(final @QueryParam("idOrName") @NotBlank String idOrName) {
      log.info("get berry");
      return ResponseUtil.createResponse(Response.Status.OK, berryService.getBerry(idOrName));
   }

   @GET
   @Path("/berry-firmness")
   @Produces(MediaType.APPLICATION_JSON)
   public Response getBerryFirmness(final @QueryParam("idOrName") @NotBlank String idOrName) {
      log.info("get berry-firmness");
      return ResponseUtil.createResponse(Response.Status.OK, berryService.getBerryFirmness(idOrName));
   }

   @GET
   @Path("/berry-flavor")
   @Produces(MediaType.APPLICATION_JSON)
   public Response getBerryFlavor(final @QueryParam("idOrName") @NotBlank String idOrName) {
      log.info("get berry-flavor");
      return ResponseUtil.createResponse(Response.Status.OK, berryService.getBerryFlavor(idOrName));
   }

}
