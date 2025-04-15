package ms.pokemon.dto.contests;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import ms.pokemon.dto.NamedAPIResourceDto;

@Data
@Builder
@ToString
public class EffectDto {

   private String effect;

   private NamedAPIResourceDto language;

}
