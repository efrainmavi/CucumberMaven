package org.example.principal;

import com.github.javafaker.Faker;
import org.example.entities.Deportista;
import org.example.entities.Usuario;
import org.example.utilities.Logs;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
     /*   Deportista dep1 = new Deportista();
        Deportista dep2 = new Deportista();


        String multiLinea = """
                deportista 1: 
                %s
                
                deportista 2: 
                %s
                """;

        System.out.printf(multiLinea, dep1, dep2);


        if (dep1.getVelocidad() > dep2.getVelocidad()){
            System.out.printf("El mas rapido es: %s%n", dep1.getNombre());
        }else {
            System.out.printf("El mas rapido es: %s%n", dep2.getNombre());
        }*/

        Faker faker = new Faker();
        Logs.info("Creando un numero aleatorio entre 20 - 50");
        Integer numAleatorio = faker.number().numberBetween(20,50);
        List<Usuario> usuarios =crearUsuarios(numAleatorio);
        System.out.printf("Usuarios : %s%n", usuarios);
    }

    private static List<Usuario> crearUsuarios(Integer n){

        List<Usuario> list =new ArrayList<Usuario>();
        for (int i = 0; i < n; i++) {
            list.add(new Usuario());
        }
        return list;
    }
}
