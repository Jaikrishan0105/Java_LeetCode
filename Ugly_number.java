import java.io.*;
import java.util.*;

public class Ugly_number {

    public static int fun(int n)
    {
        if(n==0){
            return 0;
        }
        if(n%2==0)
        {
            n/=2;
            return fun(n);
        }
        if(n%3==0)
        {
            n/=3;
            return fun(n);
        }
        if(n%5==0)
        {
            n/=5;
            return fun(n);
        }
        if(n==1){
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=fun(n);
        if(ans==1){
        System.out.println(true);}
        else{
            System.out.println(false);
        }
       
    }
}