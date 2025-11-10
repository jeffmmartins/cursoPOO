package com.github.jeffmmartins.course.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

//Classe de configuração é preciso adicionar a anotação configuration e profile pois o nome entre os parenteses
// tem que está igual ao que está no properties que criamos.
//Database seeding é para modular alguns objetos
@Configuration
@Profile("test")
public class TestConfig {
}
