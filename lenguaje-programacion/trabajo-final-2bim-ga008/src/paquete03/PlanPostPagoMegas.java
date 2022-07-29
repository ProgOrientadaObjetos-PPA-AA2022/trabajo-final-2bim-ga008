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
public class PlanPostPagoMegas extends PlanCelular{
    private double tarifaBase;
    private int megasEnGigas;
    private double costoMegasEnGigas;

    public PlanPostPagoMegas(String n, String c, String cdd, String mC, 
            String mdC, String nC, double tb, int mi, double cmi) {
        super(n, c, cdd, mC, mdC, nC);
        tarifaBase = tb;
        megasEnGigas = mi;
        costoMegasEnGigas = cmi;
    }

    public void establecerTarifaBase(double tb) {
        tarifaBase = tb;
    }

    public void establecerMegasEnGigas(int mi) {
        megasEnGigas = mi;
    }

    public void establecerCostoMegasEnGigas(double cmi) {
        costoMegasEnGigas = cmi;
    }

    @Override
    public void establecerPagoMensual() {
        pagoMensual = tarifaBase + (megasEnGigas * costoMegasEnGigas); 
    }

    public double obtenerTarifaBase() {
        return tarifaBase;
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
            + "Megas en Gigas: %d\n"
            + "Costo Megas en Gigas: %.2f\n"
            + "Tarifa Base: %.2f\n"
            + "Pago mensual: %.2f\n", 
            super.toString(), megasEnGigas, costoMegasEnGigas, 
            tarifaBase, pagoMensual);
    return cadena;
    }
}
