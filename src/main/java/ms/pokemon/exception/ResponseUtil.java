package ms.pokemon.exception;

import java.time.LocalDateTime;

import jakarta.ws.rs.core.Response;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import ms.pokemon.exception.dto.ErrorResponseDto;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ResponseUtil {

   public static Response createErrorResponse(final Response.Status status, final String description, final Object data) {
      return Response.status(status).entity(ErrorResponseDto.builder().time(LocalDateTime.now()).description(description).data(data).build()).build();
   }

   public static Response createResponse(final Response.Status status, final Object data) {
      return Response.status(status).entity(data).build();
   }

}
