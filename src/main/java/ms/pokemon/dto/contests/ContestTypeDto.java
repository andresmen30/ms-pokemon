package ms.pokemon.dto.contests;

import java.util.List;

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
public class ContestTypeDto {

   private int id;

   private String name;

   private NamedAPIResourceDto berryFlavor;

   private List<ContestNameDto> names;

}
