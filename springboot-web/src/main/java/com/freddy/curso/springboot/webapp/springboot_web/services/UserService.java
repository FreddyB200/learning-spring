package com.freddy.curso.springboot.webapp.springboot_web.services;
import com.freddy.curso.springboot.webapp.springboot_web.models.User;
import com.freddy.curso.springboot.webapp.springboot_web.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Servicio para la lógica de negocio relacionada con usuarios.
 *
 * Notas de aprendizaje:
 * - Se encarga de obtener los usuarios desde el repositorio.
 * - Aquí se puede agregar lógica adicional antes de devolver los datos al controlador.
 * - Es el punto de acceso para los controladores que necesitan información de usuarios.
 */

@AllArgsConstructor //inyeccion por constructor //no usarlo con mas de 2 constructores
@Service
public class UserService {

    private final UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();

    }

    public User getUserById(int id){
        return userRepository.findById(id);
    }
}
