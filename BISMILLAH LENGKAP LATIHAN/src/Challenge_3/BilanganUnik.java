import java.util.Scanner;
public class BilanganUnik {


    static boolean cekbilUnique (int angkasetX){
        for (int i = 2; i < angkasetX; i++) {
            while (angkasetX % i == 0) {
                angkasetX = angkasetX / i;
            }
        }

        if (angkasetX > 1) {
            if (angkasetX == 2 || angkasetX == 3 || angkasetX == 5) {
                return true;
            } else {
                return false;
            }
        } return true;
    }

    public static void main(String[] args) {
        int tandax,mulai=1;
        Scanner inputan = new Scanner(System.in);
        System.out.print("Inputkan angka : ");
        tandax = inputan.nextInt();

        System.out.print("Bilangan Unique sebelum "+tandax+" adalah : ");
        int angkasetX = mulai + 1;

        int i;
        for (i = mulai; i <= tandax; i++)
        {
            if(cekbilUnique(angkasetX))
            {
                System.out.print(angkasetX+" ");
                angkasetX++;
            }else {
                angkasetX++;
            }
        }
    }
}