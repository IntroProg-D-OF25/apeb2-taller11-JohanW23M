

import java.util.Scanner;


/**
 *Problema 04
Generar un procedimiento para calcular el valor de la planilla de luz y 
* otro procedimiento para calcular el valor del predio de un bien inmueble. 
* Cada procedimiento debe tener 2 parámetros (tipo cadena para nombre del cliente, 
* cédula del cliente).
En el procedimiento de planilla de luz se debe pedir los siguiente datos valor del 
* kilowatio y el número de kilowatios del mes. Y se genera en pantalla el siguiente 
* reporte: Cliente Ana Contreras con cédula 1100112233 debe cancelar el valor de $10

En el procedimiento del predio se debe pedir el valor de inmueble y el para obtener 
* el valor del predio se saca el 2% del valor del inmueble. Y se genera el siguiente reporte:

Cliente Ana Contreras con cédula 1100112233 tiene un bien inmueble valorado en $30000 
* y tiene que pagar de predio $ 600.

En el método principal; si el usuario ingresa 1 se llama al procedimiento calcularValorLuz;
* 2 se llama al procedimiento calcularPredio. Los datos que se necesita en cada 
* procedimiento se los debe ingresar por teclado.
 * @author Johan Wang
 */
public class Problema04 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double preskilovatio, n_kilovatio, totalplanilla = 0, valorBien;
        int desMenu;
        boolean des = true; 
        String nomCliente = "" ,apellidoCliente = "", numCedula = "";
       
        
        while ( des == true){
         System.out.println("Seleccione una opcion: ");
        System.out.println("1. Calculo de Planilla de Luz: ");
        System.out.println("2. Calculo de predial: ");
    
        desMenu = tcl.nextInt();
        
        if (desMenu == 1){
            System.out.println("Ingrese el nombre del cliente: ");
            nomCliente = tcl.next();
            apellidoCliente = tcl.next();
            System.out.println("Ingrese el numero de cedula del cliente: ");
            numCedula = tcl.next();
            System.out.println("Ingrese el valor del kilovatio: ");
            preskilovatio = tcl.nextDouble();
            System.out.println("Ingrese la cantidad de kilovatios consumidos: ");
            n_kilovatio = tcl.nextDouble(); 
            System.out.println("Nombre: " + nomCliente + " " + apellidoCliente);
            System.out.println("Numero de cedula: " + numCedula);
            System.out.println("Total a pagar: " + calculoPlanillaLuz(preskilovatio, n_kilovatio, totalplanilla));
            des = false;
        }else if (desMenu == 2){
            System.out.println("Ingrese el nombre del cliente: ");
            nomCliente = tcl.next();
            apellidoCliente = tcl.next();
            System.out.println("Ingrese el numero de cedula del cliente: ");
            numCedula = tcl.next();
            System.out.println("Ingrese el valor de el bien inmueble");
            valorBien = tcl.nextDouble();
            System.out.println("Nombre: " + nomCliente + " " + apellidoCliente);
            System.out.println("Numero de cedula: " + numCedula);
            System.out.println("Valor del bien inmueble: " + valorBien);
            System.out.println("Valor a pagor por predio: " + calculoPredio(valorBien));
            des = false;
        }else{
            System.out.println("Error opcion no valida (vuelve a intentarlo)");
        }
        }
        
    }
    
    public static double calculoPlanillaLuz(double preskilovatio, double n_kilovatio, double totalplanilla){
        totalplanilla = preskilovatio * n_kilovatio;
        return totalplanilla;
    }
    public static double calculoPredio(double valorBien){
        valorBien *= 0.02;
        return valorBien;
    }
     
     
}
/**
 * debug:
Seleccione una opcion: 
1. Calculo de Planilla de Luz: 
2. Calculo de predial: 
1
Ingrese el nombre del cliente: 
Jose Delgado
Ingrese el numero de cedula del cliente: 
1104590813
Ingrese el valor del kilovatio: 
0,80
Ingrese la cantidad de kilovatios consumidos: 
1000
Nombre: Jose Delgado
Numero de cedula: 1104590813
Total a pagar: 800.0
BUILD SUCCESSFUL (total time: 24 seconds)
* debug:
Seleccione una opcion: 
1. Calculo de Planilla de Luz: 
2. Calculo de predial: 
2
Ingrese el nombre del cliente: 
Pedro Martinez
Ingrese el numero de cedula del cliente: 
1000831221
Ingrese el valor de el bien inmueble
10000
Nombre: Pedro Martinez
Numero de cedula: 1000831221
Valor del bien inmueble: 10000.0
Valor a pagor por predio: 200.0
BUILD SUCCESSFUL (total time: 32 seconds)
debug:
Seleccione una opcion: 
1. Calculo de Planilla de Luz: 
2. Calculo de predial: 
3
Error opcion no valida (vuelve a intentarlo)
Seleccione una opcion: 
1. Calculo de Planilla de Luz: 
2. Calculo de predial: 

 */
