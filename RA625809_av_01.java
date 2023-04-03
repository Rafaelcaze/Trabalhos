import java.util.Scanner;
//X=A multiplica
//X!=A continua

public class RA625809_av_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Valor de X
        System.out.print("Digite o valor de X: ");
        int X = sc.nextInt();
        
        // Matriz A
        int[][] A = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("Digite o valores de A: ");
                A[i][j] = sc.nextInt();
            }
        }
        //Matriz B
        int[][] B = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (X%2==0 ){
                    if(A[i][j]%2==0){
                    B[i][j] = A[i][j] * X;
                   }
                   else{
                    B[i][j]= A[i][j];
                   } 
                }
                else{
                    if(A[i][j]%2==0){
                        B[i][j]=A[i][j];
                    }
                    else{
                        B[i][j] = A[i][j] * X;
                    }
                } 
            } 
        }
        //Print A
        System.out.println("Matriz A:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%3d", A[i][j]);
            }
            System.out.println();
        }

        //Print B
        System.out.println("Matriz B:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%3d", B[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}