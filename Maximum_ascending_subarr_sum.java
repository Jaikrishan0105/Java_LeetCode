import java.io.*;
import java.util.*;

public class Maximum_ascending_subarr_sum {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int sum=0,max=Integer.MIN_VALUE;
        int i;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        sum=arr[0];
        int f=0;
         for(i=0;i<n-1;i++)
          {
              if(arr[i]<arr[i+1])
              {
                  f=0;
                  sum=sum+arr[i+1];
              }
              else
              {
                  f=1;
                  if(max<sum)
                  {
                      max=sum;
                  }
                  sum=arr[i+1];
              }
          }
        if(f==1){
        System.out.println(max);
        }else{
            System.out.println(sum);
        }
    }
}