import java.util.*;//O(log n)
class binary_search_2
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
		int result=binarySearch(arr,key);
		if(result!=-1)
		{
			System.out.println("element found");
		}
		else{
			System.out.println("element not found");
		}
	}
	public static int binarySearch(int arr[],int key)
	{
		int s=0;
		int e=arr.length;
		while(s<=e)
		{
			int mid=(s+e)/2;
			if(arr[mid]==key)
			{
				return 1;
			}
			else if(arr[mid]<key)
			{
				s=mid+1;
			}
			else
			{
				e=mid-1;
			}
		}
		return -1;
		
	}

}