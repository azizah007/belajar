package Soal5OOP;

public class Animals {

    public static void main(){
        identify_myself();
        Carnivor carnivor = new Carnivor("Tiger","Daging","Tajam");
        Herbivora herbivora = new Herbivora("Horse","Tumbuhan","Tumpul");
        Omnivor omnivor = new Omnivor("Chicken","Tumbuhan dan Daging","Tumpul dan Tajam");
    }

    String Nama;
    String Makanan;
    String Gigi;

    public void  namaBinatang (String nama){
        this.Nama=nama;
    }

    public void jenisMakanan (String makanan){
        this.Makanan = makanan;
        if (makanan.equals("Tumbuhan")){
            System.out.println("Pemakan Tumbuhan");
        }else if (makanan.equals("Daging")){
            System.out.println("Pemakan Daging");
        }else if (makanan.equals("Tumbuhan dan Daging")){
            System.out.println("Pemakan Tumbuhan dan Daging");
        }
    }

    public void jenisGigi (String gigi){
        this.Gigi = gigi;
        if (gigi.equals("Tumpul")){
            System.out.println("Jenis Gigi Tumpul");
        }else if (gigi.equals("Tajam")){
            System.out.println("Jenis Gigi Tajam");
        }else if (gigi.equals("Tumpul dan Tajam")){
            System.out.println("Jenis Gigi Tumpul dan Tajam");
        }
    }

    public static void identify_myself(){
        System.out.println("Hi, I'm Parent Of All Animal, My Name is Binatang");
    }
}
