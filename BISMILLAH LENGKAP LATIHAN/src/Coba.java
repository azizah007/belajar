
//import javax.swing.*;

public class Coba {

    public static void main(String[] args) {

        int x, y = 0;

        int baris = 12;


        int kolom = baris;

        int segitiga[][] = new int[baris][kolom];

        for (x = 0; x < baris; x++) {

            for (y = 0; y < kolom; y++) {

                if ((x + y) >= (baris - 1)) {//Jika x+y kurang dari sama dengan baris -1

                    if ((x + y == (baris - 1)) || (y == (baris - 1))) {// Jika x+y sama dengan (baris -1) atau y==(baris-1)

                        segitiga[x][y] = 1;//Menampilkan di tiap2 kolom dan baris dengan angka 1

//Nilai x Disini Menjadi 1,2,3,4,5,6 dan seterusnya

                    } else {

                        segitiga[x][y] = ((segitiga[x - 1][y]) + segitiga[x - 1][y + 1]); //Menjumlahkan Nilai Tengah

                    }

                    System.out.print(segitiga[x][y] + " ");//Menampilkan Segita Pascal 3 spasi

                } else {

                    System.out.print(" "); //Ngerubah Tampilan Menjadi Segitiga biasa 2 spasi

                }

            }

            System.out.println(" ");//Memisahkan Baris Yang di atas dengan yang di bawah }

        }

    }
}