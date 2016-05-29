package com.ceste;

import java.util.*;

/**
 * Created by FITZ on 20/05/2016.
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<CarnetCruzRoja> carnetsArrayList = new ArrayList<>();

        CarnetCruzRoja carnet1 = new CarnetCruzRoja();
        CarnetCruzRoja carnet2 = new CarnetCruzRoja();
        CarnetCruzRoja carnet3 = new CarnetCruzRoja();
        CarnetCruzRoja carnet4 = new CarnetCruzRoja();
        CarnetCruzRoja carnet5 = new CarnetCruzRoja();

        carnet1.setNombre("Manuel");
        carnet1.setApellido("Gutierrez");
        carnet1.setDni("Y456348J");
        carnet1.setProvincia("Zaragoza");
        carnet1.setLocalidad("Zaragoza");
        carnet1.setServicio("Voluntario");
        carnet1.setCaducidad("2018-07-23");

        carnet2.setNombre("Fitz");
        carnet2.setApellido("Gerald");
        carnet2.setDni("Y987324J");
        carnet2.setProvincia("Zaragoza");
        carnet2.setLocalidad("Zaragoza");
        carnet2.setServicio("Voluntario");
        carnet2.setCaducidad("2018-07-19");

        carnet3.setNombre("Elias");
        carnet3.setApellido("Salvatore");
        carnet3.setDni("Y796482J");
        carnet3.setProvincia("Zaragoza");
        carnet3.setLocalidad("Zaragoza");
        carnet3.setServicio("Voluntario");
        carnet3.setCaducidad("2018-08-02");

        carnet4.setNombre("Maria");
        carnet4.setApellido("Pilar");
        carnet4.setDni("Y8379164J");
        carnet4.setProvincia("Zaragoza");
        carnet4.setLocalidad("Zaragoza");
        carnet4.setServicio("Voluntario");
        carnet4.setCaducidad("2018-07-16");

        carnet5.setNombre("Jesus");
        carnet5.setApellido("Martinez");
        carnet5.setDni("Y137982J");
        carnet5.setProvincia("Zaragoza");
        carnet5.setLocalidad("Zaragoza");
        carnet5.setServicio("Voluntario");
        carnet5.setCaducidad("2018-08-05");

        carnetsArrayList.add(carnet1);
        carnetsArrayList.add(carnet1);
        carnetsArrayList.add(carnet2);
        carnetsArrayList.add(carnet3);
        carnetsArrayList.add(carnet4);
        carnetsArrayList.add(carnet5);
        System.out.println(carnetsArrayList+"\n");

        Set carnetsSet = new HashSet<>();
        carnetsSet.add(carnet1);
        carnetsSet.add(carnet1);
        carnetsSet.add(carnet2);
        carnetsSet.add(carnet3);
        carnetsSet.add(carnet4);
        carnetsSet.add(carnet5);
        //System.out.println(carnetsSet+"\n");

        for (Iterator<CarnetCruzRoja> iter = carnetsSet.iterator(); iter.hasNext();){
            CarnetCruzRoja setCarnets = iter.next();
            System.out.println(setCarnets);
        }
        System.out.println("\n");

        Set<CarnetCruzRoja> carnetsApellidoComparable = new TreeSet<CarnetCruzRoja>();
        carnetsApellidoComparable.add(carnet1);
        carnetsApellidoComparable.add(carnet2);
        carnetsApellidoComparable.add(carnet3);
        carnetsApellidoComparable.add(carnet4);
        carnetsApellidoComparable.add(carnet5);

        for (Iterator<CarnetCruzRoja> iter = carnetsApellidoComparable.iterator(); iter.hasNext();) {
            CarnetCruzRoja carnetsApellidos = iter.next();
            System.out.println(carnetsApellidos);
        }
        System.out.println("\n");

        Comparator dniComparator = new CarnetCruzRoja();

        Set<CarnetCruzRoja> carnetsDniComparator = new TreeSet<>(dniComparator);
        carnetsDniComparator.add(carnet1);
        carnetsDniComparator.add(carnet2);
        carnetsDniComparator.add(carnet3);
        carnetsDniComparator.add(carnet4);
        carnetsDniComparator.add(carnet5);

        for (Iterator<CarnetCruzRoja> iter = carnetsDniComparator.iterator(); iter.hasNext();) {
            CarnetCruzRoja comparatorDni = iter.next();
            System.out.println(comparatorDni);
        }
        System.out.println("\n");

        Comparator fechaComparator = new CaducidadComparator();

        Set<CarnetCruzRoja> carnetsFechaComparator = new TreeSet<>(fechaComparator);
        carnetsFechaComparator.add(carnet1);
        carnetsFechaComparator.add(carnet2);
        carnetsFechaComparator.add(carnet3);
        carnetsFechaComparator.add(carnet4);
        carnetsFechaComparator.add(carnet5);

        for (Iterator<CarnetCruzRoja> iter = carnetsFechaComparator.iterator(); iter.hasNext();) {
          CarnetCruzRoja comparatorFecha = iter.next();
            System.out.println(comparatorFecha);
        }
        System.out.println("\n");

        ExportarCarnets2CVS carnets2CVS = new ExportarCarnets2CVS(carnetsArrayList, "C:\\Users\\FITZ\\Desktop\\CarnetCruzRoja\\Carnets Cruz Roja.csv");
        CarnetsDb carnetsDb = new CarnetsDb(carnetsArrayList, "C:\\Users\\FITZ\\Desktop\\CarnetCruzRoja\\Carnets Cruz Roja.ser" );
        carnets2CVS.guardarDatos();
        carnetsDb.guardar();
        carnetsDb.cargar();
        System.out.println("\n");
        CarnetCruzRoja carnet = new CarnetCruzRoja();
        carnetsDb.add(carnet);
        carnetsDb.guardar();
        carnetsDb.cargar();


    }

}
