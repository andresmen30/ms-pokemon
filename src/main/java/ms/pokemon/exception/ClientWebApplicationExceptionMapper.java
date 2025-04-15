package ms.pokemon.exception;

import org.jboss.resteasy.reactive.ClientWebApplicationException;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class ClientWebApplicationExceptionMapper implements ExceptionMapper<ClientWebApplicationException> {

   @Override
   public Response toResponse(ClientWebApplicationException ex) {
      return ResponseUtil.createErrorResponse(Response.Status.INTERNAL_SERVER_ERROR, ex.getMessage(), null);

   }
}
