package Soal4OOP;
import java.util.Scanner;
public class InputBarang {
    public static void main(){
        Scanner input = new Scanner(System.in);
        HitungHarga barang = new HitungHarga();
        System.out.println("------------------------------------------------------");
        System.out.println("Biaya Barang yang dikirimkan, dengan kualifikasi : ");
        System.out.println("------------------------------------------------------");
        System.out.print("input panjang barang : ");
        int panjang = input.nextInt();
        System.out.print("input lebar barang : ");
        int lebar = input.nextInt();
        System.out.print("input tinggi barang : ");
        int tinggi = input.nextInt();
        System.out.print("input berat barang (dalam kg) : ");
        int berat = input.nextInt();
        barang.hitungHarga(panjang, lebar, tinggi, berat);

    }
}
