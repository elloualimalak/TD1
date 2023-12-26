import java.util.Scanner;

import static java.lang.Math.sqrt;

public class EX2 {
    public static void main(String[] args){
       Scanner s=new Scanner(System.in);
       int a,b,c,d;
       System.out.println("donner 3 entiers");
       a=s.nextInt();
       b=s.nextInt();
       c=s.nextInt();
        d=b*b-4*a*c;
       if((a==0)&&(b!=0)) System.out.println("la solution est"+(-c/b));
       else if((a == 0)&&(b == 0)) System.out.println("pas le solutions");
       else if(d>0) {
           double x1;
           double x2;
           x1=(-b-sqrt(d))/(2*a);
               x2=(-b+sqrt(d))/(2*a);
           System.out.println("la solution est x1= " +x1+"  x2= "+x2);
       }
       else if(d<0) {
           System.out.println("pas de solution");
       }
       else System.out.println(" la solution est"+((-b)/(2*a)));
    }
}
