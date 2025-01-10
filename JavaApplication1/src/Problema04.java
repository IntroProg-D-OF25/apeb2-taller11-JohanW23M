
import static Problema02.areaCuadrados;
import static Problema02.areaRectangulos;
import static Problema02.areaTriangulos;
import java.util.Scanner;


/**
 *
 * @author UTPL
 */
public class Problema04 {
    public static void main(String[] args) {
                Scanner tcl = new Scanner(System.in);

        int desMenu;
        boolean des = true; 
        String nomCliente , numCedula;
        
        
        while ( des == true){
         System.out.println("Seleccione una opcion: ");
        System.out.println("1. Calculo de Planilla de Luz: ");
        System.out.println("2. Calculo de predial: ");
    
        desMenu = tcl.nextInt();
        switch(desMenu){
        
            case 1 :
                    System.out.println("Ingrese el Nombre del cliente: ");
                    nomCliente = tcl.next();
                    System.out.println("Ingrese el numetro de cedula del cliente: ");
                    numCedula = tcl.next();
                    
                    
                    des = false;
                    break;
            case 2 : 
                    System.out.println("Ingrese el Nombre del cliente: ");
                    nomCliente = tcl.next();
                    System.out.println("Ingrese el numetro de cedula del cliente: ");
                    numCedula = tcl.next();
                    
                    des = false;
                    break;
        }

    }
    }
    public static 
    
}
