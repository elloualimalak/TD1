import java.util.Scanner;
public class EX9 {
    public static void main(String[] args){
      Scanner S=new Scanner(System.in);
      int a,b;
      System.out.println("donner 2 variables");
      a= S.nextInt();  b= S.nextInt();
      System.out.println("par ordre croissant");
      if(a>b) System.out.println(a+"  "+b);
      else System.out.println(b+"  "+a);
    }
}
