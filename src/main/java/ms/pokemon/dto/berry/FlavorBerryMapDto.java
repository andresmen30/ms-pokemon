package ms.pokemon.dto.berry;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import ms.pokemon.dto.NamedAPIResourceDto;

@Data
@Builder
@ToString
public class FlavorBerryMapDto {

   private int potency;

   private NamedAPIResourceDto berry;

}
