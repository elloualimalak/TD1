import java.util.Scanner;
public class EX28 {
    public static void main(String[] args){
        int n;
        Scanner S=new Scanner(System.in);
        System.out.println("donner un entier");
        n= S.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=n;i>=1;i--){
            for(int j=i;j>1;j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
