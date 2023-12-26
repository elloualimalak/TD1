
public class EX26 {
    public static void main(String[] args){
       int i,j,k;
       for(i=1;i<=9;i++){
           for(j=i;j<=9;j++){
               for(k=j;k<=9;k++){
                   if(i+j+k==15) System.out.println("la somme est "+i+"+"+j+"+"+k+" =15");

               }
           }
       }
    }
}
