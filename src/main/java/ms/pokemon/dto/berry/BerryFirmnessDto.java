package ms.pokemon.dto.berry;

import java.util.List;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import ms.pokemon.dto.NamedAPIResourceDto;

@Data
@Builder
@ToString
public class BerryFirmnessDto {

   private int id;

   private String name;

   private List<NamedAPIResourceDto> berries;

   private List<NameDto> names;

}
