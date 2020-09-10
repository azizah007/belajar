package Challenge_1;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args){

        int angka, i =1;
        Scanner ketik = new Scanner(System.in);
        System.out.print("masukkan angka = ");
        angka = ketik.nextInt();

        while (i <= angka){
            if (i%3 == 0 && i%5 == 0) {
                System.out.println("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.println("Fizz ");
            } else if (i % 5 == 0) {
                System.out.println("Buzz ");
            } else {
                System.out.println(i + "");
            }
            i++;
        }
    }
}
