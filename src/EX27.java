import java.util.Scanner;
public class EX27 {
    public static void main(String[] args){
     int n;
     Scanner S=new Scanner(System.in);
     System.out.println("donner un entier");
     n= S.nextInt();
     for(int i=1;i<=n;i++){
         for(int j=1;j<=i;j++){
             System.out.print(j);
         }
         System.out.println("");
     }
    }
}
