import java.util.Scanner;
import java.util.Random;
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        System.out.println("--> ");
        a = input.nextInt();
        int[][] mA = new int[3][3];
        int[][] mB = new int[3][3];
           
        gerarMatriz(mA);
        gerarMatriz(mB);    
            
        System.out.print("Matriz A");
        fazerMatriz(mA);
        System.out.println("\n");
        System.out.print("Matriz B");
        fazerMatriz(mB);

           
        System.out.println("\n");
        System.out.print("Matriz C");
        somarMatriz(mA, mB);

        System.out.println("\n");
        System.out.print("Matriz D");
        subMatriz(mA, mB);

        System.out.println("\n");
        System.out.print("Matriz E");
        multiMatriz(mA, a);

        System.out.println("\n");
        System.out.print("Matriz F");
        multiMatriz(mB, a);


    }

    public static void gerarMatriz(int[][] matriz){
        Random gerador = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = gerador.nextInt(-9, 9);
                
            }
        }


    }

    public static void fazerMatriz(int m[][]){
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                System.out.print(m[i][j]+" ");
            }
        }
    
    }

    public static void somarMatriz(int[][] a, int[][] b){
        int[][] mC = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               mC[i][j] = a[i][j] + b[i][j];
            }
        }

        fazerMatriz(mC);




    }

    public static void subMatriz(int a[][], int b[][]){
        int[][] m = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               m[i][j] = a[i][j] - b[i][j];
            }
        }

        fazerMatriz(m);



    }

    public static void multiMatriz(int[][] a, int x){
        int[][] m = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               m[i][j] = a[i][j] * x;
            }
        }

        fazerMatriz(m);



    }


}
