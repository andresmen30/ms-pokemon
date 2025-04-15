package ms.pokemon.dto.contests;

import java.util.List;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import ms.pokemon.dto.NamedAPIResourceDto;

@Data
@Builder
@ToString
public class ContestTypeDto {

   private int id;
   private String name;
   private NamedAPIResourceDto berryFlavor;
   private List<ContestNameDto> names;

}
