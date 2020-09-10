import java.util.Scanner;

public class PrimaSegiempat {
    public static void main(String[] args) {
        int panjang, lebar, x;
        Scanner ketik = new Scanner(System.in);
        System.out.print(" Masukkan Panjang = ");
        panjang = ketik.nextInt();
        System.out.print(" Masukkan Lebar = ");
        lebar = ketik.nextInt();
        System.out.print(" Masukkan X = ");
        x = ketik.nextInt();

        for (int i = 0; i < lebar; i++) {
            for (int j = 0; j < panjang; j++) {

                boolean lanjut = true;
                while (lanjut) {
                    x++;
                    if (Prime(x)) {
                        System.out.print(x + " ");
                        lanjut = false;
                    }
                }
            }
            System.out.println("\n");
        }
    }

    public static boolean Prime(int input) {
        for (int i = 2; i < input; i++) {
            if (input % i == 0) {
                return false;
            }
        }

        return true;
    }
}
