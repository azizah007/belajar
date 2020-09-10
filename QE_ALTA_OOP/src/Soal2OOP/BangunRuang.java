package Soal2OOP;
import java.util.Scanner;
public class BangunRuang {
    public static void main(){
        System.out.println("-------------------------------------------");
        System.out.println("Menghitung Volume (Kubus, Balok, Tabung)");
        System.out.println("-------------------------------------------");
        Scanner input = new Scanner(System.in);
        System.out.print("input sisi: ");
        int sisi = input.nextInt();
        Kubus(sisi);
        System.out.print("input panjang: ");
        int panjang = input.nextInt();
        System.out.print("input lebar: ");
        int lebar = input.nextInt();
        System.out.print("input tinggi: ");
        int tinggi = input.nextInt();
        Balok(panjang,lebar,tinggi);
        System.out.print("input jari-jari: ");
        int jariJari = input.nextInt();
        System.out.print("input tinggi: ");
        int tinggiTabung = input.nextInt();
        Tabung(jariJari,tinggiTabung);
    }
    public static void Kubus (int sisi){
        Volume1 daerah = new Volume1();
        System.out.println("Volume Kubus : "+daerah.volumeKubus(sisi));
    }
    public static void Balok (int panjang, int lebar, int tinggi){
        Volume1 daerah = new Volume1();
        System.out.println("Volume Balok : "+daerah.volumeBalok(panjang,lebar,tinggi));
    }
    public static void Tabung (int jariJari, int tinggiTabung){
        Volume1 daerah = new Volume1();
        System.out.println("Volume Tabung : "+daerah.volumeTabung(jariJari,tinggiTabung));
    }
}
