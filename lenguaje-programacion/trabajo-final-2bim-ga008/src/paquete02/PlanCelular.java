/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author Joe
 */
public abstract class PlanCelular {

    protected String nomPropietario;
    protected String cedPropietario;
    protected String cddPropietario;
    protected String marcaCelular;
    protected String modeloCelular;
    protected String numeroCelular;
    protected double pagoMensual;

    public PlanCelular(String n, String c, String cdd,
            String mC, String mdC, String nC) {
        nomPropietario = n;
        cedPropietario = c;
        cddPropietario = cdd;
        marcaCelular = mC;
        modeloCelular = mdC;
        numeroCelular = nC;
    }

    public void establecerNombrePropietario(String n) {
        nomPropietario = n;
    }

    public void establecerCedulaPropietario(String c) {
        cedPropietario = c;
    }

    public void establecerCiudadPropietario(String cd) {
        cddPropietario = cd;
    }

    public void establecerMarcaCelular(String m) {
        marcaCelular = m;
    }

    public void establecerModeloCelular(String mc) {
        modeloCelular = mc;
    }

    public void establecerNumeroCelular(String n) {
        numeroCelular = n;
    }

    public abstract void establecerPagoMensual();

    public String obtenerNombrePropietario() {
        return nomPropietario;
    }

    public String obtenerCedulaPropietario() {
        return cedPropietario;
    }

    public String obtenerCiudadPropietario() {
        return cddPropietario;
    }

    public String obtenerMarcaCelular() {
        return marcaCelular;
    }

    public String obtenerModeloCelular() {
        return modeloCelular;
    }

    public String obtenerNumeroCelular() {
        return numeroCelular;
    }

    public double obtenerPagoMesual() {
        return pagoMensual;
    }

    @Override
    public String toString() {
        String cadena = String.format("DATOS PROPIETARIO\n"
                + "Nombre: %s\n"
                + "Cedula: %s\n"
                + "Ciudad: %s\n"
                + "Marca del celular: %s\n"
                + "Modelo de celular: %s\n"
                + "Numero de celular: %s\n", 
                nomPropietario,
                cedPropietario, 
                cddPropietario, 
                marcaCelular, 
                modeloCelular, 
                numeroCelular);
        return cadena;
    }
}
