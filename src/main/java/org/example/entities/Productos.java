package org.example.entities;

import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelSheet;

@ExcelSheet("productos")
public class Productos {
    @ExcelCellName("NOMBRE")
    private String nombre;
    @ExcelCellName("PRECIO")
    private double precio;
    @ExcelCellName("STOCK")
    private Integer stock;
    @ExcelCellName("PESO")
    private double peso;
    @ExcelCellName("PERECIBLE")
    private boolean perecible;
    @ExcelCellName("VOLUMEN")
    private double volumen;

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public Integer getStock() {
        return stock;
    }

    public double getPeso() {
        return peso;
    }

    public boolean isPerecible() {
        return perecible;
    }

    public double getVolumen() {
        return volumen;
    }

    @Override
    public String toString() {
        return "Productos{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", peso=" + peso +
                ", perecible=" + perecible +
                ", volumen=" + volumen +
                '}';
    }
}
