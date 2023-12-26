import java.util.Scanner;
public class EX25 {
    public static void main(String[] args){
Scanner S=new Scanner(System.in);
        int n;

System.out.println("donner un entier");
        n= S.nextInt();
int n0=0,n1=1,nn=0;
        for(int i=2;i<=n;i++)
        {
    nn=n0+n1;
    n0=n1;
    n1=nn;
         }
        System.out.println("le nème terme de la suite est "+nn);
    }
}
