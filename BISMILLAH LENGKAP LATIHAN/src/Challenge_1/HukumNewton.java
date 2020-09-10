package Challenge_1;

import java.util.Scanner;

public class HukumNewton {
    public static void main (String[] args){

        double F, massa, percepatan;
        Scanner ketik = new Scanner(System.in);
        System.out.print(" Masukkan massa = " );
        massa = ketik.nextDouble();
        System.out.print(" Masukkan percepatan = " );
        percepatan = ketik.nextDouble();

        F = massa*percepatan;
        System.out.println(" F = " +F);
    }
}
