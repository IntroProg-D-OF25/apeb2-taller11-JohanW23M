
import java.util.Scanner;



/**
 *Problema 03
Generar una función que tenga 4 parámetros de tipo decimal y devuelva
* el promedio cualitativo de los parámetros. Si el promedio es: De 0 a 
* 5 el promedio cualitativo es Regular De 5.1 a 8 el promedio es Bueno
* De 8.1 a 9 el promedio es Muy Bueno De 9.1 a 10 el promedio es Sobresaliente.
* A la función se la debe llamar desde un método principal. Los parámetros 
* necesarios para llamar a la función, deben ser ingresados solicitados al usuario.
 * @author Johan Wang
 */
public class Problema03 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double nota1, nota2, nota3, nota4, nota = 0;
        String notaCuantitativa = null;
        System.out.println("Ingrese La primera nota:");
        nota1 = tcl.nextDouble();
        System.out.println("Ingrese La segunda nota:");
        nota2 = tcl.nextDouble();
        System.out.println("Ingrese La tercera nota:");
        nota3 = tcl.nextDouble();
        System.out.println("Ingrese La cuarta nota:");
        nota4 = tcl.nextDouble();
        System.out.println("La nota cuantitativa es: "+ notaCualitativas(nota1, nota2, nota3, nota4, nota, notaCuantitativa));
    }

    public static String notaCualitativas(double nota1, double nota2, double nota3,double nota4, double nota, String notaCuantitativa){
        
        nota = (nota1 + nota2 + nota3 + nota4)/4;
        if (nota >= 9.1){
            notaCuantitativa = "Sobresaliente";
        }else if (nota>= 8.1){
            notaCuantitativa = "Muy Bueno";
        }else if (nota>= 5.1){
            notaCuantitativa = "Bueno";
        }else{
            notaCuantitativa = "Regular";
        }
        return notaCuantitativa;
    }
}
/**
 * debug:
Ingrese La primera nota:
10
Ingrese La segunda nota:
1
Ingrese La tercera nota:
5
Ingrese La cuarta nota:
9
La nota cuantitativa es: Bueno
BUILD SUCCESSFUL (total time: 15 seconds)

 */