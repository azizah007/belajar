package Soal5OOP;

public class Carnivor extends Animals{

        Carnivor (String nama, String makanan, String gigi){
            Nama = nama;
            Makanan = makanan;
            Gigi = gigi;
            identify_myselfcarnivora();
        }

    public void identify_myselfcarnivora(){
        System.out.println("Hi, I'm Carnivor, My Name is "+ Nama +" , My Food is "+ Makanan +" , I have "+ Gigi+ " teeth");
    }
}
