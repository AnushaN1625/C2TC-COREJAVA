package school;
import java.util.*;

public class Doors
{	
    public static void main(String args[])
    {
        int a[]=new int[100];
        
        int i, k, count = 0;
        
        for(i = 0; i < 100; i++) 
        {
            a[i] = 1;        }

        for(k = 1; k <8; k++) 
        {
            for(i = 0; i < 100; i++)
            {
                if(i % k == 0) 
                {
                    if(a[i]==0) {
                    	a[i]=1;
                    }
                    else {
                    	a[i]=0;
                    }
                    
                }
            }
        }
        
        
        for(i = 0; i < 100; i++) 
        {
            if(a[i] != 0)
            {
                count++;
            }
        }

        System.out.println("Number of closed doors: " + (100 - count));
        System.out.println("Number of open doors: " + count);	
    }
}
