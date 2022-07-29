/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import paquete03.PlanPostPagoMinutosMegas;
import paquete03.PlanPostPagoMegas;
import paquete03.PlanPostPagoMinutosMegasEconomico;
import paquete03.PlanPostPagoMinutos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author Joe
 */
public class Enlace {
    private Connection conn;
       
    public void establecerConexion() {  

        try {  
            // db parameters  
            String url = "jdbc:sqlite:bd/PlanCelular.db";  
            // create a connection to the database  
            conn = DriverManager.getConnection(url);  
            // System.out.println(conn.isClosed());
            // System.out.println("Connection to SQLite has been established.");  
              
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }   
        
    } 
    
    public Connection obtenerConexion(){
        return conn;
    }
    
    public void insertarPlanPostPagoMinutos(PlanPostPagoMinutos pppm) {  
  
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO PlanPotPagoMinutos(nombre, "
                    + "cedula, ciudad, marcaCelular, modeloCelular, numeroCelular, "
                    + "numeroMinutosNacionales, costoMinutosNacionales, "
                    + "numeroMinutosInternacionales, costoMinutosInternacionales,"
                    + "pagoMensual)"
                    + "values ('%s', '%s', '%s', '%s', '%s', '%s', '%d', '%.2f', "
                    + "'%d', '%.2f', '%.2f')", 
                    pppm.obtenerNombrePropietario(),
                    pppm.obtenerCedulaPropietario(),
                    pppm.obtenerCiudadPropietario(),
                    pppm.obtenerMarcaCelular(),
                    pppm.obtenerModeloCelular(),
                    pppm.obtenerNumeroCelular(),
                    pppm.obtenerMinutosNacionales(),
                    pppm.obtenerCostoMinutosNacionales(),
                    pppm.obtenerMinutosInternacionales(),
                    pppm.obtenerCostoMinutosInternacionales(),
                    pppm.obtenerPagoMesual());
            // System.out.println(data);
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {  
             System.out.println("Exception:");
             System.out.println(e.getMessage());  
             
        }  
    }
    
    public ArrayList<PlanPostPagoMinutos> obtenerDataPlanPostPagoMinutos() {  
        ArrayList<PlanPostPagoMinutos> lista = new ArrayList<>();
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from PlanPotPagoMinutos;";
            
            ResultSet rs = statement.executeQuery(data);
            while(rs.next()){
                PlanPostPagoMinutos planppm = new PlanPostPagoMinutos(
                        rs.getString("nombre"),
                        rs.getString("cedula"),
                        rs.getString("ciudad"),
                        rs.getString("marcaCelular"),
                        rs.getString("modeloCelular"),
                        rs.getString("numeroCelular"),
                        rs.getInt("numeroMinutosNacionales"),
                        rs.getDouble("costoMinutosNacionales"),
                        rs.getInt("numeroMinutosInternacionales"),
                        rs.getDouble("costoMinutosInternacionales"));
                planppm.establecerPagoMensual();
                lista.add(planppm);
            }
            
            obtenerConexion().close();
        } catch (SQLException e) {  
             System.out.println("Exception: insertarPlan");
             System.out.println(e.getMessage());  
             
        }  
        return lista;
    }
    public void insertarPlanPostPagoMegas(PlanPostPagoMegas pppmg) {  
  
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO PlanPostPagoMegas(nombre, "
                    + "cedula, ciudad, marcaCelular, modeloCelular, "
                    + "numeroCelular, tarifaBase, numeroMegas, costoMegas,"
                    + "pagoMensual)"
                    + "values ('%s', '%s', '%s', '%s', '%s', '%s', "
                    + "'%.2f', '%d', '%.2f', '%.2f')", 
                    pppmg.obtenerNombrePropietario(),
                    pppmg.obtenerCedulaPropietario(),
                    pppmg.obtenerCiudadPropietario(),
                    pppmg.obtenerMarcaCelular(),
                    pppmg.obtenerModeloCelular(),
                    pppmg.obtenerNumeroCelular(),
                    pppmg.obtenerTarifaBase(),
                    pppmg.obtenerMegasEnGigas(),
                    pppmg.obtenerCostoMegasEnGigas(),
                    pppmg.obtenerPagoMesual());
            // System.out.println(data);
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {  
             System.out.println("Exception:");
             System.out.println(e.getMessage());  
             
        }  
    }
    
    public ArrayList<PlanPostPagoMegas> obtenerDataPlanPostPagoMegas() {  
        ArrayList<PlanPostPagoMegas> lista = new ArrayList<>();
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from PlanPostPagoMegas;";
            
            ResultSet rs = statement.executeQuery(data);
            while(rs.next()){
                PlanPostPagoMegas planppmg = new PlanPostPagoMegas(
                        rs.getString("nombre"),
                        rs.getString("cedula"),
                        rs.getString("ciudad"),
                        rs.getString("marcaCelular"),
                        rs.getString("modeloCelular"),
                        rs.getString("numeroCelular"),
                        rs.getDouble("tarifaBase"),
                        rs.getInt("numeroMegas"),
                        rs.getDouble("costoMegas"));
                planppmg.establecerPagoMensual();
                lista.add(planppmg);
            }
            
            obtenerConexion().close();
        } catch (SQLException e) {  
             System.out.println("Exception: insertarPlan");
             System.out.println(e.getMessage());  
             
        }  
        return lista;
    }
    public void insertarPlanPostPagoMinutosMegas(PlanPostPagoMinutosMegas pppmm) {  
  
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO PlanPostPagoMinutosMegas"
                    + "(nombre, cedula, ciudad, marcaCelular, modeloCelular, "
                    + "numeroCelular, numeroMinutos, costoMinutos, "
                    + "numeroMegas, costoMegas, pagoMensual)"
                    + "values ('%s', '%s', '%s', '%s', '%s', '%s', '%d', '%.2f',"
                    + "'%d', '%.2f', '%.2f')", 
                    pppmm.obtenerNombrePropietario(),
                    pppmm.obtenerCedulaPropietario(),
                    pppmm.obtenerCiudadPropietario(),
                    pppmm.obtenerMarcaCelular(),
                    pppmm.obtenerModeloCelular(),
                    pppmm.obtenerNumeroCelular(),
                    pppmm.obtenerMinutos(),
                    pppmm.obtenerCostoMinutos(),
                    pppmm.obtenerMegasEnGigas(),
                    pppmm.obtenerCostoMegasEnGigas(),
                    pppmm.obtenerPagoMesual());
            // System.out.println(data);
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {  
             System.out.println("Exception:");
             System.out.println(e.getMessage());  
             
        }  
    }
    
    public ArrayList<PlanPostPagoMinutosMegas> 
        obtenerDataPlanPostPagoMinutosMegas() {  
        ArrayList<PlanPostPagoMinutosMegas> lista = new ArrayList<>();
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from PlanPostPagoMinutosMegas;";
            
            ResultSet rs = statement.executeQuery(data);
            while(rs.next()){
                PlanPostPagoMinutosMegas planppmm = new PlanPostPagoMinutosMegas(
                        rs.getString("nombre"),
                        rs.getString("cedula"),
                        rs.getString("ciudad"),
                        rs.getString("marcaCelular"),
                        rs.getString("modeloCelular"),
                        rs.getString("numeroCelular"),
                        rs.getInt("numeroMinutos"),
                        rs.getDouble("costoMinutos"),
                        rs.getInt("numeroMegas"),
                        rs.getDouble("costoMegas"));
                planppmm.establecerPagoMensual();
                lista.add(planppmm);
            }
            
            obtenerConexion().close();
        } catch (SQLException e) {  
             System.out.println("Exception: insertarPlan");
             System.out.println(e.getMessage());  
             
        }  
        return lista;
    }
    public void insertarPlanPostPagoMinutosMegasEconomico
        (PlanPostPagoMinutosMegasEconomico pppmme) {  
  
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO "
                    + "PlanPostPagoMinutosMegasEconomico "
                    + "(nombre, cedula, ciudad, marcaCelular, modeloCelular, "
                    + "numeroCelular, numeroMinutos, costoMinutos, numeroMegas,"
                    + "costoMegas, descuento, pagoMensual)"
                    + "values ('%s', '%s', '%s', '%s', '%s', '%s', '%d', "
                    + "'%.2f', '%d', '%.2f', '%d', '%.2f')", 
                    pppmme.obtenerNombrePropietario(),
                    pppmme.obtenerCedulaPropietario(),
                    pppmme.obtenerCiudadPropietario(),
                    pppmme.obtenerMarcaCelular(),
                    pppmme.obtenerModeloCelular(),
                    pppmme.obtenerNumeroCelular(),
                    pppmme.obtenerMinutos(),
                    pppmme.obtenerCostoMinutos(),
                    pppmme.obtenerMegasEnGigas(),
                    pppmme.obtenerCostoMegasEnGigas(),
                    pppmme.obtenerDescuento(),
                    pppmme.obtenerPagoMesual());
            // System.out.println(data);
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {  
             System.out.println("Exception:");
             System.out.println(e.getMessage());  
             
        }  
    }
    
    public ArrayList<PlanPostPagoMinutosMegasEconomico> 
        obtenerDataPlanPostPagoMinutosMegasEconomico() {  
        ArrayList<PlanPostPagoMinutosMegasEconomico> lista = new ArrayList<>();
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from PlanPostPagoMinutosMegasEconomico;";
            
            ResultSet rs = statement.executeQuery(data);
            while(rs.next()){
                PlanPostPagoMinutosMegasEconomico planppmme = 
                        new PlanPostPagoMinutosMegasEconomico(
                        rs.getString("nombre"),
                        rs.getString("cedula"),
                        rs.getString("ciudad"),
                        rs.getString("marcaCelular"),
                        rs.getString("modeloCelular"),
                        rs.getString("numeroCelular"),
                        rs.getInt("numeroMinutos"),
                        rs.getDouble("costoMinutos"),
                        rs.getInt("numeroMegas"),
                        rs.getDouble("costoMegas"),
                        rs.getInt("descuento"));
                planppmme.establecerPagoMensual();
                lista.add(planppmme);
            }
            
            obtenerConexion().close();
        } catch (SQLException e) {  
             System.out.println("Exception: "
                     + "insertarPlanPostPagoMinutosMegasEconomico");
             System.out.println(e.getMessage());  
             
        }  
        return lista;
    }
}
