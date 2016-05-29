package com.ceste;

import java.text.ParseException;
import java.util.Comparator;

/**
 * Created by FITZ on 20/05/2016.
 */
public class CaducidadComparator implements Comparator<CarnetCruzRoja>{

    @Override
    public int compare(CarnetCruzRoja o1, CarnetCruzRoja o2) {
        try {
            return (o1).getCaducidad().compareTo((o2).getCaducidad());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
