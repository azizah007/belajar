import java.util.Scanner;

public class Ujian2 {
    public static void main(String[] args) {

        String A;
        String B;


        Scanner ketik = new Scanner(System.in);
        System.out.print(" Masukkan Bilangan = ");
        A = ketik.nextLine();

        char [] charA = A.toCharArray();
        int ALength = charA.length;
        char [] charB  = A.toCharArray();
        int BLength = charB.length;


        for (int i=0; i<ALength; i++){
             for (int j=0; j<BLength; j++){
                 if(charA[i] != charB[j]){
                     System.out.print(charA[j]);
                 } else{
                     System.out.println();
                 }
             }
        }
    }
}
