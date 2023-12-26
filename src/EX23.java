import java.util.Scanner;

public class EX23 {
    public static void main(String[] args) {
        int n;
        int max=0;
        int pos=0;
        Scanner s = new Scanner(System.in);
        for (int i = 1; i <= 4; i++) {
            System.out.println("donner L entier "+i);
            n = s.nextInt();
            if(n>max) {
                max = n;
                pos=i;
            }
        }

        System.out.println("le max est "+max+" sa position est "+pos);
    }
}
