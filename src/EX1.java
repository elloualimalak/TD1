import java.util.Scanner;
public class EX1 {
    public static void main(String[] args){
        int a, b, c;
                System.out.println("donner 3 entiers");
                Scanner s = new  Scanner(System.in);
                a = s.nextInt();
                b = s.nextInt();
                c = s.nextInt();

               if((a>b)&&(a>c))  {System.out.println("le max est "+a);
               }

               if((b>a)&&(b>c)){
                   System.out.println("le max est "+b);
               }

               if((c>a)&&(c>b)){
                   System.out.println("le max est "+c);
               }
    }

        }

