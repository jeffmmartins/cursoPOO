package com.github.jeffmmartins.course.repositories;

import com.github.jeffmmartins.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

//Repository são sempre uma iterface, já tem uma interface padrão no JPA
public interface UserRepository extends JpaRepository<User, Long> {
}
