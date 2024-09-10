import java.io.*;
import java.util.*;

public class FinancialFirm {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i=0;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        if(n==1){
            System.out.println(true);
            return;
        }
            boolean a=true;
        int flag=0;
            int c1=0,c2=0;
            for(i=0;i<n-1;i++)
            {
                if(arr[i]>=arr[i+1])
                {
                   if(flag==0)
                   {
                       flag=1;
                   }
                    if(flag==-1)
                    {
                        System.out.println(false);
                        return;
                    }
                }
                else if(arr[i]<=arr[i+1])
                {
                    if(flag==0)
                    {
                        flag=-1;
                    }if(flag==1){
                        System.out.println(false);
                        return;
                    }
                }
            }
            System.out.println(true);
            
           
    
        
    }
}