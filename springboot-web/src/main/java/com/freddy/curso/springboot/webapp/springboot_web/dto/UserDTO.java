package com.freddy.curso.springboot.webapp.springboot_web.dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO para exponer solo los datos necesarios del usuario en la API.
 *
 * Notas de aprendizaje:
 * - Se utiliza para ocultar información sensible o innecesaria de la entidad User.
 * - Incluye solo id, nombre completo y email.
 * - Se construye a partir de la entidad User usando UserMapper.
 * - Usa Lombok para reducir el código repetitivo.
 */


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {
    private int id;
    private String fullName;
    private String email;

}

