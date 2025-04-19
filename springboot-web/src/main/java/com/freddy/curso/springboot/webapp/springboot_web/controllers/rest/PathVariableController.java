package com.freddy.curso.springboot.webapp.springboot_web.controllers.rest;
import com.freddy.curso.springboot.webapp.springboot_web.dto.ParamDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador REST para practicar el uso de @PathVariable en rutas.
 *
 * Notas de aprendizaje:
 * - Demuestra cómo capturar valores directamente de la URL usando @PathVariable.
 * - Devuelve siempre un objeto ParamDTO con los datos recibidos.
 *
 * Endpoints:
 *   GET /variables/foo/{message}           → Recibe un valor 'message' como parte de la ruta.
 *   GET /variables/bar/{message}/{code}    → Recibe dos valores: 'message' y 'code' como parte de la ruta.
 */

@RestController
@RequestMapping("/variables/")
public class PathVariableController {

    /**
     * Endpoint: GET /variables/foo/{message}
     * Recibe un valor 'message' como parte de la ruta.
     * Ejemplo de uso: /variables/foo/hola
     */
    @GetMapping("/foo/{message}")
    public ParamDTO foo(@PathVariable String message) {
        return ParamDTO.builder()
                .message(message)
                .build();
    }

    /**
     * Endpoint: GET /variables/bar/{message}/{code}
     * Recibe dos valores: 'message' y 'code' como parte de la ruta.
     * Ejemplo de uso: /variables/bar/hola/123
     */
    @GetMapping("/bar/{message}/{code}")
    public ParamDTO bar(@PathVariable String message, @PathVariable Integer code) {
        return ParamDTO.builder()
                .message(message)
                .code(code)
                .build();
    }
}
