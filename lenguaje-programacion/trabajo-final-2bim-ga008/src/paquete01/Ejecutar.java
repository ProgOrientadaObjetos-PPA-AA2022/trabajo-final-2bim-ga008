/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;
import paquete02.Enlace;
import paquete03.PlanPostPagoMegas;
import paquete03.PlanPostPagoMinutos;
import paquete03.PlanPostPagoMinutosMegas;
import paquete03.PlanPostPagoMinutosMegasEconomico;

/**
 *
 * @author Joe
 */
public class Ejecutar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int op;
        boolean bandera = true;
        Enlace c = new Enlace();

        do {
            System.out.println("ESCOJA UNO DE LOS PLANES QUE OFRECE LA EMPRESA");
            System.out.println("1) INGRESAR PLAN POSTPAGO MINUTOS");
            System.out.println("2) INGRESAR PLAN POSTPAGO MEGAS");
            System.out.println("3) INGRESAR PLAN POSTPAGO MINUTOS MEGAS");
            System.out.println("4) INGRESAR PLAN POSTPAGO MINUTOS MEGAS ECONOMICO");
            op = sc.nextInt();
            sc.nextLine();

            if (op == 1 || op == 2 || op == 3 || op == 4) {
                System.out.println("INGRESE LOS DATOS DEL PROPIETARIO DEL PLAN");
                System.out.println("Ingrese el nombre del propietario: ");
                String nombre = sc.nextLine();
                System.out.println("Ingrese la cedula del propietario: ");
                String cedula = sc.nextLine();
                System.out.println("Ingrese la ciudad del propietario: ");
                String ciudad = sc.nextLine();
                System.out.println("Ingrese la marca del celular: ");
                String marca = sc.nextLine();
                System.out.println("Ingrese el modelo del celular: ");
                String modelo = sc.nextLine();
                System.out.println("Ingrese el numero de celular: ");
                String numero = sc.nextLine();

                if (op == 1) {

                    System.out.println("INGRESE LOS DATOS PARA EL "
                            + "PLAN POSTPAGO MINUTOS");
                    System.out.println("Ingrese el numero de minutos nacionales: ");
                    int mNacionales = sc.nextInt();
                    System.out.println("Ingrese el costo de los "
                            + "minutos nacionales: ");
                    double cMNacionales = sc.nextDouble();
                    System.out.println("Ingrese el numero de "
                            + "minutos internaciones: ");
                    int mInternacionales = sc.nextInt();
                    System.out.println("Ingrese el costo de los "
                            + "minutos internacionales: ");
                    double cMInternacionales = sc.nextDouble();
                    PlanPostPagoMinutos pppM = new PlanPostPagoMinutos(nombre,
                            cedula, ciudad, marca, modelo, numero, mNacionales,
                            cMNacionales, mInternacionales, cMInternacionales);
                    pppM.establecerPagoMensual();
                    c.insertarPlanPostPagoMinutos(pppM);
                } else {
                    if (op == 2) {
                        System.out.println("INGRESE LOS DATOS "
                                + "PARA EL PLAN POSTPAGO MEGAS");
                        System.out.println("Ingrese la tarifa base: ");
                        double tBase = sc.nextDouble();
                        System.out.println("Ingrese el numero de megas: ");
                        int nMegas = sc.nextInt();
                        System.out.println("Ingrese el costo de megas: ");
                        double cMegas = sc.nextDouble();
                        PlanPostPagoMegas pppmg
                                = new PlanPostPagoMegas(nombre, cedula, ciudad,
                                        marca, modelo, numero, tBase, nMegas, 
                                        cMegas);
                        pppmg.establecerPagoMensual();
                        c.insertarPlanPostPagoMegas(pppmg);
                    } else {
                        if (op == 3) {
                            System.out.println("INGRESE LOS DATOS PARA EL "
                                    + "PLAN POSTPAGO MINUTOS MEGAS");
                            System.out.println("Ingrese el numero de minutos: ");
                            int nMinutos = sc.nextInt();
                            System.out.println("Ingrese el costo de los minutos: ");
                            double cMinutos = sc.nextDouble();
                            System.out.println("Ingrese el numero de megas: ");
                            int nMegas = sc.nextInt();
                            System.out.println("Ingrese el costo de las megas: ");
                            double cMegas = sc.nextDouble();
                            PlanPostPagoMinutosMegas pppmm
                                    = new PlanPostPagoMinutosMegas(nombre, cedula,
                                            ciudad, marca, modelo, numero, nMinutos,
                                            cMinutos, nMegas, cMegas);
                            pppmm.establecerPagoMensual();
                            c.insertarPlanPostPagoMinutosMegas(pppmm);
                        } else {
                            if (op == 4) {
                                System.out.println("INGRESE LOS DATOS PARA EL PLAN "
                                        + "POSTPAGO MINUTOS MEGAS ECONOMICO");
                                System.out.println("Ingrese el numero de minutos: ");
                                int nMinutos = sc.nextInt();
                                System.out.println("Ingrese el "
                                        + "costo de los minutos: ");
                                double cMinutos = sc.nextDouble();
                                System.out.println("Ingrese el numero de megas: ");
                                int nMegas = sc.nextInt();
                                System.out.println("Ingrese el "
                                        + "costo de las megas: ");
                                double cMegas = sc.nextDouble();
                                System.out.println("Ingrese el "
                                        + "porcentaje de descuento: ");
                                int descuento = sc.nextInt();
                                PlanPostPagoMinutosMegasEconomico pppmme
                                        = new PlanPostPagoMinutosMegasEconomico(
                                                nombre, cedula, ciudad, marca,
                                                modelo, numero, nMinutos, cMinutos,
                                                nMegas, cMegas, descuento);
                                pppmme.establecerPagoMensual();
                                c.insertarPlanPostPagoMinutosMegasEconomico(pppmme);
                            }
                        }
                    }
                }
            } else {
                System.out.println("-----------------------------------------");
                System.out.println("OPCION INCORRECTA");
                System.out.println("-----------------------------------------");
            }
            System.out.println("-----------------------------------------");
            System.out.println("PARA SALIR PULSE (1)");
            System.out.println("PARA INGRESAR DATOS PULSE CUALQUIER TECLA");
            System.out.println("-----------------------------------------");
            int salida = sc.nextInt();
            sc.nextLine();
            if (salida == 1) {
                bandera = false;
            }
        } while (bandera);
        System.out.println("LISTA DE PLANES");
        for (int i = 0; i < c.obtenerDataPlanPostPagoMinutos().size(); i++) {
            System.out.printf("PLAN POST PAGO MINUTOS Nº %d", i + 1);
            System.out.println(c.obtenerDataPlanPostPagoMinutos().get(i));
            System.out.println("-------------------------------------------------");
        }
        
        for (int i = 0; i < c.obtenerDataPlanPostPagoMegas().size(); i++) {
            System.out.printf("PLAN POST PAGO MEGAS Nº %d", i + 1);
            System.out.println(c.obtenerDataPlanPostPagoMegas().get(i));
            System.out.println("-------------------------------------------------");
        }

        for (int i = 0; i
                < c.obtenerDataPlanPostPagoMinutosMegas().size(); i++) {
            System.out.printf("PLAN POST PAGO MINUTOS MEGAS Nº %d", i + 1);
            System.out.println(c.obtenerDataPlanPostPagoMinutosMegas().get(i));
            System.out.println("-------------------------------------------------");
        }

        for (int i = 0; i
                < c.obtenerDataPlanPostPagoMinutosMegasEconomico().size(); i++) {
            System.out.printf("PLAN POST PAGO MINUTOS MEGAS ECONOMICO Nº %d", i + 1);
            System.out.println(
                    c.obtenerDataPlanPostPagoMinutosMegasEconomico().get(i));
            System.out.println("-------------------------------------------------");
        }
    }
}
