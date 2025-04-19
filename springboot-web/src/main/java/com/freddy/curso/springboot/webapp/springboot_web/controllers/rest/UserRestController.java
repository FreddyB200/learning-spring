package com.freddy.curso.springboot.webapp.springboot_web.controllers.rest;

import com.freddy.curso.springboot.webapp.springboot_web.mapper.UserMapper;
import com.freddy.curso.springboot.webapp.springboot_web.models.User;
import com.freddy.curso.springboot.webapp.springboot_web.dto.UserDTO;
import com.freddy.curso.springboot.webapp.springboot_web.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;



/**
 * Controlador REST para exponer endpoints relacionados con usuarios.
 *
 * Notas de aprendizaje:
 * - Devuelve datos en formato JSON para ser consumidos por clientes (por ejemplo, frontend JS o Postman).
 * - Usa UserService para obtener usuarios (simulado en memoria).
 * - Usa UserMapper para convertir User a UserDTO (para exponer solo ciertos campos).
 *
 * Endpoints:
 *   GET /api/details-map   → Devuelve un mapa con información de usuario y título.
 *   GET /api/details       → Devuelve un UserDTO (usuario simplificado).
 *   GET /api/users         → Devuelve la lista de usuarios (User).
 */


@RestController
@RequestMapping("/api")
public class UserRestController {
    private UserMapper userMapper;
    private final UserService userService;

    @Autowired //no es necesario ponerlo a menos que se tengan mas de 2 constructores
    public UserRestController(UserService userService, UserMapper userMapper){
        this.userService = userService;
        this.userMapper = userMapper;
    }

    /**
     * Endpoint: GET /api/details-map
     * Devuelve un mapa con información de usuario y título.
     * Ejemplo de uso: para probar cómo enviar varios tipos de datos en una respuesta JSON.
     */

    @GetMapping("/details-map")
    public Map<String, Object> detailsMap(){
        Map<String, Object> body = new HashMap<>();
        User user = new User(1, "Freddy", "bautista", "abs0rbmejohan@example.com", "estudiante / desarrolador");

        body.put("title", "Hola mundo Spring Boot");
        body.put("fullname", user.getFirstName() + " " + user.getLastName());
        body.put("user", user);
        return body;
    }

    /**
     * Endpoint: GET /api/details
     * Devuelve un UserDTO (usuario simplificado).
     * Ejemplo de uso: para exponer solo los datos necesarios del usuario.
     */

    @GetMapping("/details")
    public UserDTO details(){
        User user = new User(1, "Freddy", "bautista", "abs0rbmejohan@example.com", "estudiante / desarrolador");
        UserDTO userDTO = userMapper.toDTO(user);
        return userDTO;
    }

    /**
     * Endpoint: GET /api/users
     * Devuelve la lista de usuarios (User).
     * Ejemplo de uso: para listar todos los usuarios registrados.
     */

    @GetMapping("/users")
    public List<User> listUsers(){
        return userService.getAllUsers();
    }



}
