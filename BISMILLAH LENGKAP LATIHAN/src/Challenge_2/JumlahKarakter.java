package Challenge_2;
import java.util.Scanner;

public class JumlahKarakter {
    public static void main(String[] args){

        String teks;
        int jumVokal=0, jumKonsonan =0, spasi=0;

        Scanner ketik = new Scanner(System.in);
        System.out.print(" Masukkan Teks ");
        teks = ketik.nextLine();
        char [] charTeks = teks.toLowerCase().toCharArray();
        int length = teks.length();

        for(int i=0; i< length; i++){
            char abjad = charTeks[i];
            if(abjad == 'a' || abjad == 'i' || abjad == 'u' || abjad == 'e' || abjad == 'o' ){
                jumVokal++;
            } else if (abjad == ' '){
                spasi++;
            } else {
                jumKonsonan++;
            }
        }
        System.out.println( " Jumlah Vokal " + jumVokal);
        System.out.println( " Jumlah Konsonan " + jumKonsonan);
        System.out.println( " Jumlah Huruf " + (length - spasi));


    }
}
