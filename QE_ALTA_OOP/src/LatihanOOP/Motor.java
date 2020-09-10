package LatihanOOP;

public class Motor implements Warna { //kata kunci untuk mengakses interface
    int roda;
    int ccMesin;
    String merk;

    public static void main(String[] args){
        jenis("Kawasaki");//kalo mau manggil juga harus static
        kecepatan(100);
        WarnaMotor("Biru Tua");
    }

    void jumlahRoda (int ban){ // yang ban itu diambil dai class lain
        this.roda=ban;
    }

    public static void jenis (String brand){// intinya kalo ada static ngga perlu pake this, kalo ada static berarti satu class (kalo mau pake this, diperlukan jika berbeda class)
        if (brand.equals("Kawasaki")){
            System.out.println("Merk Kawasaki");
        }else if (brand.equals("Honda")){
            System.out.println("Merk Honda");
        }else {
            System.out.println("Merk Umum");
        }
    }

    public static void kecepatan (int ccMesin){


        if (ccMesin<200){
            System.out.println("LatihanOOP.Motor matic");
        }else if (ccMesin>200){
            System.out.println("LatihanOOP.Motor Sport");
        }else{
            System.out.println("LatihanOOP.Motor Standar");
        }
    }

    public static void WarnaMotor (String warna){
        if (warna.equals("Biru")){
            System.out.println(Warna.Biru);
        }else if (warna.equals("Merah")){
            System.out.println(Warna.Merah);
        }else if(warna.equals ("Orange")){
            System.out.println(Warna.Orange);
        }else if (warna.equals("Biru Muda")){
            System.out.println(Warna.BiruMuda);
        }else if (warna.equals("Biru Tua")){
            System.out.println(Warna.BiruTua);
        }else{
            System.out.println("LatihanOOP.Warna Default");
        }
    }
}
