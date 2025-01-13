
import java.util.Scanner;
/**
 *Problema 05
Generar las funciones/métodos que devuelvan las suma, resta
* y multiplicación de un arreglo bidimensional cuadrado; 
* mismo que se lo recibe como parámetro.
 * @author Johan Wang
 */

public class Problema05 {
    public static void main(String[] args) {
         Scanner tcl = new Scanner(System.in);
        int limFil = 0, limCol = 0;
        System.out.println("Deme Limite de Filas y Limite de Columnas");
        limFil = tcl.nextInt();
        limCol = tcl.nextInt();
        
        int matriz1[][] = new int[limFil][limCol];
        int matriz2[][] = new int[limFil][limCol];
        int matrizsuma[][] = new int[limFil][limCol];
        int matrizresta[][] = new int[limFil][limCol];
        int matrizmul[][] = new int [limFil][limCol];
        
        generarMatriz(matriz1);
        generarMatriz(matriz2);

        System.out.println("Matriz 1: ");
        presentarMatriz(matriz1);
        
        System.out.println("Matriz 2: ");
        presentarMatriz(matriz2);
        
        sumarMatriz(matrizsuma, matriz1, matriz2);
        restarMatriz(matrizresta, matriz1, matriz2);
        multiplicarMatriz(matrizmul, matriz1, matriz2);
        
        System.out.println("Matriz Suma: ");
        presentarMatriz(matrizsuma);
        
        System.out.println("Matriz Resta: ");
        presentarMatriz(matrizresta);
        System.out.println("Matriz Multipllicada: ");
        presentarMatriz(matrizmul);
    }

    public static void generarMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int)(Math.random() * 10);  // Valores aleatorios entre 0 y 9
            }
        }
    }

    public static void presentarMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    
    public static void sumarMatriz(int matrizsuma[][], int matriz1[][], int matriz2[][]) {
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                matrizsuma[i][j] = matriz1[i][j] + matriz2[i][j];  
                
            }
        }
    }
    public static void restarMatriz(int matrizresta[][], int matriz1[][], int matriz2[][]) {
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                matrizresta[i][j] = matriz1[i][j] - matriz2[i][j];  
            }
        }
    }
    public static void multiplicarMatriz(int matrizmul[][], int matriz1[][], int matriz2[][]) {
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                matrizmul[i][j] = matriz1[i][j] * matriz2[i][j];  
            }
        }
    }
}
/**
 * debug:
Deme Limite de Filas y Limite de Columnas
4
4
Matriz 1: 
6 5 6 6 
6 5 5 2 
7 6 8 5 
8 1 9 7 
Matriz 2: 
7 4 1 0 
7 1 2 0 
4 7 5 5 
1 2 8 3 
Matriz Suma: 
13 9 7 6 
13 6 7 2 
11 13 13 10 
9 3 17 10 
Matriz Resta: 
-1 1 5 6 
-1 4 3 2 
3 -1 3 0 
7 -1 1 4 
Matriz Multipllicada: 
42 20 6 0 
42 5 10 0 
28 42 40 25 
8 2 72 21 
BUILD SUCCESSFUL (total time: 4 seconds
 */