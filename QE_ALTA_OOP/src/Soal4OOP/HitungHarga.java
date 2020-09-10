package Soal4OOP;

public class HitungHarga {
    public void hitungHarga (int panjang, int lebar, int tinggi, int berat){
        int harga;
        int counterVolume, counterBerat;
        int hitungVolume = panjang*lebar*tinggi;
        if(hitungVolume > 50 && berat>1){
            counterVolume = hitungVolume/50;
            counterBerat = berat/1;
            if (counterVolume>=counterBerat){
                if (hitungVolume%50==0){
                    counterVolume = hitungVolume/50;
                    harga = 5000*counterVolume;
                    System.out.println("Harga Barang : Rp "+harga);
                }else{
                    counterVolume = hitungVolume/50;
                    harga = 5000*(counterVolume+1);
                    System.out.println("Harga Barang : Rp "+harga);
                }
            }else if (counterVolume<counterBerat){
                harga = 5000*counterBerat;
                System.out.println("Harga Barang : Rp "+harga);
            }
        }else if (hitungVolume >50){
            if (hitungVolume%50==0){
                counterVolume = hitungVolume/50;
                harga = 5000*counterVolume;
                System.out.println("Harga Barang : Rp "+harga);
            }else{
                counterVolume = hitungVolume/50;
                harga = 5000*(counterVolume+1);
                System.out.println("Harga Barang : Rp "+harga);
            }
        }else if (berat>1){
            counterBerat = berat/1;
            harga = 5000*counterBerat;
            System.out.println("Harga Barang : Rp "+harga);
        }else if (hitungVolume<=50 || berat<=1){
            harga = 5000;
            System.out.println("Harga Barang : Rp "+harga);
        }




    }
}
