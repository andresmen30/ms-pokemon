package ms.pokemon.exception.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@ToString
public class ErrorResponseDto implements Serializable {

   @Schema(description = "time of error", pattern = "yyyy-MM-dd HH:mm:ss")
   @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
   private LocalDateTime time;

   @Schema(description = "description of error")
   private String description;

   @Schema(description = "data generic")
   private transient Object data;

}
