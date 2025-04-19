package com.freddy.curso.springboot.webapp.springboot_web.models;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Entidad User que representa un usuario del sistema.
 *
 * Notas de aprendizaje:
 * - Es la clase principal para manejar usuarios en la aplicación.
 * - Incluye id, nombre, apellido, email y rol.
 * - Se utiliza tanto en la lógica interna como para exponer datos completos (solo en endpoints que lo requieran).
 * - Usa Lombok para generar constructores y métodos estándar.
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String role;
}

