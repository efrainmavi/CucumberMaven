package org.example.entities;

import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelSheet;

@ExcelSheet("monstruos")
public class Monstruo {
    @ExcelCellName("NOMBRE")
    private String nombre;
    @ExcelCellName("EDAD")
    private Integer edad;
    @ExcelCellName("PESO")
    private double peso;
    @ExcelCellName("GENERO")
    private String genero;
    @ExcelCellName("TIPO")
    private String tipo;
    @ExcelCellName("NIVEL")
    private Integer nivel;

    public String getNombre() {
        return nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public String getGenero() {
        return genero;
    }

    public String getTipo() {
        return tipo;
    }

    public Integer getNivel() {
        return nivel;
    }

    @Override
    public String toString() {
        return "Monstruo{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", genero='" + genero + '\'' +
                ", tipo='" + tipo + '\'' +
                ", nivel=" + nivel +
                '}';
    }
}
