import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
    	int r = scan.nextInt();
    	int a[] = new int[100000];
    	int t=0;
    	for(int i=1; i<=n ; i++)
    	{
    		a[i] = scan.nextInt();
    	}
    	
    	for(int i=0 ; i<r ;i++)
    	{
    		
    		for(int j=1 ; j<=n ; j++)
    		{
    			if(j==1)
    			{
    			t=a[1];
    			}
    		    if(j<=n-1)
    			{
    			a[j]=a[j+1];
    			}
    		    if(j==n)
    		    {
    		    	a[n]=t;
    		    }
    		    }
    			
    		}
    	for(int i=1; i<=n ; i++)
    	{
    		System.out.print(a[i]); 
    	}
    	}
    }
