import java.io.*;
import java.util.*;

public class Party_guest {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=0,i;
        int c[]=new int[n];
        int l[]=new int[n];
        for(i=0;i<n;i++)
        {
            c[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            l[i]=sc.nextInt();
        }int ans=0;
        for(i=0;i<n;i++)
        {
            ans=ans+c[i]-l[i];
            if(max<ans)
            {
                max=ans;
            }
        }
        System.out.print(max);
    }
}