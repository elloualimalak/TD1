import java.util.Scanner;
public class EX5 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
      int h;
      String l;
      System.out.println("saisir f pour français ou e pour anglais");
      l= s.nextLine();

      if(l.equals("f")){
          System.out.println("donner l'heure");
          h= s.nextInt();
          if((h>0)&&(h<18)) System.out.println("bonjour");
          if((h>=18)&&(h<=22)) System.out.println("bonsoir");
          if(h>22) System.out.println("bonne nuit");

      }
      else if(l.equals("e")){
          System.out.println("what time is it");
          h= s.nextInt();
          if((h>0)&&(h<18)) System.out.println("GOOD MORNING");
          if((h>=18)&&(h<=22)) System.out.println("GOOD EVENING");
          if(h>22) System.out.println("GOOD NIGHT");
      }

    }
}
