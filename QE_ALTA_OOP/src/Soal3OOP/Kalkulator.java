package Soal3OOP;
import java.util.Scanner;
public class Kalkulator {
    public static void main(){
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Operasi pada Kalkulator (Penjumlahan/Pengurangan/Perkalian/Pembagian");
        System.out.println("----------------------------------------------------------------------");
        Scanner input = new Scanner(System.in);
        System.out.print("input Angka1: ");
        int angka1 = input.nextInt();
        System.out.print("input Angka2: ");
        int angka2 = input.nextInt();
        penjumlahan(angka1,angka2);
        System.out.print("input Angka1: ");
        int angka3 = input.nextInt();
        System.out.print("input Angka2: ");
        int angka4 = input.nextInt();
        pengurangan(angka3,angka4);
        System.out.print("input Angka1: ");
        int angka5 = input.nextInt();
        System.out.print("input Angka2: ");
        int angka6 = input.nextInt();
        perkalian(angka5,angka6);
        System.out.print("input Angka1: ");
        int angka7 = input.nextInt();
        System.out.print("input Angka2: ");
        int angka8 = input.nextInt();
        pembagian(angka7,angka8);
    }
    public static void penjumlahan (int angka1, int angka2){
        ExecuteKalkulator daerah = new ExecuteKalkulator();
        System.out.println("Hasil Penjumlahan: "+daerah.operatorPenjumlahan(angka1,angka2));
    }
    public static void pengurangan (int angka1, int angka2){
        ExecuteKalkulator daerah = new ExecuteKalkulator();
        System.out.println("Hasil Pengurangan : "+daerah.operatorPengurangan(angka1,angka2));
    }
    public static void perkalian (int angka1, int angka2){
        ExecuteKalkulator daerah = new ExecuteKalkulator();
        System.out.println("Hasil Perkalian : "+daerah.operatorPerkalian(angka1,angka2));
    }
    public static void pembagian (int angka1, int angka2){
        ExecuteKalkulator daerah = new ExecuteKalkulator();
        System.out.println("Hasil Perkalian : "+daerah.operatorPembagian(angka1,angka2));
    }
}

