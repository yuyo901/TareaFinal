package com.ceste;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

/**
 * Created by FITZ on 20/05/2016.
 */
public class CarnetCruzRoja implements Comparable<CarnetCruzRoja>, Comparator<CarnetCruzRoja>, Serializable{
    private String nombre;
    private String apellido;
    private String dni;
    private String provincia;
    private String localidad;
    private String servicio;
    private String caducidad;

    public CarnetCruzRoja() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public Date getCaducidad() throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Date fecha = formato.parse(caducidad);
        return fecha;
    }

    public void setCaducidad(String caducidad) {
        this.caducidad = caducidad;
    }

    public String toString() {
        return nombre + "\t" + apellido + "\t" + dni + "\t" + provincia + "\t" + localidad + "\t" + servicio + "\t" + caducidad;
    }

    @Override
    public int compareTo(CarnetCruzRoja o) {
        int x = apellido.compareTo(o.apellido);
        return (x != 0 ? x : nombre.compareTo(o.nombre));
    }

    @Override
    public int compare(CarnetCruzRoja o1, CarnetCruzRoja o2) {
        return (o1).getDni().compareTo((o2).getDni());
    }
}