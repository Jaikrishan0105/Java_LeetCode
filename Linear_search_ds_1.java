import java.util.*;//O(n)
class Linear_ds_1
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int i,flag=0;
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the key value:");
		int key=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(arr[i]==key)
			{
				flag=1;
				break;
			}
			
		}
		if(flag==1)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
}