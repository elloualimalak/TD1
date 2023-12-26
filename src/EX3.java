import java.util.Scanner;
public class EX3 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println(" donner 2 entiers");
        int a,b;
        a= s.nextInt();b= s.nextInt();
        System.out.println("tapper 1 pour savoir si la somme est pair");
        System.out.println("tapper 2 pour savoir si le produit ab est pair");
        System.out.println("tapper 3 pour connaître le signe de la somme a + b ");
        System.out.println("tapper 4 pour connaître le signe du produit ab");
        int d = s.nextInt();
        switch(d){
            case 1: {
                if ((a + b) % 2 == 0) System.out.println("la somme est pair");
            else System.out.println("la somme est impair");
            } break;
            case 2:{
                if ((a * b) % 2 == 0) System.out.println("le produit est pair");
                else System.out.println("le produit est impair");
            } break;
            case 3: {
                if((a+b)>=0) System.out.println("le sigre est positif");
                else System.out.println("le signe est negatif");
            } break;
            case 4:{
                if((a*b)>=0) System.out.println("le sigre est positif");
                else System.out.println("le signe est negatif");
            } break;
        }

    }
}
