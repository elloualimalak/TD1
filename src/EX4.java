import java.util.Scanner;
public class EX4 {
    public static void main(String[] args){
       int moy;
       Scanner s=new Scanner(System.in);
       System.out.println("donner la moyenne");
       moy= s.nextInt();
       if((moy>=16)&&(moy<=20)) System.out.println("T.bien");
       else if((moy>=14)&&(moy<16)) System.out.println("bien");
       else if((moy>=12)&&(moy<14)) System.out.println("A.bien");
       else if((moy>=10)&&(moy<12)) System.out.println("passable");
    }
}
