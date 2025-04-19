package com.freddy.curso.springboot.webapp.springboot_web.dto;

import lombok.Builder;
import lombok.Data;

/**
 * DTO (Data Transfer Object) para transportar parámetros recibidos en peticiones HTTP.
 *
 * Notas de aprendizaje:
 * - Se utiliza para devolver datos simples (como parámetros de consulta o path variables) en los controladores REST.
 * - Incluye los campos 'message' (texto) y 'code' (número).
 * - Usa Lombok para generar getters, setters y el patrón builder.
 */

@Data
@Builder
public class ParamDTO {

    private String message;
    private Integer code;

}
