package Soal1OOP;

public class Keliling1 {
    int kelilingPersegi (int sisi){
        return(4*sisi);
    }
    double kelilingSegitiga (double alas, double tinggi){
        return alas+tinggi+ Math.sqrt((alas*alas)+(tinggi*tinggi));
    }
    int kelilingPersegiPanjang (int panjang, int lebar){
        return(2*(panjang+lebar));
    }
}
