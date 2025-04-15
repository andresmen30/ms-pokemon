package ms.pokemon.mock;

import java.util.Collections;

import org.apache.commons.lang3.math.NumberUtils;

import ms.pokemon.dto.NamedAPIResourceDto;
import ms.pokemon.dto.berry.BerryDto;
import ms.pokemon.dto.berry.BerryFirmnessDto;
import ms.pokemon.dto.berry.BerryFlavorDto;
import ms.pokemon.dto.berry.BerryFlavorMapDto;
import ms.pokemon.dto.berry.FlavorBerryMapDto;
import ms.pokemon.dto.berry.NameDto;

public class BerryMock {

   public static BerryDto getBerry() {
      final NamedAPIResourceDto namedAPIResource = NamedAPIResourceMock.getNamedAPIResource();
      final BerryFlavorMapDto flavorMap = BerryFlavorMapDto.builder().potency(30).flavor(namedAPIResource).build();

      return BerryDto
            .builder()
            .id(NumberUtils.INTEGER_ONE)
            .name("Random Berry")
            .growthTime(5)
            .maxHarvest(10)
            .naturalGiftPower(50)
            .size(20)
            .smoothness(15)
            .soilDryness(8)
            .firmness(namedAPIResource)
            .flavors(Collections.singletonList(flavorMap))
            .item(namedAPIResource)
            .naturalGiftType(namedAPIResource)
            .build();

   }

   public static BerryFirmnessDto getBerryFirmness() {
      return BerryFirmnessDto
            .builder()
            .id(NumberUtils.INTEGER_ONE)
            .name("firmness-name")
            .berries(Collections.singletonList(NamedAPIResourceMock.getNamedAPIResource()))
            .names(Collections.singletonList(getNameDto()))
            .build();
   }

   public static BerryFlavorDto getBerryFlavor() {
      return BerryFlavorDto
            .builder()
            .id(1)
            .name("flavor-name")
            .berries(Collections.singletonList(getFlavorBerryMap()))
            .contestType(NamedAPIResourceMock.getNamedAPIResource())
            .names(Collections.singletonList(getNameDto()))
            .build();
   }

   private static NameDto getNameDto() {
      return NameDto.builder().name("localized-name").language(NamedAPIResourceMock.getNamedAPIResource()).build();
   }

   private static FlavorBerryMapDto getFlavorBerryMap() {
      return FlavorBerryMapDto.builder().berry(NamedAPIResourceMock.getNamedAPIResource()).potency(10).build();
   }
}
