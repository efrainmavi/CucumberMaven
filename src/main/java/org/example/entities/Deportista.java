package org.example.entities;

import com.github.javafaker.Faker;
import org.example.utilities.Logs;

public class Deportista {
    private final String nombre;
    private final String apellido;
    private final Integer edad;
    private final double velocidad;
    private final double estamina;
    private final double fuerza;
    private final String email;

    public Deportista() {
        Logs.debug("Creando objeto deportista");
        Faker faker = new Faker();
        nombre = faker.name().firstName();
        apellido = faker.name().lastName();
        edad = faker.number().numberBetween(20, 60);
        velocidad = faker.number().randomDouble(2,20,80);
        estamina = faker.number().randomDouble(2,15,60);
        fuerza = faker.number().randomDouble(2,12,60);
        email = faker.internet().emailAddress();
    }

    @Override
    public String toString() {
        String multilinea = """
                {
                    nombre: %s
                    apellido: %s
                    edad: %d
                    velocidad: %.2f
                    estamina: %.2f
                    fuerza: %.2f
                    email: %s
                }
                """;
        return String.format(multilinea, nombre,apellido,edad,velocidad,estamina,fuerza,edad);
    }

    public String getNombre() {
        return nombre;
    }

    public double getVelocidad() {
        return velocidad;
    }
}
