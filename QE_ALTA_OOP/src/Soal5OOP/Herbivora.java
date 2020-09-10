package Soal5OOP;

public class Herbivora extends Animals{

    Herbivora (String nama, String makanan, String gigi){
        Nama = nama;
        Makanan = makanan;
        Gigi = gigi;
        identify_myselfherbivora();
    }


    public void identify_myselfherbivora(){
        System.out.println("Hi, I'm Herbivor, My Name is "+ Nama+ " , My Food is "+ Makanan+" , I have "+Gigi+" teeth");
    }
}
