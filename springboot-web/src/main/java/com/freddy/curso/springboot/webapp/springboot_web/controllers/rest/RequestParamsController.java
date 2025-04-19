package com.freddy.curso.springboot.webapp.springboot_web.controllers.rest;


import com.freddy.curso.springboot.webapp.springboot_web.dto.ParamDTO;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * Controlador REST para practicar la obtención de parámetros en peticiones HTTP GET.
 *
 * Notas de aprendizaje:
 * - Demuestra diferentes formas de recibir parámetros en Spring Boot.
 * - Usa @RequestParam para parámetros simples y HttpServletRequest para acceso manual.
 * - Devuelve siempre un objeto ParamDTO con los datos recibidos.
 *
 * Endpoints:
 *   GET /params/foo?message=...      → Recibe un parámetro opcional 'message'.
 *   GET /params/bar?text=...&code=...→ Recibe dos parámetros obligatorios: 'text' y 'code'.
 *   GET /params/request?message=...&code=... → Acceso manual a los parámetros usando HttpServletRequest.
 */

@RestController
@RequestMapping("/params/")
public class RequestParamsController {

    /**
     * Endpoint: GET /params/foo?message=...
     * Recibe un parámetro opcional 'message'.
     * Si no se envía, usa el valor por defecto "No hay mensaje".
     */

    @GetMapping("/foo")
    public ParamDTO foo(@RequestParam(required = false, defaultValue = "No hay mensaje") String message) {
        return ParamDTO.builder()
                .message(message)
                .build();
    }

    /**
     * Endpoint: GET /params/bar?text=...&code=...
     * Recibe dos parámetros obligatorios: 'text' y 'code'.
     * Ejemplo de uso: /params/bar?text=hola&code=123
     */

    @GetMapping("/bar")
    public ParamDTO bar(@RequestParam String text, @RequestParam Integer code) {
        return ParamDTO.builder()
                .code(code)
                .message(text)
                .build();
    }

    /**
     * Endpoint: GET /params/request?message=...&code=...
     * Acceso manual a los parámetros usando HttpServletRequest.
     * Ejemplo de uso: /params/request?message=hola&code=123
     */

    @GetMapping("/request")
    public ParamDTO request(HttpServletRequest request){
        Integer code = 0;
        try{
            code = Integer.parseInt(request.getParameter("code")); //solo adminte strings y toca pasarlo a numero entero
        } catch (NumberFormatException e) {
        } // Si no se puede parsear, code queda en 0

        return ParamDTO.builder()
                .code(code)
                .message(request.getParameter("message"))
                .build();
    }
}
