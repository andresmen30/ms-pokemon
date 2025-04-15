package ms.pokemon.dto.contests;

import java.util.List;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class ContestEffectDto {

   private int id;

   private int appeal;

   private int jam;

   private List<EffectDto> effectEntries;

   private List<FlavorTextDto> flavorTextEntries;

}
