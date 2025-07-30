package dio.web.api.repository;

import dio.web.api.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    public void save(User user){
        if (user.getId() == null){
            System.out.println("Save = Recebendo usuário na camada de repositório");
        } else {
            System.out.println("UPDATE = Recebendo usuário na camada de repositório");
        }
        System.out.println(user);
    }

    public void deleteById(Long id){
        System.out.println(String.format("Delete/id - recebendo o id: %d para excluir", id));
        System.out.println(id);
    }

    public List<User> findAll(){
        System.out.println("List - listando os usuários do sistema");
        List<User> users = new ArrayList<>();
        users.add(new User("Jeff", "password"));
        users.add(new User("Vera", "martins"));
        return users;
    }

    public User findById(Long id){
        System.out.println(String.format("FIND/id - recebendo id: %d ", id));
        return new User("Jeff", "password");

    }

    public User findByUsername (String username){
        System.out.println(String.format("Find/username - recebendo o username %s", username));
        return new User("Jeff","password");
    }


}
