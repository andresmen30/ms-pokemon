package ms.pokemon.service;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import lombok.RequiredArgsConstructor;
import ms.pokemon.client.PokemonClient;
import ms.pokemon.dto.contests.ContestEffectDto;
import ms.pokemon.dto.contests.ContestTypeDto;
import ms.pokemon.dto.contests.SuperContestEffectDto;

@ApplicationScoped
@RequiredArgsConstructor
public class ContestsService {

   @Inject
   @RestClient
   PokemonClient pokemonClient;

   public ContestTypeDto getContestType(final String idOrName) {
      return pokemonClient.getContestType(idOrName);
   }

   public ContestEffectDto getContestEffect(final String idOrName) {
      return pokemonClient.getContestEffect(idOrName);
   }

   public SuperContestEffectDto getSuperContestEffect(final String idOrName) {
      return pokemonClient.getSuperContestEffect(idOrName);
   }

}
