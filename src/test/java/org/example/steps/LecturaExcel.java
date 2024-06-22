package org.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.entities.Productos;
import org.example.utilities.ExcelReader;
import org.junit.jupiter.api.Assertions;

import java.util.List;

public class LecturaExcel {
    private List<Productos> listaProductos;
    private Productos productoActual;
    private Integer listaSize;

    @Given("Leo la lista de productos de Excel")
    public void leerListaExcelProductos() {
        listaProductos = ExcelReader.getListProductos();
    }

    @When("Obtengo el elemento con index {int}")
    public void obtenerElementoPorIndex(int index) {
        productoActual = listaProductos.get(index);
    }

    @Then("Verifico que el nombre sea {string} y su precio sea {double}")
    public void verificaNombrePrecio(String nombreEsperado, double precioEsperado) {
        Assertions.assertAll(
                () -> Assertions.assertEquals(nombreEsperado, productoActual.getNombre()),
                () -> Assertions.assertEquals(precioEsperado, productoActual.getPrecio())
        );
    }

    @When("Obtengo el ultimo elemento")
    public void obtenerUltimoElemento() {
        productoActual = listaProductos.getLast();
        System.out.printf("Ultimo producto : %s%n", productoActual);
    }

    @Then("Verifico que el precio sea {double} y que NO sea perecible")
    public void verificarPrecioNOPerecible(double precioEsperado) {
        Assertions.assertAll(
                () -> Assertions.assertEquals(precioEsperado, productoActual.getPrecio()),
                () -> Assertions.assertFalse(productoActual.isPerecible())
        );
    }

    @When("Obtengo la longitud de la lista")
    public void obtenerLongitudDeLaLista() {
        listaSize = listaProductos.size();
    }

    @Then("Verifico que la longitud de la lista sea {int}")
    public void verificaLongitudLista(int logitudExperada) {
        Assertions.assertEquals(listaProductos.size(), listaSize);
    }

    @Then("Verifico que tenga {string},{double},{int}")
    public void verificarPeoductos(String nombre, double precio, int stock) {
        Assertions.assertAll(
                () -> Assertions.assertEquals(nombre, productoActual.getNombre()),
                () -> Assertions.assertEquals(precio, productoActual.getPrecio()),
                () -> Assertions.assertEquals(stock, productoActual.getStock())
        );
    }
}
