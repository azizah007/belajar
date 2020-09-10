package Soal1OOP;
import java.util.Scanner;
public class BangunDatar {
    public static void main(){
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Menghitung Luas dan Keliling (Persegi, Segitiga, Persegi Panjang)");
        System.out.println("--------------------------------------------------------------------");
        Scanner input = new Scanner (System.in);
        System.out.print("input sisi: ");
        int sisi = input.nextInt();
       Persegi(sisi);
        System.out.print("input alas: ");
        int alas = input.nextInt();
        System.out.print("input tinggi: ");
        int tinggi = input.nextInt();
       Segitiga(alas,tinggi);
        System.out.print("input panjang: ");
        int panjang = input.nextInt();
        System.out.print("input lebar: ");
        int lebar = input.nextInt();
       PersegiPanjang(panjang,lebar);
    }
    public static void Persegi (int sisi){
        Luas1 daerah = new Luas1();
        System.out.println("Luas persegi : "+daerah.luasPersegi(sisi));
        Keliling1 daerah1 = new Keliling1();
        System.out.println("Keliling persegi : "+daerah1.kelilingPersegi(sisi));
    }
    public static void Segitiga (double alas, double tinggi){
        Luas1 daerah = new Luas1();
        System.out.println("Luas segitiga : "+daerah.luasSegitiga(alas,tinggi));
        Keliling1 daerah1 = new Keliling1();
        System.out.println("Keliling segitiga : "+daerah1.kelilingSegitiga(alas,tinggi));
    }
    public static void PersegiPanjang (int panjang, int lebar){
        Luas1 daerah = new Luas1();
        System.out.println("Luas persegi panjang : "+daerah.luasPersegiPanjang(panjang,lebar));
        Keliling1 daerah1 = new Keliling1();
        System.out.println("Keliling persegi panjang : "+daerah1.kelilingPersegiPanjang(panjang,lebar));
    }
}
