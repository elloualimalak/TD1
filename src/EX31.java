import java.util.Scanner;
public class EX31 {
    public static void main(String[] args){
        int[] tab=new  int[50];
        int n;
        Scanner S=new Scanner(System.in);
        do{
            System.out.println("donner le nombre des entiers");
            n= S.nextInt();
        }while((n<10)||(n>50));
        for(int i=1;i<=n;i++){
            System.out.println("donner la valeur N°"+i);
            tab[i]= S.nextInt();
        }
        int max=tab[0];
        for(int j=1;j<=n;j++){
            if(tab[j]>max) max=tab[j];
        }
        System.out.println("le max est "+max);



    }
}
