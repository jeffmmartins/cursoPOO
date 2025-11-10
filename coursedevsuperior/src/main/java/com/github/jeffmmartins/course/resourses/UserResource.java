package com.github.jeffmmartins.course.resourses;

import com.github.jeffmmartins.course.entities.User;
import com.github.jeffmmartins.course.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.RecursiveTask;

@RestController
@RequestMapping( "/users")
public class UserResource {

    @Autowired
    private UserService userService;

    //Response entity retorna respostas de requisições web
    @GetMapping
    public ResponseEntity<List> findAll(){
        List<User> list = userService.findAll();
        return ResponseEntity.ok().body(list);
    }
}
