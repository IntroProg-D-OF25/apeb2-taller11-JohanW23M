
import java.util.Scanner;
/**
 *Problema 02
Generar una solución que implemente 3 procedimientos. Que permitan 
* calcular el área de un cuadrado, área de un triángulo y área de un
* rectángulo. Cada procedimiento/función debe recibir los datos necesarios 
* y generar el valor correspondiente. Se debe invocar a los procedimientos 
* desde un método principal; Si el usuario ingresa 1 se llama al procedimiento 
* obtenerAreaCuadrado; 2 se llama al procedimiento obtenerAreaTriangulo; 3 se 
* llama al procedimiento obtenerAreaCuadrado.
El área del cuadrado es igual a lado x lado x lado x lado
El área del triángulo es igual a (base x altura)/2
El área del rectángulo es igual a base x altura
 * @author Johan Wang
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
            default : System.out.println("Error opcion no valida{vuelva a intentarlo}"); 
                      des = true;
                     
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
/**
 * debug:
Seleccione una opcion: 
1. Area de un Cuadrado
2. Area de un Triangulo
3. Area de un Rectangulo
1
Dame la medida de un lado del Cuadrado: 
4
El area del cuadrado es: 16.0
BUILD SUCCESSFUL (total time: 8 seconds)

* debug:
Seleccione una opcion: 
1. Area de un Cuadrado
2. Area de un Triangulo
3. Area de un Rectangulo
2
Dame la medida de la base del triangulo: 
5
Dame la altura del triangulo: 
3
El area del tiangulo es: 7.5
BUILD SUCCESSFUL (total time: 16 seconds)

* debug:
Seleccione una opcion: 
1. Area de un Cuadrado
2. Area de un Triangulo
3. Area de un Rectangulo
3
Dame la medida del largo del rectangulo: 
5
Dame la medida del ancho del rectangulo: 
2
El area del rectangulo es: 10.0
BUILD SUCCESSFUL (total time: 7 seconds)

 */