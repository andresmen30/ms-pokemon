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
public class ContestNameDto {

   private String name;

   private String color;

   private NamedAPIResourceDto language;

}
