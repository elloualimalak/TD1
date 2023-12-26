import java.util.Scanner;
public class EX35 {
    public static void main(String[] args){
   Scanner S=new Scanner(System.in);
        System.out.println("donner le nombre de colonne");
        int m= S.nextInt();
        String[] tab=new String[50];

        for(int j=1;j<=m;j++){
            System.out.println("donner la valeur de la col "+j);
            tab[j]=S.nextLine();
        }
        String a=tab[0];
        for(int i=1;i<m;i++){
            tab[i]=tab[i+1];
        }
tab[m-1]=a;

   for(int k=0;k<m;k++){
       System.out.print(tab[k]);
   }

    }
}
