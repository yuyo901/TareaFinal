package com.ceste;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by FITZ on 20/05/2016.
 */
public class ExportarCarnets2CVS {
    private final ArrayList<CarnetCruzRoja> carnets;
    private String fichero;

    public ExportarCarnets2CVS(ArrayList carnets, String fichero) {
        this.carnets = carnets;
        this.fichero = fichero;
    }
    public void guardarDatos(){
        try {
            FileWriter fW = new FileWriter(fichero);
            BufferedWriter bW = new BufferedWriter(fW);

            for (int i = 0 ; i < carnets.size();i++){
                String carnetsFichero = carnets.get(i).toString();
                bW.write(carnetsFichero, 0, carnetsFichero.length());
                bW.newLine();
            }
            bW.flush();
            bW.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
