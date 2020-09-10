package Soal6OOP;
import Soal1OOP.BangunDatar;
import Soal2OOP.BangunRuang;
import Soal3OOP.Kalkulator;
import Soal4OOP.InputBarang;
import Soal5OOP.Animals;


import java.util.Scanner;


public class Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1. Luas dan Keliling");
        System.out.println("2. Volume");
        System.out.println("3. Kalkulator");
        System.out.println("4. Biaya Pengiriman");
        System.out.println("5. Animals");
        System.out.print("Pilih : ");
        int pilih = input.nextInt();
        switch (pilih) {
            case 1:
                System.out.println("Luas dan Keliling Bangun Datar");
                BangunDatar bangunDatar = new BangunDatar();
                bangunDatar.main();
                break;
            case 2:
                System.out.println("Volume Bangun Ruang");
                BangunRuang bangunRuang = new BangunRuang();
                bangunRuang.main();
                break;
            case 3:
                System.out.println("Kalkulator");
                Kalkulator kalkulator = new Kalkulator();
                kalkulator.main();
                break;
            case 4:
                System.out.println("Hitung Harga Barang");
                InputBarang inputBarang = new InputBarang();
                inputBarang.main();
                break;
            case 5:
                System.out.println("Animals");
                Animals animals = new Animals();
                animals.main();
                break;
            default:
                System.out.println("Masukkan pilihan yang benar");
                break;
        }
    }
}