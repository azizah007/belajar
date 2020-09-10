package Challenge_1;
import java.util.Scanner;
public class TahunKabisat {
    public static void main(String[] args){

        int tahun;
        Scanner ketik = new Scanner(System.in);
        System.out.print("masukkan tahun : ");
        tahun = ketik.nextInt();

        if(tahun%4 == 0 && tahun%100!= 0){
            System.out.println(" tahun kabisat ");
        } else if (tahun % 4 == 0){
            if (tahun %100 == 0 && tahun% 400 == 0){
                System.out.println("tahun kabisat");
            } else{
                System.out.println("bukan kabisat");
            }
        } else {
            System.out.println(" bukan kabisat");
        }
    }
}
