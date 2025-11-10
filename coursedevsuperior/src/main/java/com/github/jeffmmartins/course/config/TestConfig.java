package com.github.jeffmmartins.course.config;

import com.github.jeffmmartins.course.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import com.github.jeffmmartins.course.repositories.UserRepository;

import java.util.Arrays;

//Classe de configuração é preciso adicionar a anotação configuration e profile pois o nome entre os parenteses
// tem que está igual ao que está no properties que criamos.
//Database seeding é para modular alguns objetos
//CommandLineRunner é um script de inicialização permitir que você execute um bloco de código específico exatamente uma vez
@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    //Injetando uma dependencia, tem outra forma que é melhor usando o construtor.
    @Autowired
    private UserRepository userRepository;

    //Quando for incializado ele vai rodar tudo que estiver dentro do metodo.
    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null,"Jeff", "jeff@gmail","9888888", "1233456");
        User u2 = new User(null,"Artur", "artur@gmail","9887655", "1233456");

        userRepository.saveAll(Arrays.asList(u1,u2));
    }
}
