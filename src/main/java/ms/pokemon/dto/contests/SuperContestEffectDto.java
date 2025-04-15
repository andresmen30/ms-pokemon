package ms.pokemon.dto.contests;

import java.util.List;

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
public class SuperContestEffectDto {

   private int id;

   private int appeal;

   private List<FlavorTextDto> flavorTextEntries;

   private List<NamedAPIResourceDto> moves;

}
