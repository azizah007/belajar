package Challenge_2;
import java.util.Scanner;

public class UrutanAbjad {
    public static void main(String [] args){

     String teks;
     String abjad = "abcdefghijklmnopqrstuvwxyz";
     char [] charAbjad = abjad.toCharArray();

     Scanner ketik = new Scanner(System.in);
     System.out.print(" Masukkan teks ");
     teks = ketik.nextLine();
     char [] charTeks = teks.toLowerCase().toCharArray();

     for(int i = 0; i<charTeks.length; i++ ){
         for (int k=0; k<charAbjad.length; k++){
             if(charAbjad[k] == charTeks[i]){
             System.out.print((k+1) + " ");
             }
         }
     }
    }
}
