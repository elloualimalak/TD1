import java.util.Scanner;
public class EX22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N, b = 0;
        System.out.println("donner un entier N");
        N= s.nextInt();
        for (int i = 1; i < N; i++) {
            if (i % 2 != 0)
                b += i;
        }
        System.out.println("la somme est inpair inferieur a N est  " + b);
    }
}
