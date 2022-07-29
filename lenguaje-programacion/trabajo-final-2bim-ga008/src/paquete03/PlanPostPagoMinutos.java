/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import paquete02.PlanCelular;

/**
 *
 * @author Joe
 */
public class PlanPostPagoMinutos extends PlanCelular {

    private int minutosNacionales;
    private double costoMinutosNacionales;
    private int minutosInternacionales;
    private double costoMinutosInternacionales;

    public PlanPostPagoMinutos(String n, String c, String cdd, String mC, 
            String mdC, String nC, int mn, double cmn, int mi, double cmi) {
        super(n, c, cdd, mC, mdC, nC);
        minutosNacionales = mn;
        costoMinutosNacionales = cmn;
        minutosInternacionales = mi;
        costoMinutosInternacionales = cmi;
    }

    public void establecerMinutosNacionales(int mn) {
        minutosNacionales = mn;
    }

    public void establecerCostoMinutosNacionales(double cmn) {
        costoMinutosNacionales = cmn;
    }

    public void establecerMinutosInternacionales(int mi) {
        minutosInternacionales = mi;
    }

    public void establecerCostoMinutosInternacionales(double cmi) {
        costoMinutosInternacionales = cmi;
    }

    @Override
    public void establecerPagoMensual() {
        pagoMensual = (minutosNacionales * costoMinutosNacionales)
                + (minutosInternacionales * costoMinutosInternacionales);
    }

    public int obtenerMinutosNacionales() {
        return minutosNacionales;
    }

    public double obtenerCostoMinutosNacionales() {
        return costoMinutosNacionales;
    }

    public int obtenerMinutosInternacionales() {
        return minutosInternacionales;
    }

    public double obtenerCostoMinutosInternacionales() {
        return costoMinutosInternacionales;
    }
    
    @Override
    public String toString(){
    String cadena = String.format("\n%s"
            + "Numero minutos nacionales: %d\n"
            + "Costo minutos nacionales: %.2f\n"
            + "Numero minutos internacionales: %d\n"
            + "Costo minutos internacionales: %.2f\n"
            + "Pago mensual: %.2f\n", 
            super.toString(), minutosNacionales, costoMinutosNacionales,
            minutosInternacionales, costoMinutosInternacionales, pagoMensual);
    return cadena;
    }
}
