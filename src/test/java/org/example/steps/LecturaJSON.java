package org.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.entities.User;
import org.example.utilities.JsonReader;
import org.junit.jupiter.api.Assertions;

public class LecturaJSON {
    private User user;

    @Given("Leo el JSON de User")
    public void leerJsonFile() {
        user = JsonReader.getUser("src/main/resources/data/user.json");
    }

    @Then("Verifico el id sea positivo")
    public void verificarIdPositivo() {
        Assertions.assertTrue(user.getId() > 0);
    }

    @Then("Verifico que la longitud sea {double}")
    public void VerificarPropiedadLongitud(double longitudExperada) {
        Assertions.assertEquals(user.getAddress().getGeo().getLongitud(), longitudExperada);
    }

    @Then("Verifico que la longitud de company bs sea mayor que {int}")
    public void verificarLongitudCompanyBS(int longitudMinima) {
        Assertions.assertTrue(user.getCompany().getBs().length() > longitudMinima);
    }
}
