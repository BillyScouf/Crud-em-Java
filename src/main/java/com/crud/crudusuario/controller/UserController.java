package com.crud.crudusuario.controller;

import com.crud.crudusuario.dto.MessageDTO;
import com.crud.crudusuario.entity.User;
import com.crud.crudusuario.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    /* Criar Usuario */
    @PostMapping("/criarusuario")
    public MessageDTO create(@RequestBody User user){
        return userService.criarUsuario(user);
    }

    /* Mostrar Usuario */
    @GetMapping("/mostrarusuario")
    public List<User> read(){
        return userService.mostrarUsuario();
    }

    /* Mostar Usuario por Id */
    @GetMapping("/mostrarusuario/{id}")
    public User readForId(@PathVariable Long id){
        return userService.mostrarUsuarioPorId(id);
    }

    /* Apagar Usuario por Id */
    @DeleteMapping("/apagarusuario/{id}")
    public void deleteUser(@PathVariable Long id){
        userService.deletarUsuario(id);
    }

    /* Atualizar Usuario por Id */
    @PutMapping("/atualizarusuario/{id}")
    public User updatedUser(@PathVariable Long id, @RequestBody User user){
        return userService.updateUser(id,user);
    }

}
