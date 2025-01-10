
import java.util.Scanner;
/**
 *
 * @author UTPL
 */
public class Problema02 {
    public static void main(String[] args) {
        int desMenu;
        boolean des = true;
        double num1, num2, resp = 0;
       Scanner tcl = new Scanner(System.in);
       
        while ( des == true){
         System.out.println("Seleccione una opcion: ");
        System.out.println("1. Area de un Cuadrado");
        System.out.println("2. Area de un Triangulo");
        System.out.println("3. Area de un Rectangulo");
 
        desMenu = tcl.nextInt();
        switch(desMenu){
        
            case 1 :
                    System.out.println("Dame la medida de un lado del Cuadrado: ");
                    num1 = tcl.nextDouble();
                    resp = areaCuadrados(num1, resp);
                    System.out.println("El area del cuadrado es: " + resp );
                    des = false;
                    break;
            case 2 : 
                    System.out.println("Dame la medida de la base del triangulo: ");
                    num1 = tcl.nextDouble();
                    System.out.println("Dame la altura del triangulo: ");
                    num2 = tcl.nextInt();
                    resp = areaTriangulos(num1, num2, resp);
                    System.out.println("El area del tiangulo es: " + resp );
                    des = false;
                    break;
            case 3 :
                    System.out.println("Dame la medida del largo del rectangulo: ");
                    num1 = tcl.nextDouble();
                    System.out.println("Dame la medida del ancho del rectangulo: ");
                    num2 = tcl.nextInt();
                    resp = areaRectangulos(num1, num2, resp);
                    System.out.println("El area del rectangulo es: " + resp );
                    des = false;
                    break;

        }

    }

     
    }
    public static double areaCuadrados(double num1, double resp){
        resp = num1 * num1;
        return resp;
    }
    public static double areaTriangulos(double num1, double num2, double resp){
        resp = (num1 * num2)/2;
        return resp;
    }
    public static double areaRectangulos(double num1, double num2, double resp){
        resp = num1 * num2;
        return resp;
    }
}
