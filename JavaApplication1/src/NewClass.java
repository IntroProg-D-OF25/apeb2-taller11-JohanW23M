
/**
 *
 * @author UTPL
 */
import java.util.Scanner;
public class NewClass {
    public static void main(String[] args) {
         Scanner tcl = new Scanner(System.in);
         int num1, num2, respt = 0;
         System.out.println("Dame Dos numeros:");
         num1 = tcl.nextInt();
         num2 = tcl.nextInt();
        respt = sumaNumerosFuncion(num1, num2, respt);
        System.out.println("La suma de ["+num1+"]+ ["+num2+"] = " + respt);
    }
    public static int sumaNumerosFuncion(int num1, int num2, int respt){
        respt = num1 + num2;
        return respt;
    }
    //Nivel de acceso(public, private, protected) [Ancance del Metodo(static)] Tipo de Retorno nombtrMetodo/Funcion (lista de Parametros)
    //Tipo de Retorno (metodos = void, funciones != void)
    //([Lista de Parametros = tipodato, nombreParametro1, tipodato, nombreParametro2, ..])
    //*public static void sumaNumero(int num1, int num2, int respt){
    //    respt = num1 + num2;
    //    System.out.println("La suma es: " + respt);
    // }
}
