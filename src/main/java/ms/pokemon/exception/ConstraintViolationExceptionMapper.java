package ms.pokemon.exception;

import org.apache.commons.lang3.StringUtils;

import jakarta.validation.ConstraintViolationException;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class ConstraintViolationExceptionMapper implements ExceptionMapper<ConstraintViolationException> {

   @Override
   public Response toResponse(ConstraintViolationException ex) {
      return ResponseUtil.createErrorResponse(Response.Status.BAD_REQUEST, ex.getMessage(), ex
            .getConstraintViolations()
            .stream()
            .map(constraintViolation -> StringUtils.join(constraintViolation.getPropertyPath(), " : ", constraintViolation.getMessage()))
            .toList());
   }
}
