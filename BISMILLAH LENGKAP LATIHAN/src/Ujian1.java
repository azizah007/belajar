
import java.util.Scanner;

public class Ujian1 {
    public static void main (String [] args){

        int N ;
        Scanner ketik = new Scanner(System.in);
        System.out.print(" Masukkan Tinggi Segitiga = ");
        N = ketik.nextInt();
        int fib[] = new int[N];
        fib[0] = 0;
        fib[1] = 1;

        for(int i=1; i<=N; i++){
            for (int j=1; j<=i; j++){

                for(int k = 2; k < N; k++) {
                    fib[k] = fib[k-1] + fib[k-2];
                }

                for (int l = 0; l <= (j-1); l++) {
                    System.out.print(fib[l] +  " ");
                }
            }
            System.out.println(" ");
        }
    }
}
