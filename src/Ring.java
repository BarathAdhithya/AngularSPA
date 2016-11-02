import java.util.Scanner;

public class Ring {
	 void funChar(String str[])
	 {
		 int i,j,l; char temp = 'a';
		 for(i=0; i<3; i++){
			  char[] a = str[i].toCharArray();
			  l=0;
			  for(j=a.length-1; j>0; j--)
			  {
				  if(a[j]>a[j-1])
				  {
					  temp = a[j-1];
					  a[j-1] = a[j];
					  a[j] = temp;
					  l++;
					  break;
				  }
			  }
			  if(l>0)
			  {
				  System.out.println(str[i]);
			  }
			
			  
			  
		 }
	 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan = new Scanner(System.in);
       String str[] = new String[100];
       int i;
       for( i=0; i<3 ; i++)
       {
    	   str[i] = scan.nextLine();
       }
       Ring ring = new Ring();
       ring.funChar(str);
	}

}
