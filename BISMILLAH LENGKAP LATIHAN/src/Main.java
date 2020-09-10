public class Main {

    public static void main(String[] args) {

        int x = 1, batas = 5;

        while ( x+1 <=batas){
            if (x == Prima(x)){
                System.out.println(x);
            }
        }x++;
    }

    public  static int Prima (int baru) {
        int jum = 0;
        for (int k = 1; k <= baru; k++) {
            if (baru % k == 0) {
                jum++;
            }
        }
        if (jum == 2) {
            return baru;
        }
        return baru;
    }
}
