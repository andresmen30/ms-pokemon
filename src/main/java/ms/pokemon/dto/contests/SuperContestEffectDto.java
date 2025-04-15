package ms.pokemon.dto.contests;

import java.util.List;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import ms.pokemon.dto.NamedAPIResourceDto;

@Data
@Builder
@ToString
public class SuperContestEffectDto {

   private int id;
   private int appeal;
   private List<FlavorTextDto> flavorTextEntries;
   private List<NamedAPIResourceDto> moves;

}
