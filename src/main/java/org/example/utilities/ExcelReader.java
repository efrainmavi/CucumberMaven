package org.example.utilities;

import com.poiji.bind.Poiji;
import org.example.entities.Monstruo;
import org.example.entities.Productos;

import java.io.File;
import java.util.List;

public class ExcelReader {
    private static final String excelPath = "src/main/resources/data/dataExcel.xlsx";

    public static List<Monstruo> getListMonstruos(){
        return Poiji.fromExcel(new File(excelPath), Monstruo.class);
    }
    public static List<Productos> getListProductos(){
        return Poiji.fromExcel(new File(excelPath), Productos.class);
    }
}
