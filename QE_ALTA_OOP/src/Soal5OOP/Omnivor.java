package Soal5OOP;

public class Omnivor extends Animals{
    Omnivor (String nama, String makanan, String gigi){
        Nama = nama;
        Makanan = makanan;
        Gigi = gigi;
        identify_myselfomnivor();
    }

    public void identify_myselfomnivor(){
        System.out.println("Hi, I'm Omnivor, My Name is "+Nama+" , My Food is "+Gigi+" , I have "+Gigi+" teeth");
    }
}
