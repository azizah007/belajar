package Challenge_2;
import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args){

        String teks, balikTeks ="" ;
        Scanner ketik = new Scanner(System.in);
        System.out.print(" masukkan teks : ");
        teks = ketik.nextLine();
        char [] charTeks = teks.toLowerCase().toCharArray();

        for (int i=charTeks.length-1; i>=0; i--){
            balikTeks = balikTeks + charTeks[i];
        }

        if(teks.equals(balikTeks)){
            System.out.println(balikTeks + " PALINDROM ");
        } else {
            System.out.println(balikTeks + " BUKAN PALINDROM ");
        }
    }
}
