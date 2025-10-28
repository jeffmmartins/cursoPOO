package com.github.jeffmmartins.course.entities;

import java.io.Serializable;
import java.util.Objects;

//Serializable para que os objetos trafeguem na rede. é necessário um número de serie
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private String email;
    private String phone;
    private String passwaord;

    public User(){}

    public User(Long id, String name, String email, String phone, String passwaord) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.passwaord = passwaord;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPasswaord() {
        return passwaord;
    }

    public void setPasswaord(String passwaord) {
        this.passwaord = passwaord;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    //foi escolhido apenas o id para realizar a comparação
    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
