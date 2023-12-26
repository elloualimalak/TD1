import java.util.Scanner;
public class EX24 {
    public static void main(String[] args){
 int a,b;
 Scanner s=new Scanner(System.in);
 System.out.println(" donner 2 entiers");
 a= s.nextInt();
 b= s.nextInt();
 int r=a%b;
 System.out.print("pgcd("+a+","+b+")=");
        while(r!=0){
            a=b;b=r;
            r=a%b;
            System.out.print("pgcd("+a+","+b+")=");
        }
System.out.println(b);


    }
}
