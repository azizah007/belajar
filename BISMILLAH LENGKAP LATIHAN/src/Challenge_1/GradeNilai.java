package Challenge_1;
import java.util.Scanner;

public class GradeNilai {
    public static void main (String[] args){

        String nama;
        float nilai;
        Scanner ketik = new Scanner(System.in);
        System.out.print(" Masukkan nama siswa : ");
        nama = ketik.nextLine();
        System.out.print(" Masukkan nilai siswa : ");
        nilai = ketik.nextFloat();

        if (nilai >100 || nilai<0){
            System.out.println( nama +" nilai invalid");
        } else if (nilai >=80 && nilai<=100){
            System.out.println( nama + " Grade A ");
        } else if (nilai>= 65 && nilai<80){
            System.out.println( nama +" Grade B ");
        } else if (nilai>= 50 && nilai<65){
            System.out.println( nama + " Grade C ");
        } else if (nilai>=35 && nilai<50){
            System.out.println( nama + " Grade D ");
        } else {
            System.out.println( nama + " Grade E ");
        }
    }
}
