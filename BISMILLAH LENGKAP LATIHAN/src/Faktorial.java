import java.util.Scanner;

public class Faktorial {
       public static void main(String[] args){

           int angka;
           int faktorial=1;
           Scanner ketik = new Scanner(System.in);
           System.out.print(" Masukkan bilangan = ");
           angka = ketik.nextInt();


           for(int i= angka; i>=1; i--){
               faktorial = faktorial * i;
           }
           System.out.println(" Maka hasil faktorial dari " + angka + " = " + faktorial);
       }

}
