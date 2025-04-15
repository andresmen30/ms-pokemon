package ms.pokemon.dto.contests;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import ms.pokemon.dto.NamedAPIResourceDto;

@Data
@Builder
@ToString
public class FlavorTextDto {

   private String flavorText;

   private NamedAPIResourceDto language;

}
