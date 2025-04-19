package com.freddy.curso.springboot.webapp.springboot_web.repositories;

import com.freddy.curso.springboot.webapp.springboot_web.models.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Repositorio simulado para usuarios.
 *
 * Notas de aprendizaje:
 * - Simula una base de datos en memoria usando una lista de usuarios.
 * - Métodos principales: findAll() para obtener todos los usuarios, findById() para buscar por id.
 * - En una aplicación real, aquí se conectaría a una base de datos.
 */

@Repository
public class UserRepository {

    public List<User> findAll(){
        List<User> users = new ArrayList<>();
        users.add(new User(1, "juan", "martinez", "juan@example.com", "estudiante"));
        users.add(new User(2, "maria", "martinez", "maria@example.com", "profesora"));
        users.add(new User(3, "pedro", "martinez", "pedro@example.com", "Estudiante"));
        users.add(new User(4, "Freddy", "Bautista", "freddy@example.com", "ADMIN"));
        users.add(new User(5, "juan", "martinez", "juan@example.com", "estudiante"));
        users.add(new User(6, "maria", "martinez", "maria@example.com", "profesora"));
        users.add(new User(7, "pedro", "martinez", "pedro@example.com", "Estudiante"));
        users.add(new User(8, "Freddy", "Bautista", "freddy@example.com", "ADMIN"));
        users.add(new User(1, "juan", "martinez", "juan@example.com", "estudiante"));
        users.add(new User(9, "maria", "martinez", "maria@example.com", "profesora"));
        users.add(new User(10, "pedro", "martinez", "pedro@example.com", "Estudiante"));
        users.add(new User(11, "Freddy", "Bautista", "freddy@example.com", "ADMIN"));
        return users;
    }


    public User findById(int id){
        List<User> users = findAll();
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    //ENCONTRAR UN USUARIO POR SU ID USANDO STREAM
//    public User getUserByid(int id){
//        List<User> users = findAll();
//        return users.stream()
//                .filter(user -> user.getId() == id) //para cada user compara su id con el id pasado en el argumento
//                .findFirst()
//                .orElse(null);
//    } // estructura de un lambda: (parametro) -> { cuerpo }




}
