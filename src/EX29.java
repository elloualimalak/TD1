import java.util.Scanner;
public class EX29 {
    public static void main(String[] args){
     int n;
     Scanner S=new Scanner(System.in);
     System.out.println("donner un entier");
     n= S.nextInt();
     int nbr=0;
     while(n>0){
         nbr+=n%10;
        n= n/10;
     }
     System.out.println("la somme est "+nbr);
    }
}
