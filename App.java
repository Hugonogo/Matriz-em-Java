
import java.util.Random;
public class App {
    public static void main(String[] args) {
       
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
           
    }

    public static void gerarMatriz(int[][] matriz){
        Random gerador = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = gerador.nextInt(0, 9);
                
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


}
