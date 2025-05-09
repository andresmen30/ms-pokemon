package ms.pokemon.dto.berry;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ms.pokemon.dto.NamedAPIResourceDto;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class FlavorBerryMapDto {

   private int potency;

   private NamedAPIResourceDto berry;

}
