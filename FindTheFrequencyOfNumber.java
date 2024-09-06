import java.util.*;
class FindTheFrequencyOfNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of array:");
        int n=sc.nextInt();
        System.out.println("enter the elements:");
        int i,j,count=0;
        int arr[]=new int[n];
        int dp[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            count=1;
            if(dp[i]!=-1)
            {
                for(j=i+1;j<n;j++)
                {
                    if(arr[i]==arr[j])
                    {
                        count++;
                        dp[j]=-1;
                    }
                }
                dp[i]=count;
            }
        }
        for(i=0;i<n;i++)
        {
            if(dp[i]!=-1)
            {
            System.out.println(arr[i]+":"+dp[i]);
            }
        }
    }
} 