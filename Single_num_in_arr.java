import java.io.*;
import java.util.*;

public class Single_num_in_arr {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=1;i<n;i++)
        {
            arr[0]=arr[0]^arr[i];
        }
        System.out.println(arr[0]);
    }
}