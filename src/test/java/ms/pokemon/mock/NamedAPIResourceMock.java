package ms.pokemon.mock;

import ms.pokemon.dto.NamedAPIResourceDto;

public class NamedAPIResourceMock {

   public static NamedAPIResourceDto getNamedAPIResource() {
      return NamedAPIResourceDto.builder().name("berry").url("https://pokeapi.co/api/v2/berry/1/").build();
   }

}
