package ms.pokemon.dto.contests;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ms.pokemon.dto.NamedAPIResourceDto;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class EffectDto {

   private String effect;

   private NamedAPIResourceDto language;

}
