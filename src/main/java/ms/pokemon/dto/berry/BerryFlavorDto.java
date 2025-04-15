package ms.pokemon.dto.berry;

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
public class BerryFlavorDto {

   private int id;

   private String name;

   private List<FlavorBerryMapDto> berries;

   private NamedAPIResourceDto contestType;

   private List<NameDto> names;

}
