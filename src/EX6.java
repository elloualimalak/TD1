import java.util.Scanner;

public class EX6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("donner 2 entiers");
        int a, b;
        a = s.nextInt();
        b = s.nextInt();
        if (a >= 0) {
            if (b >= 0) System.out.println("le signe est positif");
            else System.out.println("le signe est negatif");
        }
        else if(a<0) {
            if (b < 0) System.out.println("le singe est positif");
            else System.out.println("le signe est negatif");
        }
    }
}
