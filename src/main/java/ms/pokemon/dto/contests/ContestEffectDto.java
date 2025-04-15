package ms.pokemon.dto.contests;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ContestEffectDto {

   private int id;

   private int appeal;

   private int jam;

   private List<EffectDto> effectEntries;

   private List<FlavorTextDto> flavorTextEntries;

}
