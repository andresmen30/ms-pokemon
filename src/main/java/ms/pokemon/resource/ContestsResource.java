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
import ms.pokemon.service.ContestsService;
import ms.pokemon.util.ResourcePath;

@Slf4j
@Path(ResourcePath.BASE_PATH_POKEMON)
@Tag(name = "Contests", description = "Contest types are categories judges used to weigh a Pokémon's condition in Pokémon contests")
@RequiredArgsConstructor
public class ContestsResource {

   private final ContestsService contestsService;

   @GET
   @Path(ResourcePath.ENDPOINT_CONTEST_TYPE)
   @Produces(MediaType.APPLICATION_JSON)
   public Response getContestType(final @QueryParam("idOrName") @NotBlank String idOrName) {
      log.info("get contest-type");
      return ResponseUtil.createResponse(Response.Status.OK, contestsService.getContestType(idOrName));
   }

   @GET
   @Path(ResourcePath.ENDPOINT_CONTEST_EFFECT)
   @Produces(MediaType.APPLICATION_JSON)
   public Response getContestEffect(final @QueryParam("idOrName") @NotBlank String idOrName) {
      log.info("get contest-effect");
      return ResponseUtil.createResponse(Response.Status.OK, contestsService.getContestEffect(idOrName));
   }

   @GET
   @Path(ResourcePath.ENDPOINT_SUPER_CONTEST_EFFECT)
   @Produces(MediaType.APPLICATION_JSON)
   public Response getSuperContestEffect(final @QueryParam("idOrName") @NotBlank String idOrName) {
      log.info("get super-contest-effect");
      return ResponseUtil.createResponse(Response.Status.OK, contestsService.getSuperContestEffect(idOrName));
   }

}
