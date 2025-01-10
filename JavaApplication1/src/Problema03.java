
import java.util.Scanner;



/**
 *
 * @author UTPL
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
