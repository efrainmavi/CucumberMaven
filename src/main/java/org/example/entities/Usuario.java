package org.example.entities;

import com.github.javafaker.Faker;

public class Usuario {
    private final String nombreCompleto;
    private final Integer edad;
    private final double balance;
    private final String username;
    private final String password;


    public Usuario(){
        Faker faker = new Faker();

        nombreCompleto = faker.name().fullName();
        edad = faker.number().numberBetween(20, 40);
        balance = faker.number().randomDouble(2,1000,10000);
        username = faker.name().username();
        password = faker.internet().password();
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombreCompleto='" + nombreCompleto + '\'' +
                ", edad=" + edad +
                ", balance=" + balance +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
