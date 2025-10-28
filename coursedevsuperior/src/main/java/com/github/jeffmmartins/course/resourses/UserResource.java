package com.github.jeffmmartins.course.resourses;

import com.github.jeffmmartins.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.RecursiveTask;

@RestController
@RequestMapping("{/users}")
public class UserResource {

    //Response entity retorna respostas de requisições web
    public ResponseEntity<User> findAll(){
        User u = new User(1L,"Maria", "maria@gmail", "997933189", "123454");
        return ResponseEntity.ok().body(u);
    }
}
