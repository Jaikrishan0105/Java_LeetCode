import java.io.*;
import java.util.*;

public class Make_three_strings_equal {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int i,min=0;
        String s1=sc.next(),s2=sc.next(),s3=sc.next();
        int sum=s1.length()+s2.length()+s3.length();
        if(s1.charAt(0)!=s2.charAt(0)||s2.charAt(0)!=s3.charAt(0))
        {
            System.out.println("-1");
            return;
        }
        if(s1.length()<s2.length()&&s1.length()<s3.length())
        {
            min=s1.length();
        }else if(s2.length()<s3.length()){
            min=s2.length();
        }else{
            min=s3.length();
        }
        for(i=0;i<min;i++)
        {
            if(s1.charAt(i)==s2.charAt(i)&&s2.charAt(i)==s3.charAt(i))
            {
                sum=sum-3;
            }
        }System.out.println(sum);
    
    }
}