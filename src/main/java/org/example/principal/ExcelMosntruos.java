package org.example.principal;

import org.example.entities.Monstruo;
import org.example.utilities.ExcelReader;

import java.util.ArrayList;
import java.util.List;

public class ExcelMosntruos {
    public static void main(String[] args) {
        //System.out.printf("La lista es: %n%s%n", obtenerMonsttruosTipoAire(ExcelReader.getListMonstruos()));
        System.out.printf("La lista productos es: %s%n", ExcelReader.getListProductos());
    }

    private static List<Monstruo> obtenerMonsttruosTipoAire(List<Monstruo> listaTotal){
        List<Monstruo> listaAire = new ArrayList<Monstruo>();
        for (Monstruo monstruo : listaTotal){
            if (monstruo.getTipo().equals("AIRE")){
                listaAire.add(monstruo);
            }
        }
        return listaAire;
    }
}
