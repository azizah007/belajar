import java.util.Scanner;

public class PalindromBerulang {
    public static void main(String[] args) {
        int n, subs=0;
        int reverse = 0;

        System.out.print("Input ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        if(n<9) {
            int out=n+1;
            System.out.println("Output "+out);
        }
        else {
            do {n++;
                subs=subs+n;
                reverse=0;
                while(subs != 0)
                {
                    reverse = reverse * 10;
                    reverse = reverse + subs%10;
                    subs = subs/10;
                }
            }
            while(n!=reverse);
            System.out.println("Output " +n);
        }
    }
}