package ms.pokemon.exception;

import jakarta.ws.rs.NotFoundException;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class NotFoundExceptionMapper implements ExceptionMapper<NotFoundException> {

   @Override
   public Response toResponse(NotFoundException ex) {
      return ResponseUtil.createErrorResponse(Response.Status.NOT_FOUND,
            ex.getMessage(), ex.getResponse());
   }
}
