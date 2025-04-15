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
public class BerryDto {

   private int id;

   private String name;

   private int growthTime;

   private int maxHarvest;

   private int naturalGiftPower;

   private int size;

   private int smoothness;

   private int soilDryness;

   private NamedAPIResourceDto firmness;

   private List<BerryFlavorMapDto> flavors;

   private NamedAPIResourceDto item;

   private NamedAPIResourceDto naturalGiftType;

}
