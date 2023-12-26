import java.util.Scanner;
public class EX7 {
    public static void main(String[] args){
      Scanner s=new Scanner(System.in);
      System.out.println("donner un entier de 3 nombre");
      int x,a,b,c,d;
      x=s.nextInt();
       a=x/100;

       b=x%100;

        c=b/10;

       d=b%10;

System.out.println(a+""+c+""+d+"  "+a+d+c+"  "+c+a+d+"  "+c+d+a+"  "+d+a+c+"  "+d+c+a);

    }
}
