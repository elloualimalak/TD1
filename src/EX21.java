import java.util.Scanner;

public class EX21 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("donner un entier");
        n= s.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=i*fact;
        }
        System.out.println("N!="+fact);
    }
}
