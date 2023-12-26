import java.util.Scanner;
public class EX33 {
    public static void main(String[] args){
     Scanner s=new Scanner(System.in);
     System.out.println("donner le nombre des etudiants");
     int et= s.nextInt();
     System.out.println("donner le seuil");
     int se= s.nextInt();
        int[] tab=new int[50];
     for(int i=1;i<=et;i++){
         System.out.println("donner la moyenne N° "+i);
         tab[i]= s.nextInt();
     }
     int e=0;
     for(int j=1;j<=et;j++) {
         if(tab[j]>=se)
             e++;
     }
     System.out.println("le nombre des etudiant ayant note >= au seuil est "+e);


    }
}
