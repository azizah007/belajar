package Challenge_1;
import java.util.Scanner;

public class BilanganPrima {
    public static void main(String [] args){

        int angka, jum =0;
        Scanner ketik = new Scanner(System.in);
        System.out.print(" masukkan angka : ");
        angka = ketik.nextInt();

        for(int i=1; i<=angka; i++){
            if (angka % i == 0){
                jum+= 1;
            }
        }
        if (jum == 2){
            System.out.println(angka + " bilangan prima ");
        } else{
            System.out.println(angka + " bukan prima ");
        }
    }
}
