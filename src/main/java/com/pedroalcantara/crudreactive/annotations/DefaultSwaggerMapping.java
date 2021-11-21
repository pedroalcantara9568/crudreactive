package com.pedroalcantara.crudreactive.annotations;

import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.MediaType;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;

@Target({METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@ApiResponses({
        @ApiResponse(
                description = "Erro interno do servidor",
                responseCode = "500",
                content = @Content(
                        mediaType = MediaType.APPLICATION_JSON_VALUE
                )
        )
})
@Parameters({

})
public @interface DefaultSwaggerMapping {
}
