import java.util.*;

public class Arraying {
   public static void main(String[] args) {
   // create array list object
   List numbers = new ArrayList();
   Scanner scan = new Scanner(System.in);
      int a[]=new int[100000];
      int b=scan.nextInt();
      int c=scan.nextInt();
   // populate the list
   for (int i = 0; i < b; i++) {
	   a[i]=scan.nextInt();
   numbers.add(a[i]);
   }

  
      
   // rotate the list at distance 10
 
   
   /* Collections.rotateLeft(numbers, c);*/

   System.out.println(Arrays.toString(numbers.toArray())+" ");
   }
}