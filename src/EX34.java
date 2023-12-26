import java.util.Scanner;
public class EX34 {
    public static void main(String[] args){
        Scanner S=new Scanner(System.in);
        System.out.println("donner le nombre de ligne");
        int m= S.nextInt();
       int[][] a=new int[m][m];
        int[][] b=new int[m][m];
        int[][] tab=new int[m][m];
       for(int i=1;i<=m;i++){
           for(int j=i;j<=m;j++)
           {
               System.out.println("donner la valeur de lgn "+i+" col "+j);
               a[i][j]= S.nextInt();
           }
       }
        for(int k=1;k<=m;k++){
            for(int h=k;h<=m;h++)
            {
                System.out.println("donner la valeur de lgn"+k+"col "+h);
                b[k][h]= S.nextInt();
            }
        }
        for(int i=1;i<=m;i++){
            for(int j=i;j<=m;j++)
            {
                tab[i][j] =a[i][j]+b[i][j];
                System.out.print(tab[i][j]+"  ");

            }
            System.out.println();
        }

    }
}
