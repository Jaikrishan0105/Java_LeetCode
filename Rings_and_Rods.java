import java.io.*;
import java.util.*;

public class Rings_and_Rods {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int g[]=new int[10];
        int r[]=new int[10];
        int b[]=new int[10];
        int i,count=0;
        for(i=0;i<s.length()-1;i=i+2)
        {
            if(s.charAt(i)=='G')
            {
                g[s.charAt(i+1)-'0']++;
            }
            else if(s.charAt(i)=='R')
            {
                r[s.charAt(i+1)-'0']++;
            }else if(s.charAt(i)=='B')
            {
                b[s.charAt(i+1)-'0']++;
            }
        }
        for(i=0;i<10;i++)
        {
            if(g[i]>0&&r[i]>0&&b[i]>0)
            {
                count++;
            }
        }System.out.println(count);
        
        
    }
}