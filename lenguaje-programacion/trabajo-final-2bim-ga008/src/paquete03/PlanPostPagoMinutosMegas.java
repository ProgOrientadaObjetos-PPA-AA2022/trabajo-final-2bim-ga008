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
public class PlanPostPagoMinutosMegas extends PlanCelular{
    private int minutos;
    private double costoMinutos;
    private int megasEnGigas;
    private double costoMegasEnGigas;

    public PlanPostPagoMinutosMegas(String n, String c, String cdd, String mC, 
            String mdC, String nC, int mn, double cmn, int mi, double cmi) {
        super(n, c, cdd, mC, mdC, nC);
        minutos = mn;
        costoMinutos = cmn;
        megasEnGigas = mi;
        costoMegasEnGigas = cmi;
    }   

    public void establecerMinutos(int mn) {
        minutos = mn;
    }

    public void establecerCostoMinutos(double cmn) {
        costoMinutos = cmn;
    }

    public void establecerMegasEnGigas(int mi) {
        megasEnGigas = mi;
    }

    public void establecerCostoMegasEnGigas(double cmi) {
        costoMegasEnGigas = cmi;
    }

    @Override
    public void establecerPagoMensual() {
        pagoMensual = (minutos * costoMinutos)
                + (megasEnGigas * costoMegasEnGigas);
    }

    public int obtenerMinutos() {
        return minutos;
    }

    public double obtenerCostoMinutos() {
        return costoMinutos;
    }

    public int obtenerMegasEnGigas() {
        return megasEnGigas;
    }

    public double obtenerCostoMegasEnGigas() {
        return costoMegasEnGigas;
    }
   
    @Override
    public String toString(){
    String cadena = String.format("\n%s"
            + "Numero minutos: %d\n"
            + "Costo minutos: %.2f\n"
            + "Megas en Gigas: %d\n"
            + "Costo Megas en Gigas: %.2f\n"
            + "Pago mensual: %.2f\n", 
            super.toString(), minutos, costoMinutos,
            megasEnGigas, costoMegasEnGigas, pagoMensual);
    return cadena;
    }
}
