package com.crud.crudusuario.service;

import com.crud.crudusuario.dto.MessageDTO;
import com.crud.crudusuario.entity.User;
import com.crud.crudusuario.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Metodo para criar Usuario
    public MessageDTO criarUsuario(User user){
        User userSaved = userRepository.save(user);
        return MessageDTO.builder()
                .message("User created with success" +userSaved.getName())
                .build();
    }

    // Metodo para mostar Todos os Usuarios
    public List<User> mostrarUsuario(){
        return userRepository.findAll();
    }

    // Metodo para mostrar Usuarios por id
    public User mostrarUsuarioPorId(Long id){
        return userRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("User not exist"));
    }

    // Metodo para eliminar um usuario
    public void deletarUsuario(Long id){
        userRepository.deleteById(id);
    }

    // Metodo para atualizar usurio por id
    public User updateUser(Long id, User userUpdated){
        User userSaved = userRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Usuario nao existe"));

        userSaved.setName(userUpdated.getName());
        userSaved.setPassword(userUpdated.getPassword());

        return userRepository.save(userUpdated);
    }

}
