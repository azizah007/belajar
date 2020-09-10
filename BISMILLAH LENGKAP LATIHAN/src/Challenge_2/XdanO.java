package Challenge_2;
import java.util.Scanner;

public class XdanO {
    public static void main(String [] args){

        String teks;
        int jumx=0, jumo=0;
        Scanner ketik = new Scanner(System.in);
        System.out.print(" masukkan teks : ");
        teks = ketik.nextLine();

        char [] charTeks = teks.toLowerCase().toCharArray();
        char [] xo = new char [] {'x', 'o'};

        for(int i =0; i<charTeks.length; i++ ){
            if (xo[0] == charTeks[i]){
                jumx++;
            }else if (xo[1] == charTeks[i]){
                jumo++;
            }
        }
        if( jumx == jumo ){
            System.out.println( " TRUE ");
        } else {
            System.out.println(" FALSE ");
        }
    }

}
