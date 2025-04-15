package ms.pokemon.mock;

import java.util.Collections;

import ms.pokemon.dto.NamedAPIResourceDto;
import ms.pokemon.dto.contests.ContestEffectDto;
import ms.pokemon.dto.contests.ContestNameDto;
import ms.pokemon.dto.contests.ContestTypeDto;
import ms.pokemon.dto.contests.EffectDto;
import ms.pokemon.dto.contests.FlavorTextDto;
import ms.pokemon.dto.contests.SuperContestEffectDto;

public class ContestsMock {

   public static ContestTypeDto getContestType() {
      return ContestTypeDto
            .builder()
            .id(1)
            .name("Cool Contest")
            .berryFlavor(NamedAPIResourceMock.getNamedAPIResource())
            .names(Collections.singletonList(
                  ContestNameDto.builder().name("Cool").color("Red").language(NamedAPIResourceMock.getNamedAPIResource()).build()))
            .build();
   }

   public static ContestEffectDto getContestEffect() {
      return ContestEffectDto.builder()
                             .id(1)
                             .appeal(10)
                             .jam(5)
                             .effectEntries(Collections.singletonList(EffectDto.builder()
                                                                               .effect("Increases appeal by 10 points.")
                                                                               .language(NamedAPIResourceMock.getNamedAPIResource())
                                                                               .build()))
                             .flavorTextEntries(Collections.singletonList(FlavorTextDto.builder()
                                                                                       .flavorText("A move that increases appeal.")
                                                                                       .language(NamedAPIResourceMock.getNamedAPIResource())
                                                                                       .build()))
                             .build();
   }


   public static SuperContestEffectDto getSuperContestEffect() {
      return SuperContestEffectDto.builder()
                                  .id(1)
                                  .appeal(20)
                                  .flavorTextEntries(Collections.singletonList(FlavorTextDto.builder()
                                                                                            .flavorText("A move that greatly increases appeal.")
                                                                                            .language(NamedAPIResourceDto.builder()
                                                                                                                         .name("en")
                                                                                                                         .url("https://pokeapi.co/api/v2/language/9/")
                                                                                                                         .build())
                                                                                            .build()))
                                  .moves(Collections.singletonList(NamedAPIResourceDto.builder()
                                                                                      .name("move-name")
                                                                                      .url("https://pokeapi.co/api/v2/move/1/")
                                                                                      .build()))
                                  .build();
   }

}
