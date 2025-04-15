package ms.pokemon.service;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import ms.pokemon.client.PokemonClient;
import ms.pokemon.dto.berry.BerryDto;
import ms.pokemon.dto.berry.BerryFirmnessDto;
import ms.pokemon.dto.berry.BerryFlavorDto;

@ApplicationScoped
public class BerryService {

   @Inject
   @RestClient
   PokemonClient pokemonClient;

   public BerryDto getBerry(final String idOrName) {
      return pokemonClient.getBerry(idOrName);
   }

   public BerryFirmnessDto getBerryFirmness(final String idOrName) {
      return pokemonClient.getBerryFirmness(idOrName);
   }

   public BerryFlavorDto getBerryFlavor(final String idOrName) {
      return pokemonClient.getBerryFlavor(idOrName);
   }

}
