import java.util.Scanner;
public class EX32 {
    public static void main(String[] args){
        Scanner S=new Scanner(System.in);
System.out.println("donner un entier");
int n= S.nextInt(),i;
int[] tab =new int[50];
i=1;
      do{
              tab[i]=n%2;
              n=n/2;
              i++;
             }while(n!=0);
      for( int j=i;j>=1;j--){
          System.out.print(tab[j]);
      }
    }
}
