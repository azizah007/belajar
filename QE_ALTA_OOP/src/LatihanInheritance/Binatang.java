package LatihanInheritance;

public class Binatang implements WarnaHewan {
    int kaki;
    String mulut;
    String bentukKaki;
    String habitat;
    String badan;
    String makanan;
    String berkembangBiak;
    String Warna;

    void jumlahKaki (int kaki){
        this.kaki=kaki;
    }
    public void jenisMulut (String mulut){
        this.mulut = mulut;
        if (mulut.equals("Paruh")){
            System.out.println("Hewan berparuh");
        }else if (mulut.equals("tidak berparuh")){
            System.out.println("hewan tidak berparuh");
        }
    }
    public void selaputKaki (String bentukKaki){
        this.bentukKaki=bentukKaki;
        if (bentukKaki.equals ("Berselaput")){
            System.out.println("Bentuk Kaki berselaput");
        }else if (bentukKaki.equals ("Tidak Berselaput")){
            System.out.println("Bentuk Kaki tidak berselaput");
        }
    }
    public void hidup (String habitat){
        this.habitat=habitat;
        if (habitat.equals ("Darat")){
            System.out.println("Habitat di darat");
        }else if (habitat.equals("Air")){
            System.out.println("Habitat di Air");
        }else if (habitat.equals("Darat dan Air")){
            System.out.println("Habitat di Darat dan di Air");
        }
    }
    public void penutupTubuh (String badan){
        this.badan=badan;
        if (badan.equals ("Bulu")){
            System.out.println("Badan diselimuti Bulu");
        }else if (badan.equals ("Rambut")){
            System.out.println("Badan diselimuti rambut");
        }else if (badan.equals ("Sisik")){
            System.out.println("badan diselimuti sisik");
        }
    }
    public void jenisMakanan (String makanan){
        this.makanan=makanan;
        if (makanan.equals("tumbuhan")){
            System.out.println("Hewan Herbivora");
        }else if (makanan.equals("hewan")){
            System.out.println("Hewan Karnivora");
        }else if (makanan.equals("hewan dan tumbuhan")){
            System.out.println("Hewan Omnivora");
        }
    }
    public void caraBerkembangbiak (String berkembangBiak){
        this.berkembangBiak=berkembangBiak;
        if (berkembangBiak.equals ("bertelur")){
            System.out.println("Hewan Ovipar");
        }else if (berkembangBiak.equals ("beranak")){
            System.out.println("Hewan Vivipar");
        }else if (berkembangBiak.equals("bertelur dan beranak")){
            System.out.println("Hewan Ovovivipar");
        }
    }
    public void warnaBinatang (String warna){
        this.Warna = warna;
        if (warna.equals("Merah")) {
            System.out.println(WarnaHewan.Merah);
        }else if (warna.equals("Hitam")){
            System.out.println(WarnaHewan.Hitam);
        }else if (warna.equals("MerahHitam")){
            System.out.println(WarnaHewan.MerahHitam);
        }else if (warna.equals("Coklat")){
            System.out.println(WarnaHewan.Coklat);
        }
    }
}
