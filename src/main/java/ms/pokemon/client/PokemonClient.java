package ms.pokemon.client;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import ms.pokemon.dto.berry.BerryDto;
import ms.pokemon.dto.berry.BerryFirmnessDto;
import ms.pokemon.dto.berry.BerryFlavorDto;
import ms.pokemon.dto.contests.ContestEffectDto;
import ms.pokemon.dto.contests.ContestTypeDto;
import ms.pokemon.dto.contests.SuperContestEffectDto;

@RegisterRestClient(configKey = "pokeapi")
public interface PokemonClient {

   @GET()
   @Path("/berry/{idOrName}")
   @Produces(MediaType.APPLICATION_JSON)
   BerryDto getBerry(final @PathParam("idOrName") String idOrName);

   @GET()
   @Path("/berry-firmness/{idOrName}")
   @Produces(MediaType.APPLICATION_JSON)
   BerryFirmnessDto getBerryFirmness(final @PathParam("idOrName") String idOrName);

   @GET()
   @Path("/berry-flavor/{idOrName}")
   @Produces(MediaType.APPLICATION_JSON)
   BerryFlavorDto getBerryFlavor(final @PathParam("idOrName") String idOrName);

   @GET()
   @Path("/contest-type/{idOrName}")
   @Produces(MediaType.APPLICATION_JSON)
   ContestTypeDto getContestType(final @PathParam("idOrName") String idOrName);

   @GET()
   @Path("/contest-effect/{idOrName}")
   @Produces(MediaType.APPLICATION_JSON)
   ContestEffectDto getContestEffect(final @PathParam("idOrName") String idOrName);

   @GET()
   @Path("/super-contest-effect/{idOrName}")
   @Produces(MediaType.APPLICATION_JSON)
   SuperContestEffectDto getSuperContestEffect(final @PathParam("idOrName") String idOrName);

}
