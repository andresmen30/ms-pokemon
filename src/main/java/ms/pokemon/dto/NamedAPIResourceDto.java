package ms.pokemon.dto;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class NamedAPIResourceDto {

   private String name;

   private String url;
}
