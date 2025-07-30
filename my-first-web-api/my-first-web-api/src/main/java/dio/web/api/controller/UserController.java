package dio.web.api.controller;

import dio.web.api.model.User;
import dio.web.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    //metodo que irá listar os usuários.
    @Autowired
    private UserRepository userRepository;

    //Elegendo o verbo necessário para esse tipo de transação, necessário colocar a uri
    @GetMapping("/users")
    public List<User> getUsers(){
        return userRepository.findAll();
    }

    //Usando o paramentro username que vai vir na uri e mostra o objeto inteiro
    @GetMapping("/users/{username}")
    public User getOne(@PathVariable("username") String username){
        return userRepository.findByUsername(username);
    }

    @DeleteMapping("/users/{id}")
    public void delete(@PathVariable("id") Long id){
        userRepository.deleteById(id);
    }

    //Converter a requisição é necessário usar o @RequestBody, pegra JSON e converter no objeto
    @PostMapping("/users")
    public void postUser(@RequestBody User user){
        userRepository.save(user);
    }

}
