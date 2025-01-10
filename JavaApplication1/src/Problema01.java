
import java.util.Scanner;



/**
 *
 * @author UTPL
 */
public class Problema01 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int limFil = 0, limCol = 0;
        System.out.println("Deme Limite de Filas y Limite de Columnas");
        limFil = tcl.nextInt();
        limCol = tcl.nextInt();
        int matriz[][] = new int[limFil][limCol];
        generarMatriz(matriz);
        presentarMatriz(matriz);
        System.out.println("Numeros pares: ");
        presentarNumPares(matriz);
        System.out.println("Numeros imprares: ");
        presentarNumInares(matriz);
        System.out.println("El promedio es:" + presentarPromedioMatriz(matriz));
    }
    public static void generarMatriz(int matriz [][]) {
        for (int i = 0; i < matriz.length; i++) {
           for (int j = 0; j < matriz[0].length; j++) {
               matriz[i][j] = (int)(Math.random() * 10);
           }
        }
        
    }
    public static void presentarMatriz(int matriz [][]) {
        for (int i = 0; i < matriz.length; i++) {
           for (int j = 0; j < matriz[0].length; j++) {
               System.out.print(matriz[i][j] + " ");
           }
            System.out.println(" ");
        }
        
    }
    public static void presentarNumPares(int matriz [][]) {
        for (int i = 0; i < matriz.length; i++) {
           for (int j = 0; j < matriz[0].length; j++) {
               
               if(matriz[i][j]% 2 == 0){
                   System.out.println(matriz[i][j] + " ");
               }
           }
           System.out.println("");

        } 
    }
    public static void presentarNumInares(int matriz [][]) {
        for (int i = 0; i < matriz.length; i++) {
           for (int j = 0; j < matriz[0].length; j++) {
               
               if(matriz[i][j]% 2 != 0){
                   System.out.println(matriz[i][j] + " ");
               }
           }
            System.out.println("");
        } 
    }
        public static double presentarPromedioMatriz(int matriz [][]) {
            int sumaMatriz = 0;
            for (int i = 0; i < matriz.length; i++) {
                 for (int j = 0; j < matriz[0].length; j++) {
               
                 sumaMatriz = sumaMatriz + matriz[i][j];
                 }
                System.out.println("");
             } 
            return (sumaMatriz / (matriz.length * matriz[0].length));
    }
}
