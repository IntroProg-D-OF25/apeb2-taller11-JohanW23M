
import java.util.Scanner;



/**
 *Problema 01
Generar los procedimientos y/o funciones que impriman los valor pares, 
* impares y el promedio de un arreglo bidimensional. El (los) procedimiento(s)
* o método(s) deben ser invocados desde el método principal (quien es el único 
* responsable de gestionar las entradas/salidas); además el método debe recibir 
* como parámetro un arreglo bidimensional.
 * autor: Johan Wang
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
             } 
            return (sumaMatriz / (matriz.length * matriz[0].length));
    }
}


/**
 * debug:
Deme Limite de Filas y Limite de Columnas
4
4
2 6 9 7  
9 7 4 8  
0 3 3 9  
2 3 8 9  
Numeros pares: 
2 
6 

4 
8 

0 

2 
8 

Numeros imprares: 
9 
7 

9 
7 

3 
3 
9 

3 
9 


El promedio es:5.0
 */