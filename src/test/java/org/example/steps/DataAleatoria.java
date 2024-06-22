package org.example.steps;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class DataAleatoria {
    private final Faker faker = new Faker();
    private  Integer a;
    private Integer b;
    private Integer suma;
    private Integer producto;
    private double raizCuadrada1;
    private double raizCuadrada2;

    @Given("Genero un par de numeros enteros aleatorios positivos")
    public void generarParPositivosAleatorios() {
        a = faker.random().nextInt(1, 50);
        b = faker.random().nextInt(1, 50);
    }

    @When("Sumo los valores")
    public void sumoValores() {
        suma = a + b;
    }

    @Then("Verifico que la suma sea positiva")
    public void verificarSumaSeaPositiva() {
        Assertions.assertTrue(suma > 0);
    }

    @When("Multipico los valores")
    public void multipicarValores() {
        producto = a * b;
    }

    @Then("Verifico que el producto sea positivo")
    public void verificarProductoSeaPositivo() {
        Assertions.assertTrue(producto > 0);
    }

    @When("Calculo la raiz cuadrada de ambos")
    public void calcularRaizCuadrada() {
        raizCuadrada1 = Math.sqrt(a);
        raizCuadrada2 = Math.sqrt(b);
    }

    @Then("Verifico que el raiz sea positivo")
    public void verificoQueElRaizSeaPositivo() {
        Assertions.assertAll(
                () ->  Assertions.assertTrue(raizCuadrada1 > 0),
                () ->  Assertions.assertTrue(raizCuadrada2 > 0)
        );
    }
}
