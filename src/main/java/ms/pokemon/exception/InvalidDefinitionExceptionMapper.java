package ms.pokemon.exception;

import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class InvalidDefinitionExceptionMapper implements ExceptionMapper<InvalidDefinitionException> {


   @Override
   public Response toResponse(InvalidDefinitionException ex) {
      return ResponseUtil.createErrorResponse(Response.Status.INTERNAL_SERVER_ERROR, ex.getMessage(), null);

   }
}
