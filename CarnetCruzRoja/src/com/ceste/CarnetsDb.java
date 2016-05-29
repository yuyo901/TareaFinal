package com.ceste;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by FITZ on 20/05/2016.
 */
public class CarnetsDb implements Serializable{
    private ArrayList<CarnetCruzRoja> carnets;
    private String fichero ;
    CarnetsDb(ArrayList carnets, String fichero) {
        this.carnets = carnets;
        this.fichero = fichero;
        // Completa
    }
    /**
     * Abre el fichero en modo lectura y carga sus datos en la variable carnets
     * Debes usar flujos de objetos (ObjectInputStream)
     */
    public void cargar() {
        try {
            FileInputStream fIs =new FileInputStream(fichero);
            ObjectInputStream oIs = new ObjectInputStream(fIs);
            CarnetCruzRoja cruzRojas = null;
            while((cruzRojas = (CarnetCruzRoja)oIs.readObject())!= null) {
                System.out.println(cruzRojas);
            }
            oIs.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (EOFException e) {
        }catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        // Completa
    }
    /**
     * Abre el fichero en modo escritura y vuelca en el contenido del atributo carnets
     * Debes usar flujos de objetos (ObjectOutputStream)
     */
    public void guardar() {
        try {
            FileOutputStream fOs = new FileOutputStream(fichero);
            ObjectOutputStream oOs = new ObjectOutputStream(fOs);
            for (int i = 0 ; i < carnets.size(); i++){
                oOs.writeObject(carnets.get(i));
                oOs.flush();
            }
            oOs.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void add(CarnetCruzRoja carnet){
        Scanner x = new Scanner(System.in);
        System.out.print("Dni: ");
        carnet.setDni(x.nextLine());
        System.out.print("Nombre: ");
        carnet.setNombre(x.nextLine());
        System.out.print("Apellido: ");
        carnet.setApellido(x.nextLine());
        System.out.print("Localidad: ");
        carnet.setLocalidad(x.nextLine());
        System.out.print("Provincia: ");
        carnet.setProvincia(x.nextLine());
        System.out.print("Servicio: ");
        carnet.setServicio(x.nextLine());
        System.out.print("Caducidad: ");
        carnet.setCaducidad(x.nextLine());
        carnets.add(carnet);
    }
}
